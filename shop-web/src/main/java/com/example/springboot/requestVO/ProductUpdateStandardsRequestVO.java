package com.example.springboot.requestVO;

import com.example.springboot.dto.ProductStandardsDTO;
import lombok.Data;

import java.util.List;

@Data
public class ProductUpdateStandardsRequestVO {
    private Integer productID;
    private List<ProductStandardsDTO> productStandardsDTOS;
}
