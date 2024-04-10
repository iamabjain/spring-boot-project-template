package ru.gozhan.javaprojecttemplate.config;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Endpoint {
    HEALTH("/actuator/health");

    private final String path;
}
