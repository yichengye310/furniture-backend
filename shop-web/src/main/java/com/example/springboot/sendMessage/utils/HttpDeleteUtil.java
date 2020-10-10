package com.example.springboot.sendMessage.utils;

import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.annotation.NotThreadSafe;

import java.net.URI;


/**
 * @description: 类
 * @author: SunZH
 * @time: 2020/3/19 0019 上午 11:37
 */
@NotThreadSafe
public class HttpDeleteUtil extends HttpEntityEnclosingRequestBase {
    public static final String METHOD_NAME = "DELETE";
    public String getMethod() { return METHOD_NAME; }

    public HttpDeleteUtil(final String uri) {
        super();
        setURI(URI.create(uri));
    }
    public HttpDeleteUtil(final URI uri) {
        super();
        setURI(uri);
    }
    public HttpDeleteUtil() { super(); }
}
