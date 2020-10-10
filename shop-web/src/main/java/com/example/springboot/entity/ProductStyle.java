package com.example.springboot.entity;

import lombok.Data;

@Data
public class ProductStyle {
    private Integer styleID;

    private String styleName;

    private String styleImgApp;

    private String styleImgWeb;

    private Short state;

    private Integer itemNum;
}