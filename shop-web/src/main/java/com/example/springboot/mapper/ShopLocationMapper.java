package com.example.springboot.mapper;

import com.example.springboot.entity.ShopLocation;
import com.example.springboot.entity.ShopLocationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopLocationMapper {
    int countByExample(ShopLocationExample example);

    int deleteByExample(ShopLocationExample example);

    int deleteByPrimaryKey(Integer locationID);

    int insert(ShopLocation record);

    int insertSelective(ShopLocation record);

    List<ShopLocation> selectByExample(ShopLocationExample example);

    ShopLocation selectByPrimaryKey(Integer locationID);

    int updateByExampleSelective(@Param("record") ShopLocation record, @Param("example") ShopLocationExample example);

    int updateByExample(@Param("record") ShopLocation record, @Param("example") ShopLocationExample example);

    int updateByPrimaryKeySelective(ShopLocation record);

    int updateByPrimaryKey(ShopLocation record);
}