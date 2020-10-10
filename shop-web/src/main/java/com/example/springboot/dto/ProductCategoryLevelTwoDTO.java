package com.example.springboot.dto;

import com.example.springboot.entity.ProductCategoryLevelThree;
import com.example.springboot.entity.ProductCategoryLevelTwo;
import lombok.Data;

import java.util.List;

@Data
public class ProductCategoryLevelTwoDTO extends ProductCategoryLevelTwo {
    private List<ProductCategoryLevelThree> productCategoryLevelThrees;
}
