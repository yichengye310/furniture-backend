package com.example.springboot.dto;

import lombok.Data;

import java.util.List;

/**
 * @description:
 * @author: SunZH
 * @time: 2020/1/14 0014 下午 2:00
 */
@Data
public class OrderSubmitDTO {

    //支付类型： 1：正常订单支付  2：购买会员
    private Integer type;

    //订单编号数组
    private List<Integer> orderIDList;

    //支付金额
    private Integer totalAmount;

    //H5支付要求商户在统一下单接口中上传用户真实ip地址“spbill_create_ip”，为保证微信端获取的用户ip地址与商户端获取的一致.
    private String spbillCreateIp;

    //用户ID
    private String userID;
}
