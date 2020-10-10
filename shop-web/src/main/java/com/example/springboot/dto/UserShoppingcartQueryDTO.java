package com.example.springboot.dto;

import com.example.springboot.entity.UserShoppingcart;
import lombok.Data;

/**
 * @description: 类
 * @author: SunZH
 * @time: 2020/3/24 0024 下午 5:35
 */
@Data
public class UserShoppingcartQueryDTO extends UserShoppingcart {
    private Short productState;
}
