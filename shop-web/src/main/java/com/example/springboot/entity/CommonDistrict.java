package com.example.springboot.entity;

import lombok.Data;

@Data
public class CommonDistrict {
    private Integer locationDistrictID;

    private Integer cityID;

    private String districtName;

    private String spell;

    private Integer orderNo;

    private Short state;

    private Long createdTimestamp;

    private Long creatorID;

    private String creatorName;

    private Long lastModified;

    private Long lastModifierID;

    private String lastModifierName;
}