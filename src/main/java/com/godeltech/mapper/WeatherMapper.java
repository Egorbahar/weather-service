package com.godeltech.mapper;

import com.godeltech.dto.WeatherResponseDto;
import com.godeltech.model.Weather;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface WeatherMapper {
    @Mapping(target = "speedWind", source = "speedWind")
    @Mapping(target = "visibility" , source = "visibility")
    WeatherResponseDto toWeatherResponseDto(Weather weather);
}
