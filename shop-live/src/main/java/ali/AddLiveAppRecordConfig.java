package ali;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.live.model.v20161101.AddLiveAppRecordConfigRequest;
import com.aliyuncs.live.model.v20161101.AddLiveAppRecordConfigResponse;
import com.aliyuncs.live.model.v20161101.RealTimeRecordCommandRequest;
import com.aliyuncs.live.model.v20161101.RealTimeRecordCommandResponse;
import com.aliyuncs.profile.DefaultProfile;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.配置直播录制内容保存到OSS中
 * 2.开启（关闭）直播录制
 *  说明：本示例设置的录制规则为默认不开启录制，而是通过手动调用RealTimeRecordCommand接口来控制录制的启动和停止
 */
public class AddLiveAppRecordConfig {

    private static final Gson gson = new Gson();
    // 推流域名。
    private static String streamName = "www.yourLiveEdge.club";
    // 直播流所属应用名称。支持通配符(*)，代表该域名下所有的AppName。
    private static String App = "testApp";
    // 加速域名，指播放域名。
    private static String domainName = "www.yourDomainName.com";
    // OssBucket名称。
    private static String ossBucket = "oss-***-****-****";
    // OssEndpoint域名。
    private static String ossEndpoint = "oss-*****.aliyuncs.com";
    // 按需录制。
    // 0表示关闭。
    // 1表示通过HTTP回调方式。
    // 7表示默认不录制，通过RealTimeRecordCommand接口手动控制录制启停。
    private static Integer onDemand = 7;

    /**
     * Initialization  初始化公共请求参数
     */
    public IAcsClient initialization() {
        // 初始化请求参数
        DefaultProfile profile = DefaultProfile.getProfile(
                "<your-region-id>", // 您的可用区ID
                "<your-access-key-id>", // 您的AccessKey ID
                "<your-access-key-secret>"); // 您的AccessKey Secret
        return new DefaultAcsClient(profile);
    }

    /**
     * 配置APP录制，输出内容保存到OSS中
     *
     * @param client     公共请求参数
     * @param appName    直播流所属应用名称
     * @param domainName 加速域名，指播放域名
     * @param ossBucket  OssBucket名称
     * @param endpoint   OssEndpoint域名
     * @param onDemand   按需录制 0表示关闭。1表示通过HTTP回调方式。7表示默认不录制。
     * @param streamName 流名称
     */
    public void addLiveAppRecordConfig(IAcsClient client, String appName, String domainName, String ossBucket, String endpoint, Integer onDemand, String streamName, List recordFormatList) throws ClientException {
        AddLiveAppRecordConfigRequest request = new AddLiveAppRecordConfigRequest();
        System.out.println("--------------------addLiveAppRecordConfig--------------------");
        request.setAppName(appName);
        request.setDomainName(domainName);
        request.setOssBucket(ossBucket);
        request.setOssEndpoint(endpoint);
        request.setOnDemand(onDemand);
        request.setStreamName(streamName);
        request.setRecordFormats(recordFormatList);
        AddLiveAppRecordConfigResponse response = client.getAcsResponse(request);
        System.out.println(gson.toJson(response));
    }

    /**
     * 按需完成手动录制。例如，动态地启动、停止录制
     *
     * @param client     公共请求参数
     * @param appName    App名
     * @param command    操作行为。支持start、stop两种类型
     * @param domainName 您的加速域名
     * @param streamName 直播流名
     */
    public void realTimeRecordCommand(IAcsClient client, String appName, String command, String domainName, String streamName) throws ClientException {
        RealTimeRecordCommandRequest request = new RealTimeRecordCommandRequest();
        System.out.println("--------------------addLiveAppRecordConfig--------------------");
        request.setAppName(appName);
        request.setDomainName(domainName);
        request.setStreamName(streamName);
        request.setCommand(command);
        RealTimeRecordCommandResponse response = client.getAcsResponse(request);
        System.out.println(gson.toJson(response));
    }


    /**
     * 组装RecordFormat参数
     *
     * @param cycleDuration        周期录制时长。单位：秒。不填则默认为6小时。
     * @param format               格式。目前支持m3u8、flv或mp4。
     * @param ossObjectPrefix      OSS存储的录制文件名，小于256 byte，支持变量匹配
     *                             包含 {AppName}、{StreamName}、{Sequence}、{StartTime}、{EndTime}、{EscapedStartTime}、{EscapedEndTime}
     *                             参数值必须要有{StartTime}或{EscapedStartTime}和{EndTime}或{EscapedEndTime}变量。默认支持1小时周期录制，最小
     *                             周期时间15分钟，最多6小时。
     * @param sliceOssObjectPrefix 当format格式是m3u8录制，则需要配置，表示ts切片名称。默认30秒一片，小于256byte，支持变量匹配
     *                             包含{AppName}、{StreamName}、{UnixTimestamp}、{Sequence}
     */
    public List<AddLiveAppRecordConfigRequest.RecordFormat> recordFormat(Integer cycleDuration, String format, String ossObjectPrefix, String sliceOssObjectPrefix) {
        List<AddLiveAppRecordConfigRequest.RecordFormat> recordFormatList = new ArrayList<AddLiveAppRecordConfigRequest.RecordFormat>();

        AddLiveAppRecordConfigRequest.RecordFormat recordFormat1 = new AddLiveAppRecordConfigRequest.RecordFormat();
        recordFormat1.setFormat(format);
        recordFormat1.setOssObjectPrefix(ossObjectPrefix);
        recordFormat1.setCycleDuration(cycleDuration);
        recordFormat1.setSliceOssObjectPrefix(sliceOssObjectPrefix);
        recordFormatList.add(recordFormat1);
        return recordFormatList;
    }

    public static void main(String[] args) {
        AddLiveAppRecordConfig liveAppRecordConfig = new AddLiveAppRecordConfig();
        IAcsClient client = liveAppRecordConfig.initialization();
        List<AddLiveAppRecordConfigRequest.RecordFormat> recordFormats = liveAppRecordConfig.recordFormat(
                1,
                "m3u8",
                "record/{AppName}/{StreamName}/{Sequence}{EscapedStartTime}{EscapedEndTime}",
                "record/{AppName}/{StreamName}/{UnixTimestamp}_{Sequence}");
        try {
            liveAppRecordConfig.addLiveAppRecordConfig(client, App, domainName, ossBucket, ossEndpoint, 7, streamName, recordFormats);
            liveAppRecordConfig.realTimeRecordCommand(client, App, "start", domainName, streamName);
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            System.out.println("ErrCode:" + e.getErrCode());
            System.out.println("ErrMsg:" + e.getErrMsg());
            System.out.println("RequestId:" + e.getRequestId());
        }
    }
}