package com.qzd.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.qzd.dao","com.qzd.service"})
public class SpringConfig {

}
