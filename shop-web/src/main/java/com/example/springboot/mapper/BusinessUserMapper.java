package com.example.springboot.mapper;

import com.example.springboot.dto.BusinessUserDTO;
import com.example.springboot.entity.BusinessUser;
import com.example.springboot.entity.BusinessUserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface BusinessUserMapper {
    int countByExample(BusinessUserExample example);

    int deleteByExample(BusinessUserExample example);

    int deleteByPrimaryKey(Integer userID);

    int insert(BusinessUser record);

    int insertSelective(BusinessUser record);

    List<BusinessUser> selectByExample(BusinessUserExample example);

    BusinessUser selectByPrimaryKey(Integer userID);

    int updateByExampleSelective(@Param("record") BusinessUser record, @Param("example") BusinessUserExample example);

    int updateByExample(@Param("record") BusinessUser record, @Param("example") BusinessUserExample example);

    int updateByPrimaryKeySelective(BusinessUser record);

    int updateByPrimaryKey(BusinessUser record);

    List<BusinessUserDTO> userListByPage(BusinessUserDTO businessUserDTO);
}