package com.example.springboot.sendMessage.lib.base;

import com.example.springboot.sendMessage.entity.DataStore;

/**
 * @description: 包装类 ADDRESSBOOKMail、ADDRESSBOOKMessage、MAILSend、MAILXSend、MESSAGEXsend等父类
 * @author: SunZH
 * @time: 2020/3/19 0019 上午 11:06
 */
public abstract  class SenderWapper {

    protected DataStore requestData = new DataStore();

    public abstract ISender getSender();
}
