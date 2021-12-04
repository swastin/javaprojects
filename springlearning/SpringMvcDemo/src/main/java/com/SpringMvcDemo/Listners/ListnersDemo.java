package com.SpringMvcDemo.Listners;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import com.SpringMvcDemo.Entites.Todo;


/**
 * Application Lifecycle Listener implementation class ListnersDemo
 *
 */
@WebListener
public class ListnersDemo implements ServletContextListener {

  @Override
public void contextDestroyed(ServletContextEvent sce) {

}
@Override
	public void contextInitialized(ServletContextEvent sce) {
	System.out.println("Initilizing.....");
	ServletContext context=sce.getServletContext();
	List<Todo> list=new ArrayList<Todo>();
	context.setAttribute("list",list);

	}	
}
