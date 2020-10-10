package com.example.springboot.live;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class AliYunConfig {
    /**
     * 推流域名
     */
    @Value("live.ammsshop.com")
    private String aliyunLivePushDomain;
    /**
     * 拉流域名
     */
    @Value("livebo.ammsshop.com")
    private String aliyunLivePullDomain;
    /**
     * 直播测试appName
     */
    @Value("aimumisi")
    private String aliyunLiveAppName;
    /**
     * 直播测试streamName{直播类型}_{类型id}
     */
    @Value("aimumisi")
    private String aliyunLiveStreamName;
    /**
     * 推流鉴权url key
     */
    @Value("aimumisi")
    private String aliyunLivePushIdentKey;
    /**
     * 拉流鉴权url key
     */
    @Value("aimumisi")
    private String aliyunLivePullIdentKey;

    /**
     * 鉴权url的有效时间（秒），默认30分钟，1800秒 key
     */
    @Value("1800")
    private Integer aliyunLiveIdentUrlValidTime;
}