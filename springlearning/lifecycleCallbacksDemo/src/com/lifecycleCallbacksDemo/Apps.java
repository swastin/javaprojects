package com.lifecycleCallbacksDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Apps {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Employee e=(Employee)context.getBean("lifecycleDemo");
		System.out.println(e);	
		
		
		Address add=(Address)context.getBean("lifecycleDemo1");
		System.out.println(add);	
		
		Department dept=(Department)context.getBean("lifecycleDemo2");
		System.out.println(dept);	
		context.registerShutdownHook();	
	}

}
