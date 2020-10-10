package com.example.springboot.controller;

import com.alibaba.fastjson.JSON;
import com.baidu.ueditor.ActionEnter;
import com.example.springboot.service.CommonDealService;
import com.yelang.shop.base.annotation.UserLoginToken;
import com.yelang.shop.base.exception.JsonResponse;
import com.yelang.shop.base.util.Plupload;
import com.yelang.shop.base.enumType.ImgType;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@CrossOrigin
@Controller
public class CommonDealController {
    @Autowired
    private CommonDealService commonDealService;
    /**
     * 富文本编辑器上传图片(产品)
     * @param request
     * @param response
     */
    @RequestMapping(value = "/config")
    public void config(HttpServletRequest request, HttpServletResponse response){
        response.setContentType("application/json");
        String rootPath = ClassUtils.getDefaultClassLoader().getResource("").getPath() + "static/ueditor/jsp";
        String imgUrl="";

        try {
            // 检测是否为上传请求
            String contentType = request.getContentType();
            if (contentType != null && contentType.toLowerCase().startsWith("multipart/")) {
                MultipartHttpServletRequest multipartRequest =
                        WebUtils.getNativeRequest(request, MultipartHttpServletRequest.class);
                MultipartFile file =multipartRequest.getFile("upfile");
                //文件名称
                String realFileName = file.getOriginalFilename();
                //文件后缀
                String suffix = realFileName.substring(realFileName.lastIndexOf(".") + 1);
                Map<String, String> ret = new HashMap<String, String>();
                Plupload plupload = new Plupload();
                Map<String, String> map = plupload.uploadImgToOSS(file, ImgType.PRODUCT_UEDIT_IMG.getTypeName());
                if(map!=null){
                    imgUrl = map.get("fileUrl");
                }
            }
            response.setCharacterEncoding("UTF-8");
            //String exec = new ActionEnter(request, rootPath).exec();上传到本地
            String exec = "{'state':'SUCCESS'}";
            if(!"".equals(imgUrl)){
                Map mapTypes = JSON.parseObject(exec);
                mapTypes.put("url",imgUrl);
                mapTypes.put("state","SUCCESS");
                exec = JSON.toJSONString(mapTypes);
            }else{
                exec = new ActionEnter(request, rootPath).exec();
            }

            System.out.println("exec-------------------"+exec);
            PrintWriter writer = response.getWriter();
            writer.write(exec);//展示OSS图片
            //writer.write(new ActionEnter(request, rootPath).exec());//展示本地临时图片
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 图片上传（产品活动图、产品热门推荐图、产品主图、产品附图）
     * @param files 文件流数组
     * @param imgType 图片类型
     * @return
     */
    //@UserLoginToken
    @ResponseBody
    @ApiOperation(value = "图片/视频/文件上传",notes = "data返回图片/文件/视频/地址")
    @PostMapping("/uploadImg")
    public JsonResponse upload(@RequestParam("file") MultipartFile[] files, @RequestParam("imgType") Integer imgType) {
        JsonResponse resp = new JsonResponse();
        try {
            Plupload plupload = new Plupload();
            Map<String, String> map = null;
            if(files!=null && files.length>0){
                for(MultipartFile file:files){
                    switch (imgType){
                        //产品主图
                        case 1: map = plupload.uploadImgToOSS(file, ImgType.PRODUCT_MAIN_IMG.getTypeName());
                            break;
                        //产品附图
                        case 2: map = plupload.uploadImgToOSS(file, ImgType.PRODUCT_ATTACH_IMG.getTypeName());
                            break;
                        //产品图文
                        case 3: map = plupload.uploadImgToOSS(file, ImgType.PRODUCT_UEDIT_IMG.getTypeName());
                            break;
                        //产品活动图
                        case 4: map = plupload.uploadImgToOSS(file, ImgType.PRODUCT_ACTIVITY_IMG.getTypeName());
                            break;
                        //产品规格图
                        case 5: map = plupload.uploadImgToOSS(file, ImgType.PRODUCT_SPECIFICATIONS_IMG.getTypeName());
                            break;
                        //产品评价图
                        case 6: map = plupload.uploadImgToOSS(file, ImgType.PRODUCT_COMMENT_IMG.getTypeName());
                            break;
                        //产品种类/系列图7
                        case 7: map = plupload.uploadImgToOSS(file, ImgType.PRODUCT_CATEGORY_ICON_IMG.getTypeName());
                            break;
                        //限时抢购活动图8
                        case 8: map = plupload.uploadImgToOSS(file, ImgType.PRODUCT_LIMITED_TIME_MAIN_IMG.getTypeName());
                            break;
                        //限时抢购产品附图9
                        case 9: map = plupload.uploadImgToOSS(file, ImgType.PRODUCT_LIMITED_TIME_ATTACH_IMG.getTypeName());
                            break;
                        //产品主视频
                        case 10: map = plupload.uploadImgToOSS(file, ImgType.PRODUCT_MAIN_VIDEO.getTypeName());
                            break;
                        //直播封面图
                        case 11: map = plupload.uploadImgToOSS(file, ImgType.LIVE_COVER_IMG.getTypeName());
                            break;
                        //APP启动页图片
                        case 12: map = plupload.uploadImgToOSS(file, ImgType.START_UP_IMG.getTypeName());
                            break;
                        //直播分享海报图
                        case 13: map = plupload.uploadImgToOSS(file, ImgType.LIVE_POSTERS_IMG.getTypeName());
                            break;
                        //默认产品主图
                        default:map = plupload.uploadImgToOSS(file, ImgType.PRODUCT_MAIN_IMG.getTypeName());
                            break;
                    }
                }
            }
            resp.setData(map.get("fileUrl"));
        } catch (Exception e) {
            return JsonResponse.buildErrorResponse();
        }
        return resp;
    }

    /**
     * 检查版本
     * @param versionID 版本ID
     * @return
     */
    @RequestMapping(value = "/checkVersion",method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "检查版本")
    public JsonResponse checkVersion(@RequestParam("versionID") Integer versionID){
        JsonResponse resp = new JsonResponse();
        try{
            resp.setData(commonDealService.checkVersion(versionID));
        }catch (Exception e){
            e.printStackTrace();
            resp = JsonResponse.buildErrorResponse();
        }
        return resp;
    }

    /**
     * 获取APP启动图片
     * @return
     */
    @RequestMapping(value = "/getStartImg",method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "获取APP启动图片")
    public JsonResponse getStartImg(){
        JsonResponse resp = new JsonResponse();
        try{
            resp.setData(commonDealService.getStartImg());
        }catch (Exception e){
            e.printStackTrace();
            resp = JsonResponse.buildErrorResponse();
        }
        return resp;
    }

    /**
     * 获取直播分享海报图片
     * @return
     */
    @RequestMapping(value = "/getLivePostersImg",method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "获取直播分享海报图片")
    public JsonResponse getLivePostersImg(){
        JsonResponse resp = new JsonResponse();
        try{
            resp.setData(commonDealService.getLivePostersImg());
        }catch (Exception e){
            e.printStackTrace();
            resp = JsonResponse.buildErrorResponse();
        }
        return resp;
    }
}