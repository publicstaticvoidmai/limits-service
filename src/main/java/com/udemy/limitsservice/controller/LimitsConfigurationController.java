package com.udemy.limitsservice.controller;

import com.udemy.limitsservice.Configuration;
import com.udemy.limitsservice.model.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitsFromConfig() {
        return new LimitConfiguration(configuration.getMinimum(),configuration.getMaximum());
    }

    @GetMapping("/hello")
    public String test() {
        return "shit";
    }


}

