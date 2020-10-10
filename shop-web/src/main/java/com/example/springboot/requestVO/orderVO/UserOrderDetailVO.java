package com.example.springboot.requestVO.orderVO;

import lombok.Data;

import java.util.List;

/**
 * @description: 类
 * @author: SunZH
 * @time: 2020/4/22 0022 上午 9:56
 */

@Data
public class UserOrderDetailVO {
    private List<Integer> orderIDList;
}
