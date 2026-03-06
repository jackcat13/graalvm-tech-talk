package com.example.demo_springboot_graalvm.weather;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public record OpenMeteoForecastResponse(
        double latitude,
        double longitude,
        @JsonProperty("generationtime_ms")
        double generationTimeMs,
        @JsonProperty("utc_offset_seconds")
        int utcOffsetSeconds,
        String timezone,
        @JsonProperty("timezone_abbreviation")
        String timezoneAbbreviation,
        double elevation,
        @JsonProperty("hourly_units")
        HourlyUnits hourlyUnits,
        Hourly hourly
) {
    public record HourlyUnits(
            String time,
            @JsonProperty("temperature_2m")
            String temperature2m
    ) {}

    public record Hourly(
            List<String> time,
            @JsonProperty("temperature_2m")
            List<Double> temperature2m
    ) {}
}