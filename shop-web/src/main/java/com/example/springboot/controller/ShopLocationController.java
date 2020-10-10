package com.example.springboot.controller;

import com.example.springboot.entity.BusinessUser;
import com.example.springboot.entity.ShopLocation;
import com.example.springboot.enumUtil.ReponseStateEnum;
import com.example.springboot.service.BusinessUserService;
import com.example.springboot.service.ShopLocationService;
import com.yelang.shop.base.annotation.UserLoginToken;
import com.yelang.shop.base.exception.JsonResponse;
import com.yelang.shop.base.exception.ServiceExceptionCode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/location")
@Api(value = "商户位置信息获取")
public class ShopLocationController {
    @Autowired
    private ShopLocationService shopLocationService;


    @ResponseBody
    @GetMapping("/getAllLocation")
    @ApiOperation(value = "所有商铺位置信息",notes="拉取所有商铺位置信息")
    public JsonResponse getAllLocation(){
        JsonResponse resp = new JsonResponse();
        try{
            List<ShopLocation> locationList = shopLocationService.getAllLocation();
            resp.setData(locationList);
            resp.setMessage("查询成功");
            resp.setStatus(ReponseStateEnum.SUCCESS);
        }catch (Exception e){
            resp.setMessage("查询失败，服务器错误");
            resp.setStatus(ReponseStateEnum.FAIL);
        }
        return resp;
    }

}
