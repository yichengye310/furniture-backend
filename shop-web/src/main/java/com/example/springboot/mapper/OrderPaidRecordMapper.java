package com.example.springboot.mapper;

import com.example.springboot.entity.OrderPaidRecord;
import com.example.springboot.entity.OrderPaidRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderPaidRecordMapper {
    int countByExample(OrderPaidRecordExample example);

    int deleteByExample(OrderPaidRecordExample example);

    int deleteByPrimaryKey(Integer paidRecordID);

    int insert(OrderPaidRecord record);

    int insertSelective(OrderPaidRecord record);

    List<OrderPaidRecord> selectByExampleWithBLOBs(OrderPaidRecordExample example);

    List<OrderPaidRecord> selectByExample(OrderPaidRecordExample example);

    OrderPaidRecord selectByPrimaryKey(Integer paidRecordID);

    int updateByExampleSelective(@Param("record") OrderPaidRecord record, @Param("example") OrderPaidRecordExample example);

    int updateByExampleWithBLOBs(@Param("record") OrderPaidRecord record, @Param("example") OrderPaidRecordExample example);

    int updateByExample(@Param("record") OrderPaidRecord record, @Param("example") OrderPaidRecordExample example);

    int updateByPrimaryKeySelective(OrderPaidRecord record);

    int updateByPrimaryKeyWithBLOBs(OrderPaidRecord record);

    int updateByPrimaryKey(OrderPaidRecord record);
}