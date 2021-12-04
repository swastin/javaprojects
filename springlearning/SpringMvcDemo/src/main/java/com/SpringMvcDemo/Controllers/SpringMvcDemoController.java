package com.SpringMvcDemo.Controllers;

import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.SpringMvcDemo.Entites.Todo;

// this the controller 
@Controller
public class SpringMvcDemoController {
	
	@Autowired
	ServletContext context;
//	when /home will hit the corrosponding function will run
	@RequestMapping(value="/home")
	public String home(Model model) {
		String page = "home";
		model.addAttribute("page", page);
		List <Todo> todos=	(List<Todo>) context.getAttribute("list");
		model.addAttribute("todos",todos);
		
//		this function should return the view name
		return "home";
	}

	@RequestMapping(value="/addTodo")
	public String addTodo(Model model) {
		Todo t = new Todo();
		String page = "addTodo";
		model.addAttribute("page", page);
		model.addAttribute("todo", t);

//	this function should return the view name
		return "home";
	}

	@RequestMapping(value="/saveTodo",method=RequestMethod.POST)
	public String saveTodo(@ModelAttribute("todo") Todo t ,Model model) {
		t.setId(1);
		t.setCreatedDate(new Date());
List <Todo> todos= (List<Todo>) context.getAttribute("list");
todos.add(t);
model.addAttribute("Msg","Todo successfully Added");		
	return "home";
	}
}
