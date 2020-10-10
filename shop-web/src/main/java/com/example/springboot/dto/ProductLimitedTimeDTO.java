package com.example.springboot.dto;

import com.example.springboot.entity.CommonImage;
import com.example.springboot.entity.ProductLimitedTime;
import com.example.springboot.entity.ProductLimitedTimeDetail;
import com.example.springboot.entity.UserAlreadyRobbed;
import lombok.Data;

import java.util.List;

@Data
public class ProductLimitedTimeDTO extends ProductLimitedTime {

    //限时抢购产品图片List
    private List<CommonImage> commonImage;
    //限时抢购产品详情
    private ProductLimitedTimeDetail productLimitedTimeDetail;
    //限时抢购产品规格
    private List<ProductLimitedTimeStandardsDTO> productLimitedTimeStandardsDTOS;
}
