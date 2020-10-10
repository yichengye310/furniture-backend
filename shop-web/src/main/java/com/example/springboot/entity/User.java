package com.example.springboot.entity;

import lombok.Data;

@Data
public class User {

    private String id;

    private String username;

    private String password;

    private Integer age;
}