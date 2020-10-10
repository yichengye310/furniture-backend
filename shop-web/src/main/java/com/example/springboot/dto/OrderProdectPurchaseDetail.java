package com.example.springboot.dto;

import lombok.Data;

import java.util.List;

/**
 * @description:
 * @author: SunZH
 * @time: 2020/1/14 0014 下午 1:43
 */

@Data
public class OrderProdectPurchaseDetail {

    //产品ID
    private Integer productID;

    //产品中规格ID
    private Integer standardID;

    //规格中颜色分类ID
    private Integer colourID;

    //购买的数量
    private Integer productNumber;
}
