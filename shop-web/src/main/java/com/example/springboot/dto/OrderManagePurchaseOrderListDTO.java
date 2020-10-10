package com.example.springboot.dto;

import lombok.Data;

import java.util.List;

/**
 * @description: 类
 * @author: SunZH
 * @time: 2020/4/3 0003 下午 3:19
 */
@Data
public class OrderManagePurchaseOrderListDTO {

    private List<OrderManagePurchaseOrderDTO> orderList;

    private Integer number;
}
