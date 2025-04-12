package com.yourcompany.redisson.redismanager;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import java.util.concurrent.locks.Lock;

public class RedissManager {

    @Autowired
    RedissonClient redissonClient;

    @Bean
    public Lock createLock(String key){
        redissonClient.getLock(key);
        return redissonClient.getLock(key);
    }

}
