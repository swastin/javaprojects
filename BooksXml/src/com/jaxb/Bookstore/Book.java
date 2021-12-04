package com.jaxb.Bookstore;

import java.util.Date;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Book {

private Integer id;
private String title;
private String genre;
private Double price;
private Date publish_date;
private String Description;
@XmlAttribute(required =true)
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
public Date getPublish_date() {
	return publish_date;
}
public void setPublish_date(Date publish_date) {
	this.publish_date = publish_date;
}
public String getDescription() {
	return Description;
}
public void setDescription(String description) {
	Description = description;
}
public Book(Integer id, String title, String genre, Double price, Date publish_date, String description) {
	super();
	this.id = id;
	this.title = title;
	this.genre = genre;
	this.price = price;
	this.publish_date = publish_date;
	Description = description;
}
public Book() {
	super();
}

}
