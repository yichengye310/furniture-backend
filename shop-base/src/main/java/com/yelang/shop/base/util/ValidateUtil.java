package com.yelang.shop.base.util;

import java.util.List;


/**
 * 验证工具类
 * @author QuGuanglei
 */
public class ValidateUtil {

	/**
	 * 空对象验证
	 * @param data
	 * @return
	 */
	public static boolean isNull(Object data) {
		boolean isNull = true;
		if(data == null) {
			isNull = true;
		} else if (data instanceof String && isBlank(data.toString())){
			isNull = true;
		} else {
			isNull = false;
		}
		return isNull;
	}
	
	/**
	 * 空字符串验证
	 * @param data
	 * @return
	 */
	public static boolean isBlank(String data) {
		boolean isEmpty = true;
		if(data == null || data.isEmpty() || "".equals(data.replaceAll("\\s", ""))){
			isEmpty = true;
		} else {
			isEmpty = false;
		}
		return isEmpty;
	}
	
	/**
	 * 空字符串验证
	 * @param data
	 * @return
	 */
	public static boolean isEmpty(String str){
		return isBlank(str);
	}
	
	/**
	 * 字符串长度验证，允许为空
	 * @param str 字符串
	 * @param len 最大长度
	 * @return
	 */
	public static boolean checkStrLength(String str, int len) {
		if (str != null && str.length() > len) {
			return false;
		} else {
			return true;
		}
	}
	
	/**
	 * 字符串长度验证，不允许为空
	 * @param str 字符串
	 * @param len 最大长度
	 * @return
	 */
	public static boolean checkStrLengthNotNull(String str, int len) {
		if (isBlank(str) || str.length() > len){
			return false;
		} else {
			return true;
		}
	}
	
	/**
	 * 验证手机号码的有效性
	 * @param mob
	 * @return
	 */
	public static boolean isCellphoneNO(String mob) {
		boolean b = false;
		String regex = "^1\\d{10}$";
		if (!isBlank(mob) && mob.matches(regex)) {
			b = true;
		} 
		return b;
	}
	
	/**
	 * 验证电话号码的有效性
	 * @param tel
	 * @return
	 */
	public static boolean isTelephoneNO(String tel) {
		boolean b = false;
		String regex = "^\\d{3,4}-?\\d{7,8}$";
		if (!isBlank(tel) && tel.matches(regex)) {
			b = true;
		} 
		return b;
	}
	
	/**
	 * 验证邮箱的有效性
	 * @param email
	 * @return
	 */
	public static boolean isEmail(String email) {
		boolean b = false;
		String regex = "^\\w+(.\\w)*@(\\w.)*(\\w)+(.\\w)+$";
		if (!isBlank(email) && email.matches(regex)) {
			b = true;
		} 
		return b;
	}
	
	/**
	 * 是数字类型
	 * @param data
	 * @return
	 */
	public static boolean isNum(Object data){
		boolean b = false;
		if (data == null) {
			b = false;
		} else if (data instanceof Double || data instanceof Float || 
				data instanceof Long || data instanceof Integer || 
				data instanceof  Short || data instanceof Byte) {
			b = true;
		}
		return b;
	}
	
	/**
	 * 是数字格式
	 * @param data
	 * @return
	 */
	public static boolean isNumFormat(Object data){
		boolean b = false;
		if (data == null) {
			b = false;
		} else if (isNum(data)) {
			b = true;
		} else {
			String num = String.valueOf(data);
			String regex1 = "^((\\+|-)?\\d+)+(.\\d+)?$";//数字格式
			String regex2 = "^((\\+|-)?\\d+)+(.\\d+)?[E|e]{1}[+]?\\d+$";//科学计数法格式[1.5E2,1.5E+2]
			if (num.matches(regex1) || num.matches(regex2)) {
				b = true;
			}
		}
		return b;
	}
	
	/**
	 * 集合空判断
	 * @param list
	 * @return
	 */
	public static boolean isEmptyList(List<?> list){
		return null == list || list.isEmpty();
	}
	
}
