package com.example.springboot.entity;

import lombok.Data;

@Data
public class UserAdress {
    private Integer userAddressID;

    private String userID;

    private Short usual;

    private String receiverName;

    private String province;

    private Integer provinceID;

    private String city;

    private Integer cityID;

    private String county;

    private Integer countyID;

    private String address;

    private String postCode;

    private String mobilePhone;

    private Short state;

    private Long createdTimestamp;

    private Long lastModified;
}