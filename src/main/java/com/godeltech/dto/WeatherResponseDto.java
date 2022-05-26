package com.godeltech.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class WeatherResponseDto {
    private Double speedWind;
    private Integer visibility;
}
