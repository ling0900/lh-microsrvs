package com.yourcompany.servivce;

import com.yourcompany.TestImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@DependsOn(value = {"iTest"})
public class ZApi {
    @Autowired
//    @Lazy
    private TestImpl test;
}
