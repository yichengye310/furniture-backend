package com.example.springboot.entity;

import lombok.Data;

@Data
public class OrderPurchaseOrder {
    private Integer orderID;

    private String purchaseOrderID;

    private Short orderPaymentState;

    private Short orderState;

    private Short paidMode;

    private Integer paidRecordID;

    private Integer productID;

    private String productName;

    private Integer productColourID;

    private String productColour;

    private Integer productStandardID;

    private String productStandard;

    private String productTitleImage;

    private Integer productUnitPrice;

    private Integer productNumber;

    private String userID;

    private String userName;

    private Short orderType;

    private Short orderFrom;

    private String userRemark;

    private Integer totalAmount;

    private Short favourMode;

    private Integer favourRelatedCouponID;

    private Integer favourAmount;

    private Integer transportationExpenses;

    private Integer finalAmount;

    private String receiverName;

    private String province;

    private String city;

    private String county;

    private String receiveAddress;

    private String phoneNum;

    private String invoiceTitle;

    private String invoiceContent;

    private Long orderCreatedTime;

    private Long orderPaidTime;

    private Long lastModified;
}