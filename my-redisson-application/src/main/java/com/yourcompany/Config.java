package com.yourcompany;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public ITest iTest(){
        return new TestImpl();
    }

}
