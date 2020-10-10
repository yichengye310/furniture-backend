package com.example.springboot.mapper;

import com.example.springboot.dto.UserProductsCollectionDTO;
import com.example.springboot.entity.ProductCategoryLevelTwo;
import com.example.springboot.entity.UserProductsCollection;
import com.example.springboot.entity.UserProductsCollectionExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;


@Mapper
@Component
public interface UserProductsCollectionMapper {
    int countByExample(UserProductsCollectionExample example);

    int deleteByExample(UserProductsCollectionExample example);

    int deleteByPrimaryKey(Integer collectedProductID);

    int insert(UserProductsCollection record);

    int insertSelective(UserProductsCollection record);

    List<UserProductsCollection> selectByExample(UserProductsCollectionExample example);

    UserProductsCollection selectByPrimaryKey(Integer collectedProductID);

    int updateByExampleSelective(@Param("record") UserProductsCollection record, @Param("example") UserProductsCollectionExample example);

    int updateByExample(@Param("record") UserProductsCollection record, @Param("example") UserProductsCollectionExample example);

    int updateByPrimaryKeySelective(UserProductsCollection record);

    int updateByPrimaryKey(UserProductsCollection record);

    int deleteByUserIDAndProductID(UserProductsCollection record);

    UserProductsCollection selectByUserIDAndProductID(UserProductsCollection record);

    List<UserProductsCollectionDTO> collectionListByPage(UserProductsCollectionDTO record);
}