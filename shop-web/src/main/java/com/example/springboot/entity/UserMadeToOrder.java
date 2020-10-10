package com.example.springboot.entity;

import lombok.Data;

@Data
public class UserMadeToOrder {
    private Integer orderID;

    private String name;

    private String phoneNumber;

    private Integer provinceID;

    private String province;

    private Integer cityID;

    private String city;

    private Integer countryID;

    private String country;

    private String address;

    private String userRemark;

    private Long createdTime;

}