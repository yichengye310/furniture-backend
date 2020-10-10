package com.example.springboot.service;

import com.example.springboot.Interceptor.JWTToken;
import com.example.springboot.dto.BusinessUserDTO;
import com.example.springboot.entity.*;
import com.example.springboot.mapper.BusinessRoleMapper;
import com.example.springboot.mapper.BusinessUserMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yelang.shop.base.util.DESUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusinessUserService {
    @Autowired
    private BusinessUserMapper businessUserMapper;
    @Autowired
    private BusinessRoleMapper businessRoleMapper;

    public Integer add(BusinessUser businessUser){
        if(businessUser.getLoginPassword()!=null){
            businessUser.setLoginPassword(DESUtil.encryptBasedDes(businessUser.getLoginPassword()));
        }
        businessUser.setCreatedTimeStamp(System.currentTimeMillis());
        //step1:判断该用户是否已经注册过
        BusinessUserExample businessUserExample = new BusinessUserExample();
        businessUserExample.createCriteria().andLoginAccountEqualTo(businessUser.getLoginAccount());
        List<BusinessUser> businessUsers = businessUserMapper.selectByExample(businessUserExample);
        if(businessUsers!=null && businessUsers.size()>0){
            return -1;
        }
        return businessUserMapper.insertSelective(businessUser);
    }
    public Integer updateUser(BusinessUser businessUser){
        if(businessUser.getLoginPassword()!=null){
            businessUser.setLoginPassword(DESUtil.encryptBasedDes(businessUser.getLoginPassword()));
        }
        return businessUserMapper.updateByPrimaryKeySelective(businessUser);
    }
    public Integer deleteUser(Integer userID){
        BusinessUser businessUser = businessUserMapper.selectByPrimaryKey(userID);
        if(businessUser==null){
            return -1;
        }
        return businessUserMapper.deleteByPrimaryKey(userID);
    }
    public BusinessUserDTO login(String loginAccount,String loginPassword){
        JWTToken jwtToken = new JWTToken();
        BusinessUserExample businessUserExample = new BusinessUserExample();
        businessUserExample.createCriteria().andLoginAccountEqualTo(loginAccount);
        List<BusinessUser> businessUsers = businessUserMapper.selectByExample(businessUserExample);
        if(businessUsers!=null &&businessUsers.size()>0){
            BusinessUser businessUser = businessUsers.get(0);
            if(businessUser.getLoginPassword().equals(DESUtil.encryptBasedDes(loginPassword))){
                BusinessUserDTO businessUserDTO = new BusinessUserDTO();
                businessUserDTO.setToken(jwtToken.getToken(loginAccount,DESUtil.encryptBasedDes(loginPassword)));
                businessUserDTO.setLoginAccount(businessUser.getLoginAccount());
                businessUserDTO.setUserID(businessUser.getUserID());
                businessUserDTO.setRoleID(businessUser.getRoleID());
                businessUserDTO.setCreatedTimeStamp(businessUser.getCreatedTimeStamp());
                businessUserDTO.setGender(businessUser.getGender());
                businessUserDTO.setUserName(businessUser.getUserName());
                businessUserDTO.setPhoneNumber(businessUser.getPhoneNumber());
                if(businessUser.getRoleID()!=null){
                    BusinessRole businessRole =  businessRoleMapper.selectByPrimaryKey(businessUser.getRoleID());
                    businessUserDTO.setBusinessRole(businessRole);
                }
                return businessUserDTO;
            }
        }
        return null;
    }
    public PageInfo<BusinessUserDTO> userListByPage(BusinessUserDTO businessUserDTO, Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize,"userID DESC");
        List<BusinessUserDTO> pageData= businessUserMapper.userListByPage(businessUserDTO);
        PageInfo<BusinessUserDTO> pageInfo = new PageInfo<>(pageData);
        return pageInfo;
    }
    public Integer addRole(BusinessRole businessRole){
        businessRole.setCreatedTimeStamp(System.currentTimeMillis());
        return businessRoleMapper.insertSelective(businessRole);
    }
    public Integer updateRole(BusinessRole businessRole){
        return businessRoleMapper.updateByPrimaryKeySelective(businessRole);
    }
    public BusinessRole roleDetail(Integer roleID){
        return businessRoleMapper.selectByPrimaryKey(roleID);
    }
    public Integer deleteRole(Integer roleID){
        return businessRoleMapper.deleteByPrimaryKey(roleID);
    }
    public List<BusinessRole> roleList(BusinessRoleExample businessRoleExample){
        return businessRoleMapper.selectByExample(businessRoleExample);
    }
}
