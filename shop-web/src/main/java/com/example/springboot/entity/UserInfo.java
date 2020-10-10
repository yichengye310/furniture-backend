package com.example.springboot.entity;

import java.io.Serializable;

public class UserInfo implements Serializable {
    private String userID;

    private Short state;

    private Short userType;

    private Short userLevel;

    private String userName;

    private String phoneNumber;

    private String userPwd;

    private String relatedAgentID;

    private String relatedAgentName;

    private Long createdTimeStamp;

    private Short creatorType;

    private Integer creatorID;

    private String creatorName;

    private Integer isOpenLive;

    private Long lastModifiedTimeStamp;

    private Short lastModifierType;

    private Integer lastModifierID;

    private String lastModifierName;

    private String wxOpenID;

    private String relatedSubscriptionOpenID;

    private String portrait;

    private String personalSign;

    private String provinceName;

    private String cityName;

    private Integer provinceID;

    private Integer cityID;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID == null ? null : userID.trim();
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }

    public Short getUserType() {
        return userType;
    }

    public void setUserType(Short userType) {
        this.userType = userType;
    }

    public Short getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(Short userLevel) {
        this.userLevel = userLevel;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    public String getRelatedAgentID() {
        return relatedAgentID;
    }

    public void setRelatedAgentID(String relatedAgentID) {
        this.relatedAgentID = relatedAgentID == null ? null : relatedAgentID.trim();
    }

    public String getRelatedAgentName() {
        return relatedAgentName;
    }

    public void setRelatedAgentName(String relatedAgentName) {
        this.relatedAgentName = relatedAgentName == null ? null : relatedAgentName.trim();
    }

    public Long getCreatedTimeStamp() {
        return createdTimeStamp;
    }

    public void setCreatedTimeStamp(Long createdTimeStamp) {
        this.createdTimeStamp = createdTimeStamp;
    }

    public Short getCreatorType() {
        return creatorType;
    }

    public void setCreatorType(Short creatorType) {
        this.creatorType = creatorType;
    }

    public Integer getCreatorID() {
        return creatorID;
    }

    public void setCreatorID(Integer creatorID) {
        this.creatorID = creatorID;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName == null ? null : creatorName.trim();
    }

    public Integer getIsOpenLive() {
        return isOpenLive;
    }

    public void setIsOpenLive(Integer isOpenLive) {
        this.isOpenLive = isOpenLive;
    }

    public Long getLastModifiedTimeStamp() {
        return lastModifiedTimeStamp;
    }

    public void setLastModifiedTimeStamp(Long lastModifiedTimeStamp) {
        this.lastModifiedTimeStamp = lastModifiedTimeStamp;
    }

    public Short getLastModifierType() {
        return lastModifierType;
    }

    public void setLastModifierType(Short lastModifierType) {
        this.lastModifierType = lastModifierType;
    }

    public Integer getLastModifierID() {
        return lastModifierID;
    }

    public void setLastModifierID(Integer lastModifierID) {
        this.lastModifierID = lastModifierID;
    }

    public String getLastModifierName() {
        return lastModifierName;
    }

    public void setLastModifierName(String lastModifierName) {
        this.lastModifierName = lastModifierName == null ? null : lastModifierName.trim();
    }

    public String getWxOpenID() {
        return wxOpenID;
    }

    public void setWxOpenID(String wxOpenID) {
        this.wxOpenID = wxOpenID == null ? null : wxOpenID.trim();
    }

    public String getRelatedSubscriptionOpenID() {
        return relatedSubscriptionOpenID;
    }

    public void setRelatedSubscriptionOpenID(String relatedSubscriptionOpenID) {
        this.relatedSubscriptionOpenID = relatedSubscriptionOpenID == null ? null : relatedSubscriptionOpenID.trim();
    }

    public String getPortrait() {
        return portrait;
    }

    public void setPortrait(String portrait) {
        this.portrait = portrait == null ? null : portrait.trim();
    }

    public String getPersonalSign() {
        return personalSign;
    }

    public void setPersonalSign(String personalSign) {
        this.personalSign = personalSign == null ? null : personalSign.trim();
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public Integer getProvinceID() {
        return provinceID;
    }

    public void setProvinceID(Integer provinceID) {
        this.provinceID = provinceID;
    }

    public Integer getCityID() {
        return cityID;
    }

    public void setCityID(Integer cityID) {
        this.cityID = cityID;
    }
}