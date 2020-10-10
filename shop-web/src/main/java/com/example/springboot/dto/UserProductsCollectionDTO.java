package com.example.springboot.dto;

import com.example.springboot.entity.Product;
import com.example.springboot.entity.UserProductsCollection;
import lombok.Data;

@Data
public class UserProductsCollectionDTO extends UserProductsCollection {
    private Product product;
}
