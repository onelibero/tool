package com.example.lettuce.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {
    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @GetMapping("/gu")
    public String get(){
        return "呵呵";
    }
}
