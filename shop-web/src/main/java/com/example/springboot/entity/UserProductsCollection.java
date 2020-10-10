package com.example.springboot.entity;

import lombok.Data;

@Data
public class UserProductsCollection {

    private Integer collectedProductID;

    private String userID;

    private Integer productID;

    private Long createdTimestamp;
}