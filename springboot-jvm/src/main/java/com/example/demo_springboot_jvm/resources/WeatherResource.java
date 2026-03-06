package com.example.demo_springboot_jvm.resources;

import com.example.demo_springboot_jvm.clients.weather.IWeatherClient;
import com.example.demo_springboot_jvm.clients.weather.OpenMeteoForecastResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/weather")
public class WeatherResource {

    private final IWeatherClient weatherClient;

    public WeatherResource(IWeatherClient weatherClient) {
        this.weatherClient = weatherClient;
    }

    @GetMapping
    public Mono<OpenMeteoForecastResponse> weather() {
        double latitude = 52.52;
        double longitude = 13.41;
        return weatherClient.getForecast(latitude, longitude, "temperature_2m");
    }
}
