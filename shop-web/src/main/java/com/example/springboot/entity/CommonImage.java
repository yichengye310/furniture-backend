package com.example.springboot.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@ApiModel(value = "CommonImage",description = "公共图片实体")
public class CommonImage {
    /**
     * 图片ID（主键）
     */
    @ApiModelProperty(value = "imageID")
    @Id
    private Integer imageID;
    /**
     * 关联ID
     */
    @ApiModelProperty(value = "flag=1/2/3/4时(关联产品ID);flag=5时(关联限时抢购产品ID);")
    private Integer relationID;
    /**
     * 图片地址（OSS图片地址）
     */
    @ApiModelProperty(value = "图片地址（OSS图片地址）")
    private String imageUrl;
    /**
     * 图片状态 1.正常 9.删除
     */
    @ApiModelProperty(value = "图片状态 1.正常 9.删除")
    private Short state;
    /**
     * 关联标志
     */
    @ApiModelProperty(value = "关联标志：1产品附图2产品活动轮播图3产品评价图4产品热门推荐图5限时抢购附图")
    private Short flag;
}