package com.yelang.shop.wxpay.constant;

public class WXUrl {
    /**
     * 统一下单
     */
    public final static String unifiedorder = "https://api.mch.weixin.qq.com/pay/unifiedorder";
    /**
     * 统一下单回调地址
     */
    public final static String notify_url = "http://120.79.99.73:8081/wxPayCallBack";
    /**
     * 查询订单
     */
    public final static String orderquery = "https://api.mch.weixin.qq.com/pay/orderquery";
    /**
     * 关闭订单
     */
    public final static String closeorder = "https://api.mch.weixin.qq.com/pay/closeorder";
    /**
     * 申请退款
     */
    public final static String refund = "https://api.mch.weixin.qq.com/secapi/pay/refund";
    /**
     * 申请退款回调地址
     */
    public final static String notify_url_refund = "";

    /**
     * 查询退款
     */
    public final static String refundquery = "https://api.mch.weixin.qq.com/pay/refundquery";
    /**
     * 下载对账单
     */
    public final static String downloadbill = "https://api.mch.weixin.qq.com/pay/downloadbill";
    /**
     * 下载资金账单
     */
    public final static String downloadfundflow = "https://api.mch.weixin.qq.com/pay/downloadfundflow";
    /**
     * 交易保障
     */
    public final static String report = "https://api.mch.weixin.qq.com/payitil/report";

    /**
     * 拉取订单评价数据
     */
    public final static String batchquerycomment = "https://api.mch.weixin.qq.com/billcommentsp/batchquerycomment";



}
