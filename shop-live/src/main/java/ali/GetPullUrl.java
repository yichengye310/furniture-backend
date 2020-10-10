package ali;

/**
 *
 */
public class GetPullUrl {
//    public String getPullUrl(String roomName, Long endTime) {
//        roomName += ".m3u8";
//
//        return "http://" + Constants.ALI_LIVE_PULL_URL + generateUri(roomName) + generateAuthKey(roomName, endTime);
//    }
//
//    // 获取请求参数
//    private String generateUri(String roomName) {
//        return Constants.ALI_LIVE_APP_NAME + getRoomName(roomName);
//    }
//
//    // 房间号
//    private String getRoomName(String roomName) {
//        return roomName + "?";
//    }
//
//    // 完整验签串
//    private String generateAuthKey(String roomName, Long endTime) {
//        return "auth_key=" + endTime + generateUuid() + generateEncryptStr(roomName, endTime);
//    }
//
//    // 唯一标识
//    private String generateUuid() {
//        String uuid = "0";
//
//        String uid = "0";
//
//        return "-" + uuid + "-" + uid + "-";
//    }
//
//    // 验签密钥
//    private String generateEncryptStr(String roomName, Long endTime) {
//        String uri = Constants.ALI_LIVE_APP_NAME + roomName;
//
//        return md5(uri + "-" + endTime + generateUuid() + Constants.ALI_LIVE_PRIVATE_KEY);
//    }
}
