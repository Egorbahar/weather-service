package com.godeltech.controller;

import com.godeltech.dto.WeatherResponseDto;
import com.godeltech.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class WeatherController {
    private final WeatherService weatherService;

    @GetMapping("/weather")
    public ResponseEntity<WeatherResponseDto> getCurrentWeather(@RequestParam String city) {
        return new ResponseEntity<>(weatherService.getWeatherByCity(city), HttpStatus.OK);
    }
}

