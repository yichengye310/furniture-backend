package com.example.springboot.mapper;

import com.example.springboot.dto.CommonImageDTO;
import com.example.springboot.entity.CommonImage;
import com.example.springboot.entity.CommonImageExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface CommonImageMapper {
    int countByExample(CommonImageExample example);

    int deleteByExample(CommonImageExample example);

    int deleteByPrimaryKey(Integer imageID);

    int insert(CommonImage record);

    int insertSelective(CommonImage record);

    List<CommonImage> selectByExample(CommonImageExample example);

    CommonImage selectByPrimaryKey(Integer imageID);

    int updateByExampleSelective(@Param("record") CommonImage record, @Param("example") CommonImageExample example);

    int updateByExample(@Param("record") CommonImage record, @Param("example") CommonImageExample example);

    int updateByPrimaryKeySelective(CommonImage record);

    int updateByPrimaryKey(CommonImage record);

    List<CommonImage> selectProductTitleImgByRelationID(@Param("relationID") Integer relationID);

    List<CommonImage> selectProductLimitedTimeTitleImgByRelationID(@Param("relationID") Integer relationID);

    List<CommonImageDTO> selectList(CommonImage record);

    List<CommonImageDTO> selectListRelationProduct(CommonImage record);

    int deleteByProductID(CommonImage commonImage);
}