package com.example.springboot.dto;

import lombok.Data;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @description:
 * @author: SunZH
 * @time: 2020/1/13 0013 下午 4:52
 */
@Data
public class CreateUserOrderDTO {

    //购买的商品详情
    private List<Integer> cartIDList;

    //购买的商品详情
    private List<OrderProdectPurchaseDetail> productList;

    //购买的用户ID
    private String userID;

    //用户订单备注
    private String userRemark;

    //用户选择的优惠模式 ：默认0：无优惠    1：使用优惠券
    private Short favourMode;

    //有优惠时候优惠券的金额
    private Integer favourAmount;

    //使用优惠券时的优惠券ID
    private Integer favourRelatedCouponID;

    //运费金额  默认为0即可
    private Integer transportationExpenses;

    //用户购买的地址ID
    private Integer userAddressID;

    //订单类型 ：  1：普通商品   2：限时抢购
    private Integer orderType;

    //订单来源 ：  1：直播订单   2：普通订单
    private Short orderFrom;
}
