package com.example.springboot.entity;

import lombok.Data;

@Data
public class ProductComments {
    private Integer evaluateID;

    private Integer productID;

    private String userID;

    private String phoneNumber;

    private String content;

    private Integer descriptionMatchScore;

    private Integer logisticsServiceScore;

    private Integer serviceAttitudeScore;

    private Integer standardID;

    private Integer colourID;

    private String colourName;

    private String standard;

    private String styleName;

    private Integer orderID;

    private Short state;

    private Long createdTimestamp;

    private Long lastModifiedTimeStamp;
}