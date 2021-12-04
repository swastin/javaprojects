package xmlDemo;

import java.util.List;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class BookStore {

	private List<Book> bookList;
	private String name;
    private String location;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@XmlElement(name = "book")
	public List<Book> getBookList() {
		return bookList;
	}
	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
	public BookStore(List<Book> bookList, String name, String location) {
		super();
		this.bookList = bookList;
		this.name = name;
		this.location = location;
	}
	public BookStore() {
		// TODO Auto-generated constructor stub
	}
	
    
}
