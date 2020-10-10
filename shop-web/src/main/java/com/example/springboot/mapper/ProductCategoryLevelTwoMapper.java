package com.example.springboot.mapper;

import com.example.springboot.dto.ProductCategoryLevelTwoDTO;
import com.example.springboot.entity.ProductCategoryLevelTwo;
import com.example.springboot.entity.ProductCategoryLevelTwoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface ProductCategoryLevelTwoMapper {
    int countByExample(ProductCategoryLevelTwoExample example);

    int deleteByExample(ProductCategoryLevelTwoExample example);

    int deleteByPrimaryKey(Integer categoryID);

    int insert(ProductCategoryLevelTwo record);

    int insertSelective(ProductCategoryLevelTwo record);

    List<ProductCategoryLevelTwo> selectByExample(ProductCategoryLevelTwoExample example);

    ProductCategoryLevelTwo selectByPrimaryKey(Integer categoryID);

    int updateByExampleSelective(@Param("record") ProductCategoryLevelTwo record, @Param("example") ProductCategoryLevelTwoExample example);

    int updateByExample(@Param("record") ProductCategoryLevelTwo record, @Param("example") ProductCategoryLevelTwoExample example);

    int updateByPrimaryKeySelective(ProductCategoryLevelTwo record);

    int updateByPrimaryKey(ProductCategoryLevelTwo record);

    List<ProductCategoryLevelTwoDTO> productCategoryListByPage(ProductCategoryLevelTwoDTO productCategoryLevelTwoDTO);
}