package com.example.springboot.dto;

import com.example.springboot.entity.BusinessRole;
import com.example.springboot.entity.BusinessUser;
import lombok.Data;

@Data
public class BusinessUserDTO extends BusinessUser {
    /**
     * jwt生成的用户token，用户登录时返回
     */
    private String token;
    /**
     * 用户角色
     */
    private BusinessRole businessRole;
}
