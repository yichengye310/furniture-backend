package com.example.springboot.responseVO;

import com.example.springboot.entity.WYYXLive;
import lombok.Data;

@Data
public class LiveResponse {
    private WYYXLive live;
    private Integer needRecord;
    private String uid;
    private Integer duration;
    private Integer status;
    private String name;
    private String filename;
    private Integer format;
    private Integer type;
    private String ctime;
    private String cid;
    private Integer recordStatus;
}
