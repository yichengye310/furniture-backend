package com.example.springboot.mapper;

import com.example.springboot.entity.UserMadeToOrder;
import com.example.springboot.entity.UserMadeToOrderExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserMadeToOrderMapper {
    int countByExample(UserMadeToOrderExample example);

    int deleteByExample(UserMadeToOrderExample example);

    int deleteByPrimaryKey(Integer orderID);

    int insert(UserMadeToOrder record);

    int insertSelective(UserMadeToOrder record);

    List<UserMadeToOrder> selectByExample(UserMadeToOrderExample example);

    UserMadeToOrder selectByPrimaryKey(Integer orderID);

    int updateByExampleSelective(@Param("record") UserMadeToOrder record, @Param("example") UserMadeToOrderExample example);

    int updateByExample(@Param("record") UserMadeToOrder record, @Param("example") UserMadeToOrderExample example);

    int updateByPrimaryKeySelective(UserMadeToOrder record);

    int updateByPrimaryKey(UserMadeToOrder record);
}