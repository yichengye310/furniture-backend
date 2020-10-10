package com.example.springboot.quartz;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Date;

@Component
public class Jobs {

    //表示每隔30秒
//    @Scheduled(fixedRate = 30000)
//    public void fixedRateJob() {
//        System.out.println("fixedRate 每隔30秒" + new Date());
//    }

    //表示每天8时30分0秒执行
    @Scheduled(cron = "0 0,30 0,8 ? * ? ")
    public void cronJob() {
        //执行数据库备份
        Process process;
        String cmd = "/data/backup.sh";//这里必须要给文件赋权限 chmod u+x fileName;
        try {
            // 使用Runtime来执行command，生成Process对象
            Runtime runtime = Runtime.getRuntime();
            process = runtime.exec(cmd);
            // 取得命令结果的输出流
            InputStream is = process.getInputStream();
            // 用一个读输出流类去读
            InputStreamReader isr = new InputStreamReader(is);
            // 用缓冲器读行
            BufferedReader br = new BufferedReader(isr);
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            //执行关闭操作
            is.close();
            isr.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(new Date() + " ...>>cron....");
    }
}