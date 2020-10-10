package com.example.springboot.dto;

import lombok.Data;

/**
 * @description: 类
 * @author: SunZH
 * @time: 2020/3/25 0025 下午 1:54
 */
@Data
public class UserAdressDTO {
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

    private String mobilePhone;
}
