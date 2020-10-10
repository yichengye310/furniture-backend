package com.example.springboot.mapper;

import com.example.springboot.dto.ProductDTO;
import com.example.springboot.entity.Product;
import com.example.springboot.entity.ProductExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface ProductMapper {
    int countByExample(ProductExample example);

    int deleteByExample(ProductExample example);

    int deleteByPrimaryKey(Integer productID);

    int insert(Product record);

    int insertSelective(Product record);

    List<Product> selectByExample(ProductExample example);

    ProductDTO selectByPrimaryKey(Integer productID);

    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    List<ProductDTO> productListByPage(ProductDTO product);

    int addCollectNum(Integer productID);

    int cancelCollectNum(Integer productID);

    int updateBrowseNum(Integer productID);

    List<Product> selectByProductIDs(List<String> productIDs);

    void updateCollectNum(@Param("collectedProductID") Integer collectedProductID);
}