package com.SpringBootDemo.App.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.SpringBootDemo.App.Models.Employee;

@Controller
public class HomeController
{
	@RequestMapping("/")
public String index(Model model) {
	
	model.addAttribute("message","hello");
	return "index";
}
	@RequestMapping("/home")
	public String home(Model model) {
		
		model.addAttribute("message","hello");
		return "home";
	}
	
	@RequestMapping("/viewEmployee")
	public String viewEmployee(Model model) {
		Employee e=new Employee();
		e.setId(1);
		e.setName("swastin");
		e.setRole("Admin");
		List <Employee>l=new ArrayList();
		l.add(e);
		model.addAttribute("allEmployees",l);
		System.out.println(e);
		return "home";
	}
}
