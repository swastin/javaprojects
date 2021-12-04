package com.SpringJdbcDemo.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.BeanWrapperImpl;
import org.springframework.jdbc.core.RowMapper;

import com.SpringJdbcDemo.Entities.Student;

public class RowmapperImpl implements RowMapper<Student>
{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student= new Student();
		student.setId(rs.getInt(1));
		student.setName(rs.getString(2));
		student.setRollno(rs.getString(3));
		return student;
	}

}
