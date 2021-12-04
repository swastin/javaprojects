package com.SpringJdbcDemo.Dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.SpringJdbcDemo.Entities.Student;

public class StudentDaoImpl implements StudentDao {
	private JdbcTemplate template;
	public JdbcTemplate getTemplate() {
		return template;
	}
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public int Create(Student student) {
		String query="INSERT INTO student(id,name,rollno)VALUES(?,?,?);";
		int r=this.template.update(query, student.getId(), student.getName(), student.getRollno());
		return r;
	}
	@Override
	public int Update(Student student) {
		String query="UPDATE student SET name =?,rollno = ? WHERE id =?;";
		int r=this.template.update(query,student.getName(), student.getRollno(),student.getId());
		return r;
	}
	@Override
	public int Delete(int id) {
		String query="DELETE FROM student WHERE id=?;";
		int r=this.template.update(query,id);
		return r;
	}
	@Override
	public Student getStudent(int id) {
		String query="SELECT *  FROM student WHERE id=?;";
		
		RowMapper<Student> rowMapper=new RowmapperImpl();
	Student student=	this.template.queryForObject(query,rowMapper,id);
		return student;
	}


}
