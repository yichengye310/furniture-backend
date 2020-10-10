package com.example.springboot.mapper;

import com.example.springboot.entity.CommonProvince;
import com.example.springboot.entity.CommonProvinceExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;


@Mapper
@Component
public interface CommonProvinceMapper {
    int countByExample(CommonProvinceExample example);

    int deleteByExample(CommonProvinceExample example);

    int deleteByPrimaryKey(Integer provinceID);

    int insert(CommonProvince record);

    int insertSelective(CommonProvince record);

    List<CommonProvince> selectByExample(CommonProvinceExample example);

    CommonProvince selectByPrimaryKey(Integer provinceID);

    int updateByExampleSelective(@Param("record") CommonProvince record, @Param("example") CommonProvinceExample example);

    int updateByExample(@Param("record") CommonProvince record, @Param("example") CommonProvinceExample example);

    int updateByPrimaryKeySelective(CommonProvince record);

    int updateByPrimaryKey(CommonProvince record);
}