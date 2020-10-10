package com.example.springboot.mapper;

import com.example.springboot.entity.ProductLimitedTimeDetail;
import com.example.springboot.entity.ProductLimitedTimeDetailExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface ProductLimitedTimeDetailMapper {
    int countByExample(ProductLimitedTimeDetailExample example);

    int deleteByExample(ProductLimitedTimeDetailExample example);

    int deleteByPrimaryKey(Long productLimitedTimeID);

    int insert(ProductLimitedTimeDetail record);

    int insertSelective(ProductLimitedTimeDetail record);

    List<ProductLimitedTimeDetail> selectByExampleWithBLOBs(ProductLimitedTimeDetailExample example);

    List<ProductLimitedTimeDetail> selectByExample(ProductLimitedTimeDetailExample example);

    ProductLimitedTimeDetail selectByPrimaryKey(Long productLimitedTimeID);

    int updateByExampleSelective(@Param("record") ProductLimitedTimeDetail record, @Param("example") ProductLimitedTimeDetailExample example);

    int updateByExampleWithBLOBs(@Param("record") ProductLimitedTimeDetail record, @Param("example") ProductLimitedTimeDetailExample example);

    int updateByExample(@Param("record") ProductLimitedTimeDetail record, @Param("example") ProductLimitedTimeDetailExample example);

    int updateByPrimaryKeySelective(ProductLimitedTimeDetail record);

    int updateByPrimaryKeyWithBLOBs(ProductLimitedTimeDetail record);
}