package ali;

import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.digest.DigestUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * 推拉流地址示例：
 * rtmp://www.ttest.liveTest.com/a/a?auth_key=1558065152-0-0-*****
 * 播流地址
 * 原画
 * rtmp://www.btest.liveTest.com/a/a?auth_key=1558065152-0-0-*****
 * http://www.btest.liveTest.com/a/a.flv?auth_key=1558065152-0-0-*****
 * http://www.btest.liveTest.com/a/a.m3u8?auth_key=1558065152-0-0-*****
 *
 * hutool工具包地址，请参见https://hutool.cn/docs/#/
 */
public class AliyunLiveUtil {

    // 鉴权url的有效时间（秒），默认30分钟，1800秒
    private static Integer identUrlValidTime = 1800;
    // 应用名称
    private static String appName = "testApp";
    // 流名称
    private static String streamName = "streamName";
    // 推流域名
    private static String pushDomain = "live.ammsshop.com";
    // 推流鉴权url
    private static String pushIdentKey = "123";
    // 拉流域名
    private static String pullDomain = "livebo.ammsshop.com";
    // 拉流鉴权url
    private static String pullIdentKey = "123";

    /**
     * 根据源id创建该id的推流url
     *
     * @param identUrlValidTime 鉴权url的有效时间（秒），默认30分钟，1800秒
     * @param pushDomain        推流域名
     * @param appName           直播测试appName
     * @param streamName        直播测试streamName
     * @param pushIdentKey      推流鉴权url key
     * @return
     */
    public String createPushUrl(Integer identUrlValidTime, String pushDomain, String appName, String streamName, String pushIdentKey) {

        // 计算过期时间
        String timestamp = String.valueOf((System.currentTimeMillis() / 1000) + identUrlValidTime);

        // 组合推流域名前缀
        // rtmp://{pushDomain}/{appName}/{streamName}
        String rtmpUrl = StrUtil.format("rtmp://{}/{}/{}", pushDomain, appName, streamName);
        System.out.println("推流域名前缀，rtmpUrl=" + rtmpUrl);
        // 组合md5加密串
        // /{appName}/{streamName}-{timestamp}-0-0-{pushIdentKey}
        String md5Url = StrUtil.format("/{}/{}-{}-0-0-{}", appName, streamName, timestamp, pushIdentKey);

        // md5加密
        String md5Str = DigestUtil.md5Hex(md5Url);
        System.out.println("md5加密串，md5Url=" + md5Url + "------md5加密结果，md5Str=" + md5Str);

        // 组合最终鉴权过的推流域名
        // {rtmpUrl}?auth_key={timestamp}-0-0-{md5Str}
        String finallyPushUrl = StrUtil.format("{}?auth_key={}-0-0-{}", rtmpUrl, timestamp, md5Str);
        System.out.println("最终鉴权过的推流域名=" + finallyPushUrl);

        return finallyPushUrl;
    }

    /**
     * 创建拉流域名，key=rtmpUrl、flvUrl、m3u8Url，代表三种拉流类型域名
     *
     * @param pullDomain        拉流域名
     * @param appName           应用名称
     * @param streamName        流名称
     * @param pullIdentKey      拉流鉴权url key
     * @param identUrlValidTime 鉴权url的有效时间（秒），默认30分钟，1800秒
     * @return
     */
    public Map<String, String> createPullUrl(String pullDomain, String appName, String streamName, String pullIdentKey, Integer identUrlValidTime) {

        // 计算过期时间
        String timestamp = String.valueOf((System.currentTimeMillis() / 1000) + identUrlValidTime);

        // 组合通用域名
        // {pullDomain}/{appName}/{streamName}
        String pullUrl = StrUtil.format("{}/{}/{}", pullDomain, appName, streamName);
        System.out.println("组合通用域名，pullUrl=" + pullUrl);

        // 组合md5加密串
        // /{appName}/{streamName}-{timestamp}-0-0-{pullIdentKey}
        String md5Url = StrUtil.format("/{}/{}-{}-0-0-{}", appName, streamName, timestamp, pullIdentKey);
        String md5FlvUrl = StrUtil.format("/{}/{}.flv-{}-0-0-{}", appName, streamName, timestamp, pullIdentKey);
        String md5M3u8Url = StrUtil.format("/{}/{}.m3u8-{}-0-0-{}", appName, streamName, timestamp, pullIdentKey);

        // md5加密
        String md5Str = DigestUtil.md5Hex(md5Url);
        String md5FlvStr = DigestUtil.md5Hex(md5FlvUrl);
        String md5M3u8Str = DigestUtil.md5Hex(md5M3u8Url);
        System.out.println("md5加密串，md5Url    =" + md5Url + "       ------     md5加密结果，md5Str=" + md5Str);
        System.out.println("md5加密串，md5FlvUrl =" + md5FlvUrl + "    ------    md5加密结果，md5FlvStr=" + md5FlvStr);
        System.out.println("md5加密串，md5M3u8Url=" + md5M3u8Url + "   ------    md5加密结果，md5M3u8Str=" + md5M3u8Str);

        // 组合三种拉流域名前缀
        // rtmp://{pullUrl}?auth_key={timestamp}-0-0-{md5Str}
        String rtmpUrl = StrUtil.format("rtmp://{}?auth_key={}-0-0-{}", pullUrl, timestamp, md5Str);
        // http://{pullUrl}.flv?auth_key={timestamp}-0-0-{md5FlvStr}
        String flvUrl = StrUtil.format("http://{}.flv?auth_key={}-0-0-{}", pullUrl, timestamp, md5FlvStr);
        // http://{pullUrl}.m3u8?auth_key={timestamp}-0-0-{md5M3u8Str}
        String m3u8Url = StrUtil.format("http://{}.m3u8?auth_key={}-0-0-{}", pullUrl, timestamp, md5M3u8Str);

        System.out.println("最终鉴权过的拉流rtmp域名=" + rtmpUrl);
        System.out.println("最终鉴权过的拉流flv域名 =" + flvUrl);
        System.out.println("最终鉴权过的拉流m3u8域名=" + m3u8Url);

        HashMap<String, String> urlMap = new HashMap<String, String>();
        urlMap.put("rtmpUrl", rtmpUrl);
        urlMap.put("flvUrl", flvUrl);
        urlMap.put("m3u8Url", m3u8Url);

        return urlMap;
    }

    public static void main(String[] args) {
        AliyunLiveUtil aliyunLiveUtil = new AliyunLiveUtil();
        aliyunLiveUtil.createPushUrl(identUrlValidTime, pushDomain, appName, streamName, pushIdentKey);
        aliyunLiveUtil.createPullUrl(pullDomain, appName, streamName, pullIdentKey, identUrlValidTime);
    }
}            