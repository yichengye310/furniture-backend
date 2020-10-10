package com.yelang.shop.wxpay.constant;

import com.github.wxpay.sdk.WXPayConfig;

import java.io.*;

public class WXConfig implements WXPayConfig {

    private byte[] certData;

    public WXConfig() throws Exception {
        //证书位置
        String certPath = "C:\\Users\\config\\cert\\apiclient_cert.p12";
        //String certPath = "/home/Users/config/.uuj/apiclient_cert.p12";
        File file = new File(certPath);
        InputStream certStream = new FileInputStream(file);
        this.certData = new byte[(int) file.length()];
        certStream.read(this.certData);
        certStream.close();
    }

    public String getAppID() {
        return "wx8a6a81fee186200e";
    }

    public String getMchID() {
        return "1409327502";
    }

    public String getKey() {
        return "f05df970e054475180ead0e263041d28";
    }

    public InputStream getCertStream() {
        ByteArrayInputStream certBis = new ByteArrayInputStream(this.certData);
        return certBis;
    }

    public int getHttpConnectTimeoutMs() {
        return 8000;
    }

    public int getHttpReadTimeoutMs() {
        return 10000;
    }
}