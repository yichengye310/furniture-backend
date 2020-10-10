package com.example.springboot.entity;

public class UserCoupon {
    private Integer userCouponID;

    private String userID;

    private String couponName;

    private String couponDescription;

    private Integer userCouponState;

    private Integer couponType;

    private String couponInnerSeq;

    private Integer discountType;

    private Integer couponAmount;

    private Integer discountLimit;

    private Long couponBeginTime;

    private Long couponEndTime;

    public Integer getUserCouponID() {
        return userCouponID;
    }

    public void setUserCouponID(Integer userCouponID) {
        this.userCouponID = userCouponID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID == null ? null : userID.trim();
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

    public Integer getUserCouponState() {
        return userCouponState;
    }

    public void setUserCouponState(Integer userCouponState) {
        this.userCouponState = userCouponState;
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
}