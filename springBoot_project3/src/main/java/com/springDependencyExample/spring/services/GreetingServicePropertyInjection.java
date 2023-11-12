package com.springDependencyExample.spring.services;

import org.springframework.stereotype.Service;

@Service("propertyGreetingService")
public class GreetingServicePropertyInjection implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello from GreetingServicePropertyInjection";
    }
}
