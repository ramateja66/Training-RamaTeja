package com.bootjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RowMapping implements RowMapper<Employee>
{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Employee stud=new Employee();
		stud.setId(rs.getInt("id"));
		stud.setName(rs.getString("name"));
		stud.setLname(rs.getString("lname"));
		stud.setMarks(rs.getInt("marks")); 
		return stud;
	}

	

}