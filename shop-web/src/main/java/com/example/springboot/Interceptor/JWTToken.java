package com.example.springboot.Interceptor;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.example.springboot.entity.UserInfo;

/**
 * token的生成方法
 */
public class JWTToken {
    /**
     * token的生成方法
     * @return
     */
    public String getToken(String Account,String Pwd) {
        String token="";
        token= JWT.create().withAudience(Account)
                .sign(Algorithm.HMAC256(Pwd));
        return token;
    }
}
