package com.yourcompany;

import com.yourcompany.servivce.TestImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@DependsOn(value = {"iTest"})
public class ZApi {
    @Autowired
    //@Lazy

    private TestImpl test;
}
