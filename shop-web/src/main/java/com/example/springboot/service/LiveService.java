package com.example.springboot.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.example.springboot.entity.Product;
import com.example.springboot.entity.ProductLimitedTime;
import com.example.springboot.entity.WYYXLive;
import com.example.springboot.mapper.ProductLimitedTimeMapper;
import com.example.springboot.mapper.ProductMapper;
import com.example.springboot.mapper.WYYXLiveMapper;
import com.example.springboot.responseVO.LiveListResponseVO;
import com.example.springboot.responseVO.LiveResponse;
import com.example.springboot.responseVO.Ret;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yelang.shop.base.util.BaseUtils;
import org.apache.http.Consts;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import wyyx.CheckSumBuilder;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class LiveService {
    @Value("${wyyx.live.appKey}")
    private String appKey;
    @Value("${wyyx.live.appSecret}")
    private String appSecret;
    @Value("${wyyx.live.nonce}")
    private String nonce;

    @Autowired
    private WYYXLiveMapper liveMapper;
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private ProductLimitedTimeMapper productLimitedTimeMapper;

    //@Transactional(rollbackFor=IOException.class)
    public Map<String,Object> create(WYYXLive live) throws IOException {
        Map<String , Object> map = new HashMap<>();
        if(live!=null){
            //直播方式 1摄像头直播 2录屏直播
            switch (live.getLiveWay()){
                case 1:
                    //创建频道
                    String result1 = createChannel(live.getLiveTitle());
                    //新增直播
                    if(result1!=null && !("").equals(result1)){
                        Map maps = (Map) JSON.parse(result1);
                        if("200".equals(maps.get("code").toString())){
                            Map retMap = (Map) JSON.parse(maps.get("ret").toString());
                            live.setCid(retMap.get("cid").toString());
                            live.setHttpPullUrl(retMap.get("httpPullUrl").toString());
                            live.setHlsPullUrl(retMap.get("hlsPullUrl").toString());
                            live.setRtmpPullUrl(retMap.get("rtmpPullUrl").toString());
                            live.setPushUrl(retMap.get("pushUrl").toString());
                            live.setCreatedTimestamp(System.currentTimeMillis());
                            live.setCoverImage("https://ylwhcm.oss-cn-shanghai.aliyuncs.com/ylwhcm/amms/images/livecover/fengm.jpg");
                            liveMapper.insertSelective(live);
                            liveMapper.selectByPrimaryKey(live.getCid());
                            map.put("success",live);
                        }else{
                            map.put("error",maps.get("msg"));
                        }
                    }
                    break;
                case 2:
                    //创建频道
                    String result2 = createChannel(live.getLiveTitle());
                    if(result2!=null && !("").equals(result2)){
                        Map maps = (Map) JSON.parse(result2);
                        if("200".equals(maps.get("code").toString())){
                            Map retMap = (Map) JSON.parse(maps.get("ret").toString());
                            //设置录制
                            String setRecordingResult = setRecording(retMap.get("cid").toString(),120,0,live.getLiveTitle());
                            Map setRecordingMap = (Map) JSON.parse(setRecordingResult);
                            if("200".equals(setRecordingMap.get("code").toString())){
                                //自动录制开关设置
                                String autoRecordSwitchResult = autoRecordSwitch(retMap.get("cid").toString(),1);
                                Map autoRecordSwitchMap = (Map) JSON.parse(autoRecordSwitchResult);
                                if("200".equals(autoRecordSwitchMap.get("code").toString())){
                                    //新增直播
                                    live.setCid(retMap.get("cid").toString());
                                    live.setHttpPullUrl(retMap.get("httpPullUrl").toString());
                                    live.setHlsPullUrl(retMap.get("hlsPullUrl").toString());
                                    live.setRtmpPullUrl(retMap.get("rtmpPullUrl").toString());
                                    live.setPushUrl(retMap.get("pushUrl").toString());
                                    live.setCreatedTimestamp(System.currentTimeMillis());
                                    live.setCoverImage("https://ylwhcm.oss-cn-shanghai.aliyuncs.com/ylwhcm/amms/images/livecover/fengm.jpg");
                                    liveMapper.insertSelective(live);
                                    liveMapper.selectByPrimaryKey(live.getCid());
                                    map.put("success",live);
                                }else{
                                    map.put("error",maps.get("msg"));
                                }
                            }else{
                                map.put("error",maps.get("msg"));
                            }
                        }else{
                            map.put("error",maps.get("msg"));
                        }
                    }
                    break;
                default:
                    //创建频道
                    String result3 = createChannel(live.getLiveTitle());
                    //新增直播
                    if(result3!=null && !("").equals(result3)){
                        Map maps = (Map) JSON.parse(result3);
                        if("200".equals(maps.get("code").toString())){
                            Map retMap = (Map) JSON.parse(maps.get("ret").toString());
                            live.setCid(retMap.get("cid").toString());
                            live.setHttpPullUrl(retMap.get("httpPullUrl").toString());
                            live.setHlsPullUrl(retMap.get("hlsPullUrl").toString());
                            live.setRtmpPullUrl(retMap.get("rtmpPullUrl").toString());
                            live.setPushUrl(retMap.get("pushUrl").toString());
                            live.setCreatedTimestamp(System.currentTimeMillis());
                            live.setCoverImage("https://ylwhcm.oss-cn-shanghai.aliyuncs.com/ylwhcm/amms/images/livecover/fengm.jpg");
                            liveMapper.insertSelective(live);
                            map.put("success",live);
                        }else{
                            map.put("error",maps.get("msg"));
                        }
                    }
                    break;
            }
        }
        return map;
    }
    public Integer update(WYYXLive live){return liveMapper.updateByPrimaryKeySelective(live);}
    public LiveListResponseVO liveListByPage(Integer sort, Integer status, Integer pageNo, Integer pageSize,String phoneNumber) throws IOException {
        LiveListResponseVO liveListResponseVO = new LiveListResponseVO();
        Ret ret = new Ret();
        /*List<T> ts = (List<T>) JSONArray.parseArray(jsonString, clazz);*/
        //获取频道列表
        String result = channelList(sort,status,pageNo,pageSize);
        if(result!=null && !("").equals(result)){
            Map resultMap = (Map) JSON.parse(result);
            if("200".equals(resultMap.get("code").toString())){
                Map retMap = (Map) JSON.parse(resultMap.get("ret").toString());
                ret.setPnum((Integer) retMap.get("pnum"));
                ret.setTotalPnum((Integer) retMap.get("totalPnum"));
                ret.setTotalRecords((Integer) retMap.get("totalRecords"));
                ret.setRecords((Integer) retMap.get("records"));
                List<LiveResponse> liveResponses = JSONArray.parseArray(retMap.get("list").toString(), LiveResponse.class);
                if(liveResponses!=null && liveResponses.size()>0){
                    for(LiveResponse liveResponse:liveResponses){
                        WYYXLive live = liveMapper.selectByPrimaryKey(liveResponse.getCid());
                        liveResponse.setLive(live);
                    }
                }
                ret.setList(liveResponses);
                liveListResponseVO.setRet(ret);
            }
        }
        return liveListResponseVO;
    }
    public Map<String,Object> liveProducts(String cid){
        Map<String,Object> map = new HashMap<>();
        WYYXLive live = liveMapper.selectByPrimaryKey(cid);
        if(live!=null){
            String productIDs = live.getProducts();
            String limitProductIDs = live.getLimitProducts();
            if(!"".equals(productIDs) && productIDs!=null){
                List<String> productList = BaseUtils.jsonToStrArray(productIDs);
                //获取产品列表
                List<Product> products = productMapper.selectByProductIDs(productList);
                map.put("products",products);
            }
            if(!"".equals(limitProductIDs) && limitProductIDs!=null){
                List<String> limitProductList = BaseUtils.jsonToStrArray(limitProductIDs);
                //获取产品抢购产品列表
                List<ProductLimitedTime> productLimitedTimes =  productLimitedTimeMapper.selectByProductIDs(limitProductList);
                map.put("limitProducts",productLimitedTimes);
            }
            //获取优惠券列表
        }
        return map;
    }
    public PageInfo<WYYXLive> channelListByPage(WYYXLive live, Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize,"createdTimestamp DESC");
        List<WYYXLive> pageData = liveMapper.channelListByPage(live);
        PageInfo<WYYXLive> pageInfo = new PageInfo<>(pageData);
        return pageInfo;
    }
    //频道列表
    public String channelList(Integer sort, Integer status, Integer pageNo, Integer pageSize) throws IOException {
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
        StringEntity params = null;
        if (status==null){
            params = new StringEntity("{\"records\":\""+pageSize+"\",\"pnum\":\""+pageNo+"\",\"ofield\":\"ctime\",\"sort\":\""+sort+"\"}",Consts.UTF_8);
        }else{
            params = new StringEntity("{\"records\":\""+pageSize+"\",\"pnum\":\""+pageNo+"\",\"ofield\":\"ctime\",\"sort\":\""+sort+"\",\"status\":\""+status+"\"}",Consts.UTF_8);
        }

        // StringEntity params = new StringEntity("{\"status\":\""+status+"\"}",Consts.UTF_8);
        httpPost.setEntity(params);

        // 执行请求
        HttpResponse response = httpClient.execute(httpPost);

        // 打印执行结果
        // System.out.println(EntityUtils.toString(response.getEntity(), "utf-8"));
        // System.out.println(curTime);
        return EntityUtils.toString(response.getEntity(), "utf-8");
    }
    //创建频道
    public String createChannel(String channelName) throws IOException {
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
        StringEntity params = new StringEntity("{\"name\":\""+channelName+"\", \"type\":0}", Consts.UTF_8);
        httpPost.setEntity(params);

        // 执行请求
        HttpResponse response = httpClient.execute(httpPost);

        // 打印执行结果
        //System.out.println(EntityUtils.toString(response.getEntity(), "utf-8"));
        //System.out.println(curTime);
        return EntityUtils.toString(response.getEntity(), "utf-8");
    }
    //设置录屏
    public String setRecording(String cid,Integer duration,Integer format,String filename) throws IOException {
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
    //录屏文件列表
    public String videoList(String cid,Integer pageNo,Integer pageSize) throws IOException{
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
        StringEntity params = new StringEntity("{\"cid\":\""+cid+"\",\"records\":\""+pageSize+"\",\"pnum\":\""+pageNo+"\"}",Consts.UTF_8);
        httpPost.setEntity(params);

        // 执行请求
        HttpResponse response = httpClient.execute(httpPost);

        // 打印执行结果
//        System.out.println(EntityUtils.toString(response.getEntity(), "utf-8"));
//        System.out.println(curTime);
        return EntityUtils.toString(response.getEntity(), "utf-8");
    }
    //自动录制开关设置
    public String autoRecordSwitch(String cid,Integer needRecord) throws IOException{
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
}
