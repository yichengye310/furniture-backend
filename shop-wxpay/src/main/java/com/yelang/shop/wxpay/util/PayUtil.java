package com.yelang.shop.wxpay.util;

import org.apache.commons.lang3.StringUtils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

public class PayUtil {

	/**
	 * 生成订单号
	 * 
	 * @return
	 */
	public static String getTradeNo() {
		// 自增8位数 00000001
		return "TNO" + UUID.randomUUID().toString();
	}

	/**
	 * 退款单号
	 * 
	 * @return
	 */
	public static String getRefundNo() {
		// 自增8位数 00000001
		return "RNO" + UUID.randomUUID().toString();
	}

	/**
	 * 退款单号
	 * 
	 * @return
	 */
	public static String getTransferNo() {
		// 自增8位数 00000001
		return "TNO" + UUID.randomUUID().toString();
	}

	/**
	 * 返回客户端ip
	 * 
	 * @param request
	 * @return
	 */
	public static String getRemoteAddrIp(HttpServletRequest request) {
		String ip = request.getHeader("X-Forwarded-For");
		if (StringUtils.isNotEmpty(ip) && !"unKnown".equalsIgnoreCase(ip)) {
			// 多次反向代理后会有多个ip值，第一个ip才是真实ip
			int index = ip.indexOf(",");
			if (index != -1) {
				return ip.substring(0, index);
			} else {
				return ip;
			}
		}
		ip = request.getHeader("X-Real-IP");
		if (StringUtils.isNotEmpty(ip) && !"unKnown".equalsIgnoreCase(ip)) {
			return ip;
		}
		return request.getRemoteAddr();
	}

	/**
	 * 获取服务器的ip地址
	 * 
	 * @param request
	 * @return
	 */
	public static String getLocalIp(HttpServletRequest request) {
		return request.getLocalAddr();
	}

	public static String getSign(Map<String, String> params, String paternerKey) throws UnsupportedEncodingException {
		return MD5Utils.getMD5(createSign(params, false) + "&key=" + paternerKey).toUpperCase();
	}

	/**
	 * 构造签名
	 * 
	 * @param params
	 * @param encode
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public static String createSign(Map<String, String> params, boolean encode) throws UnsupportedEncodingException {
		Set<String> keysSet = params.keySet();
		Object[] keys = keysSet.toArray();
		Arrays.sort(keys);
		StringBuffer temp = new StringBuffer();
		boolean first = true;
		for (Object key : keys) {
			if (key == null || StringUtils.isEmpty(params.get(key))) // 参数为空不参与签名
				continue;
			if (first) {
				first = false;
			} else {
				temp.append("&");
			}
			temp.append(key).append("=");
			Object value = params.get(key);
			String valueStr = "";
			if (null != value) {
				valueStr = value.toString();
			}
			if (encode) {
				temp.append(URLEncoder.encode(valueStr, "UTF-8"));
			} else {
				temp.append(valueStr);
			}
		}
		return temp.toString();
	}

	/**
	 * 创建支付随机字符串
	 * @return
	 */
//	public static String getNonceStr(){
//		return RandomUtils.randomString(RandomUtil.LETTER_NUMBER_CHAR, 32);
//	}
	
	/**
	 * 支付时间戳
	 * @return
	 */
	public static String payTimestamp() {
		return Long.toString(System.currentTimeMillis() / 1000);
	}
}
