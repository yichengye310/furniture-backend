package com.example.springboot.controller;

import com.github.wxpay.sdk.WXPay;
import com.github.wxpay.sdk.WXPayUtil;
import com.yelang.shop.base.exception.JsonResponse;
import com.yelang.shop.wxpay.constant.WXUrl;
import com.yelang.shop.wxpay.util.PayUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.*;

import com.yelang.shop.wxpay.constant.WXConfig;

@CrossOrigin
@RestController
@RequestMapping("/JSAPIPay")
@Api(value = "微信支付")
public class JSAPIController {

    //    private static final String ORDER_PAY = "https://api.mch.weixin.qq.com/pay/unifiedorder";// 统一下单
//    private static final String APP_ID = "wx8a6a81fee186200e";  // 应用ID
//    private static final String MCH_ID = "1409327502";// 商户号
//    private static final String API_SECRET = "f05df970e054475180ead0e263041d28";// 密钥
//    private static final String NOTIFY_URL = "http://120.79.99.73:8082/wxPay";// 回调URL
    //应用ID
    @Value("${ali.pay.appId}")
    private String appId;
    //密钥
    @Value("${ali.pay.secret}")
    private String secret;
    //商户号
    @Value("${ali.pay.mchid}")
    private String mchId;

    /**
     * H5统一下单
     * @throws Exception
     */
    @ResponseBody
    @PostMapping("/pay")
    @ApiOperation(value = "统一下单")
    public JsonResponse wxPay() throws Exception{
        JsonResponse response = new JsonResponse();
        System.out.println("微信支付测试！！！");
        try{
            String nonce_str = UUID.randomUUID().toString().replaceAll("-", "");
            WXConfig config = new WXConfig();
            WXPay wxpay = new WXPay(config);
            SortedMap<String,String> querys = new TreeMap<String,String>();

            //querys.put("appid", config.getAppID());// 应用ID
            //querys.put("mch_id", config.getMchID());// 商户号
            //querys.put("sign", PayUtil.getSign(querys, config.getKey()));//签名

            querys.put("appid", appId);// 应用ID
            querys.put("mch_id", mchId);// 商户号
            querys.put("nonce_str",nonce_str);//随机字符串，不长于32位
            querys.put("sign", PayUtil.getSign(querys, secret));//签名
            querys.put("body","商品微信h5支付订单");//商品简单描述
            querys.put("out_trade_no","121652366");//商户订单号
            querys.put("total_fee","0.01");//总金额
            querys.put("spbill_create_ip","120.79.99.73");//终端IP,必须传正确的用户端IP,支持ipv4、ipv6格式
            querys.put("notify_url", WXUrl.notify_url);//回调地址
            //querys.put("trade_type","MWEB");//H5支付的交易类型为MWEB
            querys.put("trade_type","APP");//H5支付的交易类型为MWEB
            //querys.put("scene_info","{\"h5_info\":{\"type\":\"APP\",\"wap_url\":\"www.yelangwhcm.com\",\"wap_name\":\"爱慕米斯H5支付\"}}");//场景信息
            Map<String, String> resp = wxpay.unifiedOrder(querys);

            System.out.println(resp);
            response.setData(resp);
        }catch (Exception e){
            e.printStackTrace();
            response = JsonResponse.buildErrorResponse();
        }
        return response;
    }

    /**
     * 微信支付h5接口回调
     * @param request
     * @throws Exception
     */
    @RequestMapping(value="/wxPayCallBack")
    public void wxCallBack(HttpServletRequest request) throws Exception {
        System.out.println("微信回调：wxCallBack开始");
        //读取参数
        InputStream inStream = request.getInputStream();
        ByteArrayOutputStream outSteam = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int len = 0;
        while ((len = inStream.read(buffer)) != -1) {
            outSteam.write(buffer, 0, len);
        }
        String resultxml = new String(outSteam.toByteArray(), "utf-8");
        System.out.println("返回resultxml=:" + resultxml);
        Map<String, String> notifyMap = WXPayUtil.xmlToMap(resultxml);  // 转换成map
        System.out.println(notifyMap);
        outSteam.close();
        inStream.close();

        WXConfig config = new WXConfig();
        WXPay wxpay = new WXPay(config);
        Map<String,String> returnData = new HashMap<String,String>();
        if (wxpay.isPayResultNotifySignatureValid(notifyMap)) {// 签名正确
            if(notifyMap.get("result_code").equals("SUCCESS")) {
                System.out.println("微信回调成功");
                //更新数据，订单状态为已经支付，库存－1，如果所有颜色的库存综合为0，则下架产品

            }
        }else {
            // 签名错误，如果数据里没有sign字段，也认为是签名错误,支付失败
            returnData.put("return_code", "FAIL");
            returnData.put("return_msg", "return_code不正确");
            System.out.println(returnData);
        }
    }
}
