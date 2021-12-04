package com.SpringMvcDemo.Entites;

import java.util.Date;

public class Todo {
	private int id;
	private String title;
	private String content;
	private Date createdDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Todo(int id, String title, String content, Date createdDate) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.createdDate = createdDate;
	}
	public Todo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return  this.getContent()+":"+this.content ;
	}

}
