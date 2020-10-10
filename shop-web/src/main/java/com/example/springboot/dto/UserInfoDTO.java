package com.example.springboot.dto;

import com.example.springboot.entity.OrderPurchaseOrder;
import lombok.Data;

import java.util.List;

/**
 * @description:
 * @author: Sunzh
 * @time: 2020年3月18日 16:01:24
 */
@Data
public class UserInfoDTO {
    private String userID;

    private String userName;

    private String phoneNumber;

    private String portrait;

    private String personalSign;

    private String token;

    private Integer isOpenLive;

    private Short userType;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPortrait() {
        return portrait;
    }

    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }

    public String getPersonalSign() {
        return personalSign;
    }

    public void setPersonalSign(String personalSign) {
        this.personalSign = personalSign;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getIsOpenLive() {
        return isOpenLive;
    }

    public void setIsOpenLive(Integer isOpenLive) {
        this.isOpenLive = isOpenLive;
    }

    public Short getUserType() {
        return userType;
    }

    public void setUserType(Short userType) {
        this.userType = userType;
    }
}
