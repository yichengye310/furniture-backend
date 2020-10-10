package com.example.springboot.controller;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradeAppPayModel;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayTradeAppPayRequest;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.alipay.api.request.AlipayTradeWapPayRequest;
import com.alipay.api.response.AlipayTradeAppPayResponse;
import com.example.springboot.dto.OrderSubmitDTO;
import com.example.springboot.entity.OrderPurchaseOrder;
import com.example.springboot.entity.ProductLimitedTime;
import com.example.springboot.entity.UserAlreadyRobbed;
import com.example.springboot.mapper.ProductLimitedTimeMapper;
import com.example.springboot.mapper.ProductMapper;
import com.example.springboot.mapper.UserAlreadyRobbedMapper;
import com.example.springboot.service.UserCouponService;
import com.example.springboot.service.UserOrderService;
import com.example.springboot.service.UserService;
import com.yelang.shop.base.annotation.UserLoginToken;
import com.yelang.shop.base.exception.JsonResponse;
import com.yelang.shop.base.exception.ServiceExceptionCode;
import com.yelang.shop.wxpay.utils.PrepayIdRequestHandler;
import com.yelang.shop.wxpay.utils.UUID;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.*;

@CrossOrigin
@RestController
@RequestMapping("/zfbPay")
@Api(value = "支付宝支付")
public class AliPayController {

    //支付内容为正常订单支付
    private static final Integer PAY_TYPE_NORMAL_ORDER = 1;
    //支付内容为购买VIP资格
    private static final Integer PAY_TYPE_PURCHASE_VIP = 2;
    //标记支付内容为正常订单支付
    private static final String FLAG_NORMAL_ORDER = "NORMAL_ORDER";
    //标记支付内容为购买VIP资格
    private static final String FLAG_PURCHASE_VIP = "PURCHASE_VIP";

    @Value("${ali.pay.gatewayUrl}")
    private String gatewayUrl;
    @Value("${ali.pay.gatewayFormalUrl}")
    private String gatewayFormalUrl;
    @Value("${ali.pay.appId}")
    private String aliAppId;
    @Value("${ali.pay.appPrivateKey}")
    private String appPrivateKey;
    @Value("${ali.pay.aliPayPublicKey}")
    private String aliPayPublicKey;
    @Value("${ali.pay.returnUrl}")
    private String returnUrl;
    @Value("${ali.pay.notifyUrl}")
    private String aliPayNotifyUrl;
    @Value("${ali.pay.format}")
    private String format;
    @Value("${ali.pay.charset}")
    private String charset;
    @Value("${ali.pay.signType}")
    private String signType;


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
     * 手机网页支付环境
     * @throws Exception
     */
    //@UserLoginToken
    @ResponseBody
    @GetMapping("/toPayWap1")
    @ApiOperation(value = "手机网页支付环境")
    public String h5Pay() {
        //获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(gatewayFormalUrl, aliAppId, appPrivateKey, format, charset, aliPayPublicKey, signType);
        //实例化具体API对应的request类，类名称和接口名称对应，当前调用接口名称：alipay.trade.app.pay
        AlipayTradeWapPayRequest request = new AlipayTradeWapPayRequest();
        //SDK已经封装了公共参数，这里只需要传入业务参数。以下方法为sdk的model入参方式（）
        AlipayTradeAppPayModel model = new AlipayTradeAppPayModel();
        model.setBody("111");
        model.setSubject("test");
        model.setOutTradeNo("15663555");
        model.setTimeoutExpress("30m");
        model.setTotalAmount("0.01");
        model.setProductCode("EWJNV_dFDGD");
        request.setBizModel(model);
        // request.setNotifyUrl("商户外网可以访问的异步地址");
        String result = null;
        try{
            //这里和普通的接口调用不同，使用的是sdkExecute
            result = alipayClient.pageExecute(request).getBody();
            System.out.println(result);
        }catch (AlipayApiException e){
            e.printStackTrace();
        }
        return result;
    }

    @ResponseBody
    @GetMapping("/toPayWap")
    @ApiOperation(value = "手机网页支付环境")
    public String toPayWap1(HttpServletRequest httpRequest,
                       HttpServletResponse httpResponse) throws ServletException, IOException {
        AlipayClient alipayClient = new DefaultAlipayClient(gatewayFormalUrl, aliAppId, appPrivateKey, "json", charset, aliPayPublicKey, "RSA2"); //获得初始化的AlipayClient
        AlipayTradeWapPayRequest alipayRequest = new AlipayTradeWapPayRequest();//创建API对应的request
        alipayRequest.setReturnUrl("http://domain.com/CallBack/return_url.jsp");
        alipayRequest.setNotifyUrl("http://domain.com/CallBack/notify_url.jsp");//在公共参数中设置回跳和通知地址
        alipayRequest.setBizContent("{" +
                " \"out_trade_no\":\"20150320010101002\"," +
                " \"total_amount\":\"88.88\"," +
                " \"subject\":\"Iphone6 16G\"," +
                " \"product_code\":\"QUICK_WAP_PAY\"" +
                " }");//填充业务参数
        String form="";
        try {
            form = alipayClient.pageExecute(alipayRequest).getBody(); //调用SDK生成表单
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }
        //httpResponse.setContentType("text/html;charset=" + charset);
        //httpResponse.getWriter().write(form);//直接将完整的表单html输出到页面
        //httpResponse.getWriter().flush();
        //httpResponse.getWriter().close();
        return form;
    }

    /**
     * APP支付
     * @throws Exception
     */
    //@UserLoginToken
    @ResponseBody
    @PostMapping("/toPayApp")
    @ApiOperation(value = "APP支付")
    public JsonResponse toPayAPP( HttpServletResponse response, @RequestBody OrderSubmitDTO submitDTO) {

        JsonResponse res = new JsonResponse();
        System.out.println("OrderSubmitDTO======================>>>:" + submitDTO.toString());
//        PrepayIdRequestHandler prepayReqHandler = new PrepayIdRequestHandler(request, response);
        int total_fee = 0;
        String subject = "";
        Map<String, Object> map = new HashMap<String, Object>();
        StringBuffer flagMessageBuffer = new StringBuffer();
        if (submitDTO.getType() == PAY_TYPE_PURCHASE_VIP){
            System.out.println("OrderSubmitDTO======================>>>:" + submitDTO.toString());
            flagMessageBuffer.append(FLAG_PURCHASE_VIP).append(":");
            flagMessageBuffer.append(submitDTO.getUserID());
            subject = "会员支付";
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
            subject = "订单支付";
        }
        String passback_params = "";
        try {
            passback_params = URLEncoder.encode(flagMessageBuffer.toString(),"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        out_trade_no = String.valueOf(UUID.next());
        //获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(gatewayFormalUrl, aliAppId, appPrivateKey, format, charset, aliPayPublicKey, signType);
        //实例化具体API对应的request类，类名称和接口名称对应，当前调用接口名称：alipay.trade.app.pay
        AlipayTradeAppPayRequest request = new AlipayTradeAppPayRequest();
        //SDK已经封装了公共参数，这里只需要传入业务参数。以下方法为sdk的model入参方式（）
        AlipayTradeAppPayModel model = new AlipayTradeAppPayModel();
        model.setBody("缔邦-支付宝线上支付");
        model.setSubject(subject);
        model.setOutTradeNo(out_trade_no);
        model.setTimeoutExpress("30m");
        BigDecimal totalfee = new BigDecimal(total_fee+"").divide(new BigDecimal("100"),2,BigDecimal.ROUND_HALF_UP);
        model.setTotalAmount("0.01");
        model.setProductCode("QUICK_MSECURITY_PAY");
        model.setPassbackParams(passback_params);
        request.setBizModel(model);
        request.setNotifyUrl(aliPayNotifyUrl);
        String result = null;
        try{
            //这里和普通的接口调用不同，使用的是sdkExecute
            //AlipayTradeAppPayResponse response = alipayClient.sdkExecute(request);
            AlipayTradeAppPayResponse response1 = alipayClient.sdkExecute(request);
            result =response1.getBody();
            res.setData(result);
            System.out.println(result);//就是orderString 可以直接给客户端请求，无需再做处理。
        }catch (AlipayApiException e){
            e.printStackTrace();
        }
        return res;
    }

    /**
     * 接收支付宝异步通知消息
     * @param request
     * @param response
     * @return
     * @throws UnsupportedEncodingException
     */
    @ApiOperation("接收支付宝异步通知消息")
    @RequestMapping(value = "notify", method = RequestMethod.POST)
    public String getAlipayNotifyInfoOfCombinedPayment(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
        // 解决POST请求中文乱码问题（推荐使用此种方式解决中文乱码，因为是支付宝发送异步通知使用的是POST请求）
        request.setCharacterEncoding("UTF-8");

        //获取支付宝POST过来反馈信息
        Map<String,String> params = new HashMap<>();
        Map<String,String[]> requestParams = request.getParameterMap();
        for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
            String name = (String) iter.next();
            String[] values = (String[]) requestParams.get(name);
            String valueStr = "";
            for (int i = 0; i < values.length; i++) {
                valueStr = (i == values.length - 1) ? valueStr + values[i]
                        : valueStr + values[i] + ",";
            }

            // 官方demo中使用如下方式解决中文乱码，在此本人不推荐使用，可能会出现中文乱码解决无效的问题。
            // valueStr = new String(valueStr.getBytes("ISO-8859-1"), "UTF-8");
            params.put(name, valueStr);
        }
        boolean signVerified = false;
        try {
            //调用SDK验证签名
            signVerified = AlipaySignature.rsaCheckV1(params, aliPayPublicKey, charset, signType);
            if(signVerified) {
                // 验证通知后执行自己项目需要的业务操作
                // 一般需要判断支付状态是否为TRADE_SUCCESS
                // 更严谨一些还可以判断 1.appid 2.sellerId 3.out_trade_no 4.total_amount 等是否正确，正确之后再进行相关业务操作。
                // 成功要返回success，不然支付宝会不断发送通知。
                System.out.println("支付成功！");
                System.out.println("订单号：" + Long.valueOf(params.get("out_trade_no")));
                String tradeNumber = params.get("out_trade_no");
                System.out.println("附带信息：============》》" + params.get("passback_params"));
                String passback_params = URLDecoder.decode(params.get("passback_params"),"utf-8");
                List<String> res = Arrays.asList(passback_params.split(":"));

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
                return "success";
            }
            // 验签失败  笔者在这里是输出log，可以根据需要做一些其他操作
            // 失败要返回fail，不然支付宝会不断发送通知。
            return "fail";
        } catch (AlipayApiException e) {
            e.printStackTrace();
            // 验签异常  笔者在这里是输出log，可以根据需要做一些其他操作

            return "fail";
        }
    }

    /**
     * PC 二维码支付
     * @return
     * @throws Exception
     */
   // @UserLoginToken
    @ResponseBody
    @PostMapping("/toPayPC")
    @ApiOperation(value = "PC 二维码支付")
    public String PCPay() {
        //获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(gatewayUrl, aliAppId, appPrivateKey, format, charset, aliPayPublicKey, signType);
        //设置请求参数
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        alipayRequest.setReturnUrl(returnUrl);
        alipayRequest.setNotifyUrl(aliPayNotifyUrl);
        try {
            alipayRequest.setBizContent("{\"out_trade_no\":\""+ 89625633 +"\","
                    + "\"total_amount\":\""+ 0.01 +"\","
                    + "\"subject\":\""+ "test" +"\","
                    + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");

            //请求
            String result;
            result = alipayClient.pageExecute(alipayRequest).getBody();
            System.out.println("*********************\n返回结果为："+result);
            return result;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
    }
}
