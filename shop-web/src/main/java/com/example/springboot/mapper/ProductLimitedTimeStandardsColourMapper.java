package com.example.springboot.mapper;

import com.example.springboot.entity.ProductLimitedTimeStandardsColour;
import com.example.springboot.entity.ProductLimitedTimeStandardsColourExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface ProductLimitedTimeStandardsColourMapper {
    int countByExample(ProductLimitedTimeStandardsColourExample example);

    int deleteByExample(ProductLimitedTimeStandardsColourExample example);

    int deleteByPrimaryKey(Integer colourID);

    int insert(ProductLimitedTimeStandardsColour record);

    int insertSelective(ProductLimitedTimeStandardsColour record);

    List<ProductLimitedTimeStandardsColour> selectByExample(ProductLimitedTimeStandardsColourExample example);

    ProductLimitedTimeStandardsColour selectByPrimaryKey(Integer colourID);

    int updateByExampleSelective(@Param("record") ProductLimitedTimeStandardsColour record, @Param("example") ProductLimitedTimeStandardsColourExample example);

    int updateByExample(@Param("record") ProductLimitedTimeStandardsColour record, @Param("example") ProductLimitedTimeStandardsColourExample example);

    int updateByPrimaryKeySelective(ProductLimitedTimeStandardsColour record);

    int updateByPrimaryKey(ProductLimitedTimeStandardsColour record);

    int deleteByStandardID(Integer bandStandardID);
}