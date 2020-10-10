package com.example.springboot.service;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.live.model.v20161101.CreateLiveStreamRecordIndexFilesRequest;
import com.aliyuncs.live.model.v20161101.CreateLiveStreamRecordIndexFilesResponse;
import com.aliyuncs.profile.DefaultProfile;
import com.example.springboot.entity.AliLive;
import com.example.springboot.live.AliYunConfig;
import com.example.springboot.live.AliYunUtil;
import com.example.springboot.mapper.AliLiveMapper;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class AliLiveService {
    @Resource
    private AliYunConfig aliyunConfig;
    @Autowired
    private AliLiveMapper liveMapper;

    public Map<String,Object> create(AliLive live){
        Map<String , Object> map = new HashMap<>();
        if(live!=null){
            //直播方式 1摄像头直播 2录屏直播
            switch (live.getLiveWay()){
                case 1:
                    //生成推流地址
                    String pushUrl = AliYunUtil.createPushUrl("aimumisi", aliyunConfig);
                    //生成播流地址
                    Map<String,String> pullUrlMap = AliYunUtil.createPullUrl("aimumisi", aliyunConfig);
                    live.setPushUrl(pushUrl);
                    live.setRtmpUrl(pullUrlMap.get("rtmpUrl"));
                    live.setM3u8Url(pullUrlMap.get("m3u8Url"));
                    live.setFlvUrl(pullUrlMap.get("flvUrl"));
                    live.setCreatedTimestamp(System.currentTimeMillis());
                    live.setCoverImage("https://ylwhcm.oss-cn-shanghai.aliyuncs.com/ylwhcm/amms/images/livecover/fengm.jpg");
                    liveMapper.insertSelective(live);
                    liveMapper.selectByPrimaryKey(live.getLiveID());
                    map.put("success",live);
                    break;
                case 2:
                    //生成推流地址
                  //  String pushUrl = AliYunUtil.createPushUrl("aimumisi", aliyunConfig);
                    //生成播流地址
                   // Map<String,String> pullUrlMap = AliYunUtil.createPullUrl("aimumisi", aliyunConfig);
                    //createLiveStreamRecordIndexFiles();
                    break;
            }
        }
        return map;
    }

    public void createLiveStreamRecordIndexFiles(){
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "<accessKeyId>", "<accessSecret>");
        IAcsClient client = new DefaultAcsClient(profile);

        CreateLiveStreamRecordIndexFilesRequest request = new CreateLiveStreamRecordIndexFilesRequest();
        request.setRegionId("cn-hangzhou");
        request.setAppName("aimumisi");
        request.setStreamName("aimumisi");
        request.setOssEndpoint("oss-cn-shanghai.aliyuncs.com");
        request.setOssBucket("ylwhcm-live");
        request.setOssObject("111");
        request.setStartTime("2017-12-22T08:00:00Z");
        request.setEndTime("2017-12-22T08:00:00Z");
        request.setDomainName("live.ammsshop.com");

        try {
            CreateLiveStreamRecordIndexFilesResponse response = client.getAcsResponse(request);
            System.out.println(new Gson().toJson(response));
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            System.out.println("ErrCode:" + e.getErrCode());
            System.out.println("ErrMsg:" + e.getErrMsg());
            System.out.println("RequestId:" + e.getRequestId());
        }
    }
}
