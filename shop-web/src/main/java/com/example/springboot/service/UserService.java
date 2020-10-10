package com.example.springboot.service;

import com.example.springboot.entity.Product;
import com.example.springboot.entity.UserInfo;
import com.example.springboot.enumUtil.StateConstant;
import com.example.springboot.mapper.ProductMapper;
import com.example.springboot.mapper.UserInfoMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: SunZH
 * @time: 2020/1/14 0014 上午 11:33
 */
@Service
public class UserService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    public UserInfo selectUserByPrimaryKey(String UserID){
        return userInfoMapper.selectByPrimaryKey(UserID);
    }


    public Integer updateUserToVIPByUserID(String UserID){
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(UserID);
        userInfo.setUserType(StateConstant.USER_TYPE_MEMBER);
        return userInfoMapper.updateByPrimaryKey(userInfo);
    }

    //public Integer createTemporaryUserInfo()


}
