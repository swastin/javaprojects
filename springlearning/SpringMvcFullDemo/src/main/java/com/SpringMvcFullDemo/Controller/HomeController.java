package com.SpringMvcFullDemo.Controller;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.encrypt.Encryptors;
import org.springframework.security.crypto.encrypt.TextEncryptor;
import org.springframework.security.crypto.keygen.KeyGenerators;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.SpringMvcFullDemo.Entities.User;
import com.SpringMvcFullDemo.repositories.UserRepository;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		
		return "index";
	}
// @RequestMapping("/home/{id}/{name}")
//public String  home(@PathVariable int id,@PathVariable String name){
//	 
//	System.out.println(id+name);
//	
//	return "home";
//	
//
//}
	
	@RequestMapping("/register")
	public String Register() {
		return "register";
	}
	@RequestMapping("/login")
	public String Login() {
		return "login";
	}	
	@RequestMapping(value="/addEmployee",method = RequestMethod.POST)
	public String addEmployee(@RequestParam String name,@RequestParam String email,@RequestParam String password) {		
	BCryptPasswordEncoder bcrypt= new BCryptPasswordEncoder();
	Timestamp createdAt=new Timestamp(System.currentTimeMillis());
	System.out.println(createdAt);
	 password = bcrypt.encode(password);
		User user=new User(name,email,password,createdAt, null);
		System.out.println(user.toString());
		return "redirect:/login";
	}
}
