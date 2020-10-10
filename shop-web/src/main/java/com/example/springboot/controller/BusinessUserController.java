package com.example.springboot.controller;

import com.example.springboot.dto.BusinessUserDTO;
import com.example.springboot.entity.BusinessRole;
import com.example.springboot.entity.BusinessRoleExample;
import com.example.springboot.entity.BusinessUser;
import com.example.springboot.service.BusinessUserService;
import com.github.pagehelper.PageInfo;
import com.yelang.shop.base.annotation.UserLoginToken;
import com.yelang.shop.base.exception.JsonResponse;
import com.yelang.shop.base.exception.ServiceExceptionCode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/businessUser")
@Api(value = "商家后台权限管理")
public class BusinessUserController {
    @Autowired
    private BusinessUserService businessUserService;

    /**
     * 添加用户
     * @param businessUser
     * @return
     */
    @UserLoginToken
    @ResponseBody
    @PostMapping("/addUser")
    @ApiOperation(value = "添加用户",notes="新增成功时data=1")
    public JsonResponse add(@RequestBody BusinessUser businessUser){
        JsonResponse resp = new JsonResponse();
        try{
            Integer result = businessUserService.add(businessUser);
            if(result!=1){
                resp.setStatus(ServiceExceptionCode.USER_ALREADY_EXIST.getStatus());
                resp.setMessage(ServiceExceptionCode.USER_ALREADY_EXIST.getName());
            }
        }catch (Exception e){
            e.printStackTrace();
            resp = JsonResponse.buildErrorResponse();
        }
        return resp;
    }

    /**
     * 编辑用户
     * @param businessUser
     * @return
     */
    @UserLoginToken
    @ResponseBody
    @PostMapping("/updateUser")
    @ApiOperation(value = "编辑用户",notes="编辑成功时data=1")
    public JsonResponse updateUser(@RequestBody BusinessUser businessUser){
        JsonResponse resp = new JsonResponse();
        try{
            resp.setData(businessUserService.updateUser(businessUser));
        }catch (Exception e){
            e.printStackTrace();
            resp = JsonResponse.buildErrorResponse();
        }
        return resp;
    }
    /**
     * 删除用户
     * @param userID
     * @return
     */
    @UserLoginToken
    @ResponseBody
    @PostMapping("/deleteUser")
    @ApiOperation(value = "删除用户",notes="删除成功时data=1")
    public JsonResponse deleteUser(@RequestParam(name ="userID") Integer userID){
        JsonResponse resp = new JsonResponse();
        try{
            Integer result = businessUserService.deleteUser(userID);
            if(result!=1){
                resp.setStatus(ServiceExceptionCode.USER_IS_NOT_EXIST.getStatus());
                resp.setMessage(ServiceExceptionCode.USER_IS_NOT_EXIST.getName());
            }
        }catch (Exception e){
            e.printStackTrace();
            resp = JsonResponse.buildErrorResponse();
        }
        return resp;
    }

    /**
     * 用户登录
     * @param loginAccount 登录账号
     * @param loginPassword 登录密码
     * @return
     */
    @ResponseBody
    @PostMapping("/login")
    @ApiOperation(value = "用户登录",notes="登录成功时返回用户信息以及token")
    public JsonResponse login(@RequestParam(name ="loginAccount") String loginAccount,
                            @RequestParam(name ="loginPassword" ) String loginPassword){
        JsonResponse resp = new JsonResponse();
        try{
            if(!"".equals(loginAccount) && !"".equals(loginPassword)){
                BusinessUserDTO businessUserDTO = businessUserService.login(loginAccount,loginPassword);
                if(businessUserDTO!=null){
                    resp.setData(businessUserDTO);
                }else{
                    resp.setStatus(ServiceExceptionCode.WRONG_ACCOUNT_OR_PASSWORD.getStatus());
                    resp.setMessage(ServiceExceptionCode.WRONG_ACCOUNT_OR_PASSWORD.getName());
                }
            }else{
                resp.setStatus(ServiceExceptionCode.CANNOT_BE_EMPTY.getStatus());
                resp.setMessage(ServiceExceptionCode.CANNOT_BE_EMPTY.getName());
            }
        }catch (Exception e){
            e.printStackTrace();
            resp = JsonResponse.buildErrorResponse();
        }
        return resp;
    }

    /**
     * 用户列表分页查询
     * @param businessUserDTO
     * @param pageNo
     * @param pageSize
     * @return
     */
    @UserLoginToken
    @ResponseBody
    @GetMapping("/userListByPage")
    @ApiOperation(value = "用户列表分页查询")
    public JsonResponse userListByPage(BusinessUserDTO businessUserDTO,
                              @RequestParam(value="pageNo",defaultValue="1") Integer pageNo,
                              @RequestParam(value = "pageSize",defaultValue = "20") Integer pageSize){
        JsonResponse resp = new JsonResponse();
        if (pageNo == null || pageNo <= 0) {
            pageNo = 1;
        }
        try{
            PageInfo<BusinessUserDTO> pageData = businessUserService.userListByPage(businessUserDTO,pageNo,pageSize);
            resp.setData(pageData);
        }catch (Exception e){
            e.printStackTrace();
            resp = JsonResponse.buildErrorResponse();
        }
        return resp;
    }

    /**
     * 添加角色
     * @param businessRole
     * @return
     */
    @UserLoginToken
    @ResponseBody
    @PostMapping("/addRole")
    @ApiOperation(value = "添加角色",notes="添加成功时data=1")
    public JsonResponse addRole(@RequestBody BusinessRole businessRole){
        JsonResponse resp = new JsonResponse();
        try{
            resp.setData(businessUserService.addRole(businessRole));
        }catch (Exception e){
            e.printStackTrace();
            resp = JsonResponse.buildErrorResponse();
        }
        return resp;
    }

    /**
     * 编辑角色
     * @param businessRole
     * @return
     */
    @UserLoginToken
    @ResponseBody
    @PostMapping("/updateRole")
    @ApiOperation(value = "编辑角色",notes="成功时data=1")
    public JsonResponse updateRole(@RequestBody BusinessRole businessRole){
        JsonResponse resp = new JsonResponse();
        try{
            resp.setData(businessUserService.updateRole(businessRole));
        }catch (Exception e){
            e.printStackTrace();
            resp = JsonResponse.buildErrorResponse();
        }
        return resp;
    }

    /**
     * 角色详情
     * @param roleID
     * @return
     */
    @UserLoginToken
    @ResponseBody
    @GetMapping("/roleDetail")
    @ApiOperation(value = "角色详情",notes="返回角色详情信息，包括权限")
    public JsonResponse roleDetail(@RequestParam("roleID") Integer roleID){
        JsonResponse resp = new JsonResponse();
        try{
            resp.setData(businessUserService.roleDetail(roleID));
        }catch (Exception e){
            e.printStackTrace();
            resp = JsonResponse.buildErrorResponse();
        }
        return resp;
    }


    /**
     * 删除角色
     * @param roleID 角色ID
     * @return
     */
    @UserLoginToken
    @ResponseBody
    @PostMapping("/deleteRole")
    @ApiOperation(value = "删除角色",notes="删除成功时data=1")
    public JsonResponse deleteRole(@RequestParam(name ="roleID") Integer roleID){
        JsonResponse resp = new JsonResponse();
        try{
            resp.setData(businessUserService.deleteRole(roleID));
        }catch (Exception e){
            e.printStackTrace();
            resp = JsonResponse.buildErrorResponse();
        }
        return resp;
    }

    /**
     * 角色列表，不分页
     * @param businessRoleExample
     * @return
     */
    @UserLoginToken
    @ResponseBody
    @GetMapping("/roleList")
    @ApiOperation(value = "角色列表，不分页")
    public JsonResponse roleList(BusinessRoleExample businessRoleExample){
        JsonResponse resp = new JsonResponse();
        try{
            resp.setData(businessUserService.roleList(businessRoleExample));
        }catch (Exception e){
            e.printStackTrace();
            resp = JsonResponse.buildErrorResponse();
        }
        return resp;
    }
}
