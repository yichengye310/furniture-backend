package com.example.springboot.dto;

import com.example.springboot.entity.ProductLimitedTimeStandards;
import com.example.springboot.entity.ProductLimitedTimeStandardsColour;
import lombok.Data;

import java.util.List;
@Data
public class ProductLimitedTimeStandardsDTO extends ProductLimitedTimeStandards {
    //限时抢购产品细目列表
    private List<ProductLimitedTimeStandardsColour> productLimitedTimeStandardsColour;
}
