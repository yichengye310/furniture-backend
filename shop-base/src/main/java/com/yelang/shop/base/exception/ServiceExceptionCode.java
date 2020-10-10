package com.yelang.shop.base.exception;

public enum ServiceExceptionCode {
	SUCCESS				(1, "操作成功"),

	//系统报错
	SYSTEM_ERROR		(9000, "系统服务繁忙，请稍后重试"),
	//产品报错
	DO_NOT_REPEAT_COLLCETION		(1001, "您已收藏该商品，请勿重复操作"),
	UNCOLLECTED_PRODUCTS		(1002, "您未收藏该商品"),
	//商家用户
	USER_ALREADY_EXIST		(2001, "用户已经存在"),
	WRONG_ACCOUNT_OR_PASSWORD		(2002, "登录失败，用户名或密码错误"),
	CANNOT_BE_EMPTY		(2003, "账号或密码不能为空"),
	USER_IS_NOT_EXIST		(2004, "用户不存在"),
	//支付
	GOODS_HAVE_BEEN_ROBBED		(3001, "订单中包含商品已被抢完"),
	NO_REPEAT_PURCHASE		(3002, "订单中包含商品限购，不可重复购买"),
	;

	private Integer status;
	private String name;

	public Integer getStatus() {
		return status;
	}

	public String getName() {
		return name;
	}

	private ServiceExceptionCode(Integer status, String name) {
		this.status = status;
		this.name = name;
	}

}
