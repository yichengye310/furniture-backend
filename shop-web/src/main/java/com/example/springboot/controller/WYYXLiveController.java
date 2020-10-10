package com.example.springboot.controller;

import com.example.springboot.entity.WYYXLive;
import com.example.springboot.responseVO.LiveListResponseVO;
import com.example.springboot.service.LiveService;
import com.github.pagehelper.PageInfo;
import com.google.gson.JsonArray;
import com.yelang.shop.base.annotation.UserLoginToken;
import com.yelang.shop.base.exception.JsonResponse;
import io.swagger.annotations.ApiOperation;
import org.apache.http.Consts;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import wyyx.CheckSumBuilder;
import java.util.Date;

@CrossOrigin
@Controller
@RequestMapping("/live")
public class WYYXLiveController {

    @Value("${wyyx.live.appKey}")
    private String appKey;
    @Value("${wyyx.live.appSecret}")
    private String appSecret;
    @Value("${wyyx.live.nonce}")
    private String nonce;
    @Autowired
    private LiveService liveService;

    /**
     * 创建直播
     * @param live
     * @return
     */
    @UserLoginToken
    @ResponseBody
    @PostMapping("/create")
    @ApiOperation(value = "创建直播",notes="创建直播")
    public JsonResponse create(@RequestBody WYYXLive live){
        JsonResponse resp = new JsonResponse();
        try{
            resp.setData(liveService.create(live));
        }catch (Exception e){
            e.printStackTrace();
            resp = JsonResponse.buildErrorResponse();
        }
        return resp;

    }

    /**
     * 更新直播（更新直播封面）
     * @param live
     * @return
     */
    @UserLoginToken
    @ResponseBody
    @PostMapping("/update")
    @ApiOperation(value = "更新直播",notes="更新直播")
    public JsonResponse update(@RequestBody WYYXLive live){
        JsonResponse resp = new JsonResponse();
        try{
            resp.setData(liveService.update(live));
        }catch (Exception e){
            e.printStackTrace();
            resp = JsonResponse.buildErrorResponse();
        }
        return resp;
    }

    /**
     * 获取频道列表（获取用户直播频道列表）
     * @param pageSize 单页记录数，默认值为10，最多1000条
     * @param pageNo 要取第几页，默认值为1
     * //@param ofield 排序的域，支持的排序域为：ctime（默认）
     * @param sort 升序还是降序，1升序，0降序，默认为desc
     * @param status 筛选频道状态，status取值：（0：空闲,1：直播，2：禁用，3：录制中）
     * @return
     * @throws Exception
     */
    @ResponseBody
    @GetMapping("/liveList")
    @ApiOperation(value = "直播列表(频道列表)",notes="直播列表(频道列表)")
    public JsonResponse liveList(@RequestParam(value = "sort",defaultValue = "1") Integer sort,
                                 @RequestParam(value = "status",required = false) Integer status,
                                 @RequestParam(value="pageNo",defaultValue="1") Integer pageNo,
                                 @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize,
                                 @RequestParam(value = "phoneNumber",required = false) String phoneNumber){
        JsonResponse resp = new JsonResponse();
        if (pageNo == null || pageNo <= 0) {
            pageNo = 1;
        }
        try{
            LiveListResponseVO liveListResponseVOS = liveService.liveListByPage(sort,status,pageNo,pageSize,phoneNumber);
            resp.setData(liveListResponseVOS);
        }catch (Exception e){
            e.printStackTrace();
            resp = JsonResponse.buildErrorResponse();
        }
        return resp;
    }

    /**
     * 直播-普通产品列表(不分页)
     * @param cid 直播id
     * @return
     */
    @ResponseBody
    @GetMapping("/liveProducts")
    @ApiOperation(value = "直播产品列表(不分页)",notes="直播产品列表(不分页)")
    public JsonResponse liveProducts(@RequestParam(value = "cid") String cid){
        JsonResponse resp = new JsonResponse();
        try{
            resp.setData(liveService.liveProducts(cid));
        }catch (Exception e){
            e.printStackTrace();
            resp = JsonResponse.buildErrorResponse();
        }
        return resp;
    }

    /**
     * 频道列表（分页）-本地
     * @param live
     * @param pageNo
     * @param pageSize
     * @return
     */
    @ResponseBody
    @GetMapping("/channelListByPage")
    @ApiOperation(value = "频道列表-本地",notes="频道列表-本地")
    public JsonResponse channelListByPage(WYYXLive live,
                                          @RequestParam(value="pageNo",defaultValue="1") Integer pageNo,
                                          @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize){
        JsonResponse resp = new JsonResponse();
        if (pageNo == null || pageNo <= 0) {
            pageNo = 1;
        }
        try{
            PageInfo<WYYXLive> pageData = liveService.channelListByPage(live,pageNo,pageSize);
            resp.setData(pageData);
        }catch (Exception e){
            e.printStackTrace();
            resp = JsonResponse.buildErrorResponse();
        }
        return resp;
    }




    /**
     * 创建频道（获取推流拉流地址）
     * @param channelName 频道名称（最大长度64个字符，只支持中文、字母、数字和下划线）必填
     * @param type 频道类型（0:rtmp）
     * @return
     * @throws Exception
     */
    @UserLoginToken
    @ResponseBody
    @PostMapping("/wyyx/channel/create")
    @ApiOperation(value = "获取推流拉流地址",notes="返回获取推流拉流地址")
    public String channelCreate(@RequestParam(value = "channelName") String channelName,
                                @RequestParam(required = false) Integer type) throws Exception {
        DefaultHttpClient httpClient = new DefaultHttpClient();
        String url = "https://vcloud.163.com/app/channel/create";
        HttpPost httpPost = new HttpPost(url);

        String curTime = String.valueOf((new Date()).getTime() / 1000L);
        String checkSum = CheckSumBuilder.getCheckSum(appSecret, nonce ,curTime);//参考 计算CheckSum的java代码

        // 设置请求的header
        httpPost.addHeader("AppKey", appKey);
        httpPost.addHeader("Nonce", nonce);
        httpPost.addHeader("CurTime", curTime);
        httpPost.addHeader("CheckSum", checkSum);
        httpPost.addHeader("Content-Type", "application/json;charset=utf-8");

        // 设置请求的参数
        StringEntity params = new StringEntity("{\"name\":\""+channelName+"\", \"type\":0}",Consts.UTF_8);
        httpPost.setEntity(params);

        // 执行请求
        HttpResponse response = httpClient.execute(httpPost);

        // 打印执行结果
        //System.out.println(EntityUtils.toString(response.getEntity(), "utf-8"));
        //System.out.println(curTime);
        return EntityUtils.toString(response.getEntity(), "utf-8");
    }

    /**
     * 修改频道（修改直播频道信息）
     * @param channelName 频道名称（最大长度64个字符，只支持中文、字母、数字和下划线）必填
     * @param cid 频道ID必填
     * @return
     * @throws Exception
     */
    @UserLoginToken
    @ResponseBody
    @PostMapping("/wyyx/channel/update")
    @ApiOperation(value = "修改直播频道信息",notes="修改直播频道信息")
    public String channelUpdate(@RequestParam(value = "channelName") String channelName,
                                @RequestParam(value = "cid") String cid) throws Exception {
        DefaultHttpClient httpClient = new DefaultHttpClient();
        String url = "https://vcloud.163.com/app/channel/update";
        HttpPost httpPost = new HttpPost(url);

        String curTime = String.valueOf((new Date()).getTime() / 1000L);
        String checkSum = CheckSumBuilder.getCheckSum(appSecret, nonce ,curTime);//参考 计算CheckSum的java代码

        // 设置请求的header
        httpPost.addHeader("AppKey", appKey);
        httpPost.addHeader("Nonce", nonce);
        httpPost.addHeader("CurTime", curTime);
        httpPost.addHeader("CheckSum", checkSum);
        httpPost.addHeader("Content-Type", "application/json;charset=utf-8");

        // 设置请求的参数
        StringEntity params = new StringEntity("{\"name\":\""+channelName+"\",\"cid\":\""+cid+"\", \"type\":0}",Consts.UTF_8);
        httpPost.setEntity(params);

        // 执行请求
        HttpResponse response = httpClient.execute(httpPost);

        // 打印执行结果
        //System.out.println(EntityUtils.toString(response.getEntity(), "utf-8"));
        // System.out.println(curTime);
        return EntityUtils.toString(response.getEntity(), "utf-8");
    }

    /**
     * 删除频道（删除一个直播频道）
     * @param cid 频道ID必填
     * @return
     * @throws Exception
     */
    @UserLoginToken
    @ResponseBody
    @PostMapping("/wyyx/channel/delete")
    @ApiOperation(value = "删除一个直播频道",notes="删除一个直播频道")
    public String channelDelete(@RequestParam(value = "cid") String cid) throws Exception {
        DefaultHttpClient httpClient = new DefaultHttpClient();
        String url = "https://vcloud.163.com/app/channel/delete";
        HttpPost httpPost = new HttpPost(url);

        String curTime = String.valueOf((new Date()).getTime() / 1000L);
        String checkSum = CheckSumBuilder.getCheckSum(appSecret, nonce ,curTime);//参考 计算CheckSum的java代码

        // 设置请求的header
        httpPost.addHeader("AppKey", appKey);
        httpPost.addHeader("Nonce", nonce);
        httpPost.addHeader("CurTime", curTime);
        httpPost.addHeader("CheckSum", checkSum);
        httpPost.addHeader("Content-Type", "application/json;charset=utf-8");

        // 设置请求的参数
        StringEntity params = new StringEntity("{\"cid\":\""+cid+"\"}",Consts.UTF_8);
        httpPost.setEntity(params);

        // 执行请求
        HttpResponse response = httpClient.execute(httpPost);

        // 打印执行结果
//        System.out.println(EntityUtils.toString(response.getEntity(), "utf-8"));
//        System.out.println(curTime);
        return EntityUtils.toString(response.getEntity(), "utf-8");
    }

    /**
     * 禁用频道（禁用用户正在直播的频道。）
     * @param cid 频道ID必填
     * @return
     * @throws Exception
     */
    @UserLoginToken
    @ResponseBody
    @PostMapping("/channel/pause")
    @ApiOperation(value = "禁用用户正在直播的频道",notes="禁用用户正在直播的频道")
    public String channelPause(@RequestParam(value = "cid") String cid) throws Exception {
        DefaultHttpClient httpClient = new DefaultHttpClient();
        String url = "https://vcloud.163.com/app/channel/pause";
        HttpPost httpPost = new HttpPost(url);

        String curTime = String.valueOf((new Date()).getTime() / 1000L);
        String checkSum = CheckSumBuilder.getCheckSum(appSecret, nonce ,curTime);//参考 计算CheckSum的java代码

        // 设置请求的header
        httpPost.addHeader("AppKey", appKey);
        httpPost.addHeader("Nonce", nonce);
        httpPost.addHeader("CurTime", curTime);
        httpPost.addHeader("CheckSum", checkSum);
        httpPost.addHeader("Content-Type", "application/json;charset=utf-8");

        // 设置请求的参数
        StringEntity params = new StringEntity("{\"cid\":\""+cid+"\"}",Consts.UTF_8);
        httpPost.setEntity(params);

        // 执行请求
        HttpResponse response = httpClient.execute(httpPost);

        // 打印执行结果
//        System.out.println(EntityUtils.toString(response.getEntity(), "utf-8"));
//        System.out.println(curTime);
        return EntityUtils.toString(response.getEntity(), "utf-8");
    }

    /**
     * 批量禁用频道（批量禁用频道）
     * @param cidList 频道ID列表
     * @return
     * @throws Exception
     */
    @UserLoginToken
    @ResponseBody
    @PostMapping("/wyyx/channelList/pause")
    @ApiOperation(value = "批量禁用频道",notes="批量禁用频道")
    public String channelListPause(@RequestParam(value = "cidList") JsonArray cidList) throws Exception {
        DefaultHttpClient httpClient = new DefaultHttpClient();
        String url = "https://vcloud.163.com/app/channellist/pause";
        HttpPost httpPost = new HttpPost(url);

        String curTime = String.valueOf((new Date()).getTime() / 1000L);
        String checkSum = CheckSumBuilder.getCheckSum(appSecret, nonce ,curTime);//参考 计算CheckSum的java代码

        // 设置请求的header
        httpPost.addHeader("AppKey", appKey);
        httpPost.addHeader("Nonce", nonce);
        httpPost.addHeader("CurTime", curTime);
        httpPost.addHeader("CheckSum", checkSum);
        httpPost.addHeader("Content-Type", "application/json;charset=utf-8");

        // 设置请求的参数
        StringEntity params = new StringEntity("{\"cidList\":\""+cidList+"\"}",Consts.UTF_8);
        httpPost.setEntity(params);

        // 执行请求
        HttpResponse response = httpClient.execute(httpPost);

        // 打印执行结果
//        System.out.println(EntityUtils.toString(response.getEntity(), "utf-8"));
//        System.out.println(curTime);
        return EntityUtils.toString(response.getEntity(), "utf-8");
    }

    /**
     * 恢复频道（恢复用户被禁用的频道。）
     * @param cid 频道ID，32位字符串
     * @return
     * @throws Exception
     */
    @UserLoginToken
    @ResponseBody
    @PostMapping("/wyyx/channel/resume")
    @ApiOperation(value = "恢复频道",notes="恢复频道")
    public String channelResume(@RequestParam(value = "cid") String cid) throws Exception {
        DefaultHttpClient httpClient = new DefaultHttpClient();
        String url = "https://vcloud.163.com/app/channel/resume";
        HttpPost httpPost = new HttpPost(url);

        String curTime = String.valueOf((new Date()).getTime() / 1000L);
        String checkSum = CheckSumBuilder.getCheckSum(appSecret, nonce ,curTime);//参考 计算CheckSum的java代码

        // 设置请求的header
        httpPost.addHeader("AppKey", appKey);
        httpPost.addHeader("Nonce", nonce);
        httpPost.addHeader("CurTime", curTime);
        httpPost.addHeader("CheckSum", checkSum);
        httpPost.addHeader("Content-Type", "application/json;charset=utf-8");

        // 设置请求的参数
        StringEntity params = new StringEntity("{\"cid\":\""+cid+"\"}",Consts.UTF_8);
        httpPost.setEntity(params);

        // 执行请求
        HttpResponse response = httpClient.execute(httpPost);

        // 打印执行结果
//        System.out.println(EntityUtils.toString(response.getEntity(), "utf-8"));
//        System.out.println(curTime);
        return EntityUtils.toString(response.getEntity(), "utf-8");
    }

    /**
     * 批量恢复频道（恢复一组用户正在直播的频道。）
     * @param cidList 频道ID列表
     * @return
     * @throws Exception
     */
    @UserLoginToken
    @ResponseBody
    @PostMapping("/wyyx/channelList/resume")
    @ApiOperation(value = "批量恢复频道",notes="批量恢复频道")
    public String channellistResume(@RequestParam(value = "cidList") JsonArray cidList) throws Exception {
        DefaultHttpClient httpClient = new DefaultHttpClient();
        String url = "https://vcloud.163.com/app/channellist/resume";
        HttpPost httpPost = new HttpPost(url);

        String curTime = String.valueOf((new Date()).getTime() / 1000L);
        String checkSum = CheckSumBuilder.getCheckSum(appSecret, nonce ,curTime);//参考 计算CheckSum的java代码

        // 设置请求的header
        httpPost.addHeader("AppKey", appKey);
        httpPost.addHeader("Nonce", nonce);
        httpPost.addHeader("CurTime", curTime);
        httpPost.addHeader("CheckSum", checkSum);
        httpPost.addHeader("Content-Type", "application/json;charset=utf-8");

        // 设置请求的参数
        StringEntity params = new StringEntity("{\"cidList\":\""+cidList+"\"}",Consts.UTF_8);
        httpPost.setEntity(params);

        // 执行请求
        HttpResponse response = httpClient.execute(httpPost);

        // 打印执行结果
//        System.out.println(EntityUtils.toString(response.getEntity(), "utf-8"));
//        System.out.println(curTime);
        return EntityUtils.toString(response.getEntity(), "utf-8");
    }

    /**
     * 获取录制文件列表（获取某频道录制视频文件列表，按生成时间由近至远提供分页。）
     * @param cid 频道ID，32位字符串
     * @param records 单页记录数，默认值为10，最多1000条
     * @param pnum 要取第几页，默认值为1
     * @return
     * @throws Exception
     */
    @ResponseBody
    @GetMapping("/wyyx/videoList")
    @ApiOperation(value = "获取录制文件列表",notes="获取录制文件列表")
    public String videoList(@RequestParam(value = "cid") String cid,
                            @RequestParam(required = false,value = "records",defaultValue = "10") Integer records,
                            @RequestParam(required = false,value = "pnum",defaultValue = "1") Integer pnum) throws Exception {
        DefaultHttpClient httpClient = new DefaultHttpClient();
        String url = "https://vcloud.163.com/app/videolist";
        HttpPost httpPost = new HttpPost(url);

        String curTime = String.valueOf((new Date()).getTime() / 1000L);
        String checkSum = CheckSumBuilder.getCheckSum(appSecret, nonce ,curTime);//参考 计算CheckSum的java代码

        // 设置请求的header
        httpPost.addHeader("AppKey", appKey);
        httpPost.addHeader("Nonce", nonce);
        httpPost.addHeader("CurTime", curTime);
        httpPost.addHeader("CheckSum", checkSum);
        httpPost.addHeader("Content-Type", "application/json;charset=utf-8");

        // 设置请求的参数
        StringEntity params = new StringEntity("{\"cid\":\""+cid+"\",\"records\":\""+records+"\",\"pnum\":\""+pnum+"\"}",Consts.UTF_8);
        httpPost.setEntity(params);

        // 执行请求
        HttpResponse response = httpClient.execute(httpPost);

        // 打印执行结果
//        System.out.println(EntityUtils.toString(response.getEntity(), "utf-8"));
//        System.out.println(curTime);
        return EntityUtils.toString(response.getEntity(), "utf-8");
    }

    /**
     * 获取频道状态（获取一个直播频道的信息）
     * @param cid 频道ID，32位字符串
     * @return
     * @throws Exception
     */
    @UserLoginToken
    @ResponseBody
    @PostMapping("/wyyx/channelStats")
    @ApiOperation(value = "获取频道状态",notes="获取频道状态")
    public String channelStats(@RequestParam(value = "cid") String cid) throws Exception {
        DefaultHttpClient httpClient = new DefaultHttpClient();
        String url = "https://vcloud.163.com/app/channelstats";
        HttpPost httpPost = new HttpPost(url);

        String curTime = String.valueOf((new Date()).getTime() / 1000L);
        String checkSum = CheckSumBuilder.getCheckSum(appSecret, nonce ,curTime);//参考 计算CheckSum的java代码

        // 设置请求的header
        httpPost.addHeader("AppKey", appKey);
        httpPost.addHeader("Nonce", nonce);
        httpPost.addHeader("CurTime", curTime);
        httpPost.addHeader("CheckSum", checkSum);
        httpPost.addHeader("Content-Type", "application/json;charset=utf-8");

        // 设置请求的参数
        StringEntity params = new StringEntity("{\"cid\":\""+cid+"\"}",Consts.UTF_8);
        httpPost.setEntity(params);

        // 执行请求
        HttpResponse response = httpClient.execute(httpPost);

        // 打印执行结果
//        System.out.println(EntityUtils.toString(response.getEntity(), "utf-8"));
//        System.out.println(curTime);
        return EntityUtils.toString(response.getEntity(), "utf-8");
    }

    /**
     * 获取频道列表（获取用户直播频道列表）网易云信
     * @param records 单页记录数，默认值为10，最多1000条
     * @param pnum 要取第几页，默认值为1
     * //@param ofield 排序的域，支持的排序域为：ctime（默认）
     * @param sort 升序还是降序，1升序，0降序，默认为desc
     * @param status 筛选频道状态，status取值：（0：空闲,1：直播，2：禁用，3：录制中）
     * @return
     * @throws Exception
     */
    @UserLoginToken
    @ResponseBody
    @PostMapping("/wyyx/channelList")
    @ApiOperation(value = "获取频道列表",notes="获取频道列表")
    public String channelList(@RequestParam(value = "records",defaultValue = "10",required = false) Integer records,
                              @RequestParam(value = "pnum",defaultValue = "1",required = false) Integer pnum,
                              @RequestParam(value = "sort",required = false) Integer sort,
                              @RequestParam(value = "status",required = false) Integer status) throws Exception {
        DefaultHttpClient httpClient = new DefaultHttpClient();
        String url = "https://vcloud.163.com/app/channellist";
        HttpPost httpPost = new HttpPost(url);

        String curTime = String.valueOf((new Date()).getTime() / 1000L);
        String checkSum = CheckSumBuilder.getCheckSum(appSecret, nonce ,curTime);//参考 计算CheckSum的java代码

        // 设置请求的header
        httpPost.addHeader("AppKey", appKey);
        httpPost.addHeader("Nonce", nonce);
        httpPost.addHeader("CurTime", curTime);
        httpPost.addHeader("CheckSum", checkSum);
        httpPost.addHeader("Content-Type", "application/json;charset=utf-8");

        // 设置请求的参数
        StringEntity params = new StringEntity("{\"records\":\""+records+"\",\"pnum\":\""+pnum+"\",\"ofield\":\"ctime\",\"sort\":\""+sort+"\",\"status\":\""+status+"\"}",Consts.UTF_8);
        // StringEntity params = new StringEntity("{\"status\":\""+status+"\"}",Consts.UTF_8);
        httpPost.setEntity(params);

        // 执行请求
        HttpResponse response = httpClient.execute(httpPost);

        // 打印执行结果
        // System.out.println(EntityUtils.toString(response.getEntity(), "utf-8"));
        // System.out.println(curTime);
        return EntityUtils.toString(response.getEntity(), "utf-8");
    }
    /**
     * 重新获取推拉流地址（用户创建频道时获取的推拉流地址失效时，重新获取推拉流地址。）
     * @param cid 频道ID，32位字符串
     * @return
     * @throws Exception
     */
    @UserLoginToken
    @ResponseBody
    @PostMapping("/wyyx/address")
    @ApiOperation(value = "重新获取推拉流地址",notes="重新获取推拉流地址")
    public String address(@RequestParam(value = "cid") Integer cid) throws Exception {
        DefaultHttpClient httpClient = new DefaultHttpClient();
        String url = "https://vcloud.163.com/app/address";
        HttpPost httpPost = new HttpPost(url);

        String curTime = String.valueOf((new Date()).getTime() / 1000L);
        String checkSum = CheckSumBuilder.getCheckSum(appSecret, nonce ,curTime);//参考 计算CheckSum的java代码

        // 设置请求的header
        httpPost.addHeader("AppKey", appKey);
        httpPost.addHeader("Nonce", nonce);
        httpPost.addHeader("CurTime", curTime);
        httpPost.addHeader("CheckSum", checkSum);
        httpPost.addHeader("Content-Type", "application/json;charset=utf-8");

        // 设置请求的参数
        StringEntity params = new StringEntity("{\"cid\":\""+cid+"\"}",Consts.UTF_8);
        httpPost.setEntity(params);

        // 执行请求
        HttpResponse response = httpClient.execute(httpPost);

        // 打印执行结果
//        System.out.println(EntityUtils.toString(response.getEntity(), "utf-8"));
//        System.out.println(curTime);
        return EntityUtils.toString(response.getEntity(), "utf-8");
    }

    /**
     * 直播录制(设置录制配置)
     * @param cid 频道ID，32位字符串
     * @param duration 录制周期, 取值范围[5,120], 单位分钟, 默认120分钟
     * @param format 录制切片视频容器格式, 取值范围[0-2], 默认1
     * @param filename 录制切片文件名前缀, 要求非空, 字符长度不大于64
     * @return
     * @throws Exception
     */
    @UserLoginToken
    @ResponseBody
    @PostMapping("/wyyx/record/channel/updateConfig")
    @ApiOperation(value = "设置录制配置",notes="设置录制配置")
    public String recordChannelUpdateConfig(@RequestParam(value = "cid") String cid,
                                            @RequestParam(value = "duration") Integer duration,
                                            @RequestParam(value = "format") Integer format,
                                            @RequestParam(value = "filename") String filename) throws Exception {
        DefaultHttpClient httpClient = new DefaultHttpClient();
        String url = "https://vcloud.163.com/app/record/channel/updateConfig";
        HttpPost httpPost = new HttpPost(url);

        String curTime = String.valueOf((new Date()).getTime() / 1000L);
        String checkSum = CheckSumBuilder.getCheckSum(appSecret, nonce ,curTime);//参考 计算CheckSum的java代码

        // 设置请求的header
        httpPost.addHeader("AppKey", appKey);
        httpPost.addHeader("Nonce", nonce);
        httpPost.addHeader("CurTime", curTime);
        httpPost.addHeader("CheckSum", checkSum);
        httpPost.addHeader("Content-Type", "application/json;charset=utf-8");

        // 设置请求的参数
        StringEntity params = new StringEntity("{\"cid\":\""+cid+"\",\"duration\":\""+duration+"\",\"format\":\""+format+"\",\"filename\":\""+filename+"\"}",Consts.UTF_8);
        httpPost.setEntity(params);

        // 执行请求
        HttpResponse response = httpClient.execute(httpPost);

        // 打印执行结果
//        System.out.println(EntityUtils.toString(response.getEntity(), "utf-8"));
//        System.out.println(curTime);
        return EntityUtils.toString(response.getEntity(), "utf-8");
    }

    /**
     * 查询录制配置设置(获取频道下的录制相关配置。)
     * @param cid 频道ID，32位字符串
     * @return
     * @throws Exception
     */
    @UserLoginToken
    @ResponseBody
    @PostMapping("/wyyx/record/channel/getConfig")
    @ApiOperation(value = "查询录制配置设置",notes="查询录制配置设置")
    public String recordChannelGetConfig(@RequestParam(value = "cid") String cid) throws Exception {
        DefaultHttpClient httpClient = new DefaultHttpClient();
        String url = "https://vcloud.163.com/app/record/channel/getConfig";
        HttpPost httpPost = new HttpPost(url);

        String curTime = String.valueOf((new Date()).getTime() / 1000L);
        String checkSum = CheckSumBuilder.getCheckSum(appSecret, nonce ,curTime);//参考 计算CheckSum的java代码

        // 设置请求的header
        httpPost.addHeader("AppKey", appKey);
        httpPost.addHeader("Nonce", nonce);
        httpPost.addHeader("CurTime", curTime);
        httpPost.addHeader("CheckSum", checkSum);
        httpPost.addHeader("Content-Type", "application/json;charset=utf-8");

        // 设置请求的参数
        StringEntity params = new StringEntity("{\"cid\":\""+cid+"\"}",Consts.UTF_8);
        httpPost.setEntity(params);

        // 执行请求
        HttpResponse response = httpClient.execute(httpPost);

        // 打印执行结果
//        System.out.println(EntityUtils.toString(response.getEntity(), "utf-8"));
//        System.out.println(curTime);
        return EntityUtils.toString(response.getEntity(), "utf-8");
    }

    /**
     * 自动录制开关设置
     * @param cid 频道ID，32位字符串
     * @param needRecord 自动录制开关,0:关闭，1：打开
     * @return
     * @throws Exception
     */
    @UserLoginToken
    @ResponseBody
    @PostMapping("/wyyx/channel/autoRecordSwitch")
    @ApiOperation(value = "设置频道下的自动录制开关。",notes="自动录制开关设置")
    public String channelAutoRecordSwitch(@RequestParam(value = "cid") String cid,
                                          @RequestParam(required = false,value = "needRecord") Integer needRecord) throws Exception {
        DefaultHttpClient httpClient = new DefaultHttpClient();
        String url = "https://vcloud.163.com/app/channel/autoRecordSwitch";
        HttpPost httpPost = new HttpPost(url);

        String curTime = String.valueOf((new Date()).getTime() / 1000L);
        String checkSum = CheckSumBuilder.getCheckSum(appSecret, nonce ,curTime);//参考 计算CheckSum的java代码

        // 设置请求的header
        httpPost.addHeader("AppKey", appKey);
        httpPost.addHeader("Nonce", nonce);
        httpPost.addHeader("CurTime", curTime);
        httpPost.addHeader("CheckSum", checkSum);
        httpPost.addHeader("Content-Type", "application/json;charset=utf-8");

        // 设置请求的参数
        StringEntity params = new StringEntity("{\"cid\":\""+cid+"\",\"needRecord\":\""+needRecord+"\"}",Consts.UTF_8);
        httpPost.setEntity(params);

        // 执行请求
        HttpResponse response = httpClient.execute(httpPost);

        // 打印执行结果
//        System.out.println(EntityUtils.toString(response.getEntity(), "utf-8"));
//        System.out.println(curTime);
        return EntityUtils.toString(response.getEntity(), "utf-8");
    }

    /**
     * 获取某一时间范围的录制视频文件列表
     * @param cid 频道ID，32位字符串
     * @param beginTime 查询的起始时间戳(毫秒)
     * @param endTime 查询的结束时间戳(毫秒)
     * @param sort 排序字段，取值为0时降序，为1时升序，默认降序
     * @return
     * @throws Exception
     */
    @UserLoginToken
    @ResponseBody
    @PostMapping("/wyyx/vodVideoList")
    @ApiOperation(value = "获取某一时间范围的录制视频文件列表",notes="获取某一时间范围的录制视频文件列表")
    public String vodVideoList(@RequestParam(value = "cid") String cid,
                               @RequestParam(value = "beginTime") String beginTime,
                               @RequestParam(value = "endTime") String endTime,
                               @RequestParam(required = false,value = "sort") Integer sort) throws Exception {
        DefaultHttpClient httpClient = new DefaultHttpClient();
        String url = "https://vcloud.163.com/app/vodvideolist";
        HttpPost httpPost = new HttpPost(url);

        String curTime = String.valueOf((new Date()).getTime() / 1000L);
        String checkSum = CheckSumBuilder.getCheckSum(appSecret, nonce ,curTime);//参考 计算CheckSum的java代码

        // 设置请求的header
        httpPost.addHeader("AppKey", appKey);
        httpPost.addHeader("Nonce", nonce);
        httpPost.addHeader("CurTime", curTime);
        httpPost.addHeader("CheckSum", checkSum);
        httpPost.addHeader("Content-Type", "application/json;charset=utf-8");

        // 设置请求的参数
        StringEntity params = new StringEntity("{\"cid\":\""+cid+"\",\"beginTime\":\""+beginTime+"\",\"endTime\":\""+endTime+"\",\"sort\":\""+sort+"\"}",Consts.UTF_8);
        httpPost.setEntity(params);

        // 执行请求
        HttpResponse response = httpClient.execute(httpPost);

        // 打印执行结果
//        System.out.println(EntityUtils.toString(response.getEntity(), "utf-8"));
//        System.out.println(curTime);
        return EntityUtils.toString(response.getEntity(), "utf-8");
    }
    //    @ResponseBody
//    @PostMapping("/test")
//    public void pay(){
//        System.out.println("appKey" + appKey);
//        System.out.println("appSecret" + appSecret);
//        System.out.println("nonce" + nonce);
//    }

}