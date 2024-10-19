package com.vansh.journalApp.Service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;


@SpringBootTest
public class RedisTests {

    @Autowired
    private RedisTemplate redisTemplate;


    @Test
    void testSendMail() {
        redisTemplate.opsForValue().set("email","akshitatomar0@gmail.com");
        Object salary = redisTemplate.opsForValue().get("salary");
        int a = 1;
    }
}
