package com.kekee.spring.cloud.weatherbasic.vo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @Description WeatherResponse
 * @Ide IntelliJ IDEA
 * @Since 2020-04-24 15:40
 * @Author <a href="https://github.com/kekee0724">可可</a>
 */
@Getter
@Setter
public class WeatherResponse implements Serializable {
    private Weather data;
    private Integer status;
    private String desc;
}
