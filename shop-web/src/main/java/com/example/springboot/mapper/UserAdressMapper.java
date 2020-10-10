package com.example.springboot.mapper;

import com.example.springboot.entity.UserAdress;
import com.example.springboot.entity.UserAdressExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserAdressMapper {
    int countByExample(UserAdressExample example);

    int deleteByExample(UserAdressExample example);

    int deleteByPrimaryKey(Integer userAddressID);

    int insert(UserAdress record);

    int insertSelective(UserAdress record);

    List<UserAdress> selectByExample(UserAdressExample example);

    UserAdress selectByPrimaryKey(Integer userAddressID);

    int updateByExampleSelective(@Param("record") UserAdress record, @Param("example") UserAdressExample example);

    int updateByExample(@Param("record") UserAdress record, @Param("example") UserAdressExample example);

    int updateByPrimaryKeySelective(UserAdress record);

    int updateByPrimaryKey(UserAdress record);
}