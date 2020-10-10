package com.example.springboot.controller;

import com.example.springboot.entity.UserAlreadyRobbed;
import com.example.springboot.service.UserAlreadyRobbedService;
import com.yelang.shop.base.annotation.UserLoginToken;
import com.yelang.shop.base.exception.JsonResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/userAlreadyRobbed")
@Api(value = "限时抢购产品的增删改查")
public class UserAlreadyRobbedController {
    @Autowired
    private UserAlreadyRobbedService userAlreadyRobbedService;

    /**
     * 用户限时抢购抢购商品记录
     * @return
     */
    @UserLoginToken
    @ResponseBody
    @GetMapping("/userAlreadyRobbedList")
    @ApiOperation(value = "用户限时抢购抢购商品记录,不分页")
    public JsonResponse getUserAlreadyRobbed(UserAlreadyRobbed userAlreadyRobbed){
        JsonResponse resp = new JsonResponse();
        try{
            resp.setData(userAlreadyRobbedService.getUserAlreadyRobbed(userAlreadyRobbed));
        }catch (Exception e){
            e.printStackTrace();
            resp = JsonResponse.buildErrorResponse();
        }
        return resp;
    }
}
