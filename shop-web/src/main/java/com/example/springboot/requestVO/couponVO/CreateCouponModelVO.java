package com.example.springboot.requestVO.couponVO;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "CreateCouponModelVO",description = "创建优惠券VO")
public class CreateCouponModelVO {

    @ApiModelProperty(value = "优惠券名称")
    private String couponName;

    @ApiModelProperty(value = "优惠券生效起始时间")
    private Long couponBeginTime;

    @ApiModelProperty(value = "优惠券生效结束时间")
    private Long couponEndTime;

    @ApiModelProperty(value = "优惠券类型  1：活动优惠券  2：会员优惠券  3：直播优惠券")
    private Integer couponType;

    @ApiModelProperty(value = "优惠券描述")
    private String couponDescription;

    @ApiModelProperty(value = "优惠券发行总数量")
    private Integer couponTotalNumber;

    @ApiModelProperty(value = "单人领取数量限制")
    private Integer gainedNumLimit;

    @ApiModelProperty(value = "发放方式： 1：系统发放  2：手动领取")
    private Integer deliveryWay;

    @ApiModelProperty(value = "优惠券使用条件  1：满减(满减时有满减限制金额)  2：直接抵扣")
    private Integer discountType;

    @ApiModelProperty(value = "优惠券金额")
    private Integer couponAmount;

    @ApiModelProperty(value = "满减限制金额")
    private Integer discountLimit;

    @ApiModelProperty(value = "使用对象 0：全部用户   1：普通用户  2：会员  3：经销商  4：商家")
    private Integer destination;

    @ApiModelProperty(value = "优惠券来源 1：会员充值   2：直播领取  3：商品详情页")
    private Integer couponReleaseWindow;
}
