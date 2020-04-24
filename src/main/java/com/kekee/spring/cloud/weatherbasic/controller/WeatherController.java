package com.kekee.spring.cloud.weatherbasic.controller;

import com.kekee.spring.cloud.weatherbasic.service.WeatherDataService;
import com.kekee.spring.cloud.weatherbasic.vo.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname WeatherController
 * @Description TODO
 * @Ide IntelliJ IDEA
 * @Date 2020-04-24 21:44
 * @Author <a href="https://github.com/kekee0724">可可</a>
 */
@RestController
@RequestMapping("/weather")
public class WeatherController {
    @Autowired
    private WeatherDataService weatherDataService;

    @GetMapping("/cityId/{cityId}")
    public WeatherResponse getWeatherById(@PathVariable("cityId") String cityId) {
        return weatherDataService.getDataCityId(cityId);
    }
    @GetMapping("/cityName/{cityName}")
    public WeatherResponse getWeatherByName(@PathVariable("cityName") String cityName) {
        return weatherDataService.getDataCityName(cityName);
    }
}
