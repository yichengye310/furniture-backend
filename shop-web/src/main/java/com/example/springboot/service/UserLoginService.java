package com.example.springboot.service;

import com.example.springboot.entity.*;
import com.example.springboot.enumUtil.StateConstant;
import com.example.springboot.mapper.UserAgreementMapper;
import com.example.springboot.mapper.UserInfoMapper;
import com.example.springboot.mapper.userMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yelang.shop.base.util.DESUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class UserLoginService {

    //用户直播权限 1：打开
    public static final Integer USER_LIVE_SHOW_OPEN = 1;

    //用户直播权限 0：关闭
    public static final Integer USER_LIVE_SHOW_CLOSE = 0;

    /**
     * 注入dao
     */
    @Autowired
    private userMapper usermapper;

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private UserAgreementMapper userAgreementMapper;

    public Integer updateLivePermission(UserInfo user){
        Integer res = 0;
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(user.getUserID());
        if (userInfo == null){
            return res;
        }

        if (userInfo.getIsOpenLive() == null || userInfo.getIsOpenLive() == USER_LIVE_SHOW_OPEN){
            userInfo.setIsOpenLive(USER_LIVE_SHOW_CLOSE);
        }else if (userInfo.getIsOpenLive() == null || userInfo.getIsOpenLive() == USER_LIVE_SHOW_CLOSE){
            userInfo.setIsOpenLive(USER_LIVE_SHOW_OPEN);
        }
        res = userInfoMapper.updateByPrimaryKey(userInfo);
        return res;

    }

    public UserAgreement getAgreement()
    {
        UserAgreementExample example = new UserAgreementExample();
        example.createCriteria().andStateEqualTo(StateConstant.STATE_NORMAL);
        List<UserAgreement> list = userAgreementMapper.selectByExampleWithBLOBs(example);
        if (list.isEmpty() || list == null)
        {
            return null;
        }else {
            return list.get(0);
        }

    }

    /**
     * 用户登录
     * @param phoneNumber
     * @param password
     * @return
     */
    public UserInfo userLogin(String phoneNumber,String password){
        UserInfoExample userInfoExample = new UserInfoExample();
        userInfoExample.createCriteria().andPhoneNumberEqualTo(phoneNumber);
        List<UserInfo> users = userInfoMapper.selectByExample(userInfoExample);
        if (users.isEmpty()){
            return null;
        } else {
            UserInfo user = users.get(0);
            if (password.equals(DESUtil.decryptBasedDes(user.getUserPwd()))){
                return user;
            }else {
                return null;
            }
        }
    }

    //注册新用户
    public Integer addUser(String phoneNumber,String password){
        UserInfo userInfo = new UserInfo();
        userInfo.setUserID(UUID.randomUUID().toString());
        userInfo.setState((short) 1);
        userInfo.setUserType(StateConstant.USER_TYPE_NORMAL);
        userInfo.setUserName(phoneNumber);
        userInfo.setPhoneNumber(phoneNumber);
        userInfo.setIsOpenLive(USER_LIVE_SHOW_CLOSE);

        String pwd = DESUtil.encryptBasedDes(password);
        userInfo.setUserPwd(pwd);

        Long createTime = System.currentTimeMillis();
        userInfo.setCreatedTimeStamp(createTime);
        userInfo.setCreatorType((short) 0);
        userInfo.setLastModifiedTimeStamp(createTime);

        Integer res = userInfoMapper.insert(userInfo);

        return res;
    }

    /**
     * 修改用户名称
     * @param userID
     * @param changedName
     * @return
     */
    public UserInfo changeUserName(String userID,String changedName){
        UserInfo user = userInfoMapper.selectByPrimaryKey(userID);
        if (user == null){
            return null;
        }else {
            user.setUserName(changedName);
            Integer res = userInfoMapper.updateByPrimaryKey(user);
            if (res == 0){
                return null;
            }else {
                return user;
            }
        }

    }

    /**
     * 根据手机号查询用户信息
     * @param phoneNumber
     * @return
     */
    public Boolean queryUserByPhone(String phoneNumber){
        UserInfoExample userInfoExample = new UserInfoExample();
        userInfoExample.createCriteria().andPhoneNumberEqualTo(phoneNumber);
        List<UserInfo> users = userInfoMapper.selectByExample(userInfoExample);
        if (!users.isEmpty()){
            return true;
        }else {
            return false;
        }
    }


    /**
     * 修改用户类型
     * @param userInfo
     * @return
     */
    public Integer updateUserType(UserInfo userInfo){
        Integer res = 0;

        UserInfo user = userInfoMapper.selectByPrimaryKey(userInfo.getUserID());
        if (user == null){
            return res;
        }else {
            user.setUserType(userInfo.getUserType());

            return res = userInfoMapper.updateByPrimaryKey(user);
        }
    }
    /**
     * 修改用户密码
     * @param phoneNumber
     * @param password
     * @return
     */
    public UserInfo changeUserPassword(String phoneNumber,String password){
        UserInfoExample userInfoExample = new UserInfoExample();
        userInfoExample.createCriteria().andPhoneNumberEqualTo(phoneNumber);
        List<UserInfo> users = userInfoMapper.selectByExample(userInfoExample);
        if (users.isEmpty()){
            return null;
        }else {
            UserInfo userInfo = users.get(0);
            String pwd = DESUtil.encryptBasedDes(password);
            userInfo.setUserPwd(pwd);
            Integer res = userInfoMapper.updateByPrimaryKey(userInfo);
            if (res == 1){
                return userInfo;
            }else {
                return null;
            }
        }

    }

    //查询用户列表
    public List<Map<String,Object>> queryAllUser(){
        return usermapper.queryAllUser();
    }

    /**
     * 查询用户列表分页
     * @param user
     * @param pageNo
     * @param pageSize
     * @return
     */
    public PageInfo<UserInfo> queryUserByPage(UserInfo user, Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize,"createdTimeStamp DESC");
        UserInfoExample example = new UserInfoExample();
        UserInfoExample.Criteria criteria = example.createCriteria();

        if (user.getUserType() != null){
            criteria.andUserTypeEqualTo(user.getUserType());
        }
        if (user.getPhoneNumber() != null){
            criteria.andPhoneNumberEqualTo(user.getPhoneNumber());
        }

        List<UserInfo> pageData = userInfoMapper.selectByExample(example);
        PageInfo<UserInfo> pageInfo = new PageInfo<>(pageData);
        return pageInfo;
    }

    public UserInfo changePortrait(String userID, String portrait) {
        UserInfo user = userInfoMapper.selectByPrimaryKey(userID);
        if (user == null){
            return null;
        }else {
            user.setPortrait(portrait);
            Integer res = userInfoMapper.updateByPrimaryKey(user);
            if (res == 0){
                return null;
            }else {
                return user;
            }
        }
    }
}
