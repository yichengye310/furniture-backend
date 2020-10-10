package com.example.springboot.entity;

import lombok.Data;

@Data
public class ProductCategoryLevelThree extends BaseModel{
    private Integer categoryID;

    private Short categoryState;

    private Integer parentID;

    private String categoryName;

    private String categoryImg;

    private Integer orderNo;

    private String categoryIcon;

    private String spell;

    private String reducedName;
}