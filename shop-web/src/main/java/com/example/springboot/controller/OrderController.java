package com.example.springboot.controller;


import com.example.springboot.dto.*;
import com.example.springboot.entity.OrderDeliveryInfo;
import com.example.springboot.entity.OrderPurchaseOrder;
import com.example.springboot.entity.UserCoupon;
import com.example.springboot.enumUtil.ReponseStateEnum;
import com.example.springboot.enumUtil.StateConstant;
import com.example.springboot.requestVO.orderVO.UserMadeToOrderVO;
import com.example.springboot.requestVO.orderVO.UserOrderDetailVO;
import com.example.springboot.service.OrderManagementService;
import com.example.springboot.service.UserOrderService;
import com.example.springboot.service.UserShoppingCartService;
import com.yelang.shop.base.annotation.UserLoginToken;
import com.yelang.shop.base.exception.JsonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@Controller
@RequestMapping(value = {"/order"})
public class OrderController extends BaseController{

    @Autowired
    private UserOrderService userOrderService;

    @Autowired
    private UserShoppingCartService userShoppingCartService;

    /**
     * 定制订单提交接口
     * @return
     */
    @UserLoginToken
    @ResponseBody
    @PostMapping(value = {"/madeToOreder"})
    public JsonResponse madeToOreder(@RequestBody UserMadeToOrderVO userMadeToOrderVO){
        JsonResponse resp = new JsonResponse();

        Integer res = userOrderService.generateMadeToOrder(userMadeToOrderVO);

        if (res == 0) {
            resp.setStatus(ReponseStateEnum.FAIL);
            resp.setMessage("提交生成定制订单失败！");
        }else {
            resp.setStatus(ReponseStateEnum.SUCCESS);
            resp.setMessage("提交生成定制订单成功！");
        }
        return resp;
    }

    /**
     * 获取订单详情
     * @return
     */
    @UserLoginToken
    @ResponseBody
    @PostMapping(value = {"/getOrderDetail"})
    public JsonResponse getOrderDetail(@RequestBody UserOrderDetailVO in){
        JsonResponse resp = new JsonResponse();

        List<OrderDetailForUserDTO> detailForUserDTOS = userOrderService.getOrderDetailByIDList(in.getOrderIDList());

        resp.setData(detailForUserDTOS);
        resp.setStatus(ReponseStateEnum.SUCCESS);
        resp.setMessage("查询确认收货信息成功");

        return resp;
    }

    /**
     * 确认收货接口
     * @return
     */
    @UserLoginToken
    @ResponseBody
    @GetMapping(value = {"/confirmForAccepted"})
    public JsonResponse confirmForAccepted(@RequestParam("orderID") Integer orderID){
        JsonResponse resp = new JsonResponse();

        Integer res = userOrderService.updateOrderStateByID(orderID, StateConstant.ORDER_COMPLETED);

        if (res == 1){
            resp.setStatus(ReponseStateEnum.SUCCESS);
            resp.setMessage("确认收货成功");
        }else {
            resp.setStatus(ReponseStateEnum.FAIL);
            resp.setMessage("订单状态错误");
        }
        return resp;
    }


    /**
     * 订单申请售后接口
     * @return
     */
    @UserLoginToken
    @ResponseBody
    @GetMapping(value = {"/applyAfterSale"})
    public JsonResponse applyAfterSale(@RequestParam("orderID") Integer orderID){
        JsonResponse resp = new JsonResponse();

        Integer res = userOrderService.updateOrderStateByID(orderID, StateConstant.ORDER_AFTER_SALE);

        if (res == 1){
            resp.setStatus(ReponseStateEnum.SUCCESS);
            resp.setMessage("申请售后成功");
        }else {
            resp.setStatus(ReponseStateEnum.FAIL);
            resp.setMessage("订单状态错误");
        }
        return resp;
    }

    /**
     * 取消订单接口
     * @return
     */
    @UserLoginToken
    @ResponseBody
    @GetMapping(value = {"/cancelOrder"})
    public JsonResponse cancelUserOrder(@RequestParam("orderID") Integer orderID){
        JsonResponse resp = new JsonResponse();

        Integer res = userOrderService.updateOrderStateByID(orderID, StateConstant.ORDER_CANCELED);

        if (res == 1){
            resp.setStatus(ReponseStateEnum.SUCCESS);
            resp.setMessage("取消订单成功");
        }else {
            resp.setStatus(ReponseStateEnum.FAIL);
            resp.setMessage("订单状态错误");
        }
        return resp;
    }

    /**
     * 获取用户订单列表
     * @param userID
     * @param request
     * @return
     */
    @UserLoginToken
    @ResponseBody
    @GetMapping(value = {"/getOrderList"})
    public JsonResponse GetOrderList(
            @RequestParam("userID") String userID,
            HttpServletRequest request) {
        JsonResponse resp = new JsonResponse();
        if (userID.trim() == null){
            resp.setStatus(ReponseStateEnum.FAIL);
        }else {
            List<OrderPurchaseOrder> resultList = userOrderService.getOrderListByUserID(userID);
            UserOrderDTO userOrderDTO = new UserOrderDTO();
            userOrderDTO.setNumber(resultList.size());
            userOrderDTO.setOrderList(resultList);
            resp.setStatus(ReponseStateEnum.SUCCESS);
            resp.setData(userOrderDTO);
        }

        return resp;
    }


    /**
     * 总价计算接口
     * @return
     */
    @UserLoginToken
    @CrossOrigin
    @ResponseBody
    @PostMapping(value = {"/calculate"})
    public JsonResponse amountCalculate(@RequestBody OrderCalculateSubmitDTO orderCalculateSubmitDTO){
//            @RequestParam("productList") List<OrderProdectPurchaseDetail> productList,
//            @RequestParam("userID") String userID){
        JsonResponse resp = new JsonResponse();
//        if (userID.trim() == null){
//            resp.setStatus(ReponseStateEnum.FAIL);
//        }else

        List<Integer> productList = orderCalculateSubmitDTO.getOrderList();
        if (productList.isEmpty()){
            resp.setStatus(ReponseStateEnum.FAIL);
        }else {
            Integer amount = userOrderService.calculateAmount(productList);

            OrderAmountCalculateDTO orderAmountCalculateDTO = new OrderAmountCalculateDTO();

            orderAmountCalculateDTO.setOrderList(productList);
            orderAmountCalculateDTO.setTotalAmount(amount);
            orderAmountCalculateDTO.setTransportationExpense(0);
            resp.setStatus(ReponseStateEnum.SUCCESS);
            resp.setData(orderAmountCalculateDTO);
        }
        return resp;
    }

    /**
     * 订单提交接口
     * @return
     */
    @UserLoginToken
    @ResponseBody
    @PostMapping(value = {"/submit"})
    public JsonResponse CreateUserOrder(@RequestBody CreateUserOrderDTO createUserOrderDTO){
        JsonResponse resp = new JsonResponse();

        List<OrderProdectPurchaseDetail> productList = createUserOrderDTO.getProductList();
        String userID  = createUserOrderDTO.getUserID();
        String userRemark  = createUserOrderDTO.getUserRemark();
        Short favourMode  = createUserOrderDTO.getFavourMode();
        Integer favourAmount  = createUserOrderDTO.getFavourAmount();
        Integer favourRelatedCouponID  = createUserOrderDTO.getFavourRelatedCouponID();
        Integer transportationExpenses  = createUserOrderDTO.getTransportationExpenses();
        Integer userAddressID  = createUserOrderDTO.getUserAddressID();
        Short orderFrom  = createUserOrderDTO.getOrderFrom();
        Integer orderType  = createUserOrderDTO.getOrderType();


        if (userID.trim() == null){
            resp.setStatus(ReponseStateEnum.FAIL);
        }else if (productList.isEmpty()){
            resp.setStatus(ReponseStateEnum.FAIL);
        }else {
            List<OrderPurchaseOrder> orderList = userOrderService.createOrderByUserID(productList, userID,
                    userRemark, favourRelatedCouponID, favourAmount, userAddressID, favourMode, orderType, orderFrom);

            List<Integer> cartIDList = createUserOrderDTO.getCartIDList();
            if (cartIDList != null && !cartIDList.isEmpty())
            {
                userShoppingCartService.deleteItemByIDList(cartIDList);
            }
            OrderSubmitDTO orderSubmitDTO = new OrderSubmitDTO();
            List<Integer> idList = new ArrayList<>();
            for(OrderPurchaseOrder order : orderList) {
                idList.add(order.getOrderID());
            }
            orderSubmitDTO.setOrderIDList(idList);
            orderSubmitDTO.setTotalAmount(orderList.get(0).getFinalAmount());
            resp.setStatus(ReponseStateEnum.SUCCESS);
            resp.setData(orderSubmitDTO);
        }
        return resp;
    }

    /**
     * 使用优惠券的信息
     * @Params userID 优惠券信息 totalAmount 总金额
     * @return
     */
    @UserLoginToken
    @ResponseBody
    @PostMapping(value = {"/getCouponInfo"})
    public JsonResponse getCouponInfo(@RequestParam("userID") String userID,@RequestParam("totalAmount")Integer totalAmount){
        JsonResponse resp = new JsonResponse();
        UserCoupon userCoupon = userOrderService.getCouponInfo(userID, totalAmount);
        resp.setData(userCoupon);
        return resp;
    }

}
