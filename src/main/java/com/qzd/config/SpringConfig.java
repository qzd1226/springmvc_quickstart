package com.qzd.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

@Configuration
//@ComponentScan({"com.qzd.dao","com.qzd.service"})
@ComponentScan(value = "com.qzd",
    excludeFilters = @ComponentScan.Filter(
            type = FilterType.ANNOTATION,
            classes = Controller.class
    )


)
public class SpringConfig {

}
