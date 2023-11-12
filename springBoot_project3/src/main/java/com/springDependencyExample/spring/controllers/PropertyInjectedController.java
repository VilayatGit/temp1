package com.springDependencyExample.spring.controllers;

import com.springDependencyExample.spring.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Qualifier("propertyGreetingService")
    @Autowired
    GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
