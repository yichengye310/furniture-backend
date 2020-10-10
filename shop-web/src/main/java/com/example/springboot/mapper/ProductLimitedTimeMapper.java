package com.example.springboot.mapper;
import com.example.springboot.dto.ProductLimitedTimeDTO;
import com.example.springboot.entity.ProductLimitedTime;
import com.example.springboot.entity.ProductLimitedTimeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface ProductLimitedTimeMapper {
    int countByExample(ProductLimitedTimeExample example);

    int deleteByExample(ProductLimitedTimeExample example);

    int deleteByPrimaryKey(Integer limitedTimeProductID);

    int insert(ProductLimitedTime record);

    int insertSelective(ProductLimitedTime record);

    List<ProductLimitedTime> selectByExample(ProductLimitedTimeExample example);

    ProductLimitedTimeDTO selectByPrimaryKey(Integer limitedTimeProductID);

    int updateByExampleSelective(@Param("record") ProductLimitedTime record, @Param("example") ProductLimitedTimeExample example);

    int updateByExample(@Param("record") ProductLimitedTime record, @Param("example") ProductLimitedTimeExample example);

    int updateByPrimaryKeySelective(ProductLimitedTime record);

    int updateByPrimaryKey(ProductLimitedTime record);

    List<ProductLimitedTimeDTO> productLimitedTimeListByPage(ProductLimitedTimeDTO productLimitedTimeDTO,@Param("type") Integer type);

    int updateAlreadyRobbedNum(Integer limitedTimeProductID);

    List<ProductLimitedTime> selectByProductIDs(List<String> productIDs);

}