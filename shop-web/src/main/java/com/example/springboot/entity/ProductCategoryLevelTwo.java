package com.example.springboot.entity;

import lombok.Data;

@Data
public class ProductCategoryLevelTwo extends BaseModel{
    private Integer categoryID;

    private Short categoryState;

    private Integer parentID;

    private String categoryName;

    private String categoryImg;

    private Integer orderNo;

    private String categoryIcon;

    private String spell;

    private String reducedName;
    //是否热门种类 1非热门 2热门
    private Short hotFlag;
}