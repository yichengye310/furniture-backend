package com.example.springboot.dto;

import com.example.springboot.entity.OrderPurchaseOrder;

import java.util.List;

/**
 * @description:
 * @author: Andy
 * @time: 2020/1/13 0013 下午 3:24
 */
public class UserOrderDTO {
    private Integer number;
    private List<OrderPurchaseOrder> orderList;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public List<OrderPurchaseOrder> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<OrderPurchaseOrder> orderList) {
        this.orderList = orderList;
    }




}
