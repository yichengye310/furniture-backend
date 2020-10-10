package com.example.springboot.controller;

import com.example.springboot.dto.OrderSubmitDTO;
import com.example.springboot.entity.*;
import com.example.springboot.mapper.ProductLimitedTimeMapper;
import com.example.springboot.mapper.ProductMapper;
import com.example.springboot.mapper.UserAlreadyRobbedMapper;
import com.example.springboot.service.UserCouponService;
import com.example.springboot.service.UserOrderService;
import com.example.springboot.service.UserService;
import com.github.wxpay.sdk.WXPayUtil;
import com.yelang.shop.base.annotation.UserLoginToken;
import com.yelang.shop.base.exception.JsonResponse;
import com.yelang.shop.base.exception.ServiceExceptionCode;
import com.yelang.shop.wxpay.constant.ClientCustomSSL;
import com.yelang.shop.wxpay.utils.*;
import com.yelang.shop.wxpay.utils.UUID;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.jdom.JDOMException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/wxPay")
@Api(value = "微信支付")
public class WXPayController {
    //支付内容为正常订单支付
    private static final Integer PAY_TYPE_NORMAL_ORDER = 1;
    //支付内容为购买VIP资格
    private static final Integer PAY_TYPE_PURCHASE_VIP = 2;
    //标记支付内容为正常订单支付
    private static final String FLAG_NORMAL_ORDER = "NORMAL_ORDER";
    //标记支付内容为购买VIP资格
    private static final String FLAG_PURCHASE_VIP = "PURCHASE_VIP";

    @Value("${wx.pay.appId}")
    private String appId;
    @Value("${wx.pay.appSecret}")
    private String appSecret;
    @Value("${wx.pay.appKey}")
    private String appKey;
    @Value("${wx.pay.mchId}")
    private String mchId;
    @Value("${wx.pay.body}")
    private String body;
    @Value("${wx.pay.gateUrl}")
    private String gateUrl;
    @Value("${wx.pay.notifyUrl}")
    private String notifyUrl;
    @Value("${wx.pay.orderQueryUrl}")
    private String orderQueryUrl;
    @Value("${wx.pay.refundUrl}")
    private String refundUrl;
    @Value("${wx.pay.wxCertPath}")
    private String wxCertPath;

    @Autowired
    private UserOrderService orderService;
    @Autowired
    private UserService userService;
    @Autowired
    private UserCouponService userCouponService;
    @Autowired
    private ProductLimitedTimeMapper productLimitedTimeMapper;
    @Autowired
    private UserAlreadyRobbedMapper userAlreadyRobbedMapper;
    @Autowired
    private ProductMapper productMapper;
    private String out_trade_no = "";

    /**
     * ios生成预支付订单，获取prepayId
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @UserLoginToken
    @ResponseBody
    @PostMapping("/pay")
    @ApiOperation(value = "IOS统一下单生成预支付ID")
    public JsonResponse pay(HttpServletRequest request, HttpServletResponse response, @RequestBody OrderSubmitDTO submitDTO){
        JsonResponse res = new JsonResponse();
        System.out.println("OrderSubmitDTO======================>>>:" + submitDTO.toString());
        PrepayIdRequestHandler prepayReqHandler = new PrepayIdRequestHandler(request, response);
        int total_fee = 0;
        Map<String, Object> map = new HashMap<String, Object>();
        StringBuffer flagMessageBuffer = new StringBuffer();
        if (submitDTO.getType() == PAY_TYPE_PURCHASE_VIP){
            System.out.println("OrderSubmitDTO======================>>>:" + submitDTO.toString());
            flagMessageBuffer.append(FLAG_PURCHASE_VIP).append(":");
            flagMessageBuffer.append(submitDTO.getUserID());
            total_fee = submitDTO.getTotalAmount();
        }else if (submitDTO.getType() == PAY_TYPE_NORMAL_ORDER) {
            System.out.println("OrderSubmitDTO======================>>>:" + submitDTO.toString());
            //支付前判断限购数量是否大于已抢数量
            if (submitDTO.getOrderIDList() != null) {
                List<OrderPurchaseOrder> list = orderService.getOrderListByIDList(submitDTO.getOrderIDList());
                for (OrderPurchaseOrder order : list) {
                    Integer productID = order.getProductID();
                    Short orderType = order.getOrderType();//1普通产品 2限时抢购
                    //TODO
                    if (orderType != null && orderType == 2) {
                        //step2:更新限时抢购已抢数量
                        ProductLimitedTime productLimitedTime = productLimitedTimeMapper.selectByPrimaryKey(productID);
                        if (productLimitedTime.getLimitNum() <= productLimitedTime.getAlreadyRobbedNum()) {
                            res.setStatus(ServiceExceptionCode.GOODS_HAVE_BEEN_ROBBED.getStatus());
                            res.setMessage(ServiceExceptionCode.GOODS_HAVE_BEEN_ROBBED.getName());
                            return res;
                        }
                        //step3:获取用户抢购记录
                        UserAlreadyRobbed userAlreadyRobbed = new UserAlreadyRobbed();
                        userAlreadyRobbed.setRelationType((short) 2);
                        userAlreadyRobbed.setRelationID(productID);
                        userAlreadyRobbed.setUserID(order.getUserID());
                        List<UserAlreadyRobbed> userAlreadyRobbeds = userAlreadyRobbedMapper.selectList(userAlreadyRobbed);
                        if (userAlreadyRobbeds != null && userAlreadyRobbeds.size() > 0) {
                            res.setStatus(ServiceExceptionCode.NO_REPEAT_PURCHASE.getStatus());
                            res.setMessage(ServiceExceptionCode.NO_REPEAT_PURCHASE.getName());
                            return res;
                        }
                    }
                }
            }
            // 获取生成预支付订单的请求类
            StringBuffer buffer = new StringBuffer();
            List<Integer> orderIdList = submitDTO.getOrderIDList();
            for (Integer it : orderIdList) {
                buffer.append(it).append(",");
            }
            String idListString = buffer.toString();
            flagMessageBuffer.append(FLAG_NORMAL_ORDER).append(":");
            flagMessageBuffer.append(idListString);
            total_fee = orderService.getTotalFeeByIDList(orderIdList);
        }
        System.out.println("支付金额:" + total_fee);
        prepayReqHandler.setParameter("appid", appId);
        prepayReqHandler.setParameter("body", body);
        prepayReqHandler.setParameter("mch_id", mchId);
        String nonce_str = WXUtil.getNonceStr();
        prepayReqHandler.setParameter("nonce_str", nonce_str);
        prepayReqHandler.setParameter("attach", flagMessageBuffer.toString());
        prepayReqHandler.setParameter("notify_url", notifyUrl);
        out_trade_no = String.valueOf(UUID.next());
        prepayReqHandler.setParameter("out_trade_no", out_trade_no);
        prepayReqHandler.setParameter("spbill_create_ip", submitDTO.getSpbillCreateIp());
        String timestamp = WXUtil.getTimeStamp();
        prepayReqHandler.setParameter("time_start", timestamp);
        prepayReqHandler.setParameter("total_fee", String.valueOf(total_fee));
        prepayReqHandler.setParameter("trade_type", "APP");
        /**
         * 注意签名（sign）的生成方式，具体见官方文档（传参都要参与生成签名，且参数名按照字典序排序，最后接上APP_KEY,转化成大写）
         */
        prepayReqHandler.setParameter("sign", prepayReqHandler.createMD5Sign(appKey));
        prepayReqHandler.setGateUrl(gateUrl);
        String prepayid = null;
        Map<String ,String> m =null;
        try {
            m = prepayReqHandler.sendPrepay();
            prepayid = m.get("prepay_id");
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 若获取prepayid成功，将相关信息返回客户端
        if (prepayid != null && !prepayid.equals("")) {
            String signs = "appid=" + appId + "&noncestr=" + nonce_str + "&package=Sign=WXPay&partnerid="
                    + mchId + "&prepayid=" + prepayid + "&timestamp=" + timestamp + "&key="
                    + appKey;
            map.put("code", 0);
            map.put("info", "success");
            map.put("prepayid", prepayid);
            map.put("sign", MD5Util.MD5Encode(signs, "utf8").toUpperCase());
            map.put("appid", appId);
            map.put("timestamp", timestamp);  //等于请求prepayId时的time_start
            map.put("noncestr", nonce_str);   //与请求prepayId时值一致
            map.put("package", "Sign=WXPay");  //固定常量
            map.put("partnerid", mchId);
        } else {
            map.put("code", 1);
            map.put("info", "获取prepayid失败");
        }
        res.setData(map);
        return res;
    }

    /**
     * h5支付
     * @param request
     * @param response
     * @return
     */
    @UserLoginToken
    @ResponseBody
    @PostMapping("/H5pay")
    @ApiOperation(value = "H5支付统一下单")
    public JsonResponse H5pay(HttpServletRequest request, HttpServletResponse response,@RequestBody OrderSubmitDTO submitDTO){
        JsonResponse res = new JsonResponse();
        PrepayIdRequestHandler prepayReqHandler = new PrepayIdRequestHandler(request, response);
        int total_fee = 0;
        Map<String, Object> map = new HashMap<String, Object>();

        StringBuffer flagMessageBuffer = new StringBuffer();

        if (submitDTO.getType() == PAY_TYPE_PURCHASE_VIP){
            flagMessageBuffer.append(FLAG_PURCHASE_VIP).append(":");
            flagMessageBuffer.append(submitDTO.getUserID());
            total_fee = submitDTO.getTotalAmount();
        }else if (submitDTO.getType() == PAY_TYPE_NORMAL_ORDER) {
            //支付前判断限购数量是否大于已抢数量
            if (submitDTO.getOrderIDList() != null) {
                List<OrderPurchaseOrder> list = orderService.getOrderListByIDList(submitDTO.getOrderIDList());
                for (OrderPurchaseOrder order : list) {
                    Integer productID = order.getProductID();
                    Short orderType = order.getOrderType();//1普通产品 2限时抢购
                    //TODO
                    if (orderType != null && orderType == 2) {
                        //step2:更新限时抢购已抢数量
                        ProductLimitedTime productLimitedTime = productLimitedTimeMapper.selectByPrimaryKey(productID);
                        if (productLimitedTime.getLimitNum() <= productLimitedTime.getAlreadyRobbedNum()) {
                            res.setStatus(ServiceExceptionCode.GOODS_HAVE_BEEN_ROBBED.getStatus());
                            res.setMessage(ServiceExceptionCode.GOODS_HAVE_BEEN_ROBBED.getName());
                            return res;
                        }
                        //step3:获取用户抢购记录
                        UserAlreadyRobbed userAlreadyRobbed = new UserAlreadyRobbed();
                        userAlreadyRobbed.setRelationType((short) 2);
                        userAlreadyRobbed.setRelationID(productID);
                        userAlreadyRobbed.setUserID(order.getUserID());
                        List<UserAlreadyRobbed> userAlreadyRobbeds = userAlreadyRobbedMapper.selectList(userAlreadyRobbed);
                        if (userAlreadyRobbeds != null && userAlreadyRobbeds.size() > 0) {
                            res.setStatus(ServiceExceptionCode.NO_REPEAT_PURCHASE.getStatus());
                            res.setMessage(ServiceExceptionCode.NO_REPEAT_PURCHASE.getName());
                            return res;
                        }
                    }
                }
            }
            // 获取生成预支付订单的请求类
            StringBuffer buffer = new StringBuffer();
            List<Integer> orderIdList = submitDTO.getOrderIDList();
            for (Integer it : orderIdList) {
                buffer.append(it).append(",");
            }
            String idListString = buffer.toString();
            flagMessageBuffer.append(FLAG_PURCHASE_VIP).append(":");
            flagMessageBuffer.append(idListString);
            total_fee = orderService.getTotalFeeByIDList(orderIdList);
        }
        System.out.println("支付金额:" + total_fee);
        prepayReqHandler.setParameter("appid", appId);
        prepayReqHandler.setParameter("body", body);
        prepayReqHandler.setParameter("mch_id", mchId);
        String nonce_str = WXUtil.getNonceStr();
        prepayReqHandler.setParameter("nonce_str", nonce_str);
        prepayReqHandler.setParameter("notify_url", notifyUrl);
        out_trade_no = String.valueOf(UUID.next());
        prepayReqHandler.setParameter("out_trade_no", out_trade_no);
        prepayReqHandler.setParameter("spbill_create_ip",  submitDTO.getSpbillCreateIp());
        String timestamp = WXUtil.getTimeStamp();
        prepayReqHandler.setParameter("time_start", timestamp);
        prepayReqHandler.setParameter("attach", flagMessageBuffer.toString());
        prepayReqHandler.setParameter("total_fee", String.valueOf(total_fee));
        prepayReqHandler.setParameter("trade_type", "MWEB");
        /**
         * 注意签名（sign）的生成方式，具体见官方文档（传参都要参与生成签名，且参数名按照字典序排序，最后接上APP_KEY,转化成大写）
         */
        prepayReqHandler.setParameter("scene_info", "{\'h5_info': {'type':'Android\',\'wap_url\': \'https://www.ammsshop.com\',\'wap_name\': \'爱慕米思支付\'}}" );
        prepayReqHandler.setParameter("sign", prepayReqHandler.createMD5Sign(appKey));
        prepayReqHandler.setGateUrl(gateUrl);
        Map<String ,String> m =null;
        try {
            m = prepayReqHandler.sendPrepay();
        } catch (Exception e) {
            e.printStackTrace();
        }
        m.put("out_trade_no", out_trade_no);
        res.setData(m);
        return res;
    }

    /**
     * 查询订单
     * @param request
     * @param response
     * @param outTradeNo 订单流水号
     * @return
     */
    @UserLoginToken
    @ResponseBody
    @PostMapping("/orderQuery")
    @ApiOperation(value = "查询订单")
    public JsonResponse orderQuery(HttpServletRequest request, HttpServletResponse response,String outTradeNo){
        JsonResponse res = new JsonResponse();
        PrepayIdRequestHandler prepayReqHandler = new PrepayIdRequestHandler(request, response);
        prepayReqHandler.setParameter("appid", appId);
        prepayReqHandler.setParameter("mch_id", mchId);
        String nonce_str = WXUtil.getNonceStr();
        prepayReqHandler.setParameter("nonce_str", nonce_str);
        prepayReqHandler.setParameter("out_trade_no", outTradeNo);
        prepayReqHandler.setParameter("sign", prepayReqHandler.createMD5Sign(appKey));
        prepayReqHandler.setGateUrl(orderQueryUrl);
        Map<String ,String> m =null;
        try {
            m = prepayReqHandler.sendPrepay();
        } catch (Exception e) {
            e.printStackTrace();
        }
        res.setData(m);
        return res;
    }


    /**
     * 接收微信支付成功通知
     * @param request
     * @param response
     * @throws IOException
     */
    @Transactional
    @RequestMapping(value = "/notify")
    @ApiOperation(value = "微信支付回调",notes = "处理订单状态")
    public void notify(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        System.out.println("微信支付回调");
        PrintWriter writer = response.getWriter();
        InputStream inStream = request.getInputStream();
        ByteArrayOutputStream outSteam = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int len = 0;
        while ((len = inStream.read(buffer)) != -1) {
            outSteam.write(buffer, 0, len);
        }
        outSteam.close();
        inStream.close();
        String result = new String(outSteam.toByteArray(), "utf-8");
        System.out.println("微信支付通知结果：" + result);
        Map<String, String> map = null;
        try {
            /**
             * 解析微信通知返回的信息
             */
            map = XMLUtil.doXMLParse(result);
        } catch (JDOMException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("=========:"+result);
        // 若支付成功，则告知微信服务器收到通知
        if (map!=null && map.get("return_code").equals("SUCCESS")) {
            System.out.println("支付成功！");
            System.out.println("订单号：" + Long.valueOf(map.get("out_trade_no")));
            String tradeNumber = map.get("out_trade_no");
            System.out.println("附带信息：============》》" + map.get("attach"));
            List<String> res = Arrays.asList(map.get("attach").split(":"));

            String Flag = res.get(0);
            String Content = res.get(1);

            System.out.println("返回内容--头：============》》" + Flag);
            System.out.println("返回内容--内容：==========》》" + Content);

            if (Flag.equals(FLAG_PURCHASE_VIP)) {
                userService.updateUserToVIPByUserID(Content);
                userCouponService.registerForVIP(Content);
            } else if (Flag.equals(FLAG_NORMAL_ORDER)) {
                //step1:更新订单状态
                List<String> idStringList = Arrays.asList(Content.split(","));
                List<Integer> idList = new ArrayList<>();
                for (String str : idStringList) {
                    idList.add(Integer.parseInt(str));
                }

                orderService.updateOrderStateByIDList(idList);
                orderService.createOrderPaidRecord(idList, tradeNumber);
                List<OrderPurchaseOrder> list = orderService.getOrderListByIDList(idList);
                for (OrderPurchaseOrder order : list) {
                    Integer productID = order.getProductID();
                    Short orderType = order.getOrderType();
                    //订单来源：//1普通产品 2限时抢购
                    if (orderType != null) {
                        switch (orderType) {
                            case 1:
                                //更新销量
                                productMapper.updateBrowseNum(productID);
                                break;
                            case 2:
                                //判断是否已经更新过已抢数量
                                UserAlreadyRobbed userAlreadyRobbed = new UserAlreadyRobbed();
                                userAlreadyRobbed.setRelationType((short) 2);
                                userAlreadyRobbed.setRelationID(productID);
                                userAlreadyRobbed.setUserID(order.getUserID());
                                List<UserAlreadyRobbed> userAlreadyRobbeds = userAlreadyRobbedMapper.selectList(userAlreadyRobbed);
                                if (userAlreadyRobbeds != null && userAlreadyRobbeds.size() > 0) {
                                } else {
                                    //step2:更新限时抢购已抢数量
                                    ProductLimitedTime productLimitedTime = new ProductLimitedTime();
                                    productLimitedTime.setLimitedTimeProductID(productID);
                                    productLimitedTimeMapper.updateAlreadyRobbedNum(productID);

                                    //step3:添加用户抢购记录
                                    userAlreadyRobbed.setCreatedTimestamp(System.currentTimeMillis());
                                    userAlreadyRobbedMapper.insertSelective(userAlreadyRobbed);
                                }
                                break;
                            default:
                                productMapper.updateBrowseNum(productID);
                                break;
                        }
                    }
                }
            }
        }
    }

    /**
     * 微信退款
     * @param request
     * @param response
     * @throws Exception
     */
    @RequestMapping(value = "/refund")
    @ApiOperation(value = "微信申请退款",notes = "微信申请退款")
    public void refund(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrepayIdRequestHandler prepayReqHandler = new PrepayIdRequestHandler(request, response);
        SortedMap<String, String> packageParams = new TreeMap<String, String>();
        packageParams.put("appid", appId);
        packageParams.put("mch_id", mchId);
        String nonce_str = WXUtil.getNonceStr();
        packageParams.put("nonce_str",nonce_str);
        String out_refund_no = WXUtil.getNonceStr();
        packageParams.put("out_refund_no",out_refund_no);
        packageParams.put("out_trade_no","ozb5fjjxbwag1akdy0vm108makqhsdmx");
        packageParams.put("refund_fee","100");
        packageParams.put("total_fee","100");
        //  packageParams.put("op_user_id",wxconfig.mch_id);
        prepayReqHandler.setParameter("appid", appId);
        prepayReqHandler.setParameter("mch_id", mchId);
        prepayReqHandler.setParameter("nonce_str",nonce_str);
        prepayReqHandler.setParameter("out_refund_no",out_refund_no);
        prepayReqHandler.setParameter("out_trade_no","ozb5fjjxbwag1akdy0vm108makqhsdmx");
        prepayReqHandler.setParameter("refund_fee","100");
        prepayReqHandler.setParameter("total_fee","100");
        packageParams.put("sign", prepayReqHandler.createMD5Sign(appKey));

        String reuqestXml = WXPayUtil.mapToXml(packageParams);
        System.out.println("-----------------");
        System.out.println(reuqestXml);
        System.out.println("-----------------");
        //发送请求到后台了
        try {
            String result = ClientCustomSSL.doRefund(refundUrl, reuqestXml).toString();
            System.out.println(result);
            Map<String, String> map = null;
            try {
                /**
                 * 解析微信通知返回的信息
                 */
                map = XMLUtil.doXMLParse(result);
                String returnCode = (String) map.get("return_code");
                if(returnCode.equals("SUCCESS")){
                    //退款成功操作
                    String resultCode = (String)map.get("result_code");
                }
            } catch (JDOMException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    //    @ResponseBody
//    @PostMapping("/payTest")
//    public void pay(){
//        System.out.println("appId" + appId);
//        System.out.println("appSecret" + appSecret);
//        System.out.println("appKey" + appKey);
//        System.out.println("mchId" + mchId);
//        System.out.println("body" + body);
//        System.out.println("gateUrl" + gateUrl);
//        System.out.println("notifyUrl" + notifyUrl);
//        System.out.println("refundUrl" + refundUrl);
//        System.out.println("wxCertPath" + wxCertPath);
//    }
}
