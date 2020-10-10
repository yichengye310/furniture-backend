package com.example.springboot.mapper;

import com.example.springboot.entity.CommonDistrict;
import com.example.springboot.entity.CommonDistrictExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface CommonDistrictMapper {
    int countByExample(CommonDistrictExample example);

    int deleteByExample(CommonDistrictExample example);

    int deleteByPrimaryKey(Integer locationDistrictID);

    int insert(CommonDistrict record);

    int insertSelective(CommonDistrict record);

    List<CommonDistrict> selectByExample(CommonDistrictExample example);

    CommonDistrict selectByPrimaryKey(Integer locationDistrictID);

    int updateByExampleSelective(@Param("record") CommonDistrict record, @Param("example") CommonDistrictExample example);

    int updateByExample(@Param("record") CommonDistrict record, @Param("example") CommonDistrictExample example);

    int updateByPrimaryKeySelective(CommonDistrict record);

    int updateByPrimaryKey(CommonDistrict record);
}