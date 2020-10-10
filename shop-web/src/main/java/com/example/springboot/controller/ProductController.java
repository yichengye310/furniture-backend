package com.example.springboot.controller;

import com.example.springboot.dto.CommonImageDTO;
import com.example.springboot.dto.ProductDTO;
import com.example.springboot.dto.UserProductsCollectionDTO;
import com.example.springboot.entity.*;
import com.example.springboot.requestVO.ProductAddRequestVO;
import com.example.springboot.requestVO.ProductUpdateImgRequestVO;
import com.example.springboot.requestVO.ProductUpdateStandardsRequestVO;
import com.example.springboot.service.ProductService;
import com.github.pagehelper.PageInfo;
import com.yelang.shop.base.annotation.UserLoginToken;
import com.yelang.shop.base.exception.JsonResponse;
import com.yelang.shop.base.exception.ServiceExceptionCode;
import com.yelang.shop.base.util.BaseUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/product")
@Api(value = "产品的增删改查")
public class ProductController extends BaseController{
    @Autowired
    private ProductService productService;

    /**
     * 发布新品
     * @param productAddRequestVO
     * @return
     */
    @UserLoginToken
    @ResponseBody
    @PostMapping("/add")
    @ApiOperation(value = "发布新品",notes="新增成功时data=1")
    public JsonResponse add(@RequestBody ProductAddRequestVO productAddRequestVO){
        JsonResponse resp = new JsonResponse();
        try{
            resp.setData(productService.add(productAddRequestVO));
        }catch (Exception e){
            e.printStackTrace();
            resp = JsonResponse.buildErrorResponse();
        }
        return resp;
    }

    /**
     * 产品列表查询（分页）【首页全部商品、首页商品搜索()\关键字搜索、价格升序降序、销量降序、默认产品ID降序】
     * @param product
     * @param pageNo
     * @param pageSize
     * @return
     */
    @ResponseBody
    @GetMapping("/productListByPage")
    @ApiOperation(value = "产品列表查询，分页查询",notes="返回产品列表关联产品图片、规格、颜色、图文")
    public JsonResponse productList(ProductDTO product,
                                    @RequestParam(value="pageNo",defaultValue="1") Integer pageNo,
                                    @RequestParam(value = "pageSize",defaultValue = "20") Integer pageSize){
        JsonResponse resp = new JsonResponse();
        if (pageNo == null || pageNo <= 0) {
            pageNo = 1;
        }
        try{
            PageInfo<ProductDTO> pageData = productService.productListByPage(product,pageNo,pageSize);
            resp.setData(pageData);
        }catch (Exception e){
            e.printStackTrace();
            resp = JsonResponse.buildErrorResponse();
        }
        return resp;
    }

    /**
     * 产品详情
     * @param productID 产品ID(必传)
     * @return
     */
    @ResponseBody
    @GetMapping("/productDetail")
    @ApiOperation(value = "产品详情",notes="返回产品详情关联图文、用户是否收藏该产品、评价")
    public JsonResponse productDetail(@RequestParam("productID") Integer productID){
        JsonResponse resp = new JsonResponse();
        try{
            resp.setData(productService.selectByPrimaryKey(productID));
        }catch (Exception e){
            e.printStackTrace();
            resp = JsonResponse.buildErrorResponse();
        }
        return resp;
    }

    /**
     * 产品编辑
     * @param product
     * @return
     */
    @UserLoginToken
    @ResponseBody
    @PostMapping("/update")
    @ApiOperation(value = "产品基本信息修改（下架、上架、删除等）",notes="成功时data=1")
    public JsonResponse updateProduct(@RequestBody Product product){
        JsonResponse resp = new JsonResponse();
        try{
            resp.setData(productService.updateProduct(product));
        }catch (Exception e){
            e.printStackTrace();
            resp = JsonResponse.buildErrorResponse();
        }
        return resp;
    }
    @UserLoginToken
    @ResponseBody
    @PostMapping("/updateImg")
    @ApiOperation(value = "产品图片修改[产品附图、富文本图文]",notes="成功时data=1")
    public JsonResponse updateImg(@RequestBody ProductUpdateImgRequestVO productUpdateImgRequestVO){
        JsonResponse resp = new JsonResponse();
        try{
            resp.setData(productService.updateImg(productUpdateImgRequestVO));
        }catch (Exception e){
            e.printStackTrace();
            resp = JsonResponse.buildErrorResponse();
        }
        return resp;
    }
    @UserLoginToken
    @ResponseBody
    @PostMapping("/updateStandards")
    @ApiOperation(value = "产品规格修改[产品规格、颜色]",notes="成功时data=1")
    public JsonResponse updateStandards(@RequestBody ProductUpdateStandardsRequestVO productUpdateStandardsRequestVO){
        JsonResponse resp = new JsonResponse();
        try{
            resp.setData(productService.updateStandards(productUpdateStandardsRequestVO));
        }catch (Exception e){
            e.printStackTrace();
            resp = JsonResponse.buildErrorResponse();
        }
        return resp;
    }



    /*
     *
     * -------------------------------------------------------产品收藏--------------------------------------------------------
     *
     *
     */

    /**
     * 添加产品收藏
     * @param userProductsCollection
     * @return
     */
    @UserLoginToken
    @ResponseBody
    @PostMapping("/addProductCollection")
    @ApiOperation(value = "添加产品收藏",notes="新增成功时data=1")
    public JsonResponse addProductCollection(@RequestBody UserProductsCollection userProductsCollection){
        JsonResponse resp = new JsonResponse();
        try{
            Integer result = productService.addProductCollection(userProductsCollection);
            if(result!=1){
                resp.setStatus(ServiceExceptionCode.DO_NOT_REPEAT_COLLCETION.getStatus());
                resp.setMessage(ServiceExceptionCode.DO_NOT_REPEAT_COLLCETION.getName());
            }
        }catch (Exception e){
            e.printStackTrace();
            resp = JsonResponse.buildErrorResponse();
        }
        return resp;
    }

    /**
     * 取消产品收藏 userID,productID必传
     * @return
     */
    @UserLoginToken
    @ResponseBody
    @PostMapping("/cancelProductCollection")
    @ApiOperation(value = "取消产品收藏,userID,productID必传",notes="成功时data=1")
    public JsonResponse cancelProductCollection(@RequestParam(name = "userID") String userID,
                                                @RequestParam(name = "productID") Integer productID){
        JsonResponse resp = new JsonResponse();
        try{
            Integer result = productService.cancelProductCollection(userID,productID);
            if(result!=1){
                resp.setStatus(ServiceExceptionCode.UNCOLLECTED_PRODUCTS.getStatus());
                resp.setMessage(ServiceExceptionCode.UNCOLLECTED_PRODUCTS.getName());
            }
        }catch (Exception e){
            e.printStackTrace();
            resp = JsonResponse.buildErrorResponse();
        }
        return resp;
    }

    /**
     * 删除收藏（多个）
     * @param jsonStr
     * @return
     */
    @UserLoginToken
    @RequestMapping(value = "/deleteProductCollection",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "删除收藏（多个）",notes="成功时data=1")
    public JsonResponse deleteProductCollection(@RequestParam(name = "jsonStr") String jsonStr){
        JsonResponse resp = new JsonResponse();
        try{
            List<Integer> collectedProductIDs = BaseUtils.jsonCastToIntegerList(jsonStr);
            if(collectedProductIDs!=null&& collectedProductIDs.size()>0){
                for(Integer collectedProductID:collectedProductIDs){
                    productService.deleteProductCollection(collectedProductID);
                }
                resp.setData(1);
            }else{
                resp = JsonResponse.buildErrorResponse();
            }
        }catch (Exception e){
            e.printStackTrace();
            resp = JsonResponse.buildErrorResponse();
        }
        return resp;
    }

    /**
     * 产品收藏列表
     * @param userProductsCollectionDTO
     * @param pageNo
     * @param pageSize
     * @return
     */
    @UserLoginToken
    @RequestMapping(value = "/collectionListByPage",method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "产品收藏列表（我的收藏）",notes="返回产品收藏列表信息")
    public JsonResponse collectionListByPage(UserProductsCollectionDTO userProductsCollectionDTO,
                                             @RequestParam(value="pageNo",defaultValue="1") Integer pageNo,
                                             @RequestParam(value = "pageSize",defaultValue = "20") Integer pageSize){
        JsonResponse resp = new JsonResponse();
        if (pageNo == null || pageNo <= 0) {
            pageNo = 1;
        }
        try{
            resp.setData(productService.collectionListByPage(userProductsCollectionDTO,pageNo,pageSize));
        }catch (Exception e){
            e.printStackTrace();
            resp = JsonResponse.buildErrorResponse();
        }
        return resp;
    }





    /**
     * 查询用户是否已经收藏产品
     * @param productID
     * @param userID
     * @return
     */
    @UserLoginToken
    @ResponseBody
    @GetMapping("isNotCollect")
    @ApiOperation(value = "查询用户是否已经收藏产品",notes="data=1时表示该用户收藏了产品，data=0时表示该用户未收藏产品")
    public JsonResponse isNotCollect(@RequestParam(name = "productID") Integer productID,
                                     @RequestParam(name = "userID") String userID){
        JsonResponse resp = new JsonResponse();
        try{
            resp.setData(productService.selectByProductIDAndUserID(productID,userID));
        }catch (Exception e){
            e.printStackTrace();
            resp = JsonResponse.buildErrorResponse();
        }
        return resp;
    }

    /*
     *
     * -------------------------------------------------------图片管理--------------------------------------------------------
     *
     *
     */

    /**
     * 产品活动图、热门产品图列表查询
     * @param commonImage
     * @param pageNo
     * @param pageSize
     * @return
     */
    @ResponseBody
    @GetMapping("/commonImageListByPage")
    @ApiOperation(value = "产品活动图、热门产品图列表查询",notes="返回产品活动图、热门产品图列表（关联产品信息）")
    public JsonResponse productRotationList(CommonImage commonImage,
                                            @RequestParam(value="pageNo",defaultValue="1") Integer pageNo,
                                            @RequestParam(value = "pageSize",defaultValue = "20") Integer pageSize){
        JsonResponse resp = new JsonResponse();
        if (pageNo == null || pageNo <= 0) {
            pageNo = 1;
        }
        try{
            PageInfo<CommonImageDTO> pageData = productService.productRotationList(commonImage,pageNo,pageSize);
            resp.setData(pageData);
        }catch (Exception e){
            e.printStackTrace();
            resp = JsonResponse.buildErrorResponse();
        }
        return resp;
    }

    /**
     * 删除公共图片、产品活动图、热门推荐图
     * @param imageID
     * @return
     */
    @UserLoginToken
    @ResponseBody
    @PostMapping(value = "/deleteCommonImg")
    @ApiOperation(value = "删除公共图片、产品活动图、热门推荐图",notes = "imageID必填")
    public JsonResponse deleteCommonImg(@RequestParam(name = "imageID") Integer imageID){
        JsonResponse resp = new JsonResponse();
        try{
            productService.deleteCommonImg(imageID);
        }catch (Exception e){
            e.printStackTrace();
            resp = JsonResponse.buildErrorResponse();
        }
        return resp;
    }

    /**
     * 添加产品活动、热门推荐
     * @param commonImage
     * @return
     */
    @UserLoginToken
    @ResponseBody
    @RequestMapping(value = "/addCommonImg",method = RequestMethod.POST)
    @ApiOperation(value = "添加产品活动、热门推荐")
    public JsonResponse addCommonImg(@RequestBody CommonImage commonImage){
        JsonResponse response = new JsonResponse();
        try{
            productService.addCommonImg(commonImage);
        } catch (Exception e) {
            return JsonResponse.buildErrorResponse();
        }
        return response;
    }

    /**
     * 编辑产品活动、热门推荐
     * @param commonImage
     * @return
     */
    @UserLoginToken
    @ResponseBody
    @RequestMapping(value = "/updateCommonImg",method = RequestMethod.POST)
    @ApiOperation(value = "编辑产品活动、热门推荐")
    public JsonResponse updateCommonImg(@RequestBody CommonImage commonImage){
        JsonResponse response = new JsonResponse();
        try{
            productService.updateCommonImg(commonImage);
        } catch (Exception e) {
            return JsonResponse.buildErrorResponse();
        }
        return response;
    }
}
