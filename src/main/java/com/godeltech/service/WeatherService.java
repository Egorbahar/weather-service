package com.godeltech.service;

import com.godeltech.dto.WeatherResponseDto;

public interface WeatherService {
    WeatherResponseDto getWeatherByCity(String city);
}
