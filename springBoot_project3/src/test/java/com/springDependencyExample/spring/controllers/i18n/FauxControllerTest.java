package com.springDependencyExample.spring.controllers.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles({"prod", "EN"})
@SpringBootTest
class FauxControllerTest {
    @Autowired
    FauxController fauxController;

    @Test
    void returnString() {
        System.out.println(fauxController.returnString());
    }
}