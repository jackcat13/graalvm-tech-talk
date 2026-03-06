package com.example.demo_springboot_jvm.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/health")
public class HealthResource {

    @GetMapping
    public Mono<String> health() {
        return Mono.just("OK");
    }
}
