package com.example.springboot;
import com.yelang.shop.wxpay.util.MD5Utils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LiveTest {
    // 直播测试appName
    private static String appName = "testApp";
    // 直播测试streamName
    private static String streamName = "testStranm";
    // 推流域名
    private static String pushDomain = "live.ammsshop.com";
    // 推流鉴权url
    private static String pushIdentKey = "******";
    // 拉流域名
    private static String pullDomain = "livebo.ammsshop.com";
    // 拉流鉴权url
    private static String pullIdentKey = "******";
    private static String roomName = "爱慕米思直播";
    @Test
    public void contextLoads(){
        // 获取推流地址
        //return getRoomName(roomName) + "vhost=" + Constants.ALI_LIVE_PULL_URL + "&" + generateAuthKey(roomName, endTime);
        System.out.println(getRoomName(roomName) + "vhost=" + pushDomain + "&" + generateAuthKey(roomName, System.currentTimeMillis()));
        System.out.println("获取推流地址");
    }
    // 房间号
    private String getRoomName(String roomName) {
        return roomName + "?";
    }

    // 完整验签串
    private String generateAuthKey(String roomName, Long endTime) {
        return "auth_key=" + endTime + generateUuid() + generateEncryptStr(roomName, endTime);
    }

    // 唯一标识
    private String generateUuid() {
        String uuid = "0";

        String uid = "0";

        return "-" + uuid + "-" + uid + "-";
    }

    // 验签密钥
    private String generateEncryptStr(String roomName, Long endTime) {
        String uri = appName + roomName;
        //return MD5(uri + "-" + endTime + generateUuid() + Constants.ALI_LIVE_PRIVATE_KEY);
        return MD5Utils.getMD5(uri + "-" + endTime + generateUuid() + "YwX79Xe8cQBMBEIHp5HiNrQ6ekcGEi");
    }

}