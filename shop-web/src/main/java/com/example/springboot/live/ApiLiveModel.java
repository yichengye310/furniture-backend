package com.example.springboot.live;
import java.util.List;

public class ApiLiveModel {
    private List<String> action;
    private List<String> ip;
    private List<String> id;
    private List<String> app;
    private List<String> appname;
    private List<String> time;
    private List<String> usrargs;
    private List<String> node;

    public List<String> getAction() {
        return action;
    }

    public void setAction(List<String> action) {
        this.action = action;
    }

    public List<String> getIp() {
        return ip;
    }

    public void setIp(List<String> ip) {
        this.ip = ip;
    }

    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public List<String> getApp() {
        return app;
    }

    public void setApp(List<String> app) {
        this.app = app;
    }

    public List<String> getAppname() {
        return appname;
    }

    public void setAppname(List<String> appname) {
        this.appname = appname;
    }

    public List<String> getTime() {
        return time;
    }

    public void setTime(List<String> time) {
        this.time = time;
    }

    public List<String> getUsrargs() {
        return usrargs;
    }

    public void setUsrargs(List<String> usrargs) {
        this.usrargs = usrargs;
    }

    public List<String> getNode() {
        return node;
    }

    public void setNode(List<String> node) {
        this.node = node;
    }
}
