package com.example.springboot.mapper;

import com.example.springboot.dto.ProductLimitedTimeStandardsDTO;
import com.example.springboot.entity.ProductLimitedTimeStandards;
import com.example.springboot.entity.ProductLimitedTimeStandardsExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface ProductLimitedTimeStandardsMapper {
    int countByExample(ProductLimitedTimeStandardsExample example);

    int deleteByExample(ProductLimitedTimeStandardsExample example);

    int deleteByPrimaryKey(Integer standardID);

    int insert(ProductLimitedTimeStandards record);

    int insertSelective(ProductLimitedTimeStandards record);

    List<ProductLimitedTimeStandards> selectByExample(ProductLimitedTimeStandardsExample example);

    ProductLimitedTimeStandards selectByPrimaryKey(Integer standardID);

    int updateByExampleSelective(@Param("record") ProductLimitedTimeStandards record, @Param("example") ProductLimitedTimeStandardsExample example);

    int updateByExample(@Param("record") ProductLimitedTimeStandards record, @Param("example") ProductLimitedTimeStandardsExample example);

    int updateByPrimaryKeySelective(ProductLimitedTimeStandards record);

    int updateByPrimaryKey(ProductLimitedTimeStandards record);

    List<ProductLimitedTimeStandards> selectByProductLimitedTimeID(ProductLimitedTimeStandards record);
}