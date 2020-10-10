package com.example.springboot.entity;

public class WYYXLive {
    private String cid;

    private String longitude;

    private String latitude;

    private Short isOpenLocation;

    private Short liveWay;

    private String pushUrl;

    private String httpPullUrl;

    private String hlsPullUrl;

    private String rtmpPullUrl;

    private Short status;

    private String products;

    private String limitProducts;

    private Short userType;

    private String liveTitle;

    private String coverImage;

    private String userID;

    private Long createdTimestamp;

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
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

    public String getHttpPullUrl() {
        return httpPullUrl;
    }

    public void setHttpPullUrl(String httpPullUrl) {
        this.httpPullUrl = httpPullUrl == null ? null : httpPullUrl.trim();
    }

    public String getHlsPullUrl() {
        return hlsPullUrl;
    }

    public void setHlsPullUrl(String hlsPullUrl) {
        this.hlsPullUrl = hlsPullUrl == null ? null : hlsPullUrl.trim();
    }

    public String getRtmpPullUrl() {
        return rtmpPullUrl;
    }

    public void setRtmpPullUrl(String rtmpPullUrl) {
        this.rtmpPullUrl = rtmpPullUrl == null ? null : rtmpPullUrl.trim();
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

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID == null ? null : userID.trim();
    }

    public Long getCreatedTimestamp() {
        return createdTimestamp;
    }

    public void setCreatedTimestamp(Long createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }
}