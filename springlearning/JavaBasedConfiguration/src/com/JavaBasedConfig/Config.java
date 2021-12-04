package com.JavaBasedConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.JavaBasedConfig")
public class Config {
@Bean(initMethod ="init", destroyMethod = "destroy")
@Scope("prototype")
public Employee employee() {
		
		return new Employee();
	}
}
