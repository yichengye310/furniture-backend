package com.example.springboot.requestVO;

import com.example.springboot.dto.ProductStandardsDTO;
import com.example.springboot.entity.CommonImage;
import com.example.springboot.entity.Product;
import com.example.springboot.entity.ProductDetail;
import lombok.Data;

import java.util.List;

@Data
public class ProductAddRequestVO {
    private Product product;//产品基本信息
    private ProductDetail productDetail;//图文
    private List<CommonImage> commonImages;//产品附图
    private List<ProductStandardsDTO> productStandardsDTOS;//规格
}
