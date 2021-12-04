package com.SpringBootJpaDemo.App.Entities;

import javax.persistence.*;

@Entity
public class User {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer id;
private String name;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public User(Integer id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + "]";
}

}
