package com.example.springboot.requestVO;

import com.example.springboot.entity.CommonImage;
import com.example.springboot.entity.ProductDetail;
import lombok.Data;

import java.util.List;

@Data
public class ProductUpdateImgRequestVO {
    private Integer productID;//产品ID
    private ProductDetail productDetail;//图文
    private List<CommonImage> commonImages;//产品附图
}
