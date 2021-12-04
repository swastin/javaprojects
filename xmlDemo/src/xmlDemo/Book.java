package xmlDemo;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "book")
public class Book {
	private int id;
	@XmlAttribute  
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String name;
    private String author;
    private String publisher;
    private String isbn;
	public Book() {
		// TODO Auto-generated constructor stub
	}
	@XmlElement(name = "title")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Book(String name, String author, String publisher, String isbn) {
		super();
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.isbn = isbn;
	}

}
