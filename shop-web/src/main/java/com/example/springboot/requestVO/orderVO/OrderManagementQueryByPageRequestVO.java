package com.example.springboot.requestVO.orderVO;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description: 类
 * @author: SunZH
 * @time: 2020/4/9 0009 下午 2:19
 */
@Data
@ApiModel(value = "OrderManagementQueryByPageRequestVO",description = "查询条件实体")
public class OrderManagementQueryByPageRequestVO {

    @ApiModelProperty(value = "orderID，订单ID")
    private Integer orderID;

    @ApiModelProperty(value = "要查询的订单状态  1：已付款 2：已发货 3：已完成  4：售后订单  11:订单已经取消")
    private Short state;

    @ApiModelProperty(value = "条件查询时的电话号码")
    private String phoneNumber;

    private Short orderFrom; //订单来源 ：  1：直播订单   2：普通订单
}
