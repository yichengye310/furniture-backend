package com.example.springboot.controller;

import com.example.springboot.Interceptor.JWTToken;
import com.example.springboot.dto.UserInfoDTO;
import com.example.springboot.entity.User;
import com.example.springboot.entity.UserAgreement;
import com.example.springboot.entity.UserInfo;
import com.example.springboot.enumUtil.ReponseStateEnum;
import com.example.springboot.sendMessage.MessageSendHandler;
import com.example.springboot.service.UserLoginService;
import com.github.pagehelper.PageInfo;
import com.yelang.shop.base.annotation.UserLoginToken;
import com.yelang.shop.base.enumType.ImgType;
import com.yelang.shop.base.exception.JsonResponse;
import com.example.springboot.service.RedisService;
import com.yelang.shop.base.util.Plupload;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.spring.web.json.Json;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Random;

@CrossOrigin
@Controller
@RequestMapping(value = {"/user"})
public class UserLoginController  extends BaseController{

    /**
     * 最开始希望用Map的形式接参数，后来不用了，将请求对应的接受方式记录一下
     *
     * @RequestBody Map<String,Object> map      post请求
     * @RequestParam Map<String,Object> map     get请求
     */

    /**
     * 注入service
     */
    @Autowired
    private UserLoginService userLoginService;

    @Autowired
    private RedisService redisService;

    /**
     * 获取用户协议
     */
    @ResponseBody
    @GetMapping(value = {"/getAgreement"})
    public JsonResponse getAgreement(HttpServletRequest request){
        JsonResponse resp = new JsonResponse();

        UserAgreement agreement = userLoginService.getAgreement();
        if (agreement != null) {
            resp.setData(agreement);
            resp.setStatus(ReponseStateEnum.SUCCESS);
            resp.setMessage("获取用户协议成功!");
        }else {
            resp.setStatus(ReponseStateEnum.FAIL);
            resp.setMessage("获取用户协议失败!");
        }
        return resp;
    }


    /**
     * 跳转到用户登录页面
     * @return 登录页面
     */
    @ResponseBody
    @RequestMapping(value = {"/loginHtml"})
    public String loginHtml(){
        return "userLogin";
    }

    /**
     * 跳转到用户注册页面
     * @return 注册页面
     */
    @ResponseBody
    @RequestMapping(value = {"/registerpage"})
    public String registerpage(){
        return "register";
    }

    /**
     * 用户登出接口
     * @return 登录成功页面
     */
    @UserLoginToken
    @ResponseBody
    @GetMapping(value = {"/userLogout"})
    public JsonResponse userLogout(@RequestParam("userID") String userID,
                                  HttpServletRequest request){
        JsonResponse resp = new JsonResponse();

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("UserInfo_").append(userID);


//        UserInfo code = (UserInfo) redisService.get(stringBuffer.toString());
//
//        if (code != null) {
        redisService.del(stringBuffer.toString());
//        }

        resp.setStatus(ReponseStateEnum.SUCCESS);
        resp.setMessage("登出成功!");

        return resp;
    }

    /**
     * 用户登录
     * @return 登录成功页面
     */
    @ResponseBody
    @GetMapping(value = {"/userLogin"})
    public JsonResponse userLogin(@RequestParam("phoneNumber") String phoneNumber,
                            @RequestParam("password") String password,
                            HttpServletRequest request){

        JsonResponse resp = new JsonResponse();
        if(StringUtils.isEmpty(phoneNumber)){
            resp.setStatus(ReponseStateEnum.FAIL);
            resp.setMessage("用户名不能为空");
        }

        if(StringUtils.isEmpty(password)){
            resp.setStatus(ReponseStateEnum.FAIL);
            resp.setMessage("密码不能为空!");
        }

        UserInfo user = userLoginService.userLogin(phoneNumber, password);


        if(user != null){                                                  //登录成功

            JWTToken JWT = new JWTToken();
            String token = JWT.getToken(user.getUserID(), user.getUserPwd());
            resp.setStatus(ReponseStateEnum.SUCCESS);
            resp.setMessage("登录成功!");

            UserInfoDTO userInfoDTO = new UserInfoDTO();
            userInfoDTO.setUserID(user.getUserID());
            userInfoDTO.setUserName(user.getUserName());
            userInfoDTO.setPhoneNumber(user.getPhoneNumber());
            userInfoDTO.setPortrait(user.getPortrait());
            userInfoDTO.setPersonalSign(user.getPersonalSign());
            userInfoDTO.setToken(token);
            userInfoDTO.setIsOpenLive(user.getIsOpenLive());
            userInfoDTO.setUserType(user.getUserType());

            resp.setData(userInfoDTO);

            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("UserInfo_").append(user.getUserID());

            //System.out.println(stringBuffer.toString());


            redisService.set(stringBuffer.toString(), user);
            //request.getSession().setAttribute(stringBuffer.toString(), user);     //将用户信息放入session  用于后续的拦截器
        }else {
            resp.setStatus(ReponseStateEnum.FAIL);
            resp.setMessage("登录失败，用户名或密码错误!");
        }
        return resp;
    }


    /**
     * 获取验证码
     * @return 注册结果
     */
    @ResponseBody
    @GetMapping(value = {"/validCode"})
    public JsonResponse getValidateCode(HttpServletRequest request){
        JsonResponse resp = new JsonResponse();
        try {
            //HttpSession session = request.getSession();
            String phoneNumber = request.getParameter("phoneNumber");
            String verifyCode = String.valueOf(new Random().nextInt(899999) + 100000);//生成短信验证码
            //session.setAttribute(phoneNumber, verifyCode);
            redisService.set(phoneNumber, verifyCode);


            StringBuffer strForDelay = new StringBuffer();
            strForDelay.append(phoneNumber).append("_DELAY");
            //Long resForDelay = (Long) session.getAttribute(strForDelay.toString());
            Long resForDelay = (Long) redisService.get(strForDelay.toString());

            Long nowTime = System.currentTimeMillis();
            if (resForDelay == null) {
                //session.setAttribute(strForDelay.toString(), nowTime);
                redisService.set(strForDelay.toString(), nowTime);

                sendMessage(phoneNumber, resp, verifyCode);
                if (resp.getStatus() == ReponseStateEnum.FAIL){
//                    session.removeAttribute(phoneNumber);
                    redisService.del(phoneNumber);
                }
            } else {
                if ((nowTime - resForDelay) > 60 * 1000) {
                    sendMessage(phoneNumber, resp, verifyCode);
                    if (resp.getStatus() == ReponseStateEnum.FAIL){
                        //session.removeAttribute(phoneNumber);
                        redisService.del(phoneNumber);

                    }
                    //session.setAttribute(strForDelay.toString(), nowTime);
                    redisService.set(strForDelay.toString(), nowTime);

                } else {
                    resp.setStatus(ReponseStateEnum.FAIL);
                    resp.setMessage("发送验证码时间间隔太短，请稍后再发！");
                }
            }
        }catch (Exception e){
            resp.setStatus(ReponseStateEnum.FAIL);
            resp.setMessage("服务器错误！");
        }
        return resp;
    }

    public JsonResponse sendMessage(String phoneNumber, JsonResponse resp, String verifyCode){

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("【缔邦】你好，你的验证码是:").append(verifyCode).append(",如非本人操作请忽略此短信。");

        MessageSendHandler messageSendHandler = new MessageSendHandler();
        String res = messageSendHandler.sendMessage(phoneNumber, stringBuffer.toString());

        if (res.equals("success")){
            resp.setStatus(ReponseStateEnum.SUCCESS);
            resp.setMessage("发送成功！");
            resp.setData(res);
        }else {
            resp.setStatus(ReponseStateEnum.FAIL);
            resp.setMessage("发送失败！");
            resp.setData(res);
        }
        return resp;
    }



    /**
     * 注册新用户
     * @return 注册结果
     */
    @ResponseBody
    @GetMapping(value = {"/register"})
    public JsonResponse createUser(@RequestParam("phoneNumber") String phoneNumber,
                                   @RequestParam("password") String password,
                                   @RequestParam("validCode") String validCode,
                                   HttpServletRequest request){

       // HttpSession session = request.getSession();

        JsonResponse resp = new JsonResponse();
        //String code = (String) session.getAttribute(phoneNumber);


        Boolean isExist = userLoginService.queryUserByPhone(phoneNumber);

        if (isExist)
        {
            resp.setStatus(ReponseStateEnum.FAIL);
            resp.setMessage("注册失败，同一手机号只能注册一个账号！");
            return resp;
        }

        String code = (String) redisService.get(phoneNumber);
        if(code == null){
            resp.setStatus(ReponseStateEnum.FAIL);
            resp.setMessage("请先点击获取验证码！");
        }else {
            if (code.equals(validCode)) {
                Integer res = userLoginService.addUser(phoneNumber, password);
                if (res == 1) {
                    resp.setStatus(ReponseStateEnum.SUCCESS);
                    resp.setMessage("注册成功！");
                } else {
                    resp.setStatus(ReponseStateEnum.FAIL);
                    resp.setMessage("注册失败，稍后请重试！");
                }
            } else {
                resp.setStatus(ReponseStateEnum.FAIL);
                resp.setMessage("验证码错误！");
            }
        }
        return resp;
    }


    /**
     * 修改密码
     * @return 注册结果
     */
    @ResponseBody
    @GetMapping(value = {"/changePwd"})
    public JsonResponse changePassword(@RequestParam("phoneNumber") String phoneNumber,
                                       @RequestParam("password") String password,
                                       @RequestParam("validCode") String validCode,
                                       HttpServletRequest request){

        JsonResponse resp = new JsonResponse();
        //HttpSession session = request.getSession();

        //String code = (String) session.getAttribute(phoneNumber);
        String code = (String) redisService.get(phoneNumber);
        if(code == null){
            resp.setStatus(ReponseStateEnum.FAIL);
            resp.setMessage("请先点击获取验证码！");
        }else {
            if (code.equals(validCode)) {
                UserInfo user = userLoginService.changeUserPassword(phoneNumber, password);
                if (user != null) {
                    resp.setStatus(ReponseStateEnum.SUCCESS);
                    resp.setMessage("修改密码成功!");

                    UserInfoDTO userInfoDTO = new UserInfoDTO();
                    userInfoDTO.setUserID(user.getUserID());
                    userInfoDTO.setUserName(user.getUserName());
                    userInfoDTO.setPhoneNumber(user.getPhoneNumber());
                    userInfoDTO.setPortrait(user.getPortrait());
                    userInfoDTO.setPersonalSign(user.getPersonalSign());

                    resp.setData(userInfoDTO);
                } else {
                    resp.setStatus(ReponseStateEnum.FAIL);
                    resp.setMessage("修改密码失败!");
                }
            } else {
                resp.setStatus(ReponseStateEnum.FAIL);
                resp.setMessage("验证码错误!");
            }
        }
        return resp;
    }


    /**
     * 修改昵称
     * @return 注册结果
     */
    @UserLoginToken
    @ResponseBody
    @GetMapping(value = {"/changeName"})
    public JsonResponse changeName(@RequestParam("userID") String userID,
                                   @RequestParam("changedName") String changedName,
                                   HttpServletRequest request){
        JsonResponse resp = new JsonResponse();
        HttpSession session = request.getSession();

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("UserInfo_").append(userID);
        String tmp = stringBuffer.toString();
        UserInfo code = new UserInfo();//(UserInfo) redisService.get(tmp);
        if (code != null) {
            UserInfo user = userLoginService.changeUserName(userID, changedName);
            if (user != null) {
                resp.setStatus(ReponseStateEnum.SUCCESS);
                resp.setMessage("修改成功!");

                UserInfoDTO userInfoDTO = new UserInfoDTO();
                userInfoDTO.setUserID(user.getUserID());
                userInfoDTO.setUserName(user.getUserName());
                userInfoDTO.setPhoneNumber(user.getPhoneNumber());
                userInfoDTO.setPortrait(user.getPortrait());
                userInfoDTO.setPersonalSign(user.getPersonalSign());

                resp.setData(userInfoDTO);

                //request.getSession().setAttribute(stringBuffer.toString(), user);
                redisService.set(stringBuffer.toString(), user);//将用户信息放入session
            }else {
                resp.setStatus(ReponseStateEnum.FAIL);
                resp.setMessage("修改失败!");
            }
        }else {
            resp.setStatus(ReponseStateEnum.FAIL);
            resp.setMessage("修改失败,请登录后修改!");
        }
        return resp;
    }

    /**
     * 修改头像
     * @return 注册结果
     */
    @UserLoginToken
    @ResponseBody
    @PostMapping(value = {"/changePortrait"})
    public JsonResponse changePortrait(@RequestParam("userID") String userID,
                                   @RequestParam("portrait") MultipartFile portrait,
                                   HttpServletRequest request){
        JsonResponse resp = new JsonResponse();
        HttpSession session = request.getSession();
        Plupload plupload = new Plupload();
        Map map = null;
        try {
            map = plupload.uploadImgToOSS(portrait, ImgType.LIVE_POSTERS_IMG.getTypeName());
        } catch (IOException e) {
            e.printStackTrace();
        }
        String url = (String) map.get("fileUrl");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("UserInfo_").append(userID);
        String tmp = stringBuffer.toString();
        UserInfo code = (UserInfo) redisService.get(tmp);
        if (code != null) {
            UserInfo user = userLoginService.changePortrait(userID, url);
            if (user != null) {
                resp.setStatus(ReponseStateEnum.SUCCESS);
                resp.setMessage("修改成功!");

                UserInfoDTO userInfoDTO = new UserInfoDTO();
                userInfoDTO.setUserID(user.getUserID());
                userInfoDTO.setUserName(user.getUserName());
                userInfoDTO.setPhoneNumber(user.getPhoneNumber());
                userInfoDTO.setPortrait(user.getPortrait());
                userInfoDTO.setPersonalSign(user.getPersonalSign());

                resp.setData(userInfoDTO);

                //request.getSession().setAttribute(stringBuffer.toString(), user);
                redisService.set(stringBuffer.toString(), user);//将用户信息放入session
            }else {
                resp.setStatus(ReponseStateEnum.FAIL);
                resp.setMessage("修改失败!");
            }
        }else {
            resp.setStatus(ReponseStateEnum.FAIL);
            resp.setMessage("修改失败,请登录后修改!");
        }
        return resp;
    }

    /**
     * 用于测试拦截器（用户是否登录，查看session）
     * 查询用户列表  http://localhost:8080/user/queryAllUser
     * @return 用户列表（json串）
     */
    @ResponseBody
    @GetMapping(value = {"/queryAllUser"})
    public List<Map<String,Object>> queryAllUser(){

        return userLoginService.queryAllUser();
    }

    @ResponseBody
    @GetMapping(value = {"/updateLivePermission"})
    public JsonResponse updateLivePermission(UserInfo user){
        JsonResponse jsonResponse = new JsonResponse();
        try {
            Integer res = userLoginService.updateLivePermission(user);
            if (res == 1) {
                jsonResponse.setStatus(ReponseStateEnum.SUCCESS);
                jsonResponse.setMessage("修改用户直播权限成功！");
            }else {
                jsonResponse.setStatus(ReponseStateEnum.FAIL);
                jsonResponse.setMessage("修改用户直播权限失败！");
            }
        }catch (Exception e){
            jsonResponse.setStatus(ReponseStateEnum.FAIL);
            jsonResponse.setMessage("系统错误，修改用户直播权限失败！");
        }
        return jsonResponse;
    }

    @ResponseBody
    @GetMapping(value = {"/queryUserByPage"})
    public JsonResponse queryUserByPage(UserInfo user,
            @RequestParam(value="pageNo",defaultValue="1") Integer pageNo,
            @RequestParam(value = "pageSize",defaultValue = "20") Integer pageSize){
        JsonResponse jsonResponse = new JsonResponse();
        if (pageNo == null || pageNo <= 0) {
            pageNo = 1;
        }
        PageInfo<UserInfo> pageData = userLoginService.queryUserByPage(user,pageNo,pageSize);
        jsonResponse.setData(pageData);
        jsonResponse.setMessage("查询成功！");
        return jsonResponse;
    }

    @ResponseBody
    @GetMapping(value = {"/updateUserType"})
    public JsonResponse updateUserInfo(UserInfo user){
        JsonResponse jsonResponse = new JsonResponse();

        Integer res = userLoginService.updateUserType(user);
        if (res == 1){
            jsonResponse.setStatus(ReponseStateEnum.SUCCESS);
            jsonResponse.setMessage("修改用户类型成功！");
        }else {
            jsonResponse.setStatus(ReponseStateEnum.FAIL);
            jsonResponse.setMessage("修改用户类型失败！");
        }

        return jsonResponse;
    }
}
