package com.example.springboot.websocket;

import com.alibaba.fastjson.JSON;
import com.example.springboot.dto.CouPonModelDto;
import com.example.springboot.entity.Product;
import com.example.springboot.entity.ProductLimitedTime;
import org.springframework.stereotype.Component;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * writer: zhuyan
 * Time: 2020-5-14 13:00
 * Intent: webSocket服务器
 */
@ServerEndpoint("/websocket/chat/{roomName}/{userName}")
@Component
public class WebSocketServer {

    // 使用map来收集session，key为roomName，value为同一个房间的用户集合
    // concurrentMap的key不存在时报错，不是返回null
    private static final Map<String, Set<Session>> rooms = new ConcurrentHashMap();
    private static final Map<String, String> userNameList = new ConcurrentHashMap();
    /**静态变量，用来记录当前在线连接数。应该把它设计成线程安全的。*/
    private static int onlineCount = 0;
    private static Map<String,Integer> roomMap = new HashMap<>();

    @OnOpen
    public void connect(@PathParam("roomName") String roomName,@PathParam("userName") String userName, Session session) throws Exception {
        // 将session按照房间名来存储，将各个房间的用户隔离
        if (!rooms.containsKey(roomName)) {
            // 创建房间不存在时，创建房间
            Set<Session> room = new HashSet<Session>();
            // 添加用户
            room.add(session);
            rooms.put(roomName, room);
            //roomMap.put(roomName,0);
            roomMap.put(roomName,(int)(Math.random()*(1000-500+1)+500));//创建直播间时生成500-1000之间的一个随机的在线人数
        } else {
            // 房间已存在，直接添加用户到相应的房间
            rooms.get(roomName).add(session);
            roomMap.put(roomName,Integer.valueOf(roomMap.get(roomName))+1);
        }
        System.err.println("userName"+userName);
        System.out.println("a client has connected!");
    }

    @OnClose
    public void disConnect(@PathParam("roomName") String roomName,@PathParam("userName") String userName, Session session) {
        rooms.get(roomName).remove(session);
        roomMap.put(roomName,Integer.valueOf(roomMap.get(roomName))-1);
        System.out.println("a client has disconnected!");
    }

    @OnMessage
    public static void receiveMsg(@PathParam("roomName") String roomName, @PathParam("userName") String userName,
                                  String msg, Session session) throws Exception {
        // 此处应该有html过滤
        msg = userName + ":" + msg;
        System.out.println(msg);
        // 接收到信息后进行广播
        broadcast(roomName, msg);
    }

    /**
     * 自定义推送
     * @param roomName 房间名称
     * @param userName 用户名（手机号）
     * @param msg 信息
     * @param pushType 推送类型 1直播聊天 2已下单 3正在去购买 4进入直播间 5主播推荐产品
     * @param userType 用户类型 1：普通用户；2：会员 3：经销商 4商家 5主播
     * @throws IOException
     */
    public static void sendInfo(@PathParam("roomName") String roomName, @PathParam("userName") String userName,
                                String msg, Integer pushType, Integer userType, Integer productID,Integer productLimitedTimeID,Integer couponID){
        Map<String,Object> map = new HashMap<>();
        switch (pushType){
            //直播聊天
            case 1:
                if(userType!=null && userType!=5){
                    msg = userName.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2") + ":" + msg;
                }
                break;
            //2已下单
            case 2:
                msg = userName.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2") +"   已下单热销商品！";
                break;
            //3正在去购买
            case 3:
                msg = userName.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2") +"   正在去购买";
                break;
            //4进入直播间
            case 4:
                msg = userName.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2") +"   进入直播间";
                map.put("onlineNum",Integer.valueOf(roomMap.get(roomName)));
                break;
            case 5:msg = "主播推荐了爆款产品！看谁手速最快~";
                if(productID!=null){
                    Product product = CodeMapUtils.queryProduct(productID);
                    map.put("product",product);
                }
                if(productLimitedTimeID!=null){
                    ProductLimitedTime productLimitedTime = CodeMapUtils.queryProductLimitedTime(productLimitedTimeID);
                    map.put("productLimitedTime",productLimitedTime);
                }
                break;
            case 6: msg = "关闭了直播";
                map.put("isOpenLive",false);
                break;
            case 7: msg = "发放优惠券";
                CouPonModelDto couponModel = CodeMapUtils.queryCouponModel(couponID);
                map.put("couponModel",couponModel);
                break;
            case 8: msg = userName.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2") +"   点了赞";
                break;
            default:break;
        }
        map.put("pushType",pushType);
        map.put("msg",msg);
        map.put("userType",userType);
        //JSONArray jArray = new JSONArray();
        //jArray.add(map);
        //String str = jArray.toString();
        String  str= JSON.toJSONString(map);
        System.out.println(msg);
        // 接收到信息后进行广播
        try {
            broadcast(roomName, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 按照房间名进行广播
    public static void broadcast(String roomName, String msg) throws Exception {
        for (Session session : rooms.get(roomName)) {
            session.getBasicRemote().sendText(msg);
        }
    }

}