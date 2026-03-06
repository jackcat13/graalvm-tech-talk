package com.example.demo_springboot_graalvm.config;

import com.example.demo_springboot_graalvm.clients.weather.IWeatherClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
class HttpServicesConfig {

    @Bean
    public IWeatherClient weatherWebClient(@Value("${clients.weather.base-url}") String weatherBaseUrl) {
        WebClient client = WebClient
                .builder()
                .baseUrl(weatherBaseUrl)
                .build();
        return HttpServiceProxyFactory.builderFor(WebClientAdapter.create(client)).build().createClient(IWeatherClient.class);
    }
}