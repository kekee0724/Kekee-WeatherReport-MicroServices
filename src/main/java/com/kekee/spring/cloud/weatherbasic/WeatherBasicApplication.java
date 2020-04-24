package com.kekee.spring.cloud.weatherbasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class WeatherBasicApplication {
	public static void main(String[] args) {
		SpringApplication.run(WeatherBasicApplication.class, args);
	}

}
