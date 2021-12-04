package xmlDemo;

import java.util.ArrayList;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

public class App {

	public App() {

	}

	public static void main(String[] args) throws JAXBException {

JAXBContext context=JAXBContext.newInstance(BookStore.class);
Marshaller m= context.createMarshaller();
m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
var book1=new Book();
book1.setId(1);
book1.setIsbn("978-0060554736");
book1.setName("The Game");
book1.setAuthor("Neil Strauss");
book1.setPublisher("Harpercollins");
var bookList= new ArrayList<Book>();
bookList.add(book1);
var bookstore=new BookStore();
bookstore.setName("Fraport Bookstore");
bookstore.setLocation("Frankfurt Airport");
bookstore.setBookList(bookList);
m.marshal(bookstore,System.out);
	} 

}
