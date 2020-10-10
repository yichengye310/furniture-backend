package com.example.springboot.dto;

import lombok.Data;

@Data
public class OrderManagePurchaseOrderDTO {
    private Integer orderID;

    private String phoneNum;

    private Long orderPaidTime;

    private String productTitleImage;

    private Short orderState;

    private String productName;

    private Integer finalAmount;

    private Integer productUnitPrice;

    private Integer productNumber;

    private Integer productID;

    private Long orderCreatedTime;

    private Short orderFrom;;

}