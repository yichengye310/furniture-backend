package com.example.springboot.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.springboot.live.AliYunConfig;
import com.example.springboot.live.AliYunUtil;
import com.example.springboot.live.ApiLiveModel;
import com.example.springboot.service.LiveService;
import com.yelang.shop.base.exception.JsonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@CrossOrigin
@Controller
@RequestMapping("/aliLive")
public class AliLiveController {
    @Autowired
    private LiveService liveService;
    @Resource
    private AliYunConfig aliyunConfig;
    /**
     * 生成推流播流地址
     * sourceId  在这里我将它设置为房间号
     */
    @ResponseBody
    @GetMapping("/save_Live")
    public JsonResponse save_Live(HttpServletRequest request, @RequestParam("sourceId") String sourceId){
        JsonResponse resp = new JsonResponse();
        try {
            //生成推流地址
            String pushUrl = AliYunUtil.createPushUrl(sourceId, aliyunConfig);
            //生成播流地址
            Map<String,String> pullUrlMap = AliYunUtil.createPullUrl(sourceId, aliyunConfig);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resp;
    }

    /**
     * 推流地址回调接口 根据返回状态值进行业务处理
     */
    @ResponseBody
    @RequestMapping("/callBackPath")
    public void test(HttpServletRequest request){
        /**
         * 返回参数
         * action:[publish].......
         */
        try {
            Map<String, String[]> parameterMap = request.getParameterMap();
            ApiLiveModel model = JSONObject.parseObject(JSON.toJSONString(parameterMap),ApiLiveModel.class);
            // 实现效果   根据回调接口 publish_done：关闭直播 publish 开启直播
            if (model != null){
                String action = model.getAction().get(0); //获取直播状态值
                String houseId = model.getId().get(0); //获取直播房间号
                if (action.equals("publish")){
                    System.out.println("开启直播状态");
                    //业务处理
                }else if (action.equals("publish_done")){
                    System.out.println("关闭直播状态");
                    //业务处理
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
