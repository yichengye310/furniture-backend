package com.example.springboot.sendMessage.entity;

import lombok.Data;

/**
 * @description: 短信发送结果解析类
 * @author: SunZH
 * @time: 2020/3/20 0020 下午 5:14
 */
@Data
public class MessageResultEntity {

    private String sms_credits;

    private String status;

    private String send_id;

    private Integer fee;

    private String transactional_sms_credits;
}
