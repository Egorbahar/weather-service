package com.godeltech.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@Getter
@Setter
public class Weather {
    private Double speedWind;
    @JsonProperty("visibility")
    private Integer visibility;

    @JsonProperty("wind")
    private void unpackWind(Map<String, Object> wind) {
        this.speedWind = Double.parseDouble(wind.get("speed").toString());
    }
}
