package com.springDependencyExample.spring;

import com.springDependencyExample.spring.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class ApplicationTests {

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    MyController myController;

    @Test
    void testAutowireOfContext() {
        System.out.println(myController.sayHello());
    }

    @Test
    void testGetControllerFromContext() {
        MyController myController = applicationContext.getBean(MyController.class);
        System.out.println(myController.sayHello());
    }

    @Test
    void contextLoads() {
    }

}
