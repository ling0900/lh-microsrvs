package com.yourcompany;

import com.yourcompany.redisson.redismanager.RedissManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ComponentScan(value = {
        "com.yourcompany"


})
public class Api {

    @Autowired
    RedissManager redissManager;

    @GetMapping("/a")
    public String get() {
        redissManager.createLock("a");
        return "Hello";
    }
}
