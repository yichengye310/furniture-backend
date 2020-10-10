package com.example.springboot.mapper;

import com.example.springboot.dto.ProductCommentsDTO;
import com.example.springboot.entity.ProductComments;
import com.example.springboot.entity.ProductCommentsExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface ProductCommentsMapper {
    int countByExample(ProductCommentsExample example);

    int deleteByExample(ProductCommentsExample example);

    int deleteByPrimaryKey(Integer evaluateID);

    int insert(ProductComments record);

    int insertSelective(ProductComments record);

    List<ProductComments> selectByExample(ProductCommentsExample example);

    ProductComments selectByPrimaryKey(Integer evaluateID);

    int updateByExampleSelective(@Param("record") ProductComments record, @Param("example") ProductCommentsExample example);

    int updateByExample(@Param("record") ProductComments record, @Param("example") ProductCommentsExample example);

    int updateByPrimaryKeySelective(ProductComments record);

    int updateByPrimaryKey(ProductComments record);

    List<ProductComments> productCommentsList(ProductComments productComments);

    List<ProductCommentsDTO> productCommentsListByPage(ProductCommentsDTO productCommentsDTO);
}