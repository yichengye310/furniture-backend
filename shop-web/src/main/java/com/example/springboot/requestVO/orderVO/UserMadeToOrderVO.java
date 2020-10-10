package com.example.springboot.requestVO.orderVO;

import lombok.Data;

/**
 * @description: 类
 * @author: SunZH
 * @time: 2020/4/15 0015 上午 10:41
 */
@Data
public class UserMadeToOrderVO {

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

}
