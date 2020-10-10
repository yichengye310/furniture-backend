package com.example.springboot.sendMessage;

import com.example.springboot.sendMessage.config.AppConfig;
import com.example.springboot.sendMessage.entity.MessageResultEntity;
import com.example.springboot.sendMessage.lib.MessageSend;
import com.example.springboot.sendMessage.utils.ConfigLoader;
import com.google.gson.Gson;


/**
 * @description: 短信发送类
 * @author: SunZH
 * @time: 2020/3/19 0019 上午 10:32
 */
public class MessageSendHandler {
    public String sendMessage(String phoneNum, String content) {
        AppConfig config = ConfigLoader.load(ConfigLoader.ConfigType.Message);
        MessageSend message = new MessageSend(config);
        message.addTo(phoneNum);
        message.addContent(content);

        String res = message.send();
        Gson gson = new Gson();
        MessageResultEntity entity = gson.fromJson(res, MessageResultEntity.class);

        return entity.getStatus();
    }
}
