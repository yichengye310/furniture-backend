package com.example.springboot.mapper;

import com.example.springboot.entity.CommonImage;
import com.example.springboot.entity.ProductStandardsColour;
import com.example.springboot.entity.ProductStandardsColourExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface ProductStandardsColourMapper {
    int countByExample(ProductStandardsColourExample example);

    int deleteByExample(ProductStandardsColourExample example);

    int deleteByPrimaryKey(Integer colourID);

    int insert(ProductStandardsColour record);

    int insertSelective(ProductStandardsColour record);

    List<ProductStandardsColour> selectByExample(ProductStandardsColourExample example);

    ProductStandardsColour selectByPrimaryKey(Integer colourID);

    List<ProductStandardsColour> selectByBandStandardID(@Param("bandStandardID") Integer bandStandardID);

    int updateByExampleSelective(@Param("record") ProductStandardsColour record, @Param("example") ProductStandardsColourExample example);

    int updateByExample(@Param("record") ProductStandardsColour record, @Param("example") ProductStandardsColourExample example);

    int updateByPrimaryKeySelective(ProductStandardsColour record);

    int updateByPrimaryKey(ProductStandardsColour record);

    int deleteByStandardID(Integer bandStandardID);
}