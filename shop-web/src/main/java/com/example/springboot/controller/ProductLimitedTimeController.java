package com.example.springboot.controller;

import com.example.springboot.dto.ProductLimitedTimeDTO;
import com.example.springboot.requestVO.ProductLimitedTimeAddRequestVO;
import com.example.springboot.service.ProductLimitedTimeService;
import com.github.pagehelper.PageInfo;
import com.yelang.shop.base.annotation.UserLoginToken;
import com.yelang.shop.base.exception.JsonResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/productLimitedTime")
@Api(value = "限时抢购产品的增删改查")
public class ProductLimitedTimeController extends BaseController{
    @Autowired
    private ProductLimitedTimeService productLimitedTimeService;

    //新增限时抢购产品
    @UserLoginToken
    @ResponseBody
    @PostMapping("/add")
    @ApiOperation(value = "新增限时抢购产品",notes="新增成功时data=1")
    public JsonResponse add(@RequestBody ProductLimitedTimeAddRequestVO productLimitedTimeAddRequestVO){
        JsonResponse resp = new JsonResponse();
        try{
            resp.setData(productLimitedTimeService.add(productLimitedTimeAddRequestVO));
        }catch (Exception e){
            e.printStackTrace();
            resp = JsonResponse.buildErrorResponse();
        }
        return resp;
    }

    //编辑限时抢购产品
    @UserLoginToken
    @ResponseBody
    @PostMapping("/edit")
    @ApiOperation(value = "编辑限时抢购产品",notes="编辑成功时data=1")
    public JsonResponse edit(@RequestBody ProductLimitedTimeAddRequestVO productLimitedTimeAddRequestVO){
        JsonResponse resp = new JsonResponse();
        try{
            resp.setData(productLimitedTimeService.edit(productLimitedTimeAddRequestVO));
        }catch (Exception e){
            e.printStackTrace();
            resp = JsonResponse.buildErrorResponse();
        }
        return resp;
    }

    /**
     * 限时抢购产品列表分页查询
     * @param productLimitedTimeDTO
     * @param pageNo
     * @param pageSize
     * @return
     */
    @ResponseBody
    @GetMapping("/productLimitedTimeListByPage")
    @ApiOperation(value = "限时抢购产品列表查询，分页查询",notes="返回限时抢购产品列表关联产品图片、规格、颜色、图文")
    public JsonResponse productLimitedTimeListByPage(ProductLimitedTimeDTO productLimitedTimeDTO,
                                                     @RequestParam(value="pageNo",defaultValue="1") Integer pageNo,
                                                     @RequestParam(value = "pageSize",defaultValue = "999") Integer pageSize,
                                                     @RequestParam(value = "type",required = false) Integer type){
        JsonResponse resp = new JsonResponse();
        if (pageNo == null || pageNo <= 0) {
            pageNo = 1;
        }
        try{
            PageInfo<ProductLimitedTimeDTO> pageData = productLimitedTimeService.productLimitedTimeListByPage(productLimitedTimeDTO,pageNo,pageSize,type);
            resp.setData(pageData);
        }catch (Exception e){
            e.printStackTrace();
            resp = JsonResponse.buildErrorResponse();
        }
        return resp;
    }

    /**
     * 限时抢购产品详情
     * @param productLimitedTimeID
     * @return
     */
    @ResponseBody
    @GetMapping("/productLimitedTimeDetail")
    @ApiOperation(value = "限时抢购产品详情",notes="返回产品详情关联图文")
    public JsonResponse productLimitedTimeDetail(@RequestParam("productLimitedTimeID") Integer productLimitedTimeID){
        JsonResponse resp = new JsonResponse();
        try{
            resp.setData(productLimitedTimeService.selectByPrimaryKey(productLimitedTimeID));
        }catch (Exception e){
            e.printStackTrace();
            resp = JsonResponse.buildErrorResponse();
        }
        return resp;
    }

    /**
     * 删除限时抢购
     * @param productLimitedTimeID
     * @return
     */
    @UserLoginToken
    @ResponseBody
    @PostMapping("/delete")
    @ApiModelProperty(value = "删除",notes = "删除成功时，data返回1")
    public JsonResponse delete(@RequestParam(name = "productLimitedTimeID") Integer productLimitedTimeID){
        JsonResponse resp = new JsonResponse();
        try{
            resp.setData(productLimitedTimeService.delete(productLimitedTimeID));
        }catch (Exception e){
            e.printStackTrace();
            resp = JsonResponse.buildErrorResponse();
        }
        return resp;
    }
}
