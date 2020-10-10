package com.example.springboot.controller;


import com.example.springboot.entity.CouponModel;
import com.example.springboot.entity.UserCoupon;
import com.example.springboot.enumUtil.ReponseStateEnum;
import com.example.springboot.requestVO.couponVO.CreateCouponModelVO;
import com.example.springboot.requestVO.couponVO.GetCouponListVO;
import com.example.springboot.requestVO.couponVO.QueryAcceptedableCouponListVO;
import com.example.springboot.service.UserCouponService;
import com.github.pagehelper.PageInfo;
import com.yelang.shop.base.annotation.UserLoginToken;
import com.yelang.shop.base.exception.JsonResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/coupon")
@Api(value = "用户优惠券处理")
public class UserCouponController {
    @Autowired
    private UserCouponService userCouponService;

    @ResponseBody
    @GetMapping(value = {"/terminateCoupon"})
    @ApiOperation(value = "更新优惠券内容",notes="更新优惠券内容")
    public JsonResponse terminateCoupon(@RequestParam(value="couponID") Integer couponID){
        JsonResponse resp = new JsonResponse();
        try {
            Integer res = userCouponService.terminateCoupon(couponID);
            if (res == 1){
                resp.setStatus(ReponseStateEnum.SUCCESS);
                resp.setMessage("终止优惠券成功");
            }else {
                resp.setStatus(ReponseStateEnum.FAIL);
                resp.setMessage("终止优惠券失败");
            }
        }catch (Exception e){
            resp.setStatus(ReponseStateEnum.FAIL);
            resp.setMessage("终止优惠券失败，系统错误");
        }
        return resp;
    }


    @ResponseBody
    @PostMapping(value = {"/updateCoupon"})
    @ApiOperation(value = "更新优惠券内容",notes="更新优惠券内容")
    public JsonResponse updateCoupon(@RequestBody CouponModel vo){
        JsonResponse resp = new JsonResponse();
//        if (vo.getCouponBeginTime() <= System.currentTimeMillis()&&System.currentTimeMillis() <= vo.getCouponEndTime()){
//            resp.setStatus(ReponseStateEnum.FAIL);
//            resp.setMessage("更新优惠券失败,不能更改生效中的优惠券！");
//
//            return resp;
//        }
        try {
            Integer res = userCouponService.updateCoupon(vo);
            if (res == 1){
                resp.setStatus(ReponseStateEnum.SUCCESS);
                resp.setMessage("更新优惠券成功");
            }else {
                resp.setStatus(ReponseStateEnum.FAIL);
                resp.setMessage("更新优惠券失败");
            }
        }catch (Exception e){
            resp.setStatus(ReponseStateEnum.FAIL);
            resp.setMessage("更新优惠券失败，系统错误");
        }
        return resp;
    }


    @ResponseBody
    @PostMapping(value = {"/createCouponModel"})
    @ApiOperation(value = "创建可发放的优惠券",notes="创建可发放的优惠券")
    public JsonResponse createCouponModel(@RequestBody CreateCouponModelVO vo){
        JsonResponse resp = new JsonResponse();
        try {
            Integer res = userCouponService.createCoupon(vo);
            if (res == 1){
                resp.setStatus(ReponseStateEnum.SUCCESS);
                resp.setMessage("创建优惠券成功");
            }else {
                resp.setStatus(ReponseStateEnum.FAIL);
                resp.setMessage("创建优惠券失败");
            }
        }catch (Exception e){
            resp.setStatus(ReponseStateEnum.FAIL);
            resp.setMessage("创建优惠券失败，系统错误");
        }
        return resp;
    }



    @ResponseBody
    @GetMapping(value = {"/getCouponInfo"})
    @ApiOperation(value = "查询优惠券详情",notes="查询优惠券详情")
    public JsonResponse getCouponInfo(@RequestParam(value="couponID") Integer couponID){
        JsonResponse resp = new JsonResponse();
        try {
            CouponModel couponInfo = userCouponService.getCouponInfo(couponID);
            resp.setStatus(ReponseStateEnum.SUCCESS);
            resp.setMessage("查询成功");
            resp.setData(couponInfo);
        }catch (Exception e){
            resp.setStatus(ReponseStateEnum.FAIL);
            resp.setMessage("查询失败");
        }
        return resp;
    }

    @ResponseBody
    @GetMapping(value = {"/getCouponList"})
    @ApiOperation(value = "查询优惠券列表",notes="分页条件查询优惠券列表")
    public JsonResponse getCouponList(GetCouponListVO vo,
                                      @RequestParam(value="pageNo",defaultValue="1") Integer pageNo,
                                      @RequestParam(value = "pageSize",defaultValue = "20") Integer pageSize){
        JsonResponse resp = new JsonResponse();
        try {
            PageInfo<CouponModel> couponList = userCouponService.getCouponModelList(vo, pageNo, pageSize);
            resp.setStatus(ReponseStateEnum.SUCCESS);
            resp.setMessage("查询成功");
            resp.setData(couponList);
        }catch (Exception e){
            resp.setStatus(ReponseStateEnum.FAIL);
            resp.setMessage("查询失败");
        }
        return resp;
    }


    @UserLoginToken
    @ResponseBody
    @GetMapping(value = {"/queryCouponListByUserID"})
    @ApiOperation(value = "优惠券列表",notes="根据用户ID查询优惠券列表")
    public JsonResponse queryCouponListByUserID(@RequestParam("userID") String userID,
                                                @RequestParam("couponState") Integer couponState){
        JsonResponse resp = new JsonResponse();
        if (userID == null){
            resp.setStatus(ReponseStateEnum.FAIL);
            resp.setMessage("用户ID不能为空");
        }else {
            List<UserCoupon> couponList = userCouponService.queryCouponListByUserID(userID, couponState);
            resp.setStatus(ReponseStateEnum.SUCCESS);
            resp.setMessage("查询成功");
            resp.setData(couponList);
        }
        return resp;
    }


    @UserLoginToken
    @ResponseBody
    @GetMapping(value = {"/getAcceptedableCouponList"})
    @ApiOperation(value = "查询可以领取的优惠券列表",notes="根据查询条件返回优惠券列表")
    public JsonResponse getAcceptedableCouponList(QueryAcceptedableCouponListVO queryVO){
        JsonResponse resp = new JsonResponse();
        if (queryVO.getUserID() == null || queryVO.getUserType() == null){
            resp.setStatus(ReponseStateEnum.FAIL);
            resp.setMessage("用户ID和用户类型不能为空");
        }else {
            List<CouponModel> modelList = userCouponService.getAcceptedableCouponList(queryVO);
            resp.setStatus(ReponseStateEnum.SUCCESS);
            resp.setMessage("查询成功");
            resp.setData(modelList);
        }
        return resp;
    }

    @UserLoginToken
    @ResponseBody
    @GetMapping(value = {"/gainedCouponByID"})
    @ApiOperation(value = "领取优惠券",notes="领取优惠券")
    public JsonResponse gainedCouponByID(@RequestParam("couponID") Integer couponID,
                                         @RequestParam("userID") String userID){
        JsonResponse resp = new JsonResponse();
        if (userID == null || couponID == null){
            resp.setStatus(ReponseStateEnum.FAIL);
            resp.setMessage("用户ID和优惠券ID均不能为空");
        }else {
            Integer res = userCouponService.gainedCouponByID(couponID, userID);
            if (res == 1) {
                resp.setStatus(ReponseStateEnum.SUCCESS);
                resp.setMessage("优惠券领取成功");
            }else {
                resp.setStatus(ReponseStateEnum.FAIL);
                resp.setMessage("优惠券领取失败");
            }
        }
        return resp;
    }
}
