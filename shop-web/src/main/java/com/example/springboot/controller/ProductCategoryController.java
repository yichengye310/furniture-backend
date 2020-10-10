package com.example.springboot.controller;

import com.example.springboot.dto.ProductCategoryLevelTwoDTO;
import com.example.springboot.entity.ProductCategoryLevelThree;
import com.example.springboot.entity.ProductCategoryLevelTwo;
import com.example.springboot.service.ProductCategoryService;
import com.yelang.shop.base.annotation.UserLoginToken;
import com.yelang.shop.base.exception.JsonResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@Controller
@RequestMapping(value = "/category")
@Api(value = "产品种类的增删改查")
public class ProductCategoryController {
    @Autowired
    private ProductCategoryService productCategoryService;


    /**
     * 产品种类列表查询关联系列
     * @param productCategoryLevelTwoDTO
     * @param levelFlag 种类级别 1级分类 2级分类 3三级分类
     * @param pageNo
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "/categoryLevelTwoListByPage",method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "产品种类列表关联系列表，不分页",notes="返回产品种类关联系列列表信息")
    public JsonResponse categoryLevelTwoListByPage(ProductCategoryLevelTwoDTO productCategoryLevelTwoDTO,
                                                   @RequestParam(required = false) Integer levelFlag,
                                                   @RequestParam(value="pageNo",defaultValue="1") Integer pageNo,
                                                   @RequestParam(value = "pageSize",defaultValue = "99") Integer pageSize){
        JsonResponse resp = new JsonResponse();
        if (pageNo == null || pageNo <= 0) {
            pageNo = 1;
        }
        try{
            resp.setData(productCategoryService.categoryLevelTwoListByPage(productCategoryLevelTwoDTO,pageNo,pageSize));
        }catch (Exception e){
            e.printStackTrace();
            resp = JsonResponse.buildErrorResponse();
        }
        return resp;
    }

    /**
     * 通过种类ID获取系列列表
     * @param productCategoryLevelThree
     * @param pageNo
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "/categoryLevelThreeListByPage",method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "通过种类ID获取系列，不分页",notes = "返回系列列表信息")
    public JsonResponse productCategoryLevelThreeListByPage(ProductCategoryLevelThree productCategoryLevelThree,
                                       @RequestParam(value="pageNo",defaultValue="1") Integer pageNo,
                                       @RequestParam(value = "pageSize",defaultValue = "99") Integer pageSize){
        JsonResponse resp = new JsonResponse();
        if (pageNo == null || pageNo <= 0) {
            pageNo = 1;
        }
        try{
            resp.setData(productCategoryService.productCategoryLevelThreeListByPage(productCategoryLevelThree,pageNo,pageSize));
        }catch (Exception e){
            e.printStackTrace();
            resp = JsonResponse.buildErrorResponse();
        }
        return resp;
    }

    /**
     * 添加系列
     * @param productCategoryLevelThree
     * @return
     */
    @UserLoginToken
    @RequestMapping(value = "/categoryLevelThreeAdd",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "添加产品系列",notes = "添加成功时后台返回data=1")
    public JsonResponse categoryLevelThreeAdd(@RequestBody ProductCategoryLevelThree productCategoryLevelThree){
        JsonResponse resp = new JsonResponse();
        try{
           resp.setData(productCategoryService.categoryLevelThreeAdd(productCategoryLevelThree));
        }catch (Exception e){
            e.printStackTrace();
            resp = JsonResponse.buildErrorResponse();
        }
        return resp;
    }

    /**
     * 添加产品种类
     * @param productCategoryLevelTwo
     * @return
     */
    @UserLoginToken
    @RequestMapping(value = "/categoryLevelTwoAdd",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "添加产品分类",notes = "添加成功时后台返回data=1")
    public JsonResponse categoryLevelTwoAdd(@RequestBody ProductCategoryLevelTwo productCategoryLevelTwo){
        JsonResponse resp = new JsonResponse();
        try{
            resp.setData(productCategoryService.categoryLevelTwoAdd(productCategoryLevelTwo));
        }catch (Exception e){
            e.printStackTrace();
            resp = JsonResponse.buildErrorResponse();
        }
        return resp;
    }

    /**
     * 删除分类
     * @param categoryID 分类ID
     * @return
     */
    @UserLoginToken
    @RequestMapping(value = "/deleteCategoryLevelTwo",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "删除分类",notes = "删除分类时会同时删除分类下所有系列")
    public JsonResponse deleteCategoryLevelTwo(@RequestParam(name = "categoryID") Integer categoryID){
        JsonResponse response = new JsonResponse();
        try{
            response.setData(productCategoryService.deleteCategoryLevelTwo(categoryID));
        }catch (Exception e){
            e.printStackTrace();
            response = JsonResponse.buildErrorResponse();
        }
        return response;
    }

    /**
     * 编辑二级分类
     * @param productCategoryLevelTwo
     * @return
     */
    @UserLoginToken
    @RequestMapping(value = "/updateCategoryLevelTwo",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "编辑分类",notes ="成功时data返回1")
    public JsonResponse updateCategoryLevelTwo(@RequestBody ProductCategoryLevelTwo productCategoryLevelTwo){
        JsonResponse response = new JsonResponse();
        try{
            response.setData(productCategoryService.updateCategoryLevelTwo(productCategoryLevelTwo));
        }catch (Exception e){
            e.printStackTrace();
            response = JsonResponse.buildErrorResponse();
        }
        return response;
    }

    /**
     * 编辑系列
     * @param productCategoryLevelThree
     * @return
     */
    @UserLoginToken
    @RequestMapping(value = "/updateCategoryLevelThree",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "编辑系列",notes ="成功时data返回1")
    public JsonResponse updateCategoryLevelThree(@RequestBody ProductCategoryLevelThree productCategoryLevelThree){
        JsonResponse response = new JsonResponse();
        try{
            response.setData(productCategoryService.updateCategoryLevelThree(productCategoryLevelThree));
        }catch (Exception e){
            e.printStackTrace();
            response = JsonResponse.buildErrorResponse();
        }
        return response;
    }

    /**
     * 删除系列
     * @param categoryID 系列id
     * @return
     */
    @UserLoginToken
    @RequestMapping(value = "/deleteCategoryLevelThree",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "删除系列",notes = "删除系列")
    public JsonResponse deleteCategoryLevelThree(@RequestParam(name = "categoryID") Integer categoryID){
        JsonResponse response = new JsonResponse();
        try{
            response.setData(productCategoryService.deleteCategoryLevelThree(categoryID));
        }catch (Exception e){
            e.printStackTrace();
            response = JsonResponse.buildErrorResponse();
        }
        return response;
    }
}
