package com.example.springboot.dto;

import com.example.springboot.entity.OrderPurchaseOrder;
import lombok.Data;

/**
 * @description: 类
 * @author: SunZH
 * @time: 2020/4/11 0011 上午 10:06
 */
@Data
public class OrderDetailForUserDTO extends OrderPurchaseOrder{
//    private Integer orderID;
//    private Short orderState;
//    private Long orderPaidTime;
//
//    private Integer productID;
//    private String productName;
//    private String productTitleImage;
//    private String productStandard;
//    private String productColour;
//    private Integer totalAmount;
//    private Integer productNumber;
//    private String userRemark;
//
//    private String receiverName;
    private String receiverPhoneNum;
    private String receiverProvince;
    private String receiverCity;
    private String receiverCounty;
    private String receiverAddress;
//    private OrderPurchaseOrder purchaseOrder;

    private String deliverName;
    private String deliverPhoneNum;
    private String deliverAddress;

    private Long expressTime;
    private String expressName;
    private String expressNumber;
}
