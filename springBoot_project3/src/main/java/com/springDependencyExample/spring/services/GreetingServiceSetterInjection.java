package com.springDependencyExample.spring.services;

import org.springframework.stereotype.Service;

@Service("setterGreetingBean")
public class GreetingServiceSetterInjection implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello from GreetingServiceSetterInjection";
    }
}
