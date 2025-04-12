package com.yourcompany;

import org.redisson.Redisson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {

    @Autowired
    Redisson redisson;

    @GetMapping("/a")
    public String get() {
        return "Hello";
    }
}
