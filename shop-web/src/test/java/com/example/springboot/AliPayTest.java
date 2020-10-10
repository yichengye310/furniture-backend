package com.example.springboot;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AliPayTest {

//    @Test
//    public void contextLoads(){
//        System.out.println("支付宝支付H5测试！！！");
//        // SDK 公共请求类，包含公共请求参数，以及封装了签名与验签，开发者无需关注签名与验签
//        //调用RSA签名方式
//        AlipayClient client = new DefaultAlipayClient(AlipayConfig.URL, AlipayConfig.APPID, AlipayConfig.RSA_PRIVATE_KEY, AlipayConfig.FORMAT, AlipayConfig.CHARSET, AlipayConfig.ALIPAY_PUBLIC_KEY,AlipayConfig.SIGNTYPE);
//        AlipayTradeWapPayRequest alipay_request=new AlipayTradeWapPayRequest();
//        // 超时时间 可空
//        String timeout_express="2m";
//        // 销售产品码 必填
//        String product_code="QUICK_WAP_WAY";
//
//        // 封装请求支付信息
//        AlipayTradeWapPayModel model=new AlipayTradeWapPayModel();
//        model.setOutTradeNo("");//商户网站唯一订单号
//        model.setSubject("爱慕米斯家居商品订单");//商品的标题/交易标题/订单标题/订单关键字等。
//        model.setTotalAmount("0.01");
//        model.setBody("");//对一笔交易的具体描述信息
//        model.setTimeoutExpress(timeout_express);//该笔订单允许的最晚付款时间，逾期将关闭交易
//        model.setProductCode(product_code);
//        alipay_request.setBizModel(model);
//        // 设置异步通知地址
//        alipay_request.setNotifyUrl(AlipayConfig.notify_url);
//        // 设置同步地址
//        alipay_request.setReturnUrl(AlipayConfig.return_url);
//        // form表单生产
//        String orderStr = "";
//        // 调用SDK生成表单
//        try {
////            AlipayTradeWapPayResponse response = client.sdkExecute(alipay_request);
////            orderStr = response.getBody();
//
//            // 调用SDK生成表单
//            orderStr = client.pageExecute(alipay_request).getBody();
//            System.out.println("支付宝支付" + orderStr);
//        } catch (AlipayApiException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//    }
//
}
