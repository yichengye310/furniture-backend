package com.example.springboot.service;

import com.example.springboot.dto.DeliveryResultMessageDTO;
import com.example.springboot.dto.OrderDetailQueryDTO;
import com.example.springboot.dto.OrderManagePurchaseOrderDTO;
import com.example.springboot.entity.*;
import com.example.springboot.enumUtil.ReponseStateEnum;
import com.example.springboot.enumUtil.StateConstant;
import com.example.springboot.mapper.OrderDeliveryInfoMapper;
import com.example.springboot.mapper.OrderPurchaseOrderMapper;
import com.example.springboot.mapper.UserMadeToOrderMapper;
import com.example.springboot.requestVO.orderVO.OrderManagementQueryByPageRequestVO;
import com.example.springboot.requestVO.orderVO.UserMadeToOrderVO;
import com.example.springboot.sendMessage.MessageSendHandler;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yelang.shop.base.exception.JsonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderManagementService {

    @Autowired
    private OrderPurchaseOrderMapper orderPurchaseOrderMapper;

    @Autowired
    private OrderDeliveryInfoMapper orderDeliveryInfoMapper;

    @Autowired
    private UserMadeToOrderMapper userMadeToOrderMapper;

    public Integer deleteMadeToOrder(Integer orderID){
        return userMadeToOrderMapper.deleteByPrimaryKey(orderID);
    }


    /**
     * 分页查询定制订单接口
     * @param userMadeToOrderVO
     * @return
     */
    public PageInfo<UserMadeToOrder> getMadeToOrderList(UserMadeToOrderVO userMadeToOrderVO, Integer pageNo, Integer pageSize){

        PageHelper.startPage(pageNo,pageSize,"createdTime DESC");
        UserMadeToOrderExample userMadeToOrderExample = new UserMadeToOrderExample();
        //userMadeToOrderExample.setOrderByClause("`createdTime` DESC");
        //userMadeToOrderExample.setOrderByClause("`orderID` ASC");

        UserMadeToOrderExample.Criteria criteria = userMadeToOrderExample.createCriteria();
        if (userMadeToOrderVO.getPhoneNumber() != null){
            criteria.andPhoneNumberEqualTo(userMadeToOrderVO.getPhoneNumber());
        }
        List<UserMadeToOrder> orderList = userMadeToOrderMapper.selectByExample(userMadeToOrderExample);
        PageInfo<UserMadeToOrder> pageInfo = new PageInfo<>(orderList);

        return pageInfo;
    }


    /**
     * 发货信息入库
     * @param deliveryResultMessageDTO
     * @return
     */
    public Integer delivery(DeliveryResultMessageDTO deliveryResultMessageDTO) {

        OrderPurchaseOrder res = orderPurchaseOrderMapper.selectByPrimaryKey(deliveryResultMessageDTO.getOrderID());
        if (res == null || res.getOrderState() != StateConstant.ORDER_PAID_UNDELIVERY)
        {
            return 0;
        }else {
            res.setOrderState(StateConstant.ORDER_PAID_UNCONFIRMED);
            orderPurchaseOrderMapper.updateByPrimaryKey(res);
            OrderDeliveryInfo deliveryInfo = new OrderDeliveryInfo();
            deliveryInfo.setOrderID(deliveryResultMessageDTO.getOrderID());

            deliveryInfo.setState(StateConstant.ORDER_DELIVERY_NORMAL);
            deliveryInfo.setDeliverName(deliveryResultMessageDTO.getDeliverName());
            deliveryInfo.setDeliverPhone(deliveryResultMessageDTO.getDeliverPhoneNum());
            deliveryInfo.setDeliverAddress(deliveryResultMessageDTO.getDeliverAdd());
            deliveryInfo.setExpressName(deliveryResultMessageDTO.getExpressCompany());
            deliveryInfo.setExpressNumber(deliveryResultMessageDTO.getExpressNum());

            sendMessage(res.getPhoneNum(), res.getProductName());
            deliveryInfo.setDeliveryTime(System.currentTimeMillis());
            orderDeliveryInfoMapper.insert(deliveryInfo);
            return 1;
        }
    }


    private void sendMessage(String phoneNumber, String verifyCode){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("【爱慕米思】尊敬的顾客您好，您订购的").append(verifyCode).append("已发货~预计7到10天内到达，签收前请检查商品是否完好，如有疑问请及时联系我们。客服电话：0512-6957-1961");

        MessageSendHandler messageSendHandler = new MessageSendHandler();
        messageSendHandler.sendMessage(phoneNumber, stringBuffer.toString());
    }



    /**
     * 删除订单详细信息
     * @param orderID
     * @return
     */
    public OrderPurchaseOrder getOrderByOrderID(Integer orderID) {
        OrderPurchaseOrder res = orderPurchaseOrderMapper.selectByPrimaryKey(orderID);
        return res;
    }

    /**
     * 删除订单详细信息
     * @param orderID
     * @return
     */
    public Integer deleteOrderByID(Integer orderID) {
        Integer res = orderPurchaseOrderMapper.deleteByPrimaryKey(orderID);
        return res;
    }

    /**
     * 更新订单状态
     * @param orderID
     * @return
     */
    public Integer updateOrderStateByID(Integer orderID, Short state) {
        OrderPurchaseOrder order = orderPurchaseOrderMapper.selectByPrimaryKey(orderID);
        order.setOrderState(state);
        Integer res = orderPurchaseOrderMapper.updateByPrimaryKey(order);
        return res;
    }

    /**
     * 查询订单列表分页
     * @param flag
     * @param state
     * @param phoneNumber
     * @param orderID
     * @return
     */
    public PageInfo<OrderManagePurchaseOrderDTO> getOrderByOrderIDOrPhone(Integer flag, Short state, String phoneNumber,
                                                                          Integer orderID, Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize,"orderID DESC");
        OrderPurchaseOrderExample orderPurchaseOrderExample = new OrderPurchaseOrderExample();
        if (flag == 1) {
            if ((orderID != null) && (orderID != 0))
            {
                if ((phoneNumber != null) && (phoneNumber.trim() != null)) {
                    orderPurchaseOrderExample.createCriteria().andOrderStateEqualTo(state).andOrderIDEqualTo(orderID).andPhoneNumEqualTo(phoneNumber);
                }
                else
                {
                    orderPurchaseOrderExample.createCriteria().andOrderStateEqualTo(state).andOrderIDEqualTo(orderID);
                }
            }
            else
            {
                if ((phoneNumber != null) && (phoneNumber.trim() != null)) {
                    orderPurchaseOrderExample.createCriteria().andOrderStateEqualTo(state).andPhoneNumEqualTo(phoneNumber);
                }
                else
                {
                    orderPurchaseOrderExample.createCriteria().andOrderStateEqualTo(state);
                }
            }
        }
        else {
            if ((orderID != null) && (orderID != 0))
            {
                if ((phoneNumber != null) && (phoneNumber.trim() != null)) {
                    orderPurchaseOrderExample.createCriteria().andOrderIDEqualTo(orderID).andPhoneNumEqualTo(phoneNumber);
                }
                else
                {
                    orderPurchaseOrderExample.createCriteria().andOrderIDEqualTo(orderID);
                }
            }
            else
            {
                if ((phoneNumber != null) && (phoneNumber.trim() != null)) {
                    orderPurchaseOrderExample.createCriteria().andPhoneNumEqualTo(phoneNumber);
                }
            }
        }


        List<OrderPurchaseOrder> orderList = orderPurchaseOrderMapper.selectByExample(orderPurchaseOrderExample);
        List<OrderManagePurchaseOrderDTO> pageData = new ArrayList<>();
        for (OrderPurchaseOrder order : orderList)
        {
            OrderManagePurchaseOrderDTO dto = new OrderManagePurchaseOrderDTO();
            dto.setOrderID(order.getOrderID());
            dto.setPhoneNum(order.getPhoneNum());
            dto.setOrderPaidTime(order.getOrderPaidTime());
            dto.setProductTitleImage(order.getProductTitleImage());
            dto.setOrderState(order.getOrderState());
            dto.setProductName(order.getProductName());
            dto.setFinalAmount(order.getFinalAmount());
            dto.setProductUnitPrice(order.getProductUnitPrice());
            dto.setProductNumber(order.getProductNumber());
            dto.setProductID(order.getProductID());

            pageData.add(dto);
        }

        PageInfo<OrderManagePurchaseOrderDTO> pageInfo = new PageInfo<>(pageData);
//        OrderManagePurchaseOrderListDTO listDTO = new OrderManagePurchaseOrderListDTO();
//        listDTO.setNumber(pageData.size());
//        listDTO.setOrderList(pageData);
        return pageInfo;
    }


    /**
     * 查询订单详细信息
     * @param orderID
     * @return
     */
    public OrderDetailQueryDTO queryOrderDetailByID(Integer orderID) {
        OrderPurchaseOrder order = orderPurchaseOrderMapper.selectByPrimaryKey(orderID);
        OrderDetailQueryDTO dto = new OrderDetailQueryDTO();
        if (order != null)
        {
            dto.setOrderID(order.getOrderID());
            dto.setOrderState(order.getOrderState());
            dto.setOrderPaidTime(order.getOrderPaidTime());
            dto.setUserName(order.getUserName());
            //TODO
            dto.setUserPhone(order.getPhoneNum());

            dto.setProductID(order.getProductID());
            dto.setProductName(order.getProductName());
            dto.setProductTitleImage(order.getProductTitleImage());
            dto.setProductStandard(order.getProductStandard());
            dto.setProductStandardID(order.getProductStandardID());
            dto.setProductColour(order.getProductColour());
            dto.setProductColourID(order.getProductColourID());
            dto.setFinalAmount(order.getFinalAmount());
            dto.setProductNumber(order.getProductNumber());
            dto.setUserRemark(order.getUserRemark());


            dto.setReceiverName(order.getReceiverName());
            dto.setProvince(order.getProvince());
            dto.setCity(order.getCity());
            dto.setCounty(order.getCounty());
            dto.setReceiveAddress(order.getReceiveAddress());
            dto.setPhoneNum(order.getPhoneNum());
            OrderDeliveryInfo res = orderDeliveryInfoMapper.selectByPrimaryKey(orderID);

            if (res != null) {
                dto.setExpressTime(res.getDeliveryTime());
                dto.setExpressName(res.getExpressName());
                dto.setExpressNumber(res.getExpressNumber());
            }
        }

        return dto;
    }


    /**
     * 查询订单列表分页
     * @param orderVO
     * @param pageNo
     * @param pageSize
     * @return
     */
    public PageInfo<OrderManagePurchaseOrderDTO> queryOrderByPage(OrderManagementQueryByPageRequestVO orderVO, Integer pageNo, Integer pageSize) {

        OrderPurchaseOrderExample orderPurchaseOrderExample = new OrderPurchaseOrderExample();
        OrderPurchaseOrderExample.Criteria criteria = orderPurchaseOrderExample.createCriteria();
        if (orderVO.getState() != null){
            criteria.andOrderStateEqualTo(orderVO.getState());
        }

        if (orderVO.getPhoneNumber() != null){
            criteria.andPhoneNumEqualTo(orderVO.getPhoneNumber());
        }

        if (orderVO.getOrderID() != null){
            criteria.andOrderIDEqualTo(orderVO.getOrderID());
        }

        if (orderVO.getOrderFrom() != null){
            criteria.andOrderFromEqualTo(orderVO.getOrderFrom());
        }

        PageHelper.startPage(pageNo,pageSize,"orderID DESC");
        List<OrderPurchaseOrder> orderList = orderPurchaseOrderMapper.selectByExample(orderPurchaseOrderExample);

        PageInfo<OrderPurchaseOrder> pageInfo = new PageInfo<>(orderList);
        //List<OrderPurchaseOrder> list = pageInfo.getList();

        List<OrderManagePurchaseOrderDTO> pageData = new ArrayList<>();
        for (OrderPurchaseOrder order : orderList)
        {
            OrderManagePurchaseOrderDTO dto = new OrderManagePurchaseOrderDTO();
            dto.setOrderID(order.getOrderID());
            dto.setPhoneNum(order.getPhoneNum());
            dto.setOrderPaidTime(order.getOrderCreatedTime());
            dto.setProductTitleImage(order.getProductTitleImage());
            dto.setOrderState(order.getOrderState());
            dto.setProductName(order.getProductName());
            dto.setFinalAmount(order.getTotalAmount());
            dto.setProductUnitPrice(order.getProductUnitPrice());
            dto.setProductNumber(order.getProductNumber());
            dto.setProductID(order.getProductID());
            dto.setOrderFrom(order.getOrderFrom());

            pageData.add(dto);
        }

        PageInfo<OrderManagePurchaseOrderDTO> pages = new PageInfo<>();

        pages.setTotal(pageInfo.getTotal());
        pages.setList(pageData);


        pages.setPageNum(pageInfo.getPageNum());
        pages.setPageSize(pageInfo.getPageSize());
        pages.setSize(pageInfo.getSize());
        pages.setStartRow(pageInfo.getStartRow());
        pages.setEndRow(pageInfo.getEndRow());
        pages.setPages(pageInfo.getPages());

        pages.setPrePage(pageInfo.getPrePage());
        pages.setNextPage(pageInfo.getNextPage());
        pages.setIsFirstPage(pageInfo.isIsFirstPage());
        pages.setIsLastPage(pageInfo.isIsLastPage());
        pages.setHasPreviousPage(pageInfo.isHasPreviousPage());
        pages.setHasNextPage(pageInfo.isHasNextPage());
        pages.setNavigatePages(pageInfo.getNavigatePages());
        pages.setNavigatepageNums(pageInfo.getNavigatepageNums());
        pages.setNavigateFirstPage(pageInfo.getNavigateFirstPage());
        pages.setNavigateLastPage(pageInfo.getNavigateLastPage());
        return pages;
    }





    /**
//     * 查询订单列表分页
//     * @param orderVO
//     * @param pageNo
//     * @param pageSize
//     * @return
//     */
     /*
    public PageInfo<OrderManagePurchaseOrderDTO> queryOrderByPage(OrderManagementQueryByPageRequestVO orderVO, Integer pageNo, Integer pageSize) {

        OrderPurchaseOrderExample orderPurchaseOrderExample = new OrderPurchaseOrderExample();
        OrderPurchaseOrderExample.Criteria criteria = orderPurchaseOrderExample.createCriteria();
        if (orderVO.getState() != null){
            criteria.andOrderStateEqualTo(orderVO.getState());
        }

        if (orderVO.getPhoneNumber() != null){
            criteria.andPhoneNumEqualTo(orderVO.getPhoneNumber());
        }

        if (orderVO.getOrderID() != null){
            criteria.andOrderIDEqualTo(orderVO.getOrderID());
        }

        PageHelper.startPage(pageNo,pageSize,"orderID DESC");
        List<OrderPurchaseOrder> orderList = orderPurchaseOrderMapper.selectByExample(orderPurchaseOrderExample);
        List<OrderManagePurchaseOrderDTO> pageData = new ArrayList<>();
        for (OrderPurchaseOrder order : orderList)
        {
            OrderManagePurchaseOrderDTO dto = new OrderManagePurchaseOrderDTO();
            dto.setOrderID(order.getOrderID());
            dto.setPhoneNum(order.getPhoneNum());
            dto.setOrderPaidTime(order.getOrderPaidTime());
            dto.setProductTitleImage(order.getProductTitleImage());
            dto.setOrderState(order.getOrderState());
            dto.setProductName(order.getProductName());
            dto.setFinalAmount(order.getFinalAmount());
            dto.setProductUnitPrice(order.getProductUnitPrice());
            dto.setProductNumber(order.getProductNumber());
            dto.setProductID(order.getProductID());

            pageData.add(dto);
        }

        PageInfo<OrderManagePurchaseOrderDTO> pageInfo = new PageInfo<>(pageData);
        return pageInfo;
    }
*/



    public OrderDeliveryInfo getOrderDeliveryMessageByID(Integer orderID) {
        return orderDeliveryInfoMapper.selectByPrimaryKey(orderID);
    }
}
