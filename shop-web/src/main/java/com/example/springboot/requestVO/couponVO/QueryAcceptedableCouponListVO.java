package com.example.springboot.requestVO.couponVO;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "QueryAcceptedableCouponListVO",description = "查询条件实体")
public class QueryAcceptedableCouponListVO {

    @ApiModelProperty(value = "userID，用户ID")
    private String userID;

    @ApiModelProperty(value = "用户类型： 1：普通用户  2：会员  3：经销商  4：商家")
    private Integer userType;

    @ApiModelProperty(value = "优惠券来源 1：会员充值   2：直播领取  3：商品详情页")
    private Integer couponReleaseWindow;
}
