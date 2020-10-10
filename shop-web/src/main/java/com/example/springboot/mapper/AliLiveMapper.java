package com.example.springboot.mapper;

import com.example.springboot.entity.AliLive;
import com.example.springboot.entity.AliLiveExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface AliLiveMapper {
    int countByExample(AliLiveExample example);

    int deleteByExample(AliLiveExample example);

    int deleteByPrimaryKey(Integer liveID);

    int insert(AliLive record);

    int insertSelective(AliLive record);

    List<AliLive> selectByExample(AliLiveExample example);

    AliLive selectByPrimaryKey(Integer liveID);

    int updateByExampleSelective(@Param("record") AliLive record, @Param("example") AliLiveExample example);

    int updateByExample(@Param("record") AliLive record, @Param("example") AliLiveExample example);

    int updateByPrimaryKeySelective(AliLive record);

    int updateByPrimaryKey(AliLive record);
}