package com.example.springboot.mapper;

import com.example.springboot.entity.ProductStandards;
import com.example.springboot.entity.ProductStandardsExample;
import java.util.List;

import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface ProductStandardsMapper {
    int countByExample(ProductStandardsExample example);

    int deleteByExample(ProductStandardsExample example);

    int deleteByPrimaryKey(Integer standardID);

    int insert(ProductStandards record);

    int insertSelective(ProductStandards record);

    List<ProductStandards> selectByExample(ProductStandardsExample example);

    ProductStandards selectByPrimaryKey(Integer standardID);

    List<ProductStandards> selectByBandProductID(@Param("bandProductID") Integer bandProductID);

    int updateByExampleSelective(@Param("record") ProductStandards record, @Param("example") ProductStandardsExample example);

    int updateByExample(@Param("record") ProductStandards record, @Param("example") ProductStandardsExample example);

    int updateByPrimaryKeySelective(ProductStandards record);

    int updateByPrimaryKey(ProductStandards record);

    List<ProductStandards> selectByProductID(Integer bandProductID);
}