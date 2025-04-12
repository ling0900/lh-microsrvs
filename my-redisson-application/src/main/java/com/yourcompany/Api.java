package com.yourcompany;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {
   // 这种写法，运行启动类Main会出错。
   @Autowired
   Redisson redisson;


   // 这种写法，运行启动类Main不会出错。
//   @Autowired
//   RedissonClient redisson;
}
