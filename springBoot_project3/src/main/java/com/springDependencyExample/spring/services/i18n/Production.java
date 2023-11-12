package com.springDependencyExample.spring.services.i18n;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service("faux")
public class Production implements OperatingEnvironments {
    @Override
    public String returnValue() {
        return "This is Production";
    }
}
