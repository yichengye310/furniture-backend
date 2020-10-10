package com.example.springboot.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@ApiModel(value = "ProductLimitedTimeStandards",description = "产品规格实体")
public class ProductLimitedTimeStandards {
    /**
     * 产品规格ID
     */
    @ApiModelProperty(value = "standardID")
    @Id
    private Integer standardID;
    /**
     * 产品ID
     */
    @ApiModelProperty(value = "绑定的产品ID")
    private Integer bandProductID;
    /**
     * 规格对应实际价格*100
     */
    @ApiModelProperty(value = "规格对应原价*100")
    private Long originalPrice;
    /**
     * 折后价*100(当产品的优惠方式为2时，该字段不可为空)
     */
    @ApiModelProperty(value = "折后价*100(当产品的优惠方式为2时，该字段不可为空)")
    private Long discountPrice;
    /**
     * 批发价*100
     */
    @ApiModelProperty(value = "批发价*100")
    private Long tradePrice;
    /**
     * 规格内容
     */
    @ApiModelProperty(value = "规格内容")
    private String standard;
    /**
     * 信息状态 1：正常  9：废弃
     */
    @ApiModelProperty(value = "信息状态 1：正常  9：废弃")
    private Short state;
}