package com.yelang.shop.base.util;

/**
 * Created by qwz on 2017/1/25 23:34.
 * Project lw4Home
 * @author quweizhe
 * Package com.homebase.util
 *
 * @Doc 用来传递参数
 */
public class SystemContext {

    public SystemContext() {
        super();
    }

    private static ThreadLocal<String> fileName = new ThreadLocal<String>();

    public static String getFileName() {
        return fileName.get();
    }

    public static void setFileName(String _fileName) {
        SystemContext.fileName.set(_fileName);
    }

}
