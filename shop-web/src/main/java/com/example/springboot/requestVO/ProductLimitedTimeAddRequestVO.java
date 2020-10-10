package com.example.springboot.requestVO;

import com.example.springboot.dto.ProductLimitedTimeDTO;
import com.example.springboot.dto.ProductLimitedTimeStandardsDTO;
import com.example.springboot.entity.*;
import lombok.Data;

import java.util.List;

@Data
public class ProductLimitedTimeAddRequestVO {
    private List<ProductLimitedTimeDTO> productLimitedTimeDTOS;
}
