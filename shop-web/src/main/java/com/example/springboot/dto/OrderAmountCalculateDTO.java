package com.example.springboot.dto;

import lombok.Data;

import java.util.List;

/**
 * @description:
 * @author: SunZH
 * @time: 2020/1/14 0014 下午 2:28
 */

@Data
public class OrderAmountCalculateDTO {
    private  List<OrderProdectPurchaseDetail> productList;
    private Integer totalAmount;
    private Integer transportationExpense;

    private List<Integer> orderList;
}
