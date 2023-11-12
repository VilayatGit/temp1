package com.springDependencyExample.spring.services.i18n;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service("faux")
public class QualityAssurance implements OperatingEnvironments {
    @Override
    public String returnValue() {
        return "This is Quality Assurance";
    }
}
