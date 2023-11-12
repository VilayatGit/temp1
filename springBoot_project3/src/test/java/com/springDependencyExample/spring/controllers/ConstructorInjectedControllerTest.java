package com.springDependencyExample.spring.controllers;

import com.springDependencyExample.spring.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ConstructorInjectedControllerTest {
    @Autowired
    ConstructorInjectedController constructorInjectedController;

    @Test
    void sayHello() {
        System.out.println(constructorInjectedController.sayHello());
    }
}