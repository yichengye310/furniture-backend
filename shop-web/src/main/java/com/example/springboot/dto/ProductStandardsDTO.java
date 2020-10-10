package com.example.springboot.dto;

import com.example.springboot.entity.ProductStandards;
import com.example.springboot.entity.ProductStandardsColour;
import lombok.Data;

import java.util.List;
@Data

public class ProductStandardsDTO extends ProductStandards {

    //产品细目列表
    private List<ProductStandardsColour> productStandardsColours;
}
