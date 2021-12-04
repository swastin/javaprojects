package com.JavaBasedConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Apps {public static void main(String[] args) {
	
	AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);	
	Employee e=ctx.getBean(Employee.class);
	System.out.println(e.hashCode());
	Employee e1=ctx.getBean(Employee.class);
	System.out.println(e1.hashCode());
	ctx.registerShutdownHook();
}}
