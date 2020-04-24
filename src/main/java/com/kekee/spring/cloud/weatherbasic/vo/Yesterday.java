package com.kekee.spring.cloud.weatherbasic.vo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @Description Yesterday
 * @Ide IntelliJ IDEA
 * @Since 2020-04-24 12:51
 * @Author <a href="https://github.com/kekee0724">可可</a>
 */
@Getter
@Setter
public class Yesterday implements Serializable {
    private String date;
    private String high;
    private String fx;
    private String low;
    private String fl;
    private String type;
}
