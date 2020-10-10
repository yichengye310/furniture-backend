package com.example.springboot.entity;

public class StartUp {
    private Integer startupID;

    private String imgURL;

    private Integer startSeconds;

    public Integer getStartupID() {
        return startupID;
    }

    public void setStartupID(Integer startupID) {
        this.startupID = startupID;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL == null ? null : imgURL.trim();
    }

    public Integer getStartSeconds() {
        return startSeconds;
    }

    public void setStartSeconds(Integer startSeconds) {
        this.startSeconds = startSeconds;
    }
}