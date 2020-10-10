package com.example.springboot.service;

import com.example.springboot.dto.UserAdressDTO;
import com.example.springboot.entity.*;
import com.example.springboot.enumUtil.StateConstant;
import com.example.springboot.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: SunZH
 * @time: 2020/1/14 0014 下午 1:22
 */
@Service
public class UserAddressService {
    @Autowired
    private UserAdressMapper userAdressMapper;

    @Autowired
    private CommonProvinceMapper commonProvinceMapper;

    @Autowired
    private CommonCityMapper commonCityMapper;

    @Autowired
    private CommonDistrictMapper commonDistrictMapper;

    public List<CommonDistrict> getDistrictsByCityID(Integer cityID) {
        CommonDistrictExample example = new CommonDistrictExample();
        example.createCriteria().andCityIDEqualTo(cityID);
        return commonDistrictMapper.selectByExample(example);
    }


    public List<CommonCity> getCityListByProvinceID(Integer provinceID) {
        CommonCityExample example = new CommonCityExample();
        example.createCriteria().andProvinceIDEqualTo(provinceID);
        return commonCityMapper.selectByExample(example);
    }

    public List<CommonProvince> getProvince() {
        Short state = 1;
        CommonProvinceExample example = new CommonProvinceExample();
        example.createCriteria().andStateEqualTo(state);
        return commonProvinceMapper.selectByExample(example);
    }
    public Integer addUserAddress(UserAdressDTO userAdressDTO){

        UserAdress userAdress = new UserAdress();

        userAdress.setUserID(userAdressDTO.getUserID());
        userAdress.setUsual(userAdressDTO.getUsual());
        userAdress.setReceiverName(userAdressDTO.getReceiverName());
        userAdress.setProvince(userAdressDTO.getProvince());
        userAdress.setProvinceID(userAdressDTO.getProvinceID());
        userAdress.setCity(userAdressDTO.getCity());
        userAdress.setCityID(userAdressDTO.getCityID());
        userAdress.setCounty(userAdressDTO.getCounty());
        userAdress.setCountyID(userAdressDTO.getCountyID());
        userAdress.setAddress(userAdressDTO.getAddress());
        userAdress.setMobilePhone(userAdressDTO.getMobilePhone());
        userAdress.setState(StateConstant.USER_ADDRESS_NORMAL);

        Long time = System.currentTimeMillis();
        userAdress.setLastModified(time);
        userAdress.setCreatedTimestamp(time);

        Integer res = userAdressMapper.insert(userAdress);
        return res;
    }

    public List<UserAdressDTO> queryAddressByUserID(String userID){
        List<UserAdressDTO> userAdressDTOS = new ArrayList<>();

        UserAdressExample example = new UserAdressExample();
        example.createCriteria().andUserIDEqualTo(userID);
        List<UserAdress> res = userAdressMapper.selectByExample(example);
        for (UserAdress address : res) {
            if (address.getState().equals(StateConstant.USER_ADDRESS_NORMAL)){
                UserAdressDTO dto = new UserAdressDTO();
                dto.setUserAddressID(address.getUserAddressID());
                dto.setUserID(userID);
                dto.setAddress(address.getAddress());
                dto.setProvince(address.getProvince());
                dto.setProvinceID(address.getProvinceID());
                dto.setCityID(address.getCityID());
                dto.setCity(address.getCity());
                dto.setCounty(address.getCounty());
                dto.setCountyID(address.getCountyID());
                dto.setReceiverName(address.getReceiverName());
                dto.setUsual(address.getUsual());
                dto.setMobilePhone(address.getMobilePhone());

                userAdressDTOS.add(dto);
            }
        }
        return userAdressDTOS;
    }

    public UserAdress selectAddressByPrimaryKey(Integer addressID){
        return userAdressMapper.selectByPrimaryKey(addressID);
    }

    public Integer updateByPrimaryKey(UserAdress userAdress){
        return userAdressMapper.updateByPrimaryKey(userAdress);
    }

    public UserAdress selectDefaultAddressByUserID(String userID){
        UserAdressExample example = new UserAdressExample();
        example.createCriteria().andUserIDEqualTo(userID).andUsualEqualTo(StateConstant.USER_ADDRESS_DEFAULT).andStateEqualTo(StateConstant.USER_ADDRESS_NORMAL);
        List<UserAdress> result = userAdressMapper.selectByExample(example);
        if (!result.isEmpty())
        {
            return result.get(0);
        }
        else
        {
            return null;
        }
    }
}
