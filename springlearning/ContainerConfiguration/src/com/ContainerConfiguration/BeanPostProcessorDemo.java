package com.ContainerConfiguration;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorDemo implements BeanPostProcessor {
@Override
public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
	System.out.println("After initilization the bean name is"+beanName);
	return bean;
	
}
@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
	System.out.println("Before initilization the bean name is"+beanName);
		return bean;
	}

}
