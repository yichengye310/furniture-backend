package com.example.springboot.controller;

import com.example.springboot.dto.DeleteShoppingcartItemDTO;
import com.example.springboot.dto.UserAddShoppingCartDTO;
import com.example.springboot.dto.UserShoppingcartQueryDTO;
import com.example.springboot.entity.UserShoppingcart;
import com.example.springboot.enumUtil.ReponseStateEnum;
import com.example.springboot.service.UserShoppingCartService;
import com.github.pagehelper.PageInfo;
import com.yelang.shop.base.annotation.UserLoginToken;
import com.yelang.shop.base.exception.JsonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Controller
@RequestMapping("/shoppingCart")
public class UserShoppingCartController extends BaseController{
    @Autowired
    private UserShoppingCartService shoppingCartService;

    /**
     * 添加购物车
     * @param userAddShoppingCartDTO 用户购物车实体
     * @return
     */
    @UserLoginToken
    @ResponseBody
    @PostMapping("/add")
    public JsonResponse add(@RequestBody UserAddShoppingCartDTO userAddShoppingCartDTO){
        JsonResponse resp = new JsonResponse();
        try{
            UserShoppingcart res = shoppingCartService.add(userAddShoppingCartDTO);
            if (res != null) {
                resp.setData(res);
                resp.setMessage("添加成功");
                resp.setStatus(ReponseStateEnum.SUCCESS);
            }else {
                resp.setMessage("添加失败");
                resp.setStatus(ReponseStateEnum.FAIL);
            }
        }catch (Exception e){
            e.printStackTrace();
            resp.setMessage("服务器错误");
            resp.setStatus(ReponseStateEnum.FAIL);
        }
        return resp;
    }

    /**
     * 删除购物车商品
     * @param item
     * @return
     */
    @UserLoginToken
    @ResponseBody
    @PostMapping("/deleteItems")
    public JsonResponse deleteItems(@RequestBody DeleteShoppingcartItemDTO item){
        JsonResponse resp = new JsonResponse();
        List<Integer> cartItemIDList = item.getCartItemIDList();
        try{
            List<UserShoppingcart> userShoppingcartList = shoppingCartService.queryItemByIDList(cartItemIDList);
            if (userShoppingcartList.isEmpty())
            {
                resp.setMessage("购物车中所删除商品不存在！");
                resp.setStatus(ReponseStateEnum.FAIL);
                return resp;
            }
            Integer res = shoppingCartService.deleteItemByIDList(cartItemIDList);
            if (res == 0)
            {
                resp.setMessage("删除失败！");
                resp.setStatus(ReponseStateEnum.FAIL);
                return resp;
            }else
            {
                resp.setMessage("删除成功！");
                resp.setStatus(ReponseStateEnum.SUCCESS);
                return resp;
            }
        }catch (Exception e){
            e.printStackTrace();
            resp.setMessage("服务器错误");
            resp.setStatus(ReponseStateEnum.FAIL);
            return resp;
        }
    }

    /**
     * 修改购物车商品数量
     * @param cartItemID
     * @param modifedNum
     * @return
     */
    @UserLoginToken
    @ResponseBody
    @RequestMapping("/modifyNumber")
    public JsonResponse modifyNumber(@RequestParam(value = "cartItemID") Integer cartItemID, @RequestParam(value = "modifedNum") Integer modifedNum){
        JsonResponse resp = new JsonResponse();
        try{
            UserShoppingcart userShoppingcart = shoppingCartService.queryItemByID(cartItemID);
            if (userShoppingcart == null)
            {
                resp.setMessage("购物车中该商品不存在！");
                resp.setStatus(ReponseStateEnum.FAIL);
                return resp;
            }
            Integer tmp = userShoppingcart.getAddedNum();

            userShoppingcart.setAddedNum(modifedNum);
            Integer res = shoppingCartService.modifyItemByID(userShoppingcart);
            if (res == 1)
            {
                resp.setData(userShoppingcart);
                resp.setMessage("修改数量成功！");
                resp.setStatus(ReponseStateEnum.SUCCESS);
                return resp;
            }else
            {
                userShoppingcart.setAddedNum(tmp);
                resp.setData(userShoppingcart);
                resp.setMessage("修改数量失败！");
                resp.setStatus(ReponseStateEnum.FAIL);
                return resp;
            }
        }catch (Exception e){
            e.printStackTrace();
            resp.setMessage("服务器错误");
            resp.setStatus(ReponseStateEnum.FAIL);
            return resp;
        }
    }

    /**
     * 购物车列表分页查询
     * @param userID
     * @param pageNo
     * @param pageSize
     * @return
     */
    @UserLoginToken
    @ResponseBody
    @GetMapping("/shoppingCartListByPage")
    public JsonResponse shoppingCartList(@RequestParam(value = "userID") String userID, @RequestParam(value="pageNo",defaultValue="1") Integer pageNo,
                                    @RequestParam(value = "pageSize",defaultValue = "20") Integer pageSize){
        JsonResponse resp = new JsonResponse();
        if (pageNo == null || pageNo <= 0) {
            pageNo = 1;
        }
        try{
            PageInfo<UserShoppingcartQueryDTO> pageData = shoppingCartService.shoppingCartListByPage(userID,pageNo,pageSize);
            resp.setData(pageData);
            resp.setMessage("查询成功");
            resp.setStatus(ReponseStateEnum.SUCCESS);
        }catch (Exception e){
            e.printStackTrace();
            resp.setMessage("服务器错误");
            resp.setStatus(ReponseStateEnum.FAIL);
        }
        return resp;
    }
}
