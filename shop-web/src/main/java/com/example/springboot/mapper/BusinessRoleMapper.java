package com.example.springboot.mapper;

import com.example.springboot.entity.BusinessRole;
import com.example.springboot.entity.BusinessRoleExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface BusinessRoleMapper {
    int countByExample(BusinessRoleExample example);

    int deleteByExample(BusinessRoleExample example);

    int deleteByPrimaryKey(Integer roleID);

    int insert(BusinessRole record);

    int insertSelective(BusinessRole record);

    List<BusinessRole> selectByExample(BusinessRoleExample example);

    BusinessRole selectByPrimaryKey(Integer roleID);

    int updateByExampleSelective(@Param("record") BusinessRole record, @Param("example") BusinessRoleExample example);

    int updateByExample(@Param("record") BusinessRole record, @Param("example") BusinessRoleExample example);

    int updateByPrimaryKeySelective(BusinessRole record);

    int updateByPrimaryKey(BusinessRole record);

    BusinessRole selectByRoleID();
}