package com.kekee.spring.cloud.weatherbasic.vo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @Description Forecast
 * @Ide IntelliJ IDEA
 * @Since 2020-04-24 12:52
 * @Author <a href="https://github.com/kekee0724">可可</a>
 */
@Getter
@Setter
public class Forecast implements Serializable {
    private String date;
    private String high;
    private String fengli;
    private String low;
    private String fengxiang;
    private String type;
}
