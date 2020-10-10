package com.example.springboot.service;

import com.example.springboot.dto.*;
import com.example.springboot.entity.*;
import com.example.springboot.mapper.*;
import com.example.springboot.requestVO.ProductAddRequestVO;
import com.example.springboot.requestVO.ProductUpdateImgRequestVO;
import com.example.springboot.requestVO.ProductUpdateStandardsRequestVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private ProductCommentsMapper productCommentsMapper;
    @Autowired
    private UserProductsCollectionMapper productsCollectionMapper;
    @Autowired
    private CommonImageMapper commonImageMapper;
    @Autowired
    private ProductStandardsMapper productStandardsMapper;
    @Autowired
    private ProductStandardsColourMapper productStandardsColourMapper;
    @Autowired
    private ProductDetailMapper productDetailMapper;
    @Autowired
    private CouponModelMapper couponModelMapper;

    @Transactional
    public Integer add(ProductAddRequestVO productAddRequestVO){
        if(productAddRequestVO !=null){
            //产品基本信息添加
            productAddRequestVO.getProduct().setCreatedTimestamp(System.currentTimeMillis());
            productMapper.insertSelective(productAddRequestVO.getProduct());
            Integer productID = productAddRequestVO.getProduct().getProductID();
            if(productID!=null){
                //产品图文添加
                productAddRequestVO.getProductDetail().setProductID(productID.longValue());
                productDetailMapper.insertSelective(productAddRequestVO.getProductDetail());
                //产品附图添加
                if(productAddRequestVO.getCommonImages()!=null && productAddRequestVO.getCommonImages().size()>0){
                    for(CommonImage c: productAddRequestVO.getCommonImages()){
                        CommonImage commonImage = new CommonImage();
                        commonImage.setRelationID(productID);
                        commonImage.setFlag((short) 1);
                        commonImage.setImageUrl(c.getImageUrl());
                        commonImageMapper.insertSelective(commonImage);
                    }
                }
                //产品规格添加
                if(productAddRequestVO.getProductStandardsDTOS()!=null && productAddRequestVO.getProductStandardsDTOS().size()>0){
                    Integer lowPrice = productAddRequestVO.getProductStandardsDTOS().get(0).getBandPrice();//规格最低价
                    Integer totalStockNum = 0;//总库存
                    for(ProductStandardsDTO productStandardsDTO: productAddRequestVO.getProductStandardsDTOS()){
                        ProductStandards productStandards = new ProductStandards();
                        productStandards.setBandProductID(productID);
                        productStandards.setStandard(productStandardsDTO.getStandard());
                        productStandards.setBandPrice(productStandardsDTO.getBandPrice());
                        productStandards.setTradePrice(productStandardsDTO.getTradePrice());
                        productStandardsMapper.insertSelective(productStandards);
                        if(productStandardsDTO.getBandPrice()!=null && productStandardsDTO.getBandPrice()<lowPrice){
                            lowPrice = productStandardsDTO.getBandPrice();
                        }
                        Integer standardID = productStandards.getStandardID();
                        //产品细目（颜色）添加
                        if(standardID!=null){
                            if(productStandardsDTO.getProductStandardsColours()!=null &&productStandardsDTO.getProductStandardsColours().size()>0){
                                for(ProductStandardsColour productStandardsColour:productStandardsDTO.getProductStandardsColours()){
                                    productStandardsColour.setBandStandardID(standardID);
                                    totalStockNum = totalStockNum + productStandardsColour.getProductStockNum();
                                    productStandardsColourMapper.insertSelective(productStandardsColour);
                                }
                            }
                        }
                    }
                    Product p = new Product();
                    p.setLowPrice(lowPrice);
                    p.setProductID(productID);
                    p.setProductStockNum(totalStockNum);
                    productMapper.updateByPrimaryKeySelective(p);
                }
            }
        }
        return 1;
    }
    public PageInfo<ProductDTO> productListByPage(ProductDTO product, Integer pageNo, Integer pageSize) {
        if(product.getPriceFlag()!=null){//1升序 2降序
            if(product.getPriceFlag()==1){
                PageHelper.startPage(pageNo,pageSize,"lowPrice ASC");
            }
            if(product.getPriceFlag()==2){
                PageHelper.startPage(pageNo,pageSize,"lowPrice DESC");
            }
        }else if(product.getBoughtNumFlag()!=null){//1升序 2降序
            if(product.getBoughtNumFlag()==1){
                PageHelper.startPage(pageNo,pageSize,"boughtNum ASC");
            }
            if(product.getBoughtNumFlag()==2){
                PageHelper.startPage(pageNo,pageSize,"boughtNum DESC");
            }
        }else if(product.getProductStockNum()!= null){//1升序 2降序
            if(product.getProductStockNum()==1){
                PageHelper.startPage(pageNo,pageSize,"productStockNum ASC");
            }
            if(product.getProductStockNum()==2){
                PageHelper.startPage(pageNo,pageSize,"productStockNum DESC");
            }
        }else{
            PageHelper.startPage(pageNo,pageSize,"productID DESC");
        }
        List<ProductDTO> pageData = productMapper.productListByPage(product);
        PageInfo<ProductDTO> pageInfo = new PageInfo<>(pageData);
        return pageInfo;
    }
    public ProductDTO selectByPrimaryKey(Integer productID){
        PageHelper.startPage(1,1,"evaluateID DESC");
        ProductDTO productDTO = null;
        /*获取商品评价数据*/
        ProductComments productComments = new ProductComments();
        productComments.setProductID(productID);
        List<ProductComments> pageData = productCommentsMapper.productCommentsList(productComments);

        /*获取商品优惠券名称数据*/
        List<String> couponNames = new ArrayList<>();
        couponNames = couponModelMapper.getCouponNames();

        productDTO = productMapper.selectByPrimaryKey(productID);
        productDTO.setProductComments(pageData);
        productDTO.setCouponNames(couponNames);
        return productDTO;
    }
    public Integer updateProduct(Product product){
        return productMapper.updateByPrimaryKeySelective(product);
    }
    @Transactional
    public Integer updateImg(ProductUpdateImgRequestVO productUpdateImgRequestVO){
        if(productUpdateImgRequestVO.getProductID()!=null){
            Integer productID = productUpdateImgRequestVO.getProductID();
            //step1:更新产品详情
            productUpdateImgRequestVO.getProductDetail().setProductID(Long.valueOf(productID));
            productDetailMapper.updateByPrimaryKeySelective(productUpdateImgRequestVO.getProductDetail());

            //step2：更新产品附图(先删除，后新增)
            if(productUpdateImgRequestVO.getCommonImages()!=null && productUpdateImgRequestVO.getCommonImages().size()>0){
                CommonImage commonImage = new CommonImage();
                commonImage.setRelationID(productID);
                commonImage.setFlag((short) 1);
                commonImageMapper.deleteByProductID(commonImage);
                for(CommonImage c:productUpdateImgRequestVO.getCommonImages()){
                    commonImage.setRelationID(productID);
                    commonImage.setFlag((short) 1);
                    commonImage.setImageUrl(c.getImageUrl());
                    commonImageMapper.insertSelective(commonImage);
                }
            }
        }
        return 1;
    }
    @Transactional
    public Integer updateStandards(ProductUpdateStandardsRequestVO productUpdateStandardsRequestVO){
        if(productUpdateStandardsRequestVO.getProductStandardsDTOS()!=null && productUpdateStandardsRequestVO.getProductStandardsDTOS().size()>0){
            if(productUpdateStandardsRequestVO.getProductID()!=null){
                Integer productID = productUpdateStandardsRequestVO.getProductID();
                List<ProductStandards> productStandardsList = productStandardsMapper.selectByProductID(productID);
                if(productStandardsList!=null && productStandardsList.size()>0){
                    for(ProductStandards p:productStandardsList){
                        Integer standardID = p.getStandardID();
                        //step1：删除规格
                        productStandardsMapper.deleteByPrimaryKey(standardID);
                        //step2:删除细目
                        productStandardsColourMapper.deleteByStandardID(standardID);
                    }
                   //step3:新增规格和细目
                    Integer lowPrice = productUpdateStandardsRequestVO.getProductStandardsDTOS().get(0).getBandPrice();
                    for(ProductStandardsDTO productStandardsDTO: productUpdateStandardsRequestVO.getProductStandardsDTOS()){
                        ProductStandards productStandards = new ProductStandards();
                        productStandards.setBandProductID(productID);
                        productStandards.setStandard(productStandardsDTO.getStandard());
                        productStandards.setBandPrice(productStandardsDTO.getBandPrice());
                        productStandards.setTradePrice(productStandardsDTO.getTradePrice());
                        productStandardsMapper.insertSelective(productStandards);
                        if(productStandardsDTO.getBandPrice()!=null && productStandardsDTO.getBandPrice()<lowPrice){
                            lowPrice = productStandardsDTO.getBandPrice();
                        }
                        Integer standardID = productStandards.getStandardID();
                        //产品细目（颜色）添加
                        if(standardID!=null){
                            if(productStandardsDTO.getProductStandardsColours()!=null &&productStandardsDTO.getProductStandardsColours().size()>0){
                                for(ProductStandardsColour productStandardsColour:productStandardsDTO.getProductStandardsColours()){
                                    productStandardsColour.setBandStandardID(standardID);
                                    productStandardsColourMapper.insertSelective(productStandardsColour);
                                }
                            }
                        }
                    }
                    Product p = new Product();
                    p.setLowPrice(lowPrice);
                    p.setProductID(productID);
                    productMapper.updateByPrimaryKeySelective(p);
                }
            }
        }
        return 1;
    }
    public Integer addProductCollection(UserProductsCollection userProductsCollection){
        if(userProductsCollection.getProductID()!=null){
            //判断用户是否已经收藏该产品
            UserProductsCollection data = productsCollectionMapper.selectByUserIDAndProductID(userProductsCollection);
            if(data!=null){
                return -1;
            }
            //更新产品收藏数
            productMapper.addCollectNum(userProductsCollection.getProductID());
        }
        userProductsCollection.setCreatedTimestamp(System.currentTimeMillis());
        return productsCollectionMapper.insertSelective(userProductsCollection);
    }
    public Integer cancelProductCollection(String userID,Integer productID){
        UserProductsCollection userProductsCollection = new UserProductsCollection();
        userProductsCollection.setUserID(userID);
        userProductsCollection.setProductID(productID);
        userProductsCollection = productsCollectionMapper.selectByUserIDAndProductID(userProductsCollection);
        if(userProductsCollection!=null){
            //step1:更新产品收藏数
            productMapper.cancelCollectNum(productID);
            //step2:删除收藏
            productsCollectionMapper.deleteByUserIDAndProductID(userProductsCollection);
        }else{
            return -1;
        }
        return 1;
    }
    @Transactional
    public Integer deleteProductCollection(Integer collectedProductID){
        productMapper.updateCollectNum(collectedProductID);
        return productsCollectionMapper.deleteByPrimaryKey(collectedProductID);
    }
    public PageInfo<UserProductsCollectionDTO> collectionListByPage(UserProductsCollectionDTO userProductsCollectionDTO, Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize,"collectedProductID DESC");
        List<UserProductsCollectionDTO> pageData = productsCollectionMapper.collectionListByPage(userProductsCollectionDTO);
        PageInfo<UserProductsCollectionDTO> pageInfo = new PageInfo<>(pageData);
        return pageInfo;
    }
    public Integer selectByProductIDAndUserID(Integer productID,String userID){
        UserProductsCollection userProductsCollection = new UserProductsCollection();
        userProductsCollection.setProductID(productID);
        userProductsCollection.setUserID(userID);
        UserProductsCollection u = productsCollectionMapper.selectByUserIDAndProductID(userProductsCollection);
        if(u!=null){
            return 1;
        }
        return 0;
    }
    public PageInfo<CommonImageDTO> productRotationList(CommonImage commonImage, Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize,"imageID DESC");
        //List<CommonImageDTO> pageData = null;
//        if(commonImage.getFlag()!=null&&commonImage.getFlag()==4){//热门推荐图需要关联产品展示
//            pageData = commonImageMapper.selectListRelationProduct(commonImage);
//        }else{
//            pageData = commonImageMapper.selectList(commonImage);
//        }
        List<CommonImageDTO> pageData = commonImageMapper.selectListRelationProduct(commonImage);
        PageInfo<CommonImageDTO> pageInfo = new PageInfo<>(pageData);
        return pageInfo;
    }
    public void deleteCommonImg(Integer imageID){
        commonImageMapper.deleteByPrimaryKey(imageID);
    }
    public void addCommonImg(CommonImage commonImage){
        commonImageMapper.insertSelective(commonImage);
    }
    public void updateCommonImg(CommonImage commonImage){
        commonImageMapper.updateByPrimaryKeySelective(commonImage);
    }
}
