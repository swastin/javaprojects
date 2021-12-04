package com.SpringJdbcDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.SpringJdbcDemo.Dao.StudentDao;
import com.SpringJdbcDemo.Entities.Student;

public class Apps {

	public static void main(String[] args) 
	{
	ApplicationContext context=new ClassPathXmlApplicationContext("spring-jdbc-config.xml");
	StudentDao studentDao = context.getBean("Sd",StudentDao.class);
	Student student=new Student();
//	student.setId(2);
//	student.setName("Ram");
//	student.setRollno("cs124325");
//    int result=studentDao.Create(student);
	
	student.setName("Raja Ram1");
	student.setRollno("cs124328");
	 int result=studentDao.Create(student);
//int result=studentDao.Delete(2);
	
//	int result=studentDao.Update(student);
//System.out.println(result+"updated successfully");
//	student=studentDao.getStudent(1);
//	System.out.println(student);
	}
}
