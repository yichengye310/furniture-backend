package com.example.springboot.entity;

import lombok.Data;

@Data
public class Version {
    private Integer versionID;

    private String content;

    private String versionNum;

    private String downloadUrl;
}