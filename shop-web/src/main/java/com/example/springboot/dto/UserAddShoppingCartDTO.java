package com.example.springboot.dto;

import lombok.Data;

/**
 * @description: 类
 * @author: SunZH
 * @time: 2020/3/24 0024 下午 4:44
 */

@Data
public class UserAddShoppingCartDTO {

    //产品ID
    private Integer productID;

    //产品规格ID
    private Integer productStandardID;

    //产品颜色ID
    private Integer productColourID;

    //加入购物车数量
    private Integer addedNum;

    //用户ID
    private String userID;

}
