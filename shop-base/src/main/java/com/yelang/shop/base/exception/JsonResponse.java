package com.yelang.shop.base.exception;

import java.io.Serializable;

@SuppressWarnings("serial")
public class JsonResponse implements Serializable {

	public static JsonResponse buildErrorResponse() {
		return new JsonResponse(ServiceExceptionCode.SYSTEM_ERROR.getStatus(), ServiceExceptionCode.SYSTEM_ERROR.getName());
	}
	
	public static JsonResponse buildErrorResponse(int status, String message) {
		return new JsonResponse(status, message);
	}

	public static JsonResponse buildErrorResponse(ServiceExceptionCode responseStatus) {
		return new JsonResponse(responseStatus.getStatus(),
				responseStatus.getName());
	}

	public static JsonResponse buildErrorResponse(String message) {
		return new JsonResponse(ServiceExceptionCode.SYSTEM_ERROR.getStatus(), message);
	}

	public static JsonResponse buildErrorResponse(String message, Object data ) {
		JsonResponse responseBase = buildErrorResponse(message);
		responseBase.setData(data);
		return responseBase;
	}

	private int status;

	private String message;

	private Object data;

	public JsonResponse() {
		this.status = ServiceExceptionCode.SUCCESS.getStatus();
		this.message = ServiceExceptionCode.SUCCESS.getName();
	}

	public JsonResponse(int status, String message) {
		this.status = status;
		this.message = message;
	}

	public JsonResponse(Object data) {
		this();
		this.data = data;
	}

	public Object getData() {
		return data;
	}

	public String getMessage() {
		return message;
	}

	public int getStatus() {
		return status;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ResponseBase [status=" + status + ", message=" + message
				+ ", data=" + data + "]";
	}

}
