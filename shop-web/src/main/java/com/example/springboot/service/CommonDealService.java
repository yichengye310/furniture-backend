package com.example.springboot.service;

import com.example.springboot.entity.StartUp;
import com.example.springboot.entity.Version;
import com.example.springboot.entity.VersionExample;
import com.example.springboot.mapper.StartUpMapper;
import com.example.springboot.mapper.VersionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommonDealService {
    @Autowired
    private VersionMapper versionMapper;
    @Autowired
    private StartUpMapper startUpMapper;

    public Version checkVersion(Integer versionID){
        VersionExample versionExample = new VersionExample();
        versionExample.createCriteria().andVersionIDGreaterThan(versionID);
        versionExample.setOrderByClause("versionID DESC");
        List<Version> versions = versionMapper.selectByExample(versionExample);
        if(versions!=null && versions.size()>0){
            return versions.get(0);
        }
        return null;
    }
    public StartUp getStartImg(){
        return startUpMapper.selectByPrimaryKey(1);
    }
    public StartUp getLivePostersImg(){
        return startUpMapper.selectByPrimaryKey(2);
    }
}
