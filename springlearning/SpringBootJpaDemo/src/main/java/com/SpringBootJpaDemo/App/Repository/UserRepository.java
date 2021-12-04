package com.SpringBootJpaDemo.App.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.CrudRepository;

import com.SpringBootJpaDemo.App.Entities.User;

public interface UserRepository extends CrudRepository<User,Integer> {
	
public User findByName(String name);
/*jpql Example*/
@Query("select u from User u")
public List<User> getAllUser();


}
