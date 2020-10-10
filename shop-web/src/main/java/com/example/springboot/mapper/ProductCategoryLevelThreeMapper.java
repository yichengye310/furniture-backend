package com.example.springboot.mapper;

import com.example.springboot.entity.ProductCategoryLevelThree;
import com.example.springboot.entity.ProductCategoryLevelThreeExample;
import java.util.List;

import com.example.springboot.entity.ProductCategoryLevelTwo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;


@Mapper
@Component
public interface ProductCategoryLevelThreeMapper {
    int countByExample(ProductCategoryLevelThreeExample example);

    int deleteByExample(ProductCategoryLevelThreeExample example);

    int deleteByPrimaryKey(Integer categoryID);

    int insert(ProductCategoryLevelThree record);

    int insertSelective(ProductCategoryLevelThree record);

    List<ProductCategoryLevelThree> selectByExample(ProductCategoryLevelThreeExample example);

    ProductCategoryLevelThree selectByPrimaryKey(Integer categoryID);

    int updateByExampleSelective(@Param("record") ProductCategoryLevelThree record, @Param("example") ProductCategoryLevelThreeExample example);

    int updateByExample(@Param("record") ProductCategoryLevelThree record, @Param("example") ProductCategoryLevelThreeExample example);

    int updateByPrimaryKeySelective(ProductCategoryLevelThree record);

    int updateByPrimaryKey(ProductCategoryLevelThree record);

    List<ProductCategoryLevelThree> productCategoryLevelThreeListByPage(ProductCategoryLevelThree productCategoryLevelThree);
}