package com.example.springboot.entity;

public class UserAlreadyRobbed {
    private Integer panicBuyingID;

    private String userID;

    private Integer relationID;

    private Short relationType;

    private Long createdTimestamp;

    public Integer getPanicBuyingID() {
        return panicBuyingID;
    }

    public void setPanicBuyingID(Integer panicBuyingID) {
        this.panicBuyingID = panicBuyingID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID == null ? null : userID.trim();
    }

    public Integer getRelationID() {
        return relationID;
    }

    public void setRelationID(Integer relationID) {
        this.relationID = relationID;
    }

    public Short getRelationType() {
        return relationType;
    }

    public void setRelationType(Short relationType) {
        this.relationType = relationType;
    }

    public Long getCreatedTimestamp() {
        return createdTimestamp;
    }

    public void setCreatedTimestamp(Long createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }
}