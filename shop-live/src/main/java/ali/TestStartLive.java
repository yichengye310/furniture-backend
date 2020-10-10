package ali;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.live.model.v20161101.*;
import com.aliyuncs.profile.DefaultProfile;
import com.google.gson.Gson;

/**
 * 步骤一：添加视频直播域名
 *
 * 添加视频直播域名，您需要调用AddLiveDomain接口添加一个推流域名（业务类型为liveEdge）和一个播放域名（业务类型为liveVideo），然后再调用AddLiveDomainMapping接口将已创建的推流域名和播放域名关联。
 *
 * 完整代码示例如下：
 */
public class TestStartLive {

    // 推流域名
    private static String liveEdge = "live.ammsshop.com";
    // 播流域名
    private static String liveVideo = "livebo.ammsshop.com";

    /**
     * Initialization  初始化公共请求参数
     */
    public IAcsClient initialization() {
        // 初始化请求参数
        DefaultProfile profile = DefaultProfile.getProfile(
                "<your-region-id>", // 您的可用区ID
                "LTAI4GJPQLGSZnx8DkpVZfDC", // 您的AccessKey ID
                "YwX79Xe8cQBMBEIHp5HiNrQ6ekcGEi"); // 您的AccessKey Secret
        return new DefaultAcsClient(profile);
    }

    /**
     * 添加直播域名 AddLiveDomain
     *
     * @param client         公共请求参数
     * @param domainName     需要接入直播的域名。支持泛域名，以符号“.”开头，如：.a.com。
     * @param liveDomainType 域名业务类型。取值：liveVideo：播流域名  liveEdge：边缘推流域名
     * @param scope          加速区域。国际用户、国内L3及以上用户设置有效。
     */
    public AddLiveDomainResponse addLiveDomain(IAcsClient client, String domainName, String liveDomainType, String scope, String region) throws ClientException {
        AddLiveDomainRequest request = new AddLiveDomainRequest();
        System.out.println("--------------------addLiveDomain--------------------");
        request.setDomainName(domainName);
        request.setRegion(region);
        request.setLiveDomainType(liveDomainType);
        request.setScope(scope);
        return client.getAcsResponse(request);
    }

    /**
     * AddLiveDomainMapping  配置推流和拉流的映射关系
     *
     * @param client     公共请求参数
     * @param pullDomain 播流域名，域名类型为liveVideo。
     * @param pushDomain 推流域名，域名类型为liveEdge。
     */
    public AddLiveDomainMappingResponse addLiveDomainMapping(IAcsClient client, String pullDomain, String pushDomain) throws ClientException {
        AddLiveDomainMappingRequest request = new AddLiveDomainMappingRequest();
        System.out.println("--------------------addLiveDomainMapping--------------------");
        request.setPullDomain(pullDomain);
        request.setPushDomain(pushDomain);
        return client.getAcsResponse(request);
    }

    /**
     * DescribeLiveUserDomains 查询用户名下所有的直播域名
     *
     * @param client 公共请求参数
     */
    public DescribeLiveUserDomainsResponse describeLiveUserDomains(IAcsClient client) throws ClientException {
        DescribeLiveUserDomainsRequest request = new DescribeLiveUserDomainsRequest();
        System.out.println("--------------------describeLiveUserDomains--------------------");
        // request.setDomainName(domainName);
        return client.getAcsResponse(request);
    }

    public static void main(String[] args) {
        TestStartLive live = new TestStartLive();
        Gson gson = new Gson();
        IAcsClient client = live.initialization();
        try {
            // 添加推流域名。
            AddLiveDomainResponse liveEdgeResponse = live.addLiveDomain(client, liveEdge, "liveEdge", "domestic","cn-shanghai");
            System.out.println(gson.toJson(liveEdgeResponse));
            // 添加播流域名。
            AddLiveDomainResponse liveVideoResponse = live.addLiveDomain(client, liveVideo, "liveVideo", "domestic","cn-shanghai");
            System.out.println(gson.toJson(liveVideoResponse));
            // 查询直播域名列表。
            // 判断确认域名是否添加成功，且状态为online。
            while (true) {
                DescribeLiveUserDomainsResponse userDomains = live.describeLiveUserDomains(client);
                String liveEdgeStatus = null;
                String liveVideoStatus = null;
                for (DescribeLiveUserDomainsResponse.PageData pageData : userDomains.getDomains()) {
                    String domainName = pageData.getDomainName();
                    // 提取推流域名状态
                    if (domainName.equals(liveEdge)) {
                        liveEdgeStatus = pageData.getLiveDomainStatus();
                    }
                    // 提取拉流域名状态
                    if (domainName.equals(liveVideo)) {
                        liveVideoStatus = pageData.getLiveDomainStatus();
                    }
                }
                // 判断确认域名是否添加成功，且状态为online。
                if (liveEdgeStatus.equals("online") && liveVideoStatus.equals("online")) {
                    System.out.println("直播配置域名！");
                    live.addLiveDomainMapping(client, liveVideo, liveEdge);
                    System.out.println("域名关联成功！");
                    break;
                }else {
                    System.out.println("域名配置中，请稍后...");
                    Thread.sleep(5000);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            System.out.println("ErrCode:" + e.getErrCode());
            System.out.println("ErrMsg:" + e.getErrMsg());
            System.out.println("RequestId:" + e.getRequestId());
        }
    }
}