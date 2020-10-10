package com.example.springboot.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@ApiModel(value = "ProductLimitedTime",description = "限时抢购产品实体")
public class ProductLimitedTime extends BaseModel{
    /**
     * 限时抢购产品ID
     */
    @ApiModelProperty(value = "limitedTimeProductID")
    @Id
    private Integer limitedTimeProductID;
    /**
     * 状态
     */
    @ApiModelProperty(value = "产品状态 1正常 9删除")
    private Short status;
    /**
     * 抢购开始时间戳(精确到毫秒)
     */
    @ApiModelProperty(value = "抢购开始时间戳(精确到毫秒)")
    private Long startTime;
    /**
     * 抢购结束时间戳(精确到毫秒)
     */
    @ApiModelProperty(value = "抢购结束时间戳(精确到毫秒)")
    private Long endTime;
    /**
     * 产品编号，不可超过32个字符
     */
    @ApiModelProperty(value = "产品编号，不可超过32个字符")
    private String productCode;
    /**
     * 风格ID，外键，对应ylfs_product_style表
     */
    @ApiModelProperty(value = "风格ID")
    private Integer styleID;
    /**
     * 产品标题
     */
    @ApiModelProperty(value = "产品标题")
    private String productName;
    /**
     * 产品简介描述
     */
    @ApiModelProperty(value = "产品简介描述")
    private String productDescription;
    /**
     * 产品活动图地址
     */
    @ApiModelProperty(value = "产品活动图地址（oss图片地址）")
    private String activityImg;
    /**
     * 产品主视频
     */
    @ApiModelProperty(value = "产品主视频地址（oss视频地址）")
    private String activityVideo;
    /**
     * 已抢数量
     */
    @ApiModelProperty(value = "已抢数量")
    private Integer alreadyRobbedNum;
    /**
     * 限购数量
     */
    @ApiModelProperty(value = "限购数量")
    private Integer limitNum;
    /**
     * 单人限购数量
     */
    @ApiModelProperty(value = "单人限购数量")
    private Integer personLimitNum;
    /**
     * 浏览次数
     */
    @ApiModelProperty(value = "浏览次数")
    private Integer browseNum;
    /**
     * 1满减(如：满3000减50) 2折扣（如：原价3000，折后价2500）
     */
    @ApiModelProperty(value = "1满减(如：满3000减50) 2折扣（如：原价3000，折后价2500）")
    private Short discountWay;
    /**
     * 满多少
     */
    @ApiModelProperty(value = "满多少，当discountWay为1时，该值必填")
    private Integer full;
    /**
     * 减多少
     */
    @ApiModelProperty(value = "减多少，当discountWay为1时，该值必填")
    private Integer reduce;
    /**
     * 活动对象，1.全部用户 2普通用户 3会员用户
     */
    @ApiModelProperty(value = "活动对象，1.全部用户 2普通用户 3会员用户")
    private Short activeObject;
    /**
     * 创建时间戳
     */
    @ApiModelProperty(value = "创建时间戳")
    private long createdTimestamp;
}