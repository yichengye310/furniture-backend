package com.yelang.shop.base.exception;


/**
 * 业务异常
 * @author Qu
 * 异常处理总结：
 * 1.查询方法：
 *   a.分页查询方法中，以try...catch...捕获异常，打印信息；分页数据返回空。
 *   b.一般查询方法中，如get、list、count等，直接通过方法抛出异常，由调用方法处理。
 * 2.操作方法：如insert、update、delete，直接通过方法抛出异常，由调用方法处理。
 * 3.业务方法：凡涉及业务事务处理的方法，方法抛出ServiceException，Exception。
 *   业务逻辑异常问题，抛出ServiceException，其他异常抛出Exception。
 *   在上级调用中（一般在controller中调用），分别捕获ServiceException和Exception，
 *   若ServiceException，返回异常信息中的JsonResponseStatus，提示到界面；
 *   而Exception，返回“系统异常”，提示到界面。
 */
@SuppressWarnings("serial")
public class ServiceException extends RuntimeException {

	private ServiceExceptionCode status;

	public ServiceException (ServiceExceptionCode status) {
		super(status.getName());
		this.status = status;
	}
	
	public ServiceExceptionCode getStatus() {
		return status;
	}

	public void setStatus(ServiceExceptionCode status) {
		this.status = status;
	}

}
