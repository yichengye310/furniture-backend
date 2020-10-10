package com.yelang.shop.wxpay.constant;

import com.github.wxpay.sdk.WXPay;

import java.util.Map;
import java.util.SortedMap;

public class WXPayH5Utils {
    /**
     * 微信h5支付（统一下单接口）
     * @param querys
     * @return
     * @throws Exception
     */
    public static Map<String, String> unifiedOrder(SortedMap<String,String> querys) throws Exception {
        WXConfig config = new WXConfig();
        WXPay wxpay = new WXPay(config);
        Map<String, String> resp = wxpay.unifiedOrder(querys);
        System.out.println(resp);
        return resp;
    }
}
