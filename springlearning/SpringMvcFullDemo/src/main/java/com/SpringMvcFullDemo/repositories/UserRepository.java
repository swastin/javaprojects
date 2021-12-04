package com.SpringMvcFullDemo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SpringMvcFullDemo.Entities.User;
public interface UserRepository extends CrudRepository<User,Integer> {

}
