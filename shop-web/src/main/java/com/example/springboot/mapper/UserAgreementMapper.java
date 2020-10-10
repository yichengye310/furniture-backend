package com.example.springboot.mapper;

import com.example.springboot.entity.UserAgreement;
import com.example.springboot.entity.UserAgreementExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserAgreementMapper {
    int countByExample(UserAgreementExample example);

    int deleteByExample(UserAgreementExample example);

    int deleteByPrimaryKey(Integer agreementID);

    int insert(UserAgreement record);

    int insertSelective(UserAgreement record);

    List<UserAgreement> selectByExampleWithBLOBs(UserAgreementExample example);

    List<UserAgreement> selectByExample(UserAgreementExample example);

    UserAgreement selectByPrimaryKey(Integer agreementID);

    int updateByExampleSelective(@Param("record") UserAgreement record, @Param("example") UserAgreementExample example);

    int updateByExampleWithBLOBs(@Param("record") UserAgreement record, @Param("example") UserAgreementExample example);

    int updateByExample(@Param("record") UserAgreement record, @Param("example") UserAgreementExample example);

    int updateByPrimaryKeySelective(UserAgreement record);

    int updateByPrimaryKeyWithBLOBs(UserAgreement record);

    int updateByPrimaryKey(UserAgreement record);
}