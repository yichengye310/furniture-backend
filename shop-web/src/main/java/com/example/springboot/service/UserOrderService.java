package com.example.springboot.service;

import com.example.springboot.dto.OrderDetailForUserDTO;
import com.example.springboot.dto.OrderProdectPurchaseDetail;
import com.example.springboot.dto.ProductLimitedTimeDTO;
import com.example.springboot.entity.*;
import com.example.springboot.enumUtil.StateConstant;
import com.example.springboot.mapper.*;
import com.example.springboot.requestVO.orderVO.UserMadeToOrderVO;
import com.yelang.shop.base.util.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

import static com.example.springboot.enumUtil.StateConstant.ORDER_TYPE_MORMAL;
import static com.example.springboot.enumUtil.StateConstant.PAYMENT_STATEMENT_SUCCESS;

/**
 * @description:
 * @author: SunZH
 * @time: 2020/1/13 0013 下午 2:48
 */
@Service
public class UserOrderService {

    @Resource
    private OrderPaidRecordMapper orderPaidRecordMapper;

    @Autowired
    private ProductLimitedTimeMapper limitedTimeMapper;


    @Autowired
    private ProductLimitedTimeDetailMapper limitedTimeDetailMapper;


    @Autowired
    private ProductLimitedTimeStandardsMapper limitedTimeStandardsMapper;


    @Autowired
    private ProductLimitedTimeStandardsColourMapper limitedTimeStandardsColourMapper;

    @Autowired
    private ProductMapper productMapper;


    @Autowired
    private OrderPurchaseOrderMapper orderPurchaseOrderMapper;

    @Autowired
    private ProductService productService;

    @Autowired
    private OrderManagementService orderManagementService;

    @Autowired
    private UserService userService;

    @Autowired
    private UserAddressService userAddressService;

    @Autowired
    private ProductStandardsColourMapper productStandardsColourMapper;

    @Autowired
    private ProductStandardsMapper productStandardsMapper;

    @Autowired
    private UserMadeToOrderMapper userMadeToOrderMapper;

    @Autowired
    private UserCouponService userCouponService;

    //默认购买类型为普通商品购买
    private Short DEFAULT_ORDER_TYPE = 0;

    //默认流量来源为厂家推广用户
    private Short DEFAULT_ORDER_FROM = 0;

    //默认优惠方式为0:无优惠  1：优惠券
    private Short DEFAULT_FAVOUR_MODE = 0;

    //默认邮费为0元，包邮
    private Integer DEFAULT_TRANSPORTATION_EXPENSE = 0;

    public List<OrderDetailForUserDTO> getOrderDetailByIDList(List<Integer> orderIDList){

        List<OrderDetailForUserDTO> DTOs = new ArrayList<>();
        for (Integer orderID : orderIDList) {
            OrderPurchaseOrder order = orderPurchaseOrderMapper.selectByPrimaryKey(orderID);
            if (order != null) {
                OrderDetailForUserDTO detailForUserDTO = new OrderDetailForUserDTO();
//                detailForUserDTO.setPurchaseOrder(order);
                detailForUserDTO.setOrderID(order.getOrderID());
                detailForUserDTO.setOrderState(order.getOrderState());
                detailForUserDTO.setOrderPaidTime(order.getOrderPaidTime());

                detailForUserDTO.setProductID(order.getProductID());
                detailForUserDTO.setProductName(order.getProductName());
                detailForUserDTO.setProductTitleImage(order.getProductTitleImage());
                detailForUserDTO.setProductStandard(order.getProductStandard());

                detailForUserDTO.setProductColour(order.getProductColour());
                detailForUserDTO.setTotalAmount(order.getTotalAmount()+order.getFavourAmount());
                detailForUserDTO.setFinalAmount(order.getFinalAmount());
                detailForUserDTO.setProductNumber(order.getProductNumber());
                detailForUserDTO.setUserRemark(order.getUserRemark());


                detailForUserDTO.setReceiverName(order.getReceiverName());
                detailForUserDTO.setReceiverProvince(order.getProvince());
                detailForUserDTO.setReceiverCity(order.getCity());
                detailForUserDTO.setReceiverCounty(order.getCounty());
                detailForUserDTO.setReceiverAddress(order.getReceiveAddress());
                detailForUserDTO.setReceiverPhoneNum(order.getPhoneNum());


                detailForUserDTO.setOrderType(order.getOrderType());
                detailForUserDTO.setOrderFrom(order.getOrderFrom());
                detailForUserDTO.setFavourMode(order.getFavourMode());
                detailForUserDTO.setFavourAmount(order.getFavourAmount());
                detailForUserDTO.setFavourRelatedCouponID(order.getFavourRelatedCouponID());
                detailForUserDTO.setOrderCreatedTime(order.getOrderCreatedTime());

                OrderDeliveryInfo res = orderManagementService.getOrderDeliveryMessageByID(orderID);

                if (res != null) {
                    detailForUserDTO.setExpressTime(res.getDeliveryTime());
                    detailForUserDTO.setExpressName(res.getExpressName());
                    detailForUserDTO.setExpressNumber(res.getExpressNumber());
                    detailForUserDTO.setDeliverName(res.getDeliverName());
                    detailForUserDTO.setDeliverPhoneNum(res.getDeliverPhone());
                    detailForUserDTO.setDeliverAddress(res.getDeliverAddress());
                }

                DTOs.add(detailForUserDTO);
            }
        }

        return DTOs;
    }

    public Integer generateMadeToOrder(UserMadeToOrderVO userMadeToOrderVO){
        UserMadeToOrder madeToOrder = new UserMadeToOrder();
        madeToOrder.setName(userMadeToOrderVO.getName());
        madeToOrder.setPhoneNumber(userMadeToOrderVO.getPhoneNumber());
        madeToOrder.setProvinceID(userMadeToOrderVO.getProvinceID());
        madeToOrder.setProvince(userMadeToOrderVO.getProvince());
        madeToOrder.setCityID(userMadeToOrderVO.getCityID());
        madeToOrder.setCity(userMadeToOrderVO.getCity());
        madeToOrder.setCountryID(userMadeToOrderVO.getCountryID());
        madeToOrder.setCountry(userMadeToOrderVO.getCountry());
        madeToOrder.setAddress(userMadeToOrderVO.getAddress());
        madeToOrder.setUserRemark(userMadeToOrderVO.getUserRemark());

        madeToOrder.setCreatedTime(System.currentTimeMillis());

        return userMadeToOrderMapper.insert(madeToOrder);
    }

    public List<OrderPurchaseOrder> getOrderListByUserID(String userID){
        OrderPurchaseOrderExample orderPurchaseOrderExample = new OrderPurchaseOrderExample();
        orderPurchaseOrderExample.setOrderByClause("`orderID` DESC");
        //orderPurchaseOrderExample.setOrderByClause("`orderID` ASC");
        orderPurchaseOrderExample.createCriteria().andUserIDEqualTo(userID);
        OrderPurchaseOrder orderPurchaseOrder = new OrderPurchaseOrder();
        orderPurchaseOrder.setUserID(userID);

        List<OrderPurchaseOrder> orderList = orderPurchaseOrderMapper.selectByExample(orderPurchaseOrderExample);
        return orderList;
    }

    public OrderPurchaseOrder getOrderByID(Integer orderID){
        return orderPurchaseOrderMapper.selectByPrimaryKey(orderID);
    }

    public Integer updateOrderStateByID(Integer orderID, Short state){
        OrderPurchaseOrder order = orderPurchaseOrderMapper.selectByPrimaryKey(orderID);
        if (order.getOrderState() != state){
            order.setOrderState(state);
            return orderPurchaseOrderMapper.updateByPrimaryKey(order);
        }
        return 0;
    }

    public List<OrderPurchaseOrder> getOrderListByIDList(List<Integer> IDList){
        List<OrderPurchaseOrder> list = new ArrayList<>();
        for (Integer entry : IDList){
            OrderPurchaseOrder order = orderPurchaseOrderMapper.selectByPrimaryKey(entry);
            if (order != null){
                list.add(order);
            }
        }
        return list;
    }

    public void createOrderPaidRecord(List<Integer> IDList, String tradeNumber){
        for (Integer entry : IDList){
            OrderPurchaseOrder order = orderPurchaseOrderMapper.selectByPrimaryKey(entry);
            OrderPaidRecordExample example = new OrderPaidRecordExample();
            example.createCriteria().andOrderIDEqualTo(order.getOrderID());

            List<OrderPaidRecord> orderList = orderPaidRecordMapper.selectByExample(example);

            if (orderList == null || orderList.isEmpty()){
                OrderPaidRecord record = new OrderPaidRecord();
                record.setAmount(order.getTotalAmount());
                record.setPaymentState(PAYMENT_STATEMENT_SUCCESS);
                record.setPaidMode(ORDER_TYPE_MORMAL);
                record.setUserID(order.getUserID());
                record.setUserName(order.getUserName());
                record.setPaidFlowNum(tradeNumber);
                record.setFlowCreatedTime(System.currentTimeMillis());
                record.setOrderID(order.getOrderID());

                orderPaidRecordMapper.insert(record);
            }
        }
    }


    public void updateOrderStateByIDList(List<Integer> IDList){
        for (Integer entry : IDList){
            OrderPurchaseOrder order = orderPurchaseOrderMapper.selectByPrimaryKey(entry);
            if (order.getOrderState() == StateConstant.ORDER_WAITING_TO_PAY){
                order.setOrderState(StateConstant.ORDER_PAID_UNDELIVERY);
                order.setOrderPaidTime(System.currentTimeMillis());
                orderPurchaseOrderMapper.updateByPrimaryKey(order);
            }
        }
    }

    public Integer getTotalFeeByIDList(List<Integer> IDList){
        Integer total = 0;

        for (Integer entry : IDList){
            OrderPurchaseOrder order = orderPurchaseOrderMapper.selectByPrimaryKey(entry);
            Integer amount = order.getTotalAmount();

            total += amount;
        }

        return total;
    }


    public Integer calculateAmount(List<Integer> productList){
        Integer total = 0;

        for (Integer entry : productList){
//            Integer standardID = entry.getStandardID();
//            Integer productNum = entry.getProductNumber();
//
//            //Product product = productService.selectByPrimaryKey(productID);
//            ProductStandards productStandard = productStandardsMapper.selectByPrimaryKey(standardID);
            OrderPurchaseOrder order = orderPurchaseOrderMapper.selectByPrimaryKey(entry);

            Integer amount = order.getTotalAmount();

            total += amount;
        }

        return total;
    }


    /**
     *  提交生成订单
     * @param productList
     * @param userID
     * @param remark
     * @param couponID
     * @param couponAmount
     * @param userAddressID
     * @param favourMode
     * @param orderFrom
     * @return
     */
    public List<OrderPurchaseOrder> createOrderByUserID(List<OrderProdectPurchaseDetail> productList, String userID,
                                                        String remark, Integer couponID, Integer couponAmount,
                                                        Integer userAddressID, Short favourMode, Integer orderType, Short orderFrom){
        IdWorker idWorker = new IdWorker();
        String orderID = idWorker.orderIDGenerate();

        Integer total = 0;
        Boolean couponUsed = false;
        if (favourMode == StateConstant.FAVOUR_MODE_NULL){
            couponUsed = true;
        }

        List<OrderPurchaseOrder> orderList = new ArrayList<>();
        for (OrderProdectPurchaseDetail entry : productList){
            Integer amount = 0;
            Integer productID = entry.getProductID();
            Integer productNum = entry.getProductNumber();
            Integer colourID = entry.getColourID();
            Integer standardID = entry.getStandardID();

            OrderPurchaseOrder orderPurchaseOrder = new OrderPurchaseOrder();
            orderPurchaseOrder.setPurchaseOrderID(orderID);
            orderPurchaseOrder.setOrderState(StateConstant.ORDER_WAITING_TO_PAY);
            orderPurchaseOrder.setOrderPaymentState(StateConstant.PAYMENT_STATEMENT_WAITING);

            UserInfo userInfo = userService.selectUserByPrimaryKey(userID);
            orderPurchaseOrder.setUserID(userID);
            orderPurchaseOrder.setUserName(userInfo.getPhoneNumber());


            //订单类型 ：  1：普通商品   2：限时抢购
            if (orderType == 1){
                Product product = productMapper.selectByPrimaryKey(productID);
                orderPurchaseOrder.setProductID(product.getProductID());
                orderPurchaseOrder.setProductName(product.getProductName());
                //orderPurchaseOrder.setProductTitleImage(product.getTitleImg());

                ProductStandardsColour productStandardsColour = productStandardsColourMapper.selectByPrimaryKey(colourID);
                orderPurchaseOrder.setProductColour(productStandardsColour.getColourName());
                orderPurchaseOrder.setOrderType(ORDER_TYPE_MORMAL);
                orderPurchaseOrder.setProductTitleImage(productStandardsColour.getColourImage());

                ProductStandards standard = productStandardsMapper.selectByPrimaryKey(standardID);
                orderPurchaseOrder.setProductStandard(standard.getStandard());

                //1：普通注册用户   2：会员   3：经销商  4：商家
                if (userInfo.getUserType() == StateConstant.USER_TYPE_AGENT) {
                    orderPurchaseOrder.setProductUnitPrice(standard.getTradePrice());
                    amount = productNum * standard.getTradePrice();
                } else {
                    orderPurchaseOrder.setProductUnitPrice(standard.getBandPrice());
                    amount = productNum * standard.getBandPrice();
                }

            }else {
                ProductLimitedTimeDTO product = limitedTimeMapper.selectByPrimaryKey(productID);
                orderPurchaseOrder.setProductID(product.getLimitedTimeProductID());
                orderPurchaseOrder.setProductName(product.getProductName());
                //orderPurchaseOrder.setProductTitleImage(product.getActivityImg());

                ProductLimitedTimeStandardsColour productStandardsColour = limitedTimeStandardsColourMapper.selectByPrimaryKey(colourID);
                orderPurchaseOrder.setProductColour(productStandardsColour.getColourName());
                orderPurchaseOrder.setProductTitleImage(productStandardsColour.getColourImage());

                ProductLimitedTimeStandards standard = limitedTimeStandardsMapper.selectByPrimaryKey(standardID);
                orderPurchaseOrder.setProductStandard(standard.getStandard());
                orderPurchaseOrder.setOrderType(StateConstant.ORDER_TYPE_TIME_LIMITED);


                if (product.getDiscountWay() == 1){
                    orderPurchaseOrder.setProductUnitPrice(standard.getOriginalPrice().intValue());
                    Long tmpTotal = productNum * standard.getOriginalPrice();
                    if (tmpTotal >= product.getFull()){
                        amount = tmpTotal.intValue() - product.getReduce();
                    }else {
                        amount = tmpTotal.intValue();
                    }
                }else if (product.getDiscountWay() == 2){
                    orderPurchaseOrder.setProductUnitPrice(standard.getDiscountPrice().intValue());
                    amount = productNum * standard.getDiscountPrice().intValue();
                }

            }

            orderPurchaseOrder.setProductColourID(colourID);
            orderPurchaseOrder.setProductStandardID(standardID);

            orderPurchaseOrder.setProductNumber(productNum);



            orderPurchaseOrder.setOrderFrom(orderFrom);
            orderPurchaseOrder.setUserRemark(remark);

            if (!couponUsed){
                amount -= couponAmount;
                orderPurchaseOrder.setFavourMode(StateConstant.FAVOUR_MODE_COUPON);
                orderPurchaseOrder.setFavourRelatedCouponID(couponID);
                orderPurchaseOrder.setFavourAmount(couponAmount);

                userCouponService.useCouponByID(couponID);

                couponUsed = true;
            }else {
                orderPurchaseOrder.setFavourMode(StateConstant.FAVOUR_MODE_NULL);
                orderPurchaseOrder.setFavourRelatedCouponID(null);
                orderPurchaseOrder.setFavourAmount(0);
            }

            orderPurchaseOrder.setTotalAmount(amount);



            orderPurchaseOrder.setTransportationExpenses(DEFAULT_TRANSPORTATION_EXPENSE);

            UserAdress userAdress = userAddressService.selectAddressByPrimaryKey(userAddressID);

            orderPurchaseOrder.setReceiverName(userAdress.getReceiverName());
            orderPurchaseOrder.setProvince(userAdress.getProvince());
            orderPurchaseOrder.setCity(userAdress.getCity());
            orderPurchaseOrder.setCounty(userAdress.getCounty());
            orderPurchaseOrder.setReceiveAddress(userAdress.getAddress());
            orderPurchaseOrder.setPhoneNum(userAdress.getMobilePhone());
            orderPurchaseOrder.setOrderCreatedTime(System.currentTimeMillis());
            orderPurchaseOrder.setLastModified(System.currentTimeMillis());

            orderList.add(orderPurchaseOrder);
            total += amount;
        }

        for (OrderPurchaseOrder order : orderList){
            order.setFinalAmount(total);
            orderPurchaseOrderMapper.insert(order);
            //order.getOrderID();
        }

        return orderList;
    }

    public  UserCoupon getCouponInfo(String userID, Integer totalAmount) {
        List<UserCoupon> userCoupons = userCouponService.queryCouponListByUserID(userID,1);
        UserCoupon coupon = null;
        Integer couponAmount = 0;
        for (UserCoupon userCoupon : userCoupons){
            if (userCoupon.getDiscountType()==1){
                if (totalAmount.compareTo(userCoupon.getDiscountLimit())!=-1){
                    if (couponAmount.compareTo(userCoupon.getCouponAmount())==-1){
                        couponAmount = userCoupon.getCouponAmount();
                        coupon = userCoupon;
                    }
                }
            }else{
                if (couponAmount.compareTo(userCoupon.getCouponAmount())==-1){
                    couponAmount = userCoupon.getCouponAmount();
                    coupon = userCoupon;
                }
            }
        }
        return coupon;
    }
}
