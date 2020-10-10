package com.example.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DateTest {
    @Test
    public void contextLoads(){
        System.out.println("当前时间戳："+System.currentTimeMillis()/1000);
        long time = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).parse("2020-06-21 14:40:00", new ParsePosition(0)).getTime()/1000;
        System.out.println("将来时间戳："+time);
    }

}