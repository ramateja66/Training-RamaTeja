package com.student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.Query;
import org.hibernate.Session;

import com.connect.Connecting;

public class Student
{
	private int id;
	private String name;
	private String email;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public List<Student> view()
	{
		ArrayList<Student> li=new ArrayList<Student>();
		Session sf=Connecting.connect();
		Query qr=sf.createQuery("from Student");
		List<Student> list=qr.list();
		Iterator<Student> it=list.iterator();
		while(it.hasNext())
		{
			Student student=it.next();
		student.setName(student.getName());
		student.setEmail(student.getEmail());	
			li.add(student);
		}
		return li;
				
	}
}
