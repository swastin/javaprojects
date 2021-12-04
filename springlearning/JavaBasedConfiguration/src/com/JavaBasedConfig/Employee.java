package com.JavaBasedConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("1")
private int id;
	@Value("swastin")
private String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + "]";
}
public void init() {
	System.out.println("Initilizationing....");
}
public void destroy() {
	System.out.println("Destroying.......");
	
	
}
}
