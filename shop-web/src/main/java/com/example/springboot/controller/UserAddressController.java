package com.example.springboot.controller;

import com.example.springboot.dto.*;
import com.example.springboot.entity.*;
import com.example.springboot.enumUtil.ReponseStateEnum;
import com.example.springboot.enumUtil.StateConstant;
import com.example.springboot.service.UserAddressService;
import com.yelang.shop.base.annotation.UserLoginToken;
import com.yelang.shop.base.exception.JsonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @description: 类
 * @author: SunZH
 * @time: 2020/3/25 0025 下午 1:33
 */

@CrossOrigin
@Controller
@RequestMapping(value = {"/address"})
public class UserAddressController {

    @Autowired
    private UserAddressService userAddressService;

    /**
     * 根据市ID查询市归属的县区列表
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping(value = {"/getDistrictsByCityID"})
    public JsonResponse getDistrictsByCityID(@RequestParam("cityID") Integer cityID, HttpServletRequest request) {
        JsonResponse resp = new JsonResponse();
        List<CommonDistrict> districtList = userAddressService.getDistrictsByCityID(cityID);
        if (districtList != null){
            resp.setStatus(ReponseStateEnum.SUCCESS);
            resp.setMessage("查询成功");
            resp.setData(districtList);
        }else {
            resp.setStatus(ReponseStateEnum.FAIL);
            resp.setMessage("查询失败");
        }
        return resp;
    }


    /**
     * 根据省份ID查询省归属的市列表
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping(value = {"/getCityByProvinceID"})
    public JsonResponse getCityByProvinceID(@RequestParam("provinceID") Integer provinceID, HttpServletRequest request) {
        JsonResponse resp = new JsonResponse();
        List<CommonCity> cityList = userAddressService.getCityListByProvinceID(provinceID);
        if (cityList != null){
            resp.setStatus(ReponseStateEnum.SUCCESS);
            resp.setMessage("查询成功");
            resp.setData(cityList);
        }else {
            resp.setStatus(ReponseStateEnum.FAIL);
            resp.setMessage("查询失败");
        }
        return resp;
    }

    /**
     * 查询所有省份信息
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping(value = {"/getAllProvince"})
    public JsonResponse getAllProvince(HttpServletRequest request) {
        JsonResponse resp = new JsonResponse();
            List<CommonProvince> provinceList = userAddressService.getProvince();
            if (provinceList != null){
                resp.setStatus(ReponseStateEnum.SUCCESS);
                resp.setMessage("查询成功");
                resp.setData(provinceList);
            }else {
                resp.setStatus(ReponseStateEnum.FAIL);
                resp.setMessage("查询失败");
            }
        return resp;
    }



    /**
     * 添加用户地址
     * @param userAdressDTO
     * @param request
     * @return
     */
    @UserLoginToken
    @ResponseBody
    @RequestMapping(value = {"/add"})
    public JsonResponse addUserAddress(@RequestBody UserAdressDTO userAdressDTO, HttpServletRequest request) {
        JsonResponse resp = new JsonResponse();
        if (userAdressDTO.getUserID().trim() == null){
            resp.setStatus(ReponseStateEnum.FAIL);
            resp.setMessage("用户ID不能为空");
        }else {
            Integer result = userAddressService.addUserAddress(userAdressDTO);
            if (result == 1){
                resp.setStatus(ReponseStateEnum.SUCCESS);
                resp.setMessage("添加地址成功");
            }else {
                resp.setStatus(ReponseStateEnum.FAIL);
                resp.setMessage("添加地址失败");
            }
        }
        return resp;
    }


    /**
     * 查询用户收货地址列表
     * @param userID
     * @param request
     * @return
     */
    @UserLoginToken
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = {"/query"})
    public JsonResponse queryUserAddressByUserID(@RequestParam("userID") String userID, HttpServletRequest request){
        JsonResponse resp = new JsonResponse();
        if (userID.trim() == null){
            resp.setStatus(ReponseStateEnum.FAIL);
            resp.setMessage("用户ID不能为空");
        }else {
            List<UserAdressDTO> adressDTOS = userAddressService.queryAddressByUserID(userID);
            resp.setStatus(ReponseStateEnum.SUCCESS);
            resp.setMessage("查询成功");
            resp.setData(adressDTOS);
        }
        return resp;
    }

    /**
     * 修改用户收货地址信息
     * @param userAdressDTO
     * @param request
     * @return
     */
    @UserLoginToken
    @ResponseBody
    @RequestMapping(value = {"/modify"})
    public JsonResponse modifyUserAddress(@RequestBody UserAdressDTO userAdressDTO,
                                          HttpServletRequest request){
        JsonResponse resp = new JsonResponse();
        if (userAdressDTO.getUserID().trim() == null){
            resp.setStatus(ReponseStateEnum.FAIL);
            resp.setMessage("用户ID不能为空");
        }else if (userAdressDTO.getUserAddressID() == null){
            resp.setStatus(ReponseStateEnum.FAIL);
            resp.setMessage("用户地址ID不能为空");
        }else {
            UserAdress userAdress = userAddressService.selectAddressByPrimaryKey(userAdressDTO.getUserAddressID());
            if (userAdress == null)
            {
                resp.setStatus(ReponseStateEnum.FAIL);
                resp.setMessage("要修改的地址不存在");
                return resp;
            }


            if (userAdress.getUserID().equals(userAdressDTO.getUserID()))
            {
                //userAdress.setUsual(userAdressDTO.getUsual());
                userAdress.setReceiverName(userAdressDTO.getReceiverName());
                userAdress.setProvince(userAdressDTO.getProvince());
                userAdress.setProvinceID(userAdressDTO.getProvinceID());
                userAdress.setCity(userAdressDTO.getCity());
                userAdress.setCityID(userAdressDTO.getCityID());
                userAdress.setCounty(userAdressDTO.getCounty());
                userAdress.setCountyID(userAdressDTO.getCountyID());
                userAdress.setAddress(userAdressDTO.getAddress());
                userAdress.setMobilePhone(userAdressDTO.getMobilePhone());
                Long time = System.currentTimeMillis();
                userAdress.setLastModified(time);
                Integer res = userAddressService.updateByPrimaryKey(userAdress);
                if (res == 1){
                    resp.setStatus(ReponseStateEnum.SUCCESS);
                    resp.setMessage("修改成功");
                }else {
                    resp.setStatus(ReponseStateEnum.FAIL);
                    resp.setMessage("修改失败");
                }
            }else {
                resp.setStatus(ReponseStateEnum.FAIL);
                resp.setMessage("用户与地址不统一，修改失败");
            }
        }
        return resp;
    }

    /**
     * 修改用户默认地址
     * @param userID
     * @param oldAddressID
     * @param newAddressID
     * @param request
     * @return
     */
    @UserLoginToken
    @ResponseBody
    @RequestMapping(value = {"/default"})
    public JsonResponse setDefaultAddress(@RequestParam("userID") String userID,
                                          @RequestParam("oldAddressID") Integer oldAddressID,
                                          @RequestParam("newAddressID") Integer newAddressID,
                                          HttpServletRequest request){
        JsonResponse resp = new JsonResponse();
        try {
            if (userID.trim() == null) {
                resp.setStatus(ReponseStateEnum.FAIL);
                resp.setMessage("用户ID不能为空");
                return resp;
            }

//            if ((newAddressID == null) || (oldAddressID == null)) {
//                resp.setStatus(ReponseStateEnum.FAIL);
//                resp.setMessage("用户地址ID不能为空");
//                return resp;
//            }

            if (newAddressID == null) {
                resp.setStatus(ReponseStateEnum.FAIL);
                resp.setMessage("用户地址ID不能为空");
                return resp;
            }

             UserAdress oldAddress = userAddressService.selectDefaultAddressByUserID(userID);
            UserAdress newAddress = userAddressService.selectAddressByPrimaryKey(newAddressID);
            if ((oldAddress == null) || (newAddress == null)) {
                resp.setStatus(ReponseStateEnum.FAIL);
                resp.setMessage("地址不存在");
                return resp;
            }

            if (!oldAddress.getUserID().equals(userID)) {
                resp.setStatus(ReponseStateEnum.FAIL);
                resp.setMessage("用户与地址不统一，修改失败");
                return resp;
            }

            if (!newAddress.getUserID().equals(userID)) {
                resp.setStatus(ReponseStateEnum.FAIL);
                resp.setMessage("用户与地址不统一，修改失败");
                return resp;
            }

            oldAddress.setUsual(StateConstant.USER_ADDRESS_NOT_DEFAULT);
            newAddress.setUsual(StateConstant.USER_ADDRESS_DEFAULT);
            Long time = System.currentTimeMillis();
            oldAddress.setLastModified(time);
            newAddress.setLastModified(time);
            Integer res1 = userAddressService.updateByPrimaryKey(oldAddress);
            if (res1 == 1) {
                Integer res2 = userAddressService.updateByPrimaryKey(newAddress);
                if (res2 == 1) {
                    resp.setStatus(ReponseStateEnum.SUCCESS);
                    resp.setMessage("修改默认地址成功");
                } else {
                    oldAddress.setUsual(StateConstant.USER_ADDRESS_DEFAULT);
                    userAddressService.updateByPrimaryKey(oldAddress);
                    resp.setStatus(ReponseStateEnum.FAIL);
                    resp.setMessage("修改默认地址失败,服务器错误");
                }
            } else {
                resp.setStatus(ReponseStateEnum.FAIL);
                resp.setMessage("修改默认地址失败,服务器错误");
            }
        }catch (Exception e){
            resp.setStatus(ReponseStateEnum.FAIL);
            resp.setMessage("服务器错误");
        }
        return resp;
    }

    /**
     * 删除用户收货地址信息
     * @param userID
     * @param addressID
     * @param request
     * @return
     */
    @UserLoginToken
    @ResponseBody
    @RequestMapping(value = {"/delete"})
    public JsonResponse deleteUserAddress(@RequestParam("userID") String userID,
                                          @RequestParam("addressID") Integer addressID,
                                          HttpServletRequest request){
        JsonResponse resp = new JsonResponse();
        if (userID.trim() == null){
            resp.setStatus(ReponseStateEnum.FAIL);
            resp.setMessage("用户ID不能为空");
            return resp;
        }

        if (addressID == null){
            resp.setStatus(ReponseStateEnum.FAIL);
            resp.setMessage("用户地址ID不能为空");
            return resp;
        }

        UserAdress userAdress = userAddressService.selectAddressByPrimaryKey(addressID);
        if (userAdress == null) {
            resp.setStatus(ReponseStateEnum.FAIL);
            resp.setMessage("删除的地址不存在");
            return resp;
        }

        if (!userAdress.getUserID().equals(userID)) {
            resp.setStatus(ReponseStateEnum.FAIL);
            resp.setMessage("用户与地址不统一，修改失败");
            return resp;
        }

        if (userAdress.getUsual() == StateConstant.USER_ADDRESS_DEFAULT) {
            resp.setStatus(ReponseStateEnum.FAIL);
            resp.setMessage("不能删除默认地址！");
            return resp;
        }

        userAdress.setState(StateConstant.USER_ADDRESS_DELETE);
        Long time = System.currentTimeMillis();
        userAdress.setLastModified(time);
        Integer res = userAddressService.updateByPrimaryKey(userAdress);
        if (res == 1) {
            resp.setStatus(ReponseStateEnum.SUCCESS);
            resp.setMessage("删除成功");
        } else {
            resp.setStatus(ReponseStateEnum.FAIL);
            resp.setMessage("删除失败,服务器错误");
        }
        return resp;
    }

}
