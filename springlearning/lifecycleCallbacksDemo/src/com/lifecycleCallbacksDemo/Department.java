package com.lifecycleCallbacksDemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Department {
	
	private int id;
	private String name;
	
	@PostConstruct
	public void init() {
		
		System.out.println("initilizing bean 3");
		
	}
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
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
	@PreDestroy
	public void destry() {
		System.out.println("destroying  bean 3");	
	}

}
