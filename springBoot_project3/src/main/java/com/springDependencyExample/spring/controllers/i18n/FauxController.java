package com.springDependencyExample.spring.controllers.i18n;

import com.springDependencyExample.spring.services.i18n.OperatingEnvironments;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class FauxController {

    private final OperatingEnvironments operatingEnvironments;

    public FauxController(@Qualifier("faux") OperatingEnvironments operatingEnvironments) {
        this.operatingEnvironments = operatingEnvironments;
    }

    public String returnString() {
        return operatingEnvironments.returnValue();
    }
}
