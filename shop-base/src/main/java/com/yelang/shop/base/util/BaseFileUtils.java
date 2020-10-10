package com.yelang.shop.base.util;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.Calendar;
import java.util.Properties;

/**
 * Created by qwz on 2017/1/29 10:53.
 * Project lw4Home
 *
 * @author quweizhe
 * Package com.homebase.util
 * @Doc 文件操作工具类
 */
public class BaseFileUtils {

    private static final Logger LOGGER = LoggerFactory.getLogger(BaseFileUtils.class);

    private static String baseDir;
    private static String logicUrl;
    private static String branchDir;
    private static String storageUrl;

    static {
        Properties properties = new Properties();
        try {
//            方式一：存在缓存问题
//            InputStream in = BaseFileUtils.class.getResourceAsStream("/init.properties");
//            方式二：实时刷新
            InputStream in = new BufferedInputStream(
                    new FileInputStream(BaseFileUtils.class.getResource("/init.properties").getPath()));
            properties.load(in);
            baseDir = properties.getProperty("baseDir");
            logicUrl = properties.getProperty("logicUrl");
            branchDir = properties.getProperty("branchDir");
            storageUrl= properties.getProperty("storageUrl");
            if (in != null) {
                in.close();
            }
        } catch (IOException e) {
            LOGGER.error("获取存储路径出错：{}", e.getMessage());
        }
    }

    /**
     * 保存图片共用方法
     * @param file 文件流
     * @param groupCode 组别码
     * @param uid 用户id
     * @return filePath 持久化的图片逻辑地址
     */
    public static String uploadImg(MultipartFile file, String groupCode, Long uid) {
        String oldName = file.getOriginalFilename();
        String suffix = StringUtils.substring(oldName, StringUtils.lastIndexOf(oldName, "."));
        String name = DigestUtils.md5Hex(System.currentTimeMillis() + uid + "") + suffix;
        String filePath = File.separator + "oa" + File.separator + "project" + File.separator + groupCode + File.separator + (Calendar.getInstance().get(Calendar.MONTH) + 1) + File.separator + name;
        String realPath = storageUrl  + filePath;
        try {
            FileUtils.copyInputStreamToFile(file.getInputStream(), new File(realPath));
        } catch (IOException e) {
            LOGGER.error("上传文件出错：{},{},{}", realPath, filePath, e.getMessage());
            return Code.NULL_STR;
        }
        return filePath;
    }

    /**
     * 保存文件
     * @param file 文件流
     * @param newName 自定义文件名称
     * @param projectId 项目id
     * @param uid 用户id
     * @return filePath 持久化的文件逻辑地址
     */
    public static String uploadFile(MultipartFile file, String newName, String projectId, Long uid) {
        String oldName = file.getOriginalFilename();
        String suffix = StringUtils.substring(oldName, StringUtils.lastIndexOf(oldName, "."));
        String name = newName+"_"+DigestUtils.md5Hex(System.currentTimeMillis() + uid + "") + suffix;
        String filePath = File.separator + "oa" + File.separator + "project" + File.separator + projectId + File.separator + (Calendar.getInstance().get(Calendar.MONTH) + 1) + File.separator + name;;
        String realPath = storageUrl + filePath;
        try {
            FileUtils.copyInputStreamToFile(file.getInputStream(), new File(realPath));
        } catch (IOException e) {
            LOGGER.error("上传文件出错：{},{},{}", realPath, filePath, e.getMessage());
            return Code.NULL_STR;
        }
        return filePath;
    }


    /**
     * 删除指定路径的文件，成功返回true，失败返回false
     * @param sPath //指定路径
     * @return
     */
    public static boolean deleteFile(String type,String sPath) {
        if(type.equals("img"))
            sPath=baseDir+"/images/"+sPath;
        else if(type.equals("app"))
            sPath=baseDir+sPath;
        boolean flag = false;
        File file = new File(sPath);
        // 路径为文件且不为空则进行删除
        if (file.isFile() && file.exists()) {
            file.delete();
            flag = true;
        }
        return flag;
    }

}
