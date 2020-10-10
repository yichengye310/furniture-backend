package com.example.springboot.service;

import com.example.springboot.entity.UserAlreadyRobbed;
import com.example.springboot.mapper.UserAlreadyRobbedMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAlreadyRobbedService {
    @Autowired
    private UserAlreadyRobbedMapper userAlreadyRobbedMapper;

    public List<UserAlreadyRobbed> getUserAlreadyRobbed(UserAlreadyRobbed userAlreadyRobbed){
        return userAlreadyRobbedMapper.selectList(userAlreadyRobbed);
    }
}
