package com.example.springboot.mapper;

import com.example.springboot.entity.UserAlreadyRobbed;
import com.example.springboot.entity.UserAlreadyRobbedExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserAlreadyRobbedMapper {
    int countByExample(UserAlreadyRobbedExample example);

    int deleteByExample(UserAlreadyRobbedExample example);

    int deleteByPrimaryKey(Integer panicBuyingID);

    int insert(UserAlreadyRobbed record);

    int insertSelective(UserAlreadyRobbed record);

    List<UserAlreadyRobbed> selectByExample(UserAlreadyRobbedExample example);

    UserAlreadyRobbed selectByPrimaryKey(Integer panicBuyingID);

    int updateByExampleSelective(@Param("record") UserAlreadyRobbed record, @Param("example") UserAlreadyRobbedExample example);

    int updateByExample(@Param("record") UserAlreadyRobbed record, @Param("example") UserAlreadyRobbedExample example);

    int updateByPrimaryKeySelective(UserAlreadyRobbed record);

    int updateByPrimaryKey(UserAlreadyRobbed record);

    List<UserAlreadyRobbed> selectList(UserAlreadyRobbed record);
}