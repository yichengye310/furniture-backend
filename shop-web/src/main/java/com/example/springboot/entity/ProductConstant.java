package com.example.springboot.entity;

import lombok.Data;

@Data
public class ProductConstant extends ProductConstantKey {
    private String constantFieldName;

    private String constantName;
}