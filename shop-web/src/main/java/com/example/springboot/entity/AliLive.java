package com.example.springboot.entity;

public class AliLive {
    private Integer liveID;

    private String longitude;

    private String latitude;

    private Short isOpenLocation;

    private Short liveWay;

    private String pushUrl;

    private String rtmpUrl;

    private String flvUrl;

    private String m3u8Url;

    private Short status;

    private String products;

    private String limitProducts;

    private Short userType;

    private String liveTitle;

    private String coverImage;

    private Integer userID;

    private Long createdTimestamp;

    public Integer getLiveID() {
        return liveID;
    }

    public void setLiveID(Integer liveID) {
        this.liveID = liveID;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }

    public Short getIsOpenLocation() {
        return isOpenLocation;
    }

    public void setIsOpenLocation(Short isOpenLocation) {
        this.isOpenLocation = isOpenLocation;
    }

    public Short getLiveWay() {
        return liveWay;
    }

    public void setLiveWay(Short liveWay) {
        this.liveWay = liveWay;
    }

    public String getPushUrl() {
        return pushUrl;
    }

    public void setPushUrl(String pushUrl) {
        this.pushUrl = pushUrl == null ? null : pushUrl.trim();
    }

    public String getRtmpUrl() {
        return rtmpUrl;
    }

    public void setRtmpUrl(String rtmpUrl) {
        this.rtmpUrl = rtmpUrl == null ? null : rtmpUrl.trim();
    }

    public String getFlvUrl() {
        return flvUrl;
    }

    public void setFlvUrl(String flvUrl) {
        this.flvUrl = flvUrl == null ? null : flvUrl.trim();
    }

    public String getM3u8Url() {
        return m3u8Url;
    }

    public void setM3u8Url(String m3u8Url) {
        this.m3u8Url = m3u8Url == null ? null : m3u8Url.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products == null ? null : products.trim();
    }

    public String getLimitProducts() {
        return limitProducts;
    }

    public void setLimitProducts(String limitProducts) {
        this.limitProducts = limitProducts == null ? null : limitProducts.trim();
    }

    public Short getUserType() {
        return userType;
    }

    public void setUserType(Short userType) {
        this.userType = userType;
    }

    public String getLiveTitle() {
        return liveTitle;
    }

    public void setLiveTitle(String liveTitle) {
        this.liveTitle = liveTitle == null ? null : liveTitle.trim();
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage == null ? null : coverImage.trim();
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public Long getCreatedTimestamp() {
        return createdTimestamp;
    }

    public void setCreatedTimestamp(Long createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }
}