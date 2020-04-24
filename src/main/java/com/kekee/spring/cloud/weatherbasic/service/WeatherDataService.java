package com.kekee.spring.cloud.weatherbasic.service;

import com.kekee.spring.cloud.weatherbasic.vo.WeatherResponse;
import org.springframework.stereotype.Service;

/**
 * @Description WeatherDataService
 * @Ide IntelliJ IDEA
 * @Since 2020-04-24 15:47
 * @Author <a href="https://github.com/kekee0724">可可</a>
 */
//@Service
public interface WeatherDataService {
    /**
     *
     *@Description //TODO 根据城市ID查询天气数据  @Date 2020/4/24 17:15
     *@param [cityId]
     *@return com.kekee.spring.cloud.weatherbasic.vo.WeatherResponse
     */
    WeatherResponse getDataCityId(String cityId);
    /**
     *
     *@Description //TODO 根据城市名称查询天气数据  @Date 2020/4/24 17:15
     *@param [cityName]
     *@return com.kekee.spring.cloud.weatherbasic.vo.WeatherResponse
     */
    WeatherResponse getDataCityName(String cityName);

}
