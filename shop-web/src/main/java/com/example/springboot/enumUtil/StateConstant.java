package com.example.springboot.enumUtil;

/**
 * @description:
 * @author: SunZH
 * @time: 2020/1/14 0014 上午 10:56
 */
public class StateConstant {

    //订单类型---普通产品
    public static final Short ORDER_TYPE_MORMAL = 1;

    //订单类型---限时抢购
    public static final Short ORDER_TYPE_TIME_LIMITED = 2;


    //用户类型————普通用户
    public static final Short USER_TYPE_NORMAL = 1;

    //用户类型————会员
    public static final Short USER_TYPE_MEMBER = 2;

    //用户类型————经销商
    public static final Short USER_TYPE_AGENT = 3;





    //状态：正常
    public static final Integer STATE_NORMAL = 1;

    //状态：删除
    public static final Integer STATE_DELETED = 9;

    //等待付款
    public static final Short ORDER_WAITING_TO_PAY = 0;

    //已经付款，等待发货
    public static final Short ORDER_PAID_UNDELIVERY = 1;

    //已经发货，等待确认收货
    public static final Short ORDER_PAID_UNCONFIRMED = 2;

    //已经完成
    public static final Short ORDER_COMPLETED = 3;

    //售后订单
    public static final Short ORDER_AFTER_SALE = 4;

    //售后订单
    public static final Short ORDER_COMMENTED = 1;

    //已经评价，交易成功
    public static final Short ORDER_DELETED = 9;

    //：订单已取消,
    public static final Short ORDER_CANCELED = 11;

    //优惠方式   0：无优惠
    public static final Short FAVOUR_MODE_NULL = 0;

    //优惠方式   1：优惠券
    public static final Short FAVOUR_MODE_COUPON = 1;

    //支付状态--等待支付
    public static final Short PAYMENT_STATEMENT_WAITING = 9;
    //支付状态--支付成功
    public static final Short PAYMENT_STATEMENT_SUCCESS = 0;
    //支付状态--支付失败
    public static final Short PAYMENT_STATEMENT_FAIL = 1;

    //用户地址状态--正常
    public static final Short USER_ADDRESS_NORMAL = 1;
    //用户地址状态--删除
    public static final Short USER_ADDRESS_DELETE = 9;

    //用户地址状态--默认地址
    public static final Short USER_ADDRESS_DEFAULT = 1;
    //用户地址状态--非默认地址
    public static final Short USER_ADDRESS_NOT_DEFAULT = 0;


    //订单发货信息状态--正常
    public static final Short ORDER_DELIVERY_NORMAL = 1;

    //订单发货信息状态--删除
    public static final Short ORDER_DELIVERY_DELETED = 9;
}
