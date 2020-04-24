package com.kekee.spring.cloud.weatherbasic.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Classname Rest Configuration
 * @Description TODO
 * @Ide IntelliJ IDEA
 * @Date 2020-04-24 23:24
 * @Author <a href="https://github.com/kekee0724">可可</a>
 */
@Configuration
public class RestConfiguration {
    @Autowired
    private RestTemplateBuilder builder;
    @Bean
    public RestTemplate restTemplate(){
        return builder.build();
    }
}
