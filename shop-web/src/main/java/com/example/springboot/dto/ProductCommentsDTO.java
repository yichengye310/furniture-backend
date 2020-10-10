package com.example.springboot.dto;

import com.example.springboot.entity.CommonImage;
import com.example.springboot.entity.ProductComments;
import lombok.Data;

import java.util.List;

@Data
public class ProductCommentsDTO extends ProductComments {
    //评价图片
    List<CommonImage> commonImages;
    //物流态度分数（平均分）
//    private Integer logisticsServiceScore;
//    //描述相符分数（平均分）
//    private Integer descriptionMatchScore;
//    //服务态度分数（平均分）
//    private Integer serviceAttitudeScore;
}
