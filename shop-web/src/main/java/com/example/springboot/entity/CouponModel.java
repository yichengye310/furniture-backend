package com.example.springboot.entity;

public class CouponModel {
    private Integer couponID;

    private String couponName;

    private String couponDescription;

    private Integer couponTotalNumber;

    private Integer couponSendedNumber;

    private Integer gainedNumLimit;

    private Integer deliveryWay;

    private Integer couponState;

    private Integer couponType;

    private String couponInnerSeq;

    private Integer discountType;

    private Integer couponAmount;

    private Integer discountLimit;

    private Long couponBeginTime;

    private Long couponEndTime;

    private Integer destination;

    private Integer couponReleaseWindow;

    public Integer getCouponID() {
        return couponID;
    }

    public void setCouponID(Integer couponID) {
        this.couponID = couponID;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName == null ? null : couponName.trim();
    }

    public String getCouponDescription() {
        return couponDescription;
    }

    public void setCouponDescription(String couponDescription) {
        this.couponDescription = couponDescription == null ? null : couponDescription.trim();
    }

    public Integer getCouponTotalNumber() {
        return couponTotalNumber;
    }

    public void setCouponTotalNumber(Integer couponTotalNumber) {
        this.couponTotalNumber = couponTotalNumber;
    }

    public Integer getCouponSendedNumber() {
        return couponSendedNumber;
    }

    public void setCouponSendedNumber(Integer couponSendedNumber) {
        this.couponSendedNumber = couponSendedNumber;
    }

    public Integer getGainedNumLimit() {
        return gainedNumLimit;
    }

    public void setGainedNumLimit(Integer gainedNumLimit) {
        this.gainedNumLimit = gainedNumLimit;
    }

    public Integer getDeliveryWay() {
        return deliveryWay;
    }

    public void setDeliveryWay(Integer deliveryWay) {
        this.deliveryWay = deliveryWay;
    }

    public Integer getCouponState() {
        return couponState;
    }

    public void setCouponState(Integer couponState) {
        this.couponState = couponState;
    }

    public Integer getCouponType() {
        return couponType;
    }

    public void setCouponType(Integer couponType) {
        this.couponType = couponType;
    }

    public String getCouponInnerSeq() {
        return couponInnerSeq;
    }

    public void setCouponInnerSeq(String couponInnerSeq) {
        this.couponInnerSeq = couponInnerSeq == null ? null : couponInnerSeq.trim();
    }

    public Integer getDiscountType() {
        return discountType;
    }

    public void setDiscountType(Integer discountType) {
        this.discountType = discountType;
    }

    public Integer getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(Integer couponAmount) {
        this.couponAmount = couponAmount;
    }

    public Integer getDiscountLimit() {
        return discountLimit;
    }

    public void setDiscountLimit(Integer discountLimit) {
        this.discountLimit = discountLimit;
    }

    public Long getCouponBeginTime() {
        return couponBeginTime;
    }

    public void setCouponBeginTime(Long couponBeginTime) {
        this.couponBeginTime = couponBeginTime;
    }

    public Long getCouponEndTime() {
        return couponEndTime;
    }

    public void setCouponEndTime(Long couponEndTime) {
        this.couponEndTime = couponEndTime;
    }

    public Integer getDestination() {
        return destination;
    }

    public void setDestination(Integer destination) {
        this.destination = destination;
    }

    public Integer getCouponReleaseWindow() {
        return couponReleaseWindow;
    }

    public void setCouponReleaseWindow(Integer couponReleaseWindow) {
        this.couponReleaseWindow = couponReleaseWindow;
    }
}