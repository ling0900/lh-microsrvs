package com.yourcompany.redisson.config;

import com.yourcompany.redisson.redismanager.RedissManager;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
public class EnhancedRedissonAutoConfiguration {

   @Bean
   public RedissManager redissManager() {
       return new RedissManager();
   }
}
