package com.example.springboot.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@ApiModel(value = "BusinessUser",description = "商家后台-用户实体")
public class BusinessUser {
    @ApiModelProperty(value = "userID")
    @Id
    private Integer userID;
    @ApiModelProperty(value = "登录账号，由管理员自定义")
    private String loginAccount;
    @ApiModelProperty(value = "登录密码，MD5加密")
    private String loginPassword;
    @ApiModelProperty(value = "姓名")
    private String userName;
    @ApiModelProperty(value = "性别，1男2女")
    private Byte gender;
    @ApiModelProperty(value = "角色ID")
    private Integer roleID;
    @ApiModelProperty(value = "手机号")
    private String phoneNumber;
    @ApiModelProperty(value = "创建时间戳")
    private Long createdTimeStamp;
}