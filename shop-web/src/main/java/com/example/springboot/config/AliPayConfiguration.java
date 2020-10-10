package com.example.springboot.config;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AliPayConfiguration {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /** 支付宝应用网关 */
    @Value("${pay.aliPay.gatewayUrl}")
    private String gatewayUrl;

    /** 商户应用id */
    @Value("${pay.aliPay.appId}")
    private String appId;

    /** 开发者RSA私钥，用于对商户请求报文加签 */
    @Value("${pay.aliPay.appPrivateKey}")
    private String appPrivateKey;

    /** 支付宝RSA公钥，用于验签支付宝应答 */
    @Value("${pay.aliPay.aliPayPublicKey}")
    private String aliPayPublicKey;

    /*请求支付宝接口返回数据格式，只支持 json*/
    @Value("${aliyun.pay.format}")
    private String formatJson;

    /*编码集，支持 GBK/UTF-8*/
    @Value("${aliyun.pay.charset}")
    private String charsetUtf8;

    /* #商户生成签名字符串所使用的签名算法类型，目前支持 RSA2 和 RSA，推荐使用 RSA2*/
    @Value("${aliyun.pay.signType}")
    private String signType;

    /**
     * alipay-sdk-java 阿里支付Client
     * @return DefaultAlipayClient
     */
    @Bean
    public AlipayClient alipayClient(){
        return new DefaultAlipayClient(gatewayUrl,appId,appPrivateKey,formatJson,charsetUtf8,aliPayPublicKey,signType);
    }
}