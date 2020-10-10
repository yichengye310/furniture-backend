package com.example.springboot.responseVO;

import lombok.Data;

import java.util.List;

@Data
public class Ret {
    private Integer pnum;
    private List<LiveResponse> list;
    private Integer totalRecords;
    private Integer totalPnum;
    private Integer records;
}
