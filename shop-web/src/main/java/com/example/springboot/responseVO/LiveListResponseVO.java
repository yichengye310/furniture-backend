package com.example.springboot.responseVO;

import lombok.Data;

@Data
public class LiveListResponseVO {
    private Ret ret;
    private String requestId;
    private Integer code;
}
