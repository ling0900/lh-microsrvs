package com.yourcompany.con;

import com.yourcompany.servivce.ITest;
import com.yourcompany.servivce.TestImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public ITest iTest(){
        return new TestImpl();
    }

}
