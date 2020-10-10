package ali;

/**
 * 获取推流地址
 */
public class GetPushUrl {
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

    // 获取推流地址
    public String getPushUri(String roomName, Long endTime) {
        //return getRoomName(roomName) + "vhost=" + Constants.ALI_LIVE_PULL_URL + "&" + generateAuthKey(roomName, endTime);
        return getRoomName(roomName) + "vhost=" + pushDomain + "&" + generateAuthKey(roomName, endTime);
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
        return MD5Util.MD5Encode(uri + "-" + endTime + generateUuid() + "YwX79Xe8cQBMBEIHp5HiNrQ6ekcGEi", "utf8");
    }
}
