package com.example.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class YmlTest {
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
    @Value("${wx.pay.refundUrl}")
    private String refundUrl;
    @Value("${wx.pay.wxCertPath}")
    private String wxCertPath;

    @Value("${ali.pay.gatewayUrl}")
    private String gatewayUrl;
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

    @Value("${wyyx.live.appKey}")
    private String liveAppKey;
    @Value("${wyyx.live.appSecret}")
    private String liveAppSecret;
    @Value("${wyyx.live.nonce}")
    private String nonce;

    @Test
    public void contextLoads(){
        System.out.println("appId" + appId);
        System.out.println("appSecret" + appSecret);
        System.out.println("appKey" + appKey);
        System.out.println("mchId" + mchId);
        System.out.println("body" + body);
        System.out.println("gateUrl" + gateUrl);
        System.out.println("notifyUrl" + notifyUrl);
        System.out.println("refundUrl" + refundUrl);
        System.out.println("wxCertPath" + wxCertPath);

        System.out.println("gatewayUrl" + gatewayUrl);
        System.out.println("aliAppId" + aliAppId);
        System.out.println("appPrivateKey" + appPrivateKey);
        System.out.println("aliPayPublicKey" + aliPayPublicKey);
        System.out.println("returnUrl" + returnUrl);
        System.out.println("aliPayNotifyUrl" + aliPayNotifyUrl);
        System.out.println("format" + format);
        System.out.println("charset" + charset);
        System.out.println("signType" + signType);

        System.out.println("liveAppKey" + liveAppKey);
        System.out.println("liveAppSecret" + liveAppSecret);
        System.out.println("nonce" + nonce);
    }

}
