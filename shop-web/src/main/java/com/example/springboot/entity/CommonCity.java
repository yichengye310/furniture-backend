package com.example.springboot.entity;

import lombok.Data;

@Data
public class CommonCity {
    private Integer cityID;

    private Integer provinceID;

    private String cityName;

    private Short state;

    private String spell;

    private Integer orderNo;

    private String areaCode;

    private Short isHot;

    private Long createdTimestamp;

    private Long lastModified;

    private String cityCode;
}