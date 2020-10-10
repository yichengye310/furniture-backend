package com.example.springboot;

import com.github.wxpay.sdk.WXPay;
import com.yelang.shop.wxpay.constant.WXConfig;
import com.yelang.shop.wxpay.constant.WXUrl;
import com.yelang.shop.wxpay.util.PayUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WXPayH5Test {
	private static final String ORDER_PAY = "https://api.mch.weixin.qq.com/pay/unifiedorder";// 统一下单

	private static final String APP_ID = "wx8a6a81fee186200e";  // 应用ID
	private static final String MCH_ID = "1409327502";// 商户号
	private static final String API_SECRET = "f05df970e054475180ead0e263041d28";// 密钥
	private static final String NOTIFY_URL = "http://www.baidu.com";// 回调URL
	@Test
	public void contextLoads() throws Exception {
		System.out.println("微信支付H5测试！！！");
		String nonce_str = UUID.randomUUID().toString().replaceAll("-", "");
		WXConfig config = new WXConfig();
		WXPay wxpay = new WXPay(config);
		SortedMap<String,String> querys = new TreeMap<String,String>();
		querys.put("trade_type","MWEB");
		// 附加数据
		querys.put("attach", "附加数据");
		querys.put("out_trade_no","商户订单号");
		querys.put("nonce_str",nonce_str);
		querys.put("body","商品微信h5支付订单");
		querys.put("total_fee","0.01");
		querys.put("spbill_create_ip","120.79.99.73");
		querys.put("scene_info","{\"h5_info\":{\"type\":\"Wap\",\"wap_url\":\"www.yelangwhcm.com\",\"wap_name\":\"爱慕米斯H5支付\"}}");
		querys.put("appid", config.getAppID());// 应用ID
		querys.put("mch_id", config.getMchID());// 商户号
		querys.put("notify_url",WXUrl.notify_url);//回调地址
		querys.put("sign", PayUtil.getSign(querys, config.getKey()));

		//公众账号ID（必填），示例：wxd678efh567hg6787
//		querys.put("appid","");
//		//商户号（必填）
//		querys.put("mch_id","");
//		//设备号（非必填）
//		//querys.put("device_info","");
//		//随机字符串（必填）	随机字符串，不长于32位。推荐随机数生成算法
//		querys.put("nonce_str",nonce_str);
//		//签名(必填)
//		querys.put("sign", PayUtil.getSign(querys, API_SECRET));
//		//签名类型（非必填）签名类型，目前支持HMAC-SHA256和MD5，默认为MD5
//		//querys.put("sign_type", "MD5");
//		//商品描述(必填)
//		querys.put("body", "商品微信h5支付订单");
//		//商品详情(非必填)
//		//querys.put("detail", "商品详情");
//		//附加数据
//		//querys.put("attach", "附加数据");
//		//商户订单号（必填）
//		querys.put("out_trade_no", "商户订单号");
//		//货币类型，符合ISO 4217标准的三位字母代码，默认人民币：CNY，其他值列表详见货币类型
//		//querys.put("fee_type", "CNY");
//		//总金额（必填）订单总金额，单位为分
//		querys.put("total_fee", "0.01");
//		//终端IP（必填）必须传正确的用户端IP,支持ipv4、ipv6格式
//		querys.put("spbill_create_ip", "ip地址");
//		//交易起始时间 订单生成时间，格式为yyyyMMddHHmmss，如2009年12月25日9点10分10秒表示为20091225091010。
//		querys.put("time_start", "交易起始时间");
//		//交易结束时间
//		querys.put("time_expire", "交易结束时间");
// 		//通知地址(必填) 接收微信支付异步通知回调地址，通知url必须为直接可访问的url，不能携带参数。
//		querys.put("notify_url", WXUrl.notify_url);
//		//交易类型（必填）H5支付的交易类型为MWEB
//		querys.put("trade_type", "MWEB");
//		//商品ID（非必填）trade_type=NATIVE，此参数必传。
//		//querys.put("attach", "附加数据");
//		//querys.put("product_id", "");
//		//用户标识 trade_type=JSAPI，此参数必传，用户在商户appid下的唯一标识。
//		querys.put("openid", "");
//		//场景信息
//		querys.put("scene_info", "{\"h5_info\":{\"type\":\"Wap\",\"wap_url\":\"https://pay.qq.com\",\"wap_name\":\"野狼家具商店H5支付\"}}");
		try {
			Map<String, String> resp = wxpay.unifiedOrder(querys);
			System.out.println(resp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
