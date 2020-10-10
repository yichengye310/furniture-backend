package com.example.springboot.mapper;

import com.example.springboot.dto.CouPonModelDto;
import com.example.springboot.entity.CouponModel;
import com.example.springboot.entity.CouponModelExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface CouponModelMapper {
    int countByExample(CouponModelExample example);

    int deleteByExample(CouponModelExample example);

    int deleteByPrimaryKey(Integer couponID);

    int insert(CouponModel record);

    int insertSelective(CouponModel record);

    List<CouponModel> selectByExample(CouponModelExample example);

    CouponModel selectByPrimaryKey(Integer couponID);

    int updateByExampleSelective(@Param("record") CouponModel record, @Param("example") CouponModelExample example);

    int updateByExample(@Param("record") CouponModel record, @Param("example") CouponModelExample example);

    int updateByPrimaryKeySelective(CouponModel record);

    int updateByPrimaryKey(CouponModel record);

    CouPonModelDto queryCouponModel(@Param("couponID") Integer couponId);


    List<String> getCouponNames();

}