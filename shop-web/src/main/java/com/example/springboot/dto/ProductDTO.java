package com.example.springboot.dto;

import com.example.springboot.entity.*;
import lombok.Data;

import java.util.List;

@Data
public class ProductDTO extends Product {
  //价格升序、降序标志 1升序 2降序
  private Integer priceFlag;
  //销量升降标志 1升序 2降序
  private Integer boughtNumFlag;
  //库存升降标志 1升序 2降序
  private Integer productStockNumFlag;
  //产品图片List
  private List<CommonImage> commonImage;
  //产品详情
  private ProductDetail productDetail;
  //产品规格
  private List<ProductStandardsDTO> productStandards;
  //产品评价（只取一条）
  private List<ProductComments> productComments;
  //优惠券名称
  private List<String> couponNames;
}
