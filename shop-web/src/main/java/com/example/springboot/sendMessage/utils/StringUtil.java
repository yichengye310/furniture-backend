package com.example.springboot.sendMessage.utils;


import java.io.File;
import java.io.FileInputStream;
//import sun.misc.BASE64Encoder;
import org.apache.commons.codec.binary.Base64;
/**
 * @description: 类
 * @author: SunZH
 * @time: 2020/3/19 0019 上午 11:00
 */
public class StringUtil {
    public static boolean isNullOrEmpty(String text) {
        return text == null || text.trim().isEmpty();
    }

    public static String encodeBase64File(String path) throws Exception {
        File file = new File(path);
        ;
        FileInputStream inputFile = new FileInputStream(file);
        byte[] buffer = new byte[(int) file.length()];
        inputFile.read(buffer);
        inputFile.close();
        //return new BASE64Encoder().encode(buffer);
        return Base64.encodeBase64String(buffer);
    }

    public String replaceSpecialStr(String str) {
        str = str.replaceAll("\\\\", "").replaceAll("\n", "").replaceAll("\r", "").replaceAll("\"", "");
        return str;
    }
}
