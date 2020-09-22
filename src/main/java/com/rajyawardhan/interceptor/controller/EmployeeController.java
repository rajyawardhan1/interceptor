package com.rajyawardhan.interceptor.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private static final Map<String, String> EMP_CITY_MAP = Collections.singletonMap("aman", "indore");
    private static final String ERROR_MESSAGE = "Employee not found";

    @GetMapping("/name/{empName}")
    public String getContactCityName(@PathVariable String empName) {
        return EMP_CITY_MAP.getOrDefault(empName, ERROR_MESSAGE);
    }

    @GetMapping("/game")
    public String getGame() {
        return "game";
    }
}
