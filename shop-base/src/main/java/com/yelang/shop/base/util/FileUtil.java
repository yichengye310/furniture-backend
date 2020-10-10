package com.yelang.shop.base.util;

import com.yelang.shop.base.enumType.ImgType;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.Properties;

/**
 * Created by qwz on 2017/1/29 10:53.
 * Project lw4Home
 *
 * @author quweizhe
 *         Package com.homebase.util
 * @Doc 文件操作工具类
 */
public class FileUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(FileUtil.class);

    private static String storageUrl;
    private static String logicUrl;
    private static String branchDirectory;

    static {
        Properties properties = new Properties();
        try {
//            方式一：存在缓存问题
//            InputStream in = FileUtil.class.getResourceAsStream("/init.properties");
//            方式二：实时刷新
            InputStream in = new BufferedInputStream( new FileInputStream(FileUtil.class.getResource("/init.properties").getPath()));
            properties.load(in);
            storageUrl = properties.getProperty("storageUrl");
            logicUrl = properties.getProperty("logicUrl");
            branchDirectory = properties.getProperty("branchDirectory");
//            LOGGER.error("获取文件地址：{}", branchDirectory);
            if (in != null) {
                in.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String uploadImg(MultipartFile file, ImgType type, Long userId) {
        String oldName = file.getOriginalFilename();
        String suffix = StringUtils.substring(oldName, StringUtils.lastIndexOf(oldName, "."));
        String name = type.getTypeName() + userId + Code.UNDER_SCORE + System.currentTimeMillis() + suffix;
        String realPath = storageUrl + type.getTypeName() + branchDirectory + File.separator + name;
        System.out.println("realPath"+realPath);
        String filePath = logicUrl + type.getTypeName() + branchDirectory + name;
        try {
            FileUtils.copyInputStreamToFile(file.getInputStream(), new File(realPath));
        } catch (IOException e) {
            LOGGER.error("上传文件出错：{},{},{}", realPath, filePath, e.getMessage());
            return Code.NULL_STR;
        }
        SystemContext.setFileName(name);
        return filePath;
    }



    public ResponseEntity<byte[]> download(String fileName, File file) throws IOException {
        String dfileName = new String(fileName.getBytes("gb2312"), "iso8859-1");
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        headers.setContentDispositionFormData("attachment", dfileName);
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), headers, HttpStatus.CREATED);
    }

}
