package com.example.springboot.mapper;

import com.example.springboot.entity.StartUp;
import com.example.springboot.entity.StartUpExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface StartUpMapper {
    int countByExample(StartUpExample example);

    int deleteByExample(StartUpExample example);

    int deleteByPrimaryKey(Integer startupID);

    int insert(StartUp record);

    int insertSelective(StartUp record);

    List<StartUp> selectByExample(StartUpExample example);

    StartUp selectByPrimaryKey(Integer startupID);

    int updateByExampleSelective(@Param("record") StartUp record, @Param("example") StartUpExample example);

    int updateByExample(@Param("record") StartUp record, @Param("example") StartUpExample example);

    int updateByPrimaryKeySelective(StartUp record);

    int updateByPrimaryKey(StartUp record);
}