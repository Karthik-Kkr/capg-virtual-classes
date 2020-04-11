package com.capg.lab1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.capg.practice.labprog1")
@PropertySource("app.properties")
public class EmployeeConfiguration {
	

}
