package com.example.springboot.controller;

import com.example.springboot.dto.*;
import com.example.springboot.entity.OrderPurchaseOrder;
import com.example.springboot.entity.UserMadeToOrder;
import com.example.springboot.enumUtil.ReponseStateEnum;
import com.example.springboot.requestVO.orderVO.OrderManagementQueryByPageRequestVO;
import com.example.springboot.requestVO.orderVO.UserMadeToOrderVO;
import com.example.springboot.service.OrderManagementService;
import com.github.pagehelper.PageInfo;
import com.yelang.shop.base.annotation.UserLoginToken;
import com.yelang.shop.base.exception.JsonResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @description: 后台订单管理相关接口
 * @author: SunZH
 * @time: 2020/4/3 0003 下午 2:38
 */
@CrossOrigin
@Controller
@RequestMapping(value = {"/orderManage"})
@Api(value = "商家后台订单相关接口")
public class OrderManagementController {

    @Autowired
    private OrderManagementService orderManagementService;

    /**
     * 删除定制订单接口
     * @return
     */
    @ResponseBody
    @GetMapping(value = {"/deleteMadeToOreder"})
    public JsonResponse deleteMadeToOreder(@RequestParam(value="orderID") Integer orderID){
        JsonResponse resp = new JsonResponse();

        Integer res = orderManagementService.deleteMadeToOrder(orderID);

        if (res == 0) {
            resp.setStatus(ReponseStateEnum.FAIL);
            resp.setMessage("删除定制订单失败！");
        }else {
            resp.setStatus(ReponseStateEnum.SUCCESS);
            resp.setMessage("删除定制订单成功！");
        }
        return resp;
    }

    /**
     * 根据状态分页查询订单列表
     * @param orderVO
     * @param pageNo
     * @param pageSize
     * @return
     */
    @ResponseBody
    @GetMapping(value = {"/getMadeToOrderList"})
    @ApiOperation(value = "查询定制订单列表",notes="根据查询条件返回定制订单列表")
    public JsonResponse getMadeToOrderList(UserMadeToOrderVO orderVO,
            @RequestParam(value="pageNo",defaultValue="1") Integer pageNo,
            @RequestParam(value = "pageSize",defaultValue = "20") Integer pageSize){
        JsonResponse resp = new JsonResponse();
        if (pageNo == null || pageNo <= 0) {
            pageNo = 1;
        }

        PageInfo<UserMadeToOrder> pageData =  orderManagementService.getMadeToOrderList(orderVO, pageNo, pageSize);

        //OrderManagePurchaseOrderListDTO orderListDTO = new OrderManagePurchaseOrderListDTO();
        resp.setMessage("查询成功");
        resp.setStatus(ReponseStateEnum.SUCCESS);
        resp.setData(pageData);
        return resp;
    }

    /**
     * 根据状态分页查询订单列表
     *
     * 订单状态    1：已付款 2：已发货 3：已完成  4：售后订单,
     * @param orderVO
     * @param pageNo
     * @param pageSize
     * @return
     */
    @ResponseBody
    @GetMapping(value = {"/getOrderByState"})
    @ApiOperation(value = "查询订单列表",notes="根据查询条件返回订单列表")
    public JsonResponse getOrderByState(
            OrderManagementQueryByPageRequestVO orderVO,
            @RequestParam(value="pageNo",defaultValue="1") Integer pageNo,
            @RequestParam(value = "pageSize",defaultValue = "20") Integer pageSize){
        JsonResponse resp = new JsonResponse();
        if (pageNo == null || pageNo <= 0) {
            pageNo = 1;
        }

        PageInfo<OrderManagePurchaseOrderDTO> pageData =  orderManagementService.queryOrderByPage(orderVO, pageNo, pageSize);

        //OrderManagePurchaseOrderListDTO orderListDTO = new OrderManagePurchaseOrderListDTO();
        resp.setMessage("查询成功");
        resp.setStatus(ReponseStateEnum.SUCCESS);
        resp.setData(pageData);
        return resp;
    }


    /**
     * 根据订单ID查询订单详细信息
     * @param orderID
     * @return
     */
    @ResponseBody
    @GetMapping(value = {"/getOrderByID"})
    @ApiOperation(value = "根据订单ID查询订单详细信息",notes="参数为Integer类型的 orderID")
    public JsonResponse getOrderByID(@RequestParam("orderID") Integer orderID){
        JsonResponse resp = new JsonResponse();

        OrderDetailQueryDTO detailQueryDTO =  orderManagementService.queryOrderDetailByID(orderID);

        resp.setMessage("查询成功");
        resp.setStatus(ReponseStateEnum.SUCCESS);
        resp.setData(detailQueryDTO);
        return resp;
    }

    /**
     * 根据订单编号或者用户手机查询订单信息
     * 订单状态  0：待付款  1：待发货  2：已发货（待收货）  3：已收货（已完成） 4：申请售后（售后订单）
     * @param flag
     * @param state
     * @param phoneNumber
     * @param orderID
     * @return
     */
    /*
    @ResponseBody
    @GetMapping(value = {"/getOrderByOrderIDOrPhone"})
    public JsonResponse getOrderByOrderIDOrPhone(@RequestParam("flag") Integer flag,@RequestParam("state") Short state,
                                                 @RequestParam(value = "phoneNumber", required = false) String phoneNumber,
                                                 @RequestParam(value = "orderID",defaultValue="0") Integer orderID,
                                                 @RequestParam(value="pageNo",defaultValue="1") Integer pageNo,
                                                 @RequestParam(value = "pageSize",defaultValue = "20") Integer pageSize){
        JsonResponse resp = new JsonResponse();

        if (pageNo == null || pageNo <= 0) {
            pageNo = 1;
        }

        if ((orderID == null || orderID == 0) && (phoneNumber == null || phoneNumber.trim() == null))
        {
            resp.setMessage("电话号码和订单ID不能同时为空！");
            resp.setStatus(ReponseStateEnum.FAIL);
        }
        else {
            PageInfo<OrderManagePurchaseOrderDTO> pageData = orderManagementService.getOrderByOrderIDOrPhone(flag, state, phoneNumber, orderID, pageNo, pageSize);

            resp.setMessage("查询成功");
            resp.setStatus(ReponseStateEnum.SUCCESS);
            resp.setData(pageData);
        }
        return resp;
    }
*/



    /**
     *  根据订单编号删除已经完成订单
     * @param orderID
     * @return
     */
    @ResponseBody
    @GetMapping(value = {"/deleteOrderByID"})
    @ApiOperation(value = "根据订单编号删除已经完成订单",notes="参数为Integer类型的 orderID")
    public JsonResponse deleteOrderByID(@RequestParam("orderID") Integer orderID){
        JsonResponse resp = new JsonResponse();

        Integer res  =  orderManagementService.deleteOrderByID(orderID);

        if (res == 1) {
            resp.setMessage("删除成功");
            resp.setStatus(ReponseStateEnum.SUCCESS);
        }else {
            resp.setMessage("删除失败");
            resp.setStatus(ReponseStateEnum.FAIL);
        }
        return resp;
    }



    /**
     *  设置售后订单为已经完成订单
     * @param orderID
     * @return
     */
    @ResponseBody
    @GetMapping(value = {"/setOrderFinishedByID"})
    @ApiOperation(value = "设置售后订单为已经完成订单",notes="参数为Integer类型的 orderID")
    public JsonResponse setOrderFinishedByID(@RequestParam("orderID") Integer orderID){
        JsonResponse resp = new JsonResponse();
        Short state = 3;
        Integer res  =  orderManagementService.updateOrderStateByID(orderID, state);

        if (res == 1) {
            resp.setMessage("修改状态成功");
            resp.setStatus(ReponseStateEnum.SUCCESS);
        }else {
            resp.setMessage("修改状态失败");
            resp.setStatus(ReponseStateEnum.FAIL);
        }
        return resp;
    }


    /**
     * 根据订单ID查询发货详细信息
     * @param orderID
     * @return
     */
    @ResponseBody
    @GetMapping(value = {"/getDeliveryDetailByOrderID"})
    @ApiOperation(value = "根据订单ID查询发货详细信息",notes="参数为Integer类型的 orderID")
    public JsonResponse getDeliveryDetailByOrderID(@RequestParam("orderID") Integer orderID){
        JsonResponse resp = new JsonResponse();
        OrderPurchaseOrder order = orderManagementService.getOrderByOrderID(orderID);
        if (order == null)
        {
            resp.setMessage("查询失败，订单信息不存在");
            resp.setStatus(ReponseStateEnum.FAIL);
            return resp;
        }

        DeliveryMessageDTO detailQueryDTO = new DeliveryMessageDTO();
        detailQueryDTO.setOrderID(order.getOrderID());
        detailQueryDTO.setOrderPaidTime(order.getOrderPaidTime());
        detailQueryDTO.setProductID(order.getProductID());
        detailQueryDTO.setProductName(order.getProductName());
        detailQueryDTO.setProductTitleImage(order.getProductTitleImage());
        detailQueryDTO.setProductStandardID(order.getProductStandardID());
        detailQueryDTO.setProductStandard(order.getProductStandard());
        detailQueryDTO.setProductColourID(order.getProductColourID());
        detailQueryDTO.setProductColour(order.getProductColour());
        detailQueryDTO.setProductNumber(order.getProductNumber());
        detailQueryDTO.setUserRemark(order.getUserRemark());
        detailQueryDTO.setReceiverName(order.getReceiverName());
        detailQueryDTO.setPhoneNum(order.getPhoneNum());
        detailQueryDTO.setProvince(order.getProvince());
        detailQueryDTO.setCity(order.getCity());
        detailQueryDTO.setCounty(order.getCounty());
        detailQueryDTO.setReceiveAddress(order.getReceiveAddress());

        resp.setMessage("查询成功");
        resp.setStatus(ReponseStateEnum.SUCCESS);
        resp.setData(detailQueryDTO);
        return resp;
    }


    /**
     * 发货
     * @param resultMessageDTO
     * @return
     */
    @ResponseBody
    @PostMapping(value = {"/delivery"})
    @ApiOperation(value = "根据订单ID查询发货详细信息",notes="请求体为resultMessageDTO")
    public JsonResponse delivery(@RequestBody DeliveryResultMessageDTO resultMessageDTO){
        JsonResponse resp = new JsonResponse();
        Integer res = orderManagementService.delivery(resultMessageDTO);

        if (res == 1) {
            resp.setMessage("发货成功");
            resp.setStatus(ReponseStateEnum.SUCCESS);
        }else {
            resp.setMessage("发货失败");
            resp.setStatus(ReponseStateEnum.FAIL);
        }
        return resp;
    }
}
