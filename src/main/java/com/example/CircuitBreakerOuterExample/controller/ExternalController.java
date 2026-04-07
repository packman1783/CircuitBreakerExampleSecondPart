package com.example.CircuitBreakerOuterExample.controller;

import com.example.CircuitBreakerOuterExample.dto.ExternalResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ExternalController {

    @GetMapping("/data")
    public ExternalResponse getData() {
        return new ExternalResponse("Внешний сервис (8081) доступен и работает корректно");
    }
}
