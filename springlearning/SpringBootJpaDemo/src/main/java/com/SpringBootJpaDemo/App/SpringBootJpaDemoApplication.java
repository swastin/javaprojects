
package com.SpringBootJpaDemo.App;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.SpringBootJpaDemo.App.Entities.User;
import com.SpringBootJpaDemo.App.Repository.UserRepository;

@SpringBootApplication
public class SpringBootJpaDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootJpaDemoApplication.class, args);
		UserRepository userRepo =  context.getBean(UserRepository.class);
		/*******
		 * multiple insert
		 * 
		 * *******/
//		User user=new User();
//		
//		user.setName("Ram");
//		User user1=new User();
//		user1.setName("Rahul");
//		User user2=new User();
//		user2.setName("Raj");
//		List<User> users = List.of(user,user1,user2);
//		Iterable<User> userList = userRepo.saveAll(users);
//		userList.forEach(user4->{System.out.println(user4);});
//		System.out.println(user2);
		
		/*******
		 *  update
		 * 
		 * *******/	
//		Optional<User> optional= userRepo.findById(5);
//		User user = optional.get();
//		System.out.println(user);
//		user.setName("sahpp");
//		User user1 = userRepo.save(user);
//	System.out.println(user1);
		
		/*******
		 *  Delete
		 * 
		 * *******/		
	//	userRepo.deleteById(5);	
		
//		 User user = userRepo.findByName("swastin");	
//		 
//		 System.out.println(user);
		 List<User> allUser = userRepo.getAllUser();
		 
		 allUser.forEach(e->System.out.println(e));	
	}

}
