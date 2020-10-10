package com.example.springboot.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@ApiModel(value = "Product",description = "产品实体")
public class Product extends BaseModel{
    /**
     * 产品ID
     */
    @ApiModelProperty(value = "productID")
    @Id
    private Integer productID;
    /**
     * 产品编号
     */
    @ApiModelProperty(value = "产品编号")
    private String productCode;
    /**
     * 产品状态 1上架；2下架；3仓库 9删除
     */
    @ApiModelProperty(value = "产品状态 1上架；2下架；3仓库 9删除")
    private Short state;
    /**
     * 库存（库存数量等于规格库存总和）
     */
    @ApiModelProperty(value = "库存数量等于规格库存总和")
    private Integer productStockNum;
    /**
     * 系列ID
     */
    @ApiModelProperty(value = "三级分类-系列ID")
    private Integer levelThreeCategoryID;
    /**
     * 二级分类
     */
    @ApiModelProperty(value = "二级分类ID")
    private Integer levelTwoCategoryID;
    /**
     * 一级分类
     */
    @ApiModelProperty(value = "一级分类，暂时没有")
    private Integer levelOneCategoryID;
    /**
     * 产品标题
     */
    @ApiModelProperty(value = "产品标题")
    private String productName;
    /**
     * 产品简介
     */
    @ApiModelProperty(value = "产品简介")
    private String productDescription;
    /**
     * 产品主图片地址
     */
    @ApiModelProperty(value = "产品主图片地址")
    private String titleImg;
    /**
     * 产品主视频地址
     */
    @ApiModelProperty(value = "产品主视频地址")
    private String titleVideo;
    /**
     * 风格
     */
    @ApiModelProperty(value = "产品风格，暂时没有")
    private String styleName;
    @ApiModelProperty(value = "产品风格ID，暂时没有")
    private String styleID;
    /**
     * 推荐指数，默认为0。0表示不推荐，>0表示推荐，数字越大，排名越前
     */
    @ApiModelProperty(value = "产品风格，暂时没有,默认为0。0表示不推荐，>0表示推荐，数字越大，排名越前")
    private Integer recommendPriority;
    /**
     * 收藏数
     */
    @ApiModelProperty(value = "收藏数")
    private Integer collectNum;
    /**
     * 已购买数
     */
    @ApiModelProperty(value = "已购买数")
    private Integer boughtNum;
    /**
     * 创建时间戳
     */
    @ApiModelProperty(value = "创建时间戳")
    private Long createdTimestamp;
    /**
     * 浏览数
     */
    @ApiModelProperty(value = "浏览数")
    private Integer browseNum;
    /**
     * 发货周期
     */
    @ApiModelProperty(value = "发货周期")
    private String deliveryCycle;
    /**
     * 是否为会员专享 1是 2否 （会员专享必须是会员才有资格购买）
     */
    @ApiModelProperty(value = "会员专享产品 1是2否")
    private Short isSpecialGoods;
    /**
     * 会员产品类型 1专享好物 2.99元专区(isSpecialGoods为2时必填)
     */
    @ApiModelProperty(value = "会员产品类型 1专享好物 2.99元专区(isSpecialGoods为2时必填)")
    private Short vipProductType;
    /**
     * 规格的最低价格
     */
    @ApiModelProperty(value = "规格最低价格")
    private Integer lowPrice;
}