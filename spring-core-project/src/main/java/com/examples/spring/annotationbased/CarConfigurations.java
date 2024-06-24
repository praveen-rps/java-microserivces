package com.examples.spring.annotationbased;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.examples.spring"})
public class CarConfigurations {

}

// com.examples.spring.annotationbased.carconfigs
// com.examples.spring.annotationbased.engineconfigs
