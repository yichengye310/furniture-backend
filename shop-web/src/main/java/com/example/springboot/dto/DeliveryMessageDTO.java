package com.example.springboot.dto;

import lombok.Data;

/**
 * @description: 类
 * @author: SunZH
 * @time: 2020/4/3 0003 下午 5:53
 */
@Data
public class DeliveryMessageDTO {
    private Integer orderID;
    private Long orderPaidTime;

    private Integer productID;
    private String productName;
    private String productTitleImage;
    private Integer productStandardID;
    private String productStandard;
    private Integer productColourID;
    private String productColour;
    private Integer productNumber;
    private String userRemark;

    private String receiverName;
    private String phoneNum;
    private String province;
    private String city;
    private String county;
    private String receiveAddress;
}
