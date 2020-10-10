package com.example.springboot.entity;

public class UserShoppingcart {
    private Integer cartItemID;

    private Integer productID;

    private String productName;

    private Integer productStandardID;

    private String productStandard;

    private Integer productColourID;

    private String productColour;

    private String productTitleImage;

    private String userID;

    private Integer addedNum;

    private Integer marketPrice;

    private Integer realPrice;

    private Long itemCreatedTime;

    public Integer getCartItemID() {
        return cartItemID;
    }

    public void setCartItemID(Integer cartItemID) {
        this.cartItemID = cartItemID;
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public Integer getProductStandardID() {
        return productStandardID;
    }

    public void setProductStandardID(Integer productStandardID) {
        this.productStandardID = productStandardID;
    }

    public String getProductStandard() {
        return productStandard;
    }

    public void setProductStandard(String productStandard) {
        this.productStandard = productStandard == null ? null : productStandard.trim();
    }

    public Integer getProductColourID() {
        return productColourID;
    }

    public void setProductColourID(Integer productColourID) {
        this.productColourID = productColourID;
    }

    public String getProductColour() {
        return productColour;
    }

    public void setProductColour(String productColour) {
        this.productColour = productColour == null ? null : productColour.trim();
    }

    public String getProductTitleImage() {
        return productTitleImage;
    }

    public void setProductTitleImage(String productTitleImage) {
        this.productTitleImage = productTitleImage == null ? null : productTitleImage.trim();
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID == null ? null : userID.trim();
    }

    public Integer getAddedNum() {
        return addedNum;
    }

    public void setAddedNum(Integer addedNum) {
        this.addedNum = addedNum;
    }

    public Integer getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(Integer marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Integer getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(Integer realPrice) {
        this.realPrice = realPrice;
    }

    public Long getItemCreatedTime() {
        return itemCreatedTime;
    }

    public void setItemCreatedTime(Long itemCreatedTime) {
        this.itemCreatedTime = itemCreatedTime;
    }
}