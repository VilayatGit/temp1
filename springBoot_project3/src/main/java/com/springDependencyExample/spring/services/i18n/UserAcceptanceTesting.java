package com.springDependencyExample.spring.services.i18n;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service("faux")
public class UserAcceptanceTesting implements OperatingEnvironments {
    @Override
    public String returnValue() {
        return "This is User Acceptance Testing";
    }
}
