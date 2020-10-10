package com.example.springboot.controller;
import com.example.springboot.websocket.WebSocketServer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin
@Controller
@RequestMapping("/socket")
public class WebsocketController {

    /**
     * 推送数据接口
     * @param roomName 直播间标题（唯一）
     * @param userName 用户手机号
     * @param msg 信息
     * @param pushType 推送类型 1直播聊天 2已下单 3正在去购买 4进入直播间 5主播推荐产品(产品ID必填)
     * @param userType
     * @return
     */
    @ResponseBody
    @PostMapping("/push")
    public Map pushToWeb(@RequestParam(value = "roomName") String roomName,
                         @RequestParam(value = "userName") String userName,
                         @RequestParam(value = "msg",required = false) String msg,
                         @RequestParam(value = "pushType") Integer pushType,
                         @RequestParam(value = "userType",required = false) Integer userType,
                         @RequestParam(value = "productID",required = false) Integer productID,
                         @RequestParam(value = "productLimitedTimeID",required = false) Integer productLimitedTimeID,
                         @RequestParam(value = "couponID",required = false) Integer couponID) {
        Map result = new HashMap();
        WebSocketServer.sendInfo(roomName,userName,msg,pushType,userType,productID,productLimitedTimeID,couponID);
        result.put("code", 200);
        result.put("msg", "success");
        return result;
    }
//    返回示例
//    [{"msg":"18896596369:666666！！！！！","userType":1,"pushType":1}]
//
//    [{"msg":"18896596369已下单直播热销商品~~~","userType":2,"pushType":2}]
//
//    [{"msg":"18896596369正在去下单~~~","userType":3,"pushType":3}]
}
