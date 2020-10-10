package com.example.springboot.mapper;

import com.example.springboot.entity.UserShoppingcart;
import com.example.springboot.entity.UserShoppingcartExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserShoppingcartMapper {
    int countByExample(UserShoppingcartExample example);

    int deleteByExample(UserShoppingcartExample example);

    int deleteByPrimaryKey(Integer cartItemID);

    int insert(UserShoppingcart record);

    int insertSelective(UserShoppingcart record);

    List<UserShoppingcart> selectByExample(UserShoppingcartExample example);

    UserShoppingcart selectByPrimaryKey(Integer cartItemID);

    int updateByExampleSelective(@Param("record") UserShoppingcart record, @Param("example") UserShoppingcartExample example);

    int updateByExample(@Param("record") UserShoppingcart record, @Param("example") UserShoppingcartExample example);

    int updateByPrimaryKeySelective(UserShoppingcart record);

    int updateByPrimaryKey(UserShoppingcart record);
}