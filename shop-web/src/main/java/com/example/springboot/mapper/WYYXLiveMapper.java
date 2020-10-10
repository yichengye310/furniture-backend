package com.example.springboot.mapper;

import com.example.springboot.entity.WYYXLive;
import com.example.springboot.entity.WYYXLiveExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface WYYXLiveMapper {
    int countByExample(WYYXLiveExample example);

    int deleteByExample(WYYXLiveExample example);

    int deleteByPrimaryKey(String cid);

    int insert(WYYXLive record);

    int insertSelective(WYYXLive record);

    List<WYYXLive> selectByExample(WYYXLiveExample example);

    WYYXLive selectByPrimaryKey(String cid);

    int updateByExampleSelective(@Param("record") WYYXLive record, @Param("example") WYYXLiveExample example);

    int updateByExample(@Param("record") WYYXLive record, @Param("example") WYYXLiveExample example);

    int updateByPrimaryKeySelective(WYYXLive record);

    int updateByPrimaryKey(WYYXLive record);

    List<WYYXLive> channelListByPage(WYYXLive live);
}