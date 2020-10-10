package com.example.springboot.mapper;

import com.example.springboot.entity.CommonCity;
import com.example.springboot.entity.CommonCityExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface CommonCityMapper {
    int countByExample(CommonCityExample example);

    int deleteByExample(CommonCityExample example);

    int deleteByPrimaryKey(Integer cityID);

    int insert(CommonCity record);

    int insertSelective(CommonCity record);

    List<CommonCity> selectByExample(CommonCityExample example);

    CommonCity selectByPrimaryKey(Integer cityID);

    int updateByExampleSelective(@Param("record") CommonCity record, @Param("example") CommonCityExample example);

    int updateByExample(@Param("record") CommonCity record, @Param("example") CommonCityExample example);

    int updateByPrimaryKeySelective(CommonCity record);

    int updateByPrimaryKey(CommonCity record);
}