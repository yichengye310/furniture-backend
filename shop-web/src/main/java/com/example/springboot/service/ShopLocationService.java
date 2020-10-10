package com.example.springboot.service;


import com.example.springboot.entity.ShopLocation;
import com.example.springboot.entity.ShopLocationExample;
import com.example.springboot.mapper.ShopLocationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShopLocationService {

    @Autowired
    private ShopLocationMapper shopLocationMapper;

    public List<ShopLocation> getAllLocation(){
        List<ShopLocation> locations = new ArrayList<>();

        ShopLocationExample example = new ShopLocationExample();
//        example.createCriteria().get

        locations = shopLocationMapper.selectByExample(example);

        return locations;
    }
}
