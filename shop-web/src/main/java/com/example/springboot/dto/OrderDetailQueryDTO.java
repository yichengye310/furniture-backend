package com.example.springboot.dto;

import lombok.Data;

/**
 * @description: 类
 * @author: SunZH
 * @time: 2020/4/3 0003 下午 4:24
 */
@Data
public class OrderDetailQueryDTO {
    private Integer orderID;
    private Short orderState;
    private Long orderPaidTime;
    private String userName;
    private String userPhone;

    private Integer productID;
    private String productName;
    private String productTitleImage;
    private Integer productStandardID;
    private String productStandard;
    private Integer productColourID;
    private String productColour;
    private Integer finalAmount;
    private Integer productNumber;
    private String userRemark;

    private String receiverName;
    private String phoneNum;
    private String province;
    private String city;
    private String county;
    private String receiveAddress;

    private Long expressTime;
    private String expressName;
    private String expressNumber;

}
