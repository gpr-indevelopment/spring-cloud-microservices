package com.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {

    @Autowired
    private LimitConfiguration limitConfiguration;

    @GetMapping("/limits")
    public LimitConfiguration getLimitConfig() {
        return new LimitConfiguration(limitConfiguration.getMaximum(), limitConfiguration.getMinimum());
    }
}
