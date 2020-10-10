package com.example.springboot.controller;

import com.example.springboot.dto.ProductCommentsDTO;
import com.example.springboot.entity.ProductComments;
import com.example.springboot.service.ProductCommentsService;
import com.yelang.shop.base.annotation.UserLoginToken;
import com.yelang.shop.base.exception.JsonResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@CrossOrigin
@Controller
@RequestMapping(value = "/comment")
@Api(value = "产品评价的增删改查")
public class ProductCommentsController {
    @Autowired
    private ProductCommentsService productCommentsService;

    @RequestMapping(value = "/listByPage",method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "获取产品评价列表，分页查询",notes="返回评价列表信息")
    public JsonResponse list(ProductCommentsDTO productCommentsDTO,
                             @RequestParam(value="pageNo",defaultValue="1") Integer pageNo,
                             @RequestParam(value = "pageSize",defaultValue = "20") Integer pageSize){
        JsonResponse resp = new JsonResponse();
        if (pageNo == null || pageNo <= 0) {
            pageNo = 1;
        }
        try{
            resp.setData(productCommentsService.productCommentsListByPage(productCommentsDTO,pageNo,pageSize));
        }catch (Exception e){
            e.printStackTrace();
            resp = JsonResponse.buildErrorResponse();
        }
        return resp;
    }

    /**
     * 添加产品评价
     * @param files 文件流数组
     * @param productComments
     * @return
     */
    @UserLoginToken
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "添加产品评价")
    public JsonResponse upload(@RequestParam("file") MultipartFile[] files,
                               ProductComments productComments) {
        JsonResponse resp = new JsonResponse();
        try{
            resp.setData(productCommentsService.add(files,productComments));
        }catch (Exception e){
            e.printStackTrace();
            resp = JsonResponse.buildErrorResponse();
        }
        return resp;
    }
}
