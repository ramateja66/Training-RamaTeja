package com.bootjdbc;

import java.sql.Types;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.jdbc.object.SqlUpdate;
import org.springframework.stereotype.Repository;
@Repository
public class EmployeeJdbc {
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Autowired
	DataSource datasource;
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate,DataSource datasource) {
		this.jdbcTemplate = jdbcTemplate;
		this.datasource=datasource;
	}
	
	public String createTable()
	{
		String sql="create table emp(id int(20),name varchar(120),lname varchar(255),marks int(20))";
		int update=this.jdbcTemplate.update(sql);
		return "created";

	}
	
	public void insert(int id,String name,String lastname,int marks)
	{
		SimpleJdbcInsert ins=new SimpleJdbcInsert(jdbcTemplate).withTableName("emp");
		HashMap<String,Object> map=new HashMap<String,Object>();
		map.put("id", id);
		map.put("name",name);
		map.put("lname", lastname);
		map.put("marks",marks);
		int i=ins.execute(map);
		if(i>0)
			System.out.println("Success");
		
		
	}
	public void update(Integer id,String name,String lastname,Integer marks)
	{
		String sql="update emp set name=? ,lname=?,marks=? where id=?";
		SqlUpdate up=new SqlUpdate(datasource, sql);
		up.declareParameter(new SqlParameter("name", Types.VARCHAR));
	     up.declareParameter(new SqlParameter("lastname", Types.VARCHAR));
	     up.declareParameter(new SqlParameter("marks", Types.INTEGER));
	     up.declareParameter(new SqlParameter("id", Types.INTEGER));
	      up.compile();
	      
	    int i=  up.update(name.toString(),lastname.toString(),marks.intValue(),id.intValue());
	    if(i>0)
	    System.out.println("Updated");
		
	}
	public void delet(int id)
	{
		String sql="delete from emp where id=?";
		int i=jdbcTemplate.update(sql,id);
		if(i>0)
			System.out.println("Deleted ");
	}
	public void display(int id)
	{
		String sql="select * from emp where id=?";
	List<Employee> li=	jdbcTemplate.query(sql, new RowMapping(),id);
		Iterator<Employee> it=li.iterator();
		while(it.hasNext())
		{
			Employee ss=it.next();
			System.out.println(ss.getName()+"--" +ss.getLname()+"--"+ss.getMarks());
		}

}
}
