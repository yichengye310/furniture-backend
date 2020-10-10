package com.example.springboot.entity;

public class OrderPaidRecord {
    private Integer paidRecordID;

    private Integer amount;

    private Short paymentState;

    private Short paidMode;

    private String userID;

    private String userName;

    private String payerID;

    private String payerEmail;

    private String paidFlowNum;

    private Long flowCreatedTime;

    private Long flowPaidTime;

    private String notificationID;

    private Long notificationTime;

    private Integer verifyTime;

    private Integer orderID;

    private String notifyLog;

    public Integer getPaidRecordID() {
        return paidRecordID;
    }

    public void setPaidRecordID(Integer paidRecordID) {
        this.paidRecordID = paidRecordID;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Short getPaymentState() {
        return paymentState;
    }

    public void setPaymentState(Short paymentState) {
        this.paymentState = paymentState;
    }

    public Short getPaidMode() {
        return paidMode;
    }

    public void setPaidMode(Short paidMode) {
        this.paidMode = paidMode;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID == null ? null : userID.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPayerID() {
        return payerID;
    }

    public void setPayerID(String payerID) {
        this.payerID = payerID == null ? null : payerID.trim();
    }

    public String getPayerEmail() {
        return payerEmail;
    }

    public void setPayerEmail(String payerEmail) {
        this.payerEmail = payerEmail == null ? null : payerEmail.trim();
    }

    public String getPaidFlowNum() {
        return paidFlowNum;
    }

    public void setPaidFlowNum(String paidFlowNum) {
        this.paidFlowNum = paidFlowNum == null ? null : paidFlowNum.trim();
    }

    public Long getFlowCreatedTime() {
        return flowCreatedTime;
    }

    public void setFlowCreatedTime(Long flowCreatedTime) {
        this.flowCreatedTime = flowCreatedTime;
    }

    public Long getFlowPaidTime() {
        return flowPaidTime;
    }

    public void setFlowPaidTime(Long flowPaidTime) {
        this.flowPaidTime = flowPaidTime;
    }

    public String getNotificationID() {
        return notificationID;
    }

    public void setNotificationID(String notificationID) {
        this.notificationID = notificationID == null ? null : notificationID.trim();
    }

    public Long getNotificationTime() {
        return notificationTime;
    }

    public void setNotificationTime(Long notificationTime) {
        this.notificationTime = notificationTime;
    }

    public Integer getVerifyTime() {
        return verifyTime;
    }

    public void setVerifyTime(Integer verifyTime) {
        this.verifyTime = verifyTime;
    }

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public String getNotifyLog() {
        return notifyLog;
    }

    public void setNotifyLog(String notifyLog) {
        this.notifyLog = notifyLog == null ? null : notifyLog.trim();
    }
}