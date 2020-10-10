package com.example.springboot.entity;

import lombok.Data;

@Data
public class CommonProvince {
    private Integer provinceID;

    private Integer locationRegionID;

    private String provinceName;

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