package com.SpringJdbcDemo.Dao;
import com.SpringJdbcDemo.Entities.Student;
public interface StudentDao {
public int Create(Student student);
public int Update(Student student);
public int Delete(int id);
public Student getStudent(int id);
}
