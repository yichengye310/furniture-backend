package com.yelang.shop.base.util;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

//import com.sun.image.codec.jpeg.JPEGCodec;
//import com.sun.image.codec.jpeg.JPEGEncodeParam;
//import com.sun.image.codec.jpeg.JPEGImageEncoder;

public class ImgCompressUtil {
    /**
     * 
     * @Title: getFileFromMultipartFile
     * @Description: 根据传入高度和宽度，0.6的压缩率压缩图片
     * @param @param fileCover
     * @param @param temSrc
     * @param @param width
     * @param @param heigth
     * @param @return   
     * @return byte[] 
     * @author yanlei 2016年7月29日 
     * @throws
     */
    public static byte[] getFileFromMultipartFile(byte[] fileCoverByte, String temSrc, int width, int heigth, float scom) {
        // boolean isSuccess = true;
        File tempFile;
        BufferedOutputStream outStream = null;
        try {
            tempFile = new File(temSrc);
            FileOutputStream fstream = new FileOutputStream(tempFile);
            outStream = new BufferedOutputStream(fstream);
            outStream.write(fileCoverByte);
        } catch (Exception e1) {
            return null;
        } finally {
            if (outStream != null) {
                try {
                    outStream.close();
                } catch (IOException e1) {
                }
            }
        }
        try {
            zipImageFile(tempFile.getPath(), width, heigth, scom, "");
        } catch (Exception e) {
            return null;
        }
        tempFile = new File(temSrc);
        try {
            FileInputStream stream = new FileInputStream(tempFile);
            ByteArrayOutputStream out = new ByteArrayOutputStream(1024);
            byte[] b = new byte[1024];
            int n;
            while ((n = stream.read(b)) != -1)
                out.write(b, 0, n);
            stream.close();
            out.close();
            tempFile.delete();
            return out.toByteArray();
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 直接指定压缩后的宽高：
     * (先保存原文件，再压缩、上传)
     * 壹拍项目中用于二维码压缩
     * @param oldFile 要进行压缩的文件全路径
     * @param width 压缩后的宽度
     * @param height 压缩后的高度
     * @param quality 压缩质量
     * @param smallIcon 文件名的小小后缀(注意，非文件后缀名称),入压缩文件名是yasuo.jpg,则压缩后文件名是yasuo(+smallIcon).jpg
     * @return 返回压缩后的文件的全路径
     */
    public static String zipImageFile(String oldFile, int width, int height, float quality, String smallIcon) {
        if (oldFile == null) {
            return null;
        }
        String newImage = null;
        try {
            File file = new File(oldFile);
            Image src = ImageIO.read(file);
            int srcHeight = src.getHeight(null);
            int srcWidth = src.getWidth(null);
            if (0 == width)
                width = srcWidth;
            if (0 == height)
                height = srcHeight;
            /**对服务器上的临时文件进行处理 */
            Image srcFile = ImageIO.read(new File(oldFile));
            /** 宽,高设定 */
            BufferedImage tag = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            tag.getGraphics().drawImage(srcFile, 0, 0, width, height, null);
            String filePrex = oldFile.substring(0, oldFile.indexOf('.'));
            /** 压缩后的文件名 */
            newImage = filePrex + smallIcon + oldFile.substring(filePrex.length());
            /** 压缩之后临时存放位置 */
            //JDK1.6
//            FileOutputStream out = new FileOutputStream(newImage);
//            JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
//            JPEGEncodeParam jep = JPEGCodec.getDefaultJPEGEncodeParam(tag);
//            /** 压缩质量 */
//            jep.setQuality(quality, true);
//            encoder.encode(tag, jep);
//            out.close();
            
            //JDK1.7
//            ImageIO.write(tag, filePrex, new File(newImage));
            
        } catch (FileNotFoundException e) {
        	
        } catch (IOException e) {
        	
        }
        return newImage;
    }
}
