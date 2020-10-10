package com.example.springboot.dto;

import lombok.Data;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @description:
 * @author: SunZH
 * @time: 2020/1/15 0015 上午 11:40
 */
@Data
public class OrderCalculateSubmitDTO {

    //订单IDList
    private List<Integer> orderList;

    private List<OrderProdectPurchaseDetail> productList;

    private String userID;

}

