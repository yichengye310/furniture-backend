package com.example.springboot.mapper;

import com.example.springboot.entity.OrderDeliveryInfo;
import com.example.springboot.entity.OrderDeliveryInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface OrderDeliveryInfoMapper {
    int countByExample(OrderDeliveryInfoExample example);

    int deleteByExample(OrderDeliveryInfoExample example);

    int deleteByPrimaryKey(Integer orderID);

    int insert(OrderDeliveryInfo record);

    int insertSelective(OrderDeliveryInfo record);

    List<OrderDeliveryInfo> selectByExample(OrderDeliveryInfoExample example);

    OrderDeliveryInfo selectByPrimaryKey(Integer orderID);

    int updateByExampleSelective(@Param("record") OrderDeliveryInfo record, @Param("example") OrderDeliveryInfoExample example);

    int updateByExample(@Param("record") OrderDeliveryInfo record, @Param("example") OrderDeliveryInfoExample example);

    int updateByPrimaryKeySelective(OrderDeliveryInfo record);

    int updateByPrimaryKey(OrderDeliveryInfo record);
}