package com.godeltech.service.impl;

import com.godeltech.dto.WeatherResponseDto;
import com.godeltech.service.WeatherService;
import com.godeltech.mapper.WeatherMapper;
import com.godeltech.model.Weather;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@RequiredArgsConstructor
public class WeatherServiceImpl implements WeatherService {
    private final RestTemplate restTemplate;
    private final WeatherMapper weatherMapper;

    @Override
    public WeatherResponseDto getWeatherByCity(String city) {
        String url = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=dbe3d85134f6d492b4b99e8b67bbef05";
        Weather weather = restTemplate.getForObject(url, Weather.class);
        return weatherMapper.toWeatherResponseDto(weather);
    }
}
