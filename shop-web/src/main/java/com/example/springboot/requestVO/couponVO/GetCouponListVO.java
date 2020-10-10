package com.example.springboot.requestVO.couponVO;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "GetCouponListVO",description = "条件查询优惠券列表")
public class GetCouponListVO {

    @ApiModelProperty(value = "优惠券名称")
    private String couponName;

    @ApiModelProperty(value = "优惠券生效起始时间")
    private Long couponBeginTime;

    @ApiModelProperty(value = "优惠券生效结束时间")
    private Long couponEndTime;

    @ApiModelProperty(value = "优惠券类型  1：活动优惠券  2：会员优惠券  3：直播优惠券")
    private Integer couponType;

    @ApiModelProperty(value = "优惠券状态   0：未生效  1：正常  9：终止")
    private Integer couponState;

}
