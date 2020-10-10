package com.example.springboot.dto;

import lombok.Data;

import java.util.List;

/**
 * @description: 类
 * @author: SunZH
 * @time: 2020/3/30 0030 上午 11:03
 */
@Data
public class DeleteShoppingcartItemDTO {
    private List<Integer> cartItemIDList;
}
