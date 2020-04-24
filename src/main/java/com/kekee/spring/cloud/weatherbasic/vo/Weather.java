package com.kekee.spring.cloud.weatherbasic.vo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * @Description Weather
 * @Ide IntelliJ IDEA
 * @Since 2020-04-24 12:47
 * @Author <a href="https://github.com/kekee0724">可可</a>
 */
//：@Data作用于类上，是以下注解的集合：@ToString @EqualsAndHashCode @Getter @Setter @RequiredArgsConstructor
@Getter
@Setter
public class Weather implements Serializable {
    private Yesterday yesterday;
    private String city;
    private List<Forecast> forecast;
    private String ganmao;
    private String wendu;
}
