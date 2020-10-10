package com.example.springboot.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@ApiModel(value = "ProductStandardsColour",description = "产品颜色细目")
public class ProductStandardsColour {
    /**
     * 颜色细目ID
     */
    @ApiModelProperty(value = "colourID")
    @Id
    private Integer colourID;
    /**
     * 规格ID
     */
    @ApiModelProperty(value = "规格ID")
    private Integer bandStandardID;
    /**
     * 颜色
     */
    @ApiModelProperty(value = "颜色")
    private String colourName;
    /**
     * 该款颜色对应产品的图片地址
     */
    @ApiModelProperty(value = "该款颜色对应产品的图片地址")
    private String colourImage;
    /**
     * 信息状态 1：正常  9：废弃
     */
    @ApiModelProperty(value = "信息状态 1：正常  9：废弃")
    private Short state;
    /**
     * 库存数量
     */
    @ApiModelProperty(value = "库存数量")
    private Integer productStockNum;
}