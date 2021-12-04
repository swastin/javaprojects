package com.lifecycleCallbacksDemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.Ordered;

public class Address implements InitializingBean,DisposableBean,Ordered{
private String city,state,country;
	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("initilizing....");
		
	}

	
	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + "]";
	}


	@Override
	public void destroy() throws Exception {
		
		System.out.println("destroying.....");
	}


	@Override
	public int getOrder() {
		return 0;
	}


}
