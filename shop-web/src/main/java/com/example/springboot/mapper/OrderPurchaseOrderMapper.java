package com.example.springboot.mapper;

import com.example.springboot.entity.OrderPurchaseOrder;
import com.example.springboot.entity.OrderPurchaseOrderExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface OrderPurchaseOrderMapper {
    int countByExample(OrderPurchaseOrderExample example);

    int deleteByExample(OrderPurchaseOrderExample example);

    int deleteByPrimaryKey(Integer orderID);

    int insert(OrderPurchaseOrder record);

    int insertSelective(OrderPurchaseOrder record);

    List<OrderPurchaseOrder> selectByExample(OrderPurchaseOrderExample example);

    OrderPurchaseOrder selectByPrimaryKey(Integer orderID);

    int updateByExampleSelective(@Param("record") OrderPurchaseOrder record, @Param("example") OrderPurchaseOrderExample example);

    int updateByExample(@Param("record") OrderPurchaseOrder record, @Param("example") OrderPurchaseOrderExample example);

    int updateByPrimaryKeySelective(OrderPurchaseOrder record);

    int updateByPrimaryKey(OrderPurchaseOrder record);
}