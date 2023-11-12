package com.springDependencyExample.spring.services.i18n;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev", "default"})
@Service("faux")
public class Development implements OperatingEnvironments {
    @Override
    public String returnValue() {
        return "This is Development";
    }
}
