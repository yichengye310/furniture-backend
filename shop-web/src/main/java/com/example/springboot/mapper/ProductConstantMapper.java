package com.example.springboot.mapper;

import com.example.springboot.entity.ProductConstant;
import com.example.springboot.entity.ProductConstantExample;
import com.example.springboot.entity.ProductConstantKey;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface ProductConstantMapper {
    int countByExample(ProductConstantExample example);

    int deleteByExample(ProductConstantExample example);

    int deleteByPrimaryKey(ProductConstantKey key);

    int insert(ProductConstant record);

    int insertSelective(ProductConstant record);

    List<ProductConstant> selectByExample(ProductConstantExample example);

    ProductConstant selectByPrimaryKey(ProductConstantKey key);

    int updateByExampleSelective(@Param("record") ProductConstant record, @Param("example") ProductConstantExample example);

    int updateByExample(@Param("record") ProductConstant record, @Param("example") ProductConstantExample example);

    int updateByPrimaryKeySelective(ProductConstant record);

    int updateByPrimaryKey(ProductConstant record);
}