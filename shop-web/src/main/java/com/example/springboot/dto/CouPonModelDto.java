package com.example.springboot.dto;

public class CouPonModelDto {

    private Integer couponID;

    private String couponName;

    private String couponDescription;

    private Integer couponAmount;

    private Integer couponState;

    private Long couponBeginTime;

    private Long couponEndTime;

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
        this.couponName = couponName;
    }

    public String getCouponDescription() {
        return couponDescription;
    }

    public void setCouponDescription(String couponDescription) {
        this.couponDescription = couponDescription;
    }

    public Integer getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(Integer couponAmount) {
        this.couponAmount = couponAmount;
    }

    public Integer getCouponState() {
        return couponState;
    }

    public void setCouponState(Integer couponState) {
        this.couponState = couponState;
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
