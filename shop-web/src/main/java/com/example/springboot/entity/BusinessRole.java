package com.example.springboot.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@ApiModel(value = "BusinessUser",description = "商家后台-角色实体")
public class BusinessRole {
    /**
     * 角色ID
     */
    @ApiModelProperty(value = "roleID")
    @Id
    private Integer roleID;
    @ApiModelProperty(value = "角色")
    private String roleName;
    @ApiModelProperty(value = "角色描述")
    private String description;
    @ApiModelProperty(value = "权限内容，json格式的字符串")
    private String permissionContent;
    @ApiModelProperty(value = "创建时间戳")
    private Long createdTimeStamp;
}