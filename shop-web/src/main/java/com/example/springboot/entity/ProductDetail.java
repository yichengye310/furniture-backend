package com.example.springboot.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@ApiModel(value = "ProductDetail",description = "产品图文实体")
public class ProductDetail {
    /**
     * 
     */
    @ApiModelProperty(value = "productID")
    @Id
    private Long productID;
    /**
     * 产品图文
     */
    @ApiModelProperty(value = "产品图文，富文本编辑器内容（用于APP展示）")
    private String appDescription;
    /**
     * 产品图文
     */
    @ApiModelProperty(value = "产品图文，富文本编辑器内容（用于PC展示）")
    private String productPCDescription;
}