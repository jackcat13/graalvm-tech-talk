package com.example.demo_springboot_graalvm.clients.weather;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;
import reactor.core.publisher.Mono;

public interface IWeatherClient {

    @GetExchange("/forecast")
    Mono<OpenMeteoForecastResponse> getForecast(@RequestParam double latitude, @RequestParam double longitude, @RequestParam String hourly);
}
