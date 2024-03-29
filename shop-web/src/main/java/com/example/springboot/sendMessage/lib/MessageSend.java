package com.example.springboot.sendMessage.lib;

import com.example.springboot.sendMessage.config.AppConfig;
import com.example.springboot.sendMessage.lib.base.ISender;
import com.example.springboot.sendMessage.lib.base.SenderWapper;

/**
 * @description: message/send API 不仅提供强大的短信发送功能,
 *              并在API中集成了地址薄发送功能。你可以通过设定一些参数来确定 API 以哪种模式发送。
 * @author: SunZH
 * @time: 2020/3/19 0019 上午 11:29
 */
public class MessageSend extends SenderWapper {
    protected AppConfig config = null;
    public static final String TO = "to";
    public static final String CONTENT = "content";

    public MessageSend(AppConfig config) {

        this.config = config;

    }

    public void addTo(String to) {
        requestData.addWithComma(TO, to);;
    }

    public void addContent(String content){
        requestData.addWithComma(CONTENT, content);
    }


    @Override
    public ISender getSender() {
        return new  Message(this.config);
    }

    public String send(){
        return getSender().send(requestData);
    }

}
