package com.example.springboot;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JWTTokenTest {
    @Test
    public void contextLoads(){
        String token="";
        token= JWT.create().withAudience("d35dc963-1f46-4127-823e-403b2f497953")
                .sign(Algorithm.HMAC256("A7B348616FAA3994"));
        System.out.println("token"+token);
    }

}