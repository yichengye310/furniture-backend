package com.example.springboot.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@ApiModel(value = "ProductStandards",description = "产品规格实体")
public class ProductStandards {
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
    @ApiModelProperty(value = "规格对应实际价格*100")
    private Integer bandPrice;
    /**
     * 规格内容
     */
    @ApiModelProperty(value = "规格内容")
    private String standard;
    /**
     * 状态 1：正常  9：删除
     */
    @ApiModelProperty(value = "状态 1：正常  9：删除")
    private Short state;
    /**
     * 实际批发价*100
     */
    @ApiModelProperty(value = "实际批发价*100")
    private Integer tradePrice;
}