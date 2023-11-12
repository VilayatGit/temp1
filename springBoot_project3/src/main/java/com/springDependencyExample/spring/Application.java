package com.springDependencyExample.spring;

import com.springDependencyExample.spring.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);

        MyController myController = ctx.getBean(MyController.class);
        System.out.println("It is main");

        System.out.println(myController.sayHello());
    }

}
