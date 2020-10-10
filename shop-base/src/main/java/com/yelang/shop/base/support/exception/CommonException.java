package com.yelang.shop.base.support.exception;
import com.yelang.shop.base.constant.HttpResponseCode;

public class CommonException extends RuntimeException {

    private String customMsg;// 报错信息
    private String exceptionCode; // code
    private String exceptionName;


    public String getCustomMsg() {
        return customMsg;
    }

    public void setCustomMsg(String customMsg) {
        this.customMsg = customMsg;
    }

    public String getExceptionCode() {
        return exceptionCode;
    }

    public void setExceptionCode(String exceptionCode) {
        this.exceptionCode = exceptionCode;
    }

    public String getExceptionName() {
        return exceptionName;
    }

    public void setExceptionName(String exceptionName) {
        this.exceptionName = exceptionName;
    }

    public CommonException(String customMsg) {
        super();
        this.setCustomMsg(customMsg);
        this.setExceptionCode(HttpResponseCode.SC_BAD_REQUEST);
    }

    public CommonException(String customMsg, Exception e) {
        super();
        this.setCustomMsg(customMsg);
        this.setExceptionName(e.toString());
        this.setExceptionCode(HttpResponseCode.SC_BAD_REQUEST);
        this.setStackTrace(e.getStackTrace());
    }

    public CommonException(Exception exception) {
        this(null, exception);
    }


    public CommonException(String customMsg, String exceptionCode) {
        super();
        this.setCustomMsg(customMsg);
        this.setExceptionCode(exceptionCode);
    }


}
