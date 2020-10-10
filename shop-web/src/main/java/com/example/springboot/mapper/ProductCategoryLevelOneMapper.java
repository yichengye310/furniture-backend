package com.example.springboot.mapper;

import com.example.springboot.entity.ProductCategoryLevelOne;
import com.example.springboot.entity.ProductCategoryLevelOneExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface ProductCategoryLevelOneMapper {
    int countByExample(ProductCategoryLevelOneExample example);

    int deleteByExample(ProductCategoryLevelOneExample example);

    int deleteByPrimaryKey(Integer categoryID);

    int insert(ProductCategoryLevelOne record);

    int insertSelective(ProductCategoryLevelOne record);

    List<ProductCategoryLevelOne> selectByExample(ProductCategoryLevelOneExample example);

    ProductCategoryLevelOne selectByPrimaryKey(Integer categoryID);

    int updateByExampleSelective(@Param("record") ProductCategoryLevelOne record, @Param("example") ProductCategoryLevelOneExample example);

    int updateByExample(@Param("record") ProductCategoryLevelOne record, @Param("example") ProductCategoryLevelOneExample example);

    int updateByPrimaryKeySelective(ProductCategoryLevelOne record);

    int updateByPrimaryKey(ProductCategoryLevelOne record);
}