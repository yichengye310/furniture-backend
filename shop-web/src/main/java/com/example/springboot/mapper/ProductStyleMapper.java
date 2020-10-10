package com.example.springboot.mapper;

import com.example.springboot.entity.ProductStyle;
import com.example.springboot.entity.ProductStyleExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface ProductStyleMapper {
    int countByExample(ProductStyleExample example);

    int deleteByExample(ProductStyleExample example);

    int deleteByPrimaryKey(Integer styleID);

    int insert(ProductStyle record);

    int insertSelective(ProductStyle record);

    List<ProductStyle> selectByExample(ProductStyleExample example);

    ProductStyle selectByPrimaryKey(Integer styleID);

    int updateByExampleSelective(@Param("record") ProductStyle record, @Param("example") ProductStyleExample example);

    int updateByExample(@Param("record") ProductStyle record, @Param("example") ProductStyleExample example);

    int updateByPrimaryKeySelective(ProductStyle record);

    int updateByPrimaryKey(ProductStyle record);
}