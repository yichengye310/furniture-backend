package com.example.springboot.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description: 类
 * @author: SunZH
 * @time: 2020/4/3 0003 下午 5:53
 */
@Data
@ApiModel(value = "DeliveryResultMessageDTO",description = "发货信息DTO")
public class DeliveryResultMessageDTO {
    @ApiModelProperty(value = "订单ID ，必填，根据查询到的发货详情填入。")
    private Integer orderID;

    @ApiModelProperty(value = "订单下单时间 ，必填，根据查询到的发货详情填入。")
    private Long orderPaidTime;

    @ApiModelProperty(value = "产品ID ，必填，根据查询到的发货详情填入。")
    private Integer productID;

    @ApiModelProperty(value = "产品名称 ，必填，根据查询到的发货详情填入。")
    private String productName;

    @ApiModelProperty(value = "产品主图 ，必填，根据查询到的发货详情填入。")
    private String productTitleImage;

    @ApiModelProperty(value = "产品规格ID ，必填，根据查询到的发货详情填入。")
    private Integer productStandardID;

    @ApiModelProperty(value = "产品规格名称 ，必填，根据查询到的发货详情填入。")
    private String productStandard;

    @ApiModelProperty(value = "产品规格颜色ID ，必填，根据查询到的发货详情填入。")
    private Integer productColourID;

    @ApiModelProperty(value = "产品规格颜色名称 ，必填，根据查询到的发货详情填入。")
    private String productColour;

    @ApiModelProperty(value = "购买数量 ，必填，根据查询到的发货详情填入。")
    private Integer productNumber;

    @ApiModelProperty(value = "用户备注 ，必填，根据查询到的发货详情填入。")
    private String userRemark;

    @ApiModelProperty(value = "收货人名称 ，必填，根据查询到的发货详情填入。")
    private String receiverName;

    @ApiModelProperty(value = "收货人联系方式 ，必填，根据查询到的发货详情填入。")
    private String phoneNum;

    @ApiModelProperty(value = "省名称 ，必填，根据查询到的发货详情填入。")
    private String province;

    @ApiModelProperty(value = "市名称 ，必填，根据查询到的发货详情填入。")
    private String city;

    @ApiModelProperty(value = "区名称 ，必填，根据查询到的发货详情填入。")
    private String county;

    @ApiModelProperty(value = "收货人详细地址 ，必填，根据查询到的发货详情填入。")
    private String receiveAddress;

    @ApiModelProperty(value = "发货人名称，必填")
    private String deliverName;

    @ApiModelProperty(value = "发货人手机，必填")
    private String deliverPhoneNum;

    @ApiModelProperty(value = "发货地址，必填")
    private String deliverAdd;

    @ApiModelProperty(value = "物流公司，必填")
    private String expressCompany;

    @ApiModelProperty(value = "物流单号，必填")
    private String expressNum;
}
