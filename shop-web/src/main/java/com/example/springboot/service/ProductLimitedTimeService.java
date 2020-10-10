package com.example.springboot.service;

import com.example.springboot.dto.ProductLimitedTimeDTO;
import com.example.springboot.dto.ProductLimitedTimeStandardsDTO;
import com.example.springboot.entity.*;
import com.example.springboot.mapper.*;
import com.example.springboot.requestVO.ProductLimitedTimeAddRequestVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductLimitedTimeService {
    @Autowired
    private ProductLimitedTimeMapper productLimitedTimeMapper;
    @Autowired
    private ProductLimitedTimeDetailMapper productLimitedTimeDetailMapper;
    @Autowired
    private CommonImageMapper commonImageMapper;
    @Autowired
    private ProductLimitedTimeStandardsMapper productLimitedTimeStandardsMapper;
    @Autowired
    private ProductLimitedTimeStandardsColourMapper productLimitedTimeStandardsColourMapper;
    @Transactional
    public Integer add(ProductLimitedTimeAddRequestVO productLimitedTimeAddRequestVO){
        if(productLimitedTimeAddRequestVO !=null){
            if(productLimitedTimeAddRequestVO.getProductLimitedTimeDTOS()!=null &&productLimitedTimeAddRequestVO.getProductLimitedTimeDTOS().size()>0){
                for(ProductLimitedTimeDTO productLimitedTimeDTO:productLimitedTimeAddRequestVO.getProductLimitedTimeDTOS()){
                    //产品基本信息添加
                    productLimitedTimeDTO.setCreatedTimestamp(System.currentTimeMillis());
                    productLimitedTimeMapper.insertSelective(productLimitedTimeDTO);
                    Integer productID = productLimitedTimeDTO.getLimitedTimeProductID();
                    if(productID!=null){
                        //产品图文添加
                        productLimitedTimeDTO.getProductLimitedTimeDetail().setProductLimitedTimeID(productID.longValue());
                        productLimitedTimeDetailMapper.insertSelective(productLimitedTimeDTO.getProductLimitedTimeDetail());
                        //产品附图添加
                        if(productLimitedTimeDTO.getCommonImage()!=null && productLimitedTimeDTO.getCommonImage().size()>0){
                            for(CommonImage c: productLimitedTimeDTO.getCommonImage()){
                                CommonImage commonImage = new CommonImage();
                                commonImage.setRelationID(productID);
                                commonImage.setFlag((short) 5);
                                commonImage.setImageUrl(c.getImageUrl());
                                commonImageMapper.insertSelective(commonImage);
                            }
                        }
                        //产品规格添加
                        if(productLimitedTimeDTO.getProductLimitedTimeStandardsDTOS()!=null && productLimitedTimeDTO.getProductLimitedTimeStandardsDTOS().size()>0){
                            for(ProductLimitedTimeStandardsDTO productLimitedTimeStandardsDTO: productLimitedTimeDTO.getProductLimitedTimeStandardsDTOS()){
                                ProductLimitedTimeStandards productLimitedTimeStandards = new ProductLimitedTimeStandards();
                                productLimitedTimeStandards.setBandProductID(productID);
                                productLimitedTimeStandards.setStandard(productLimitedTimeStandardsDTO.getStandard());
                                productLimitedTimeStandards.setOriginalPrice(productLimitedTimeStandardsDTO.getOriginalPrice());
                                productLimitedTimeStandards.setDiscountPrice(productLimitedTimeStandardsDTO.getDiscountPrice());
                                productLimitedTimeStandards.setTradePrice(productLimitedTimeStandardsDTO.getTradePrice());
                                productLimitedTimeStandardsMapper.insertSelective(productLimitedTimeStandards);
                                Integer standardID = productLimitedTimeStandards.getStandardID();
                                //产品细目（颜色）添加
                                if(standardID!=null){
                                    if(productLimitedTimeStandardsDTO.getProductLimitedTimeStandardsColour()!=null &&productLimitedTimeStandardsDTO.getProductLimitedTimeStandardsColour().size()>0){
                                        for(ProductLimitedTimeStandardsColour productLimitedTimeStandardsColour:productLimitedTimeStandardsDTO.getProductLimitedTimeStandardsColour()){
                                            productLimitedTimeStandardsColour.setBandStandardID(standardID);
                                            productLimitedTimeStandardsColourMapper.insertSelective(productLimitedTimeStandardsColour);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

        }
        return 1;
    }
    public Integer edit(ProductLimitedTimeAddRequestVO productLimitedTimeAddRequestVO){
        if(productLimitedTimeAddRequestVO!=null){
            if(productLimitedTimeAddRequestVO.getProductLimitedTimeDTOS()!=null &&productLimitedTimeAddRequestVO.getProductLimitedTimeDTOS().size()>0){
                for(ProductLimitedTime productLimitedTime:productLimitedTimeAddRequestVO.getProductLimitedTimeDTOS()){
                    //删除
                    delete(productLimitedTime.getLimitedTimeProductID());
                    //新增
                    add(productLimitedTimeAddRequestVO);
                }
            }
        }
        return 1;
    }
    public PageInfo<ProductLimitedTimeDTO> productLimitedTimeListByPage(ProductLimitedTimeDTO productLimitedTimeDTO, Integer pageNo, Integer pageSize,Integer type) {
        PageHelper.startPage(pageNo,pageSize,"limitedTimeProductID DESC");
        List<ProductLimitedTimeDTO> pageData = productLimitedTimeMapper.productLimitedTimeListByPage(productLimitedTimeDTO,type);
        PageInfo<ProductLimitedTimeDTO> pageInfo = new PageInfo<>(pageData);
        return pageInfo;
    }
    public ProductLimitedTimeDTO selectByPrimaryKey(Integer productLimitedTimeID){
        return productLimitedTimeMapper.selectByPrimaryKey(productLimitedTimeID);
    }
    public int delete(Integer productLimitedTimeID){
        //step1:删除限时抢购基本信息
        productLimitedTimeMapper.deleteByPrimaryKey(productLimitedTimeID);
        //step2:删除附图
        CommonImage commonImage = new CommonImage();
        commonImage.setFlag((short) 5);
        commonImage.setRelationID(productLimitedTimeID);
        commonImageMapper.deleteByProductID(commonImage);
        //step3:删除图文
        productLimitedTimeDetailMapper.deleteByPrimaryKey(Long.valueOf(productLimitedTimeID));
        //step4:删除规格
        ProductLimitedTimeStandards productLimitedTimeStandards = new ProductLimitedTimeStandards();
        productLimitedTimeStandards.setBandProductID(productLimitedTimeID);
        List<ProductLimitedTimeStandards> productLimitedTimeStandardsList =
                productLimitedTimeStandardsMapper.selectByProductLimitedTimeID(productLimitedTimeStandards);
        if(productLimitedTimeStandardsList!=null && productLimitedTimeStandardsList.size()>0){
            for(ProductLimitedTimeStandards p:productLimitedTimeStandardsList){
                Integer standardID = p.getStandardID();
                productLimitedTimeStandardsMapper.deleteByPrimaryKey(standardID);
                //step5:删除颜色
                productLimitedTimeStandardsColourMapper.deleteByStandardID(standardID);
            }
        }
        return 1;
    }
}
