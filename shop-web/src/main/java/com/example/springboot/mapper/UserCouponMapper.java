package com.example.springboot.mapper;

import com.example.springboot.entity.UserCoupon;
import com.example.springboot.entity.UserCouponExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserCouponMapper {
    int countByExample(UserCouponExample example);

    int deleteByExample(UserCouponExample example);

    int deleteByPrimaryKey(Integer userCouponID);

    int insert(UserCoupon record);

    int insertSelective(UserCoupon record);

    List<UserCoupon> selectByExample(UserCouponExample example);

    UserCoupon selectByPrimaryKey(Integer userCouponID);

    int updateByExampleSelective(@Param("record") UserCoupon record, @Param("example") UserCouponExample example);

    int updateByExample(@Param("record") UserCoupon record, @Param("example") UserCouponExample example);

    int updateByPrimaryKeySelective(UserCoupon record);

    int updateByPrimaryKey(UserCoupon record);
}