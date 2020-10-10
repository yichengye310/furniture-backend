package com.example.springboot.dto;

import com.example.springboot.entity.CommonImage;
import lombok.Data;

@Data
public class CommonImageDTO extends CommonImage {

    private ProductDTO product;
}
