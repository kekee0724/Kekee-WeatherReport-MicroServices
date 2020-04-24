package com.kekee.spring.cloud.weatherbasic.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kekee.spring.cloud.weatherbasic.vo.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

/**
 * @Classname WeatherDataServiceImpl
 * @Description TODO
 * @Ide IntelliJ IDEA
 * @Date 2020-04-24 17:19
 * @Author <a href="https://github.com/kekee0724">可可</a>
 */
@Service
public class WeatherDataServiceImpl implements WeatherDataService {
    private static final String WEATHER_URI = "http://wthrcdn.etouch.cn/weather_mini?";
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public WeatherResponse getDataCityId(String cityId) {
        String uri = WEATHER_URI + "citykey=" + cityId;
        System.out.println(uri);
        return this.doGetWeather(uri);
    }

    @Override
    public WeatherResponse getDataCityName(String cityName) {
        String uri = WEATHER_URI + "city=" + cityName;
        System.out.println(uri);
        return this.doGetWeather(uri);
    }

    private WeatherResponse doGetWeather(String uri) {
        ResponseEntity<String> respString = restTemplate.getForEntity(uri, String.class);
        ObjectMapper mapper = new ObjectMapper();
        WeatherResponse resp = null;
        String strBody = null;
        if (respString.getStatusCodeValue() == 200) {
            strBody = respString.getBody();
        }
        try {
            resp = mapper.readValue(strBody, WeatherResponse.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(resp);
        return resp;
    }
}
