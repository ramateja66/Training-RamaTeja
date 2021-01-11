package com.course;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.connect.Connecting;

public class Course 
{
	private int aid;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}

	private int id;
	private String name;
	private String subject;
	private String file;
	private String path;
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
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
	
	public List<Course> searchCourses(String subject)
	{
		ArrayList<Course> list=new ArrayList();
		Session sf=Connecting.connect();
		Query qr=sf.createQuery("from Course c where c.subject=?");
		qr.setParameter(0, subject);
		List<Course> li=qr.list();
		Iterator<Course> it=li.iterator();
		while(it.hasNext())
		{
			Course course=it.next();
			course.setName(course.getName());
			course.setSubject(course.getSubject());
			list.add(course);
		}
		return list;
	}
	
	public List<Course> allCourse()
	{
		ArrayList<Course> list=new ArrayList();
		Session sf=Connecting.connect();
		Query qr=sf.createQuery("from Course");
		List<Course> lo=qr.list();
		Iterator<Course> it=lo.iterator();
		while(it.hasNext())
		{
			Course course=it.next();
			course.setName(course.getName());
			course.setSubject(course.getSubject());
			list.add(course);
		}
		return list;
	}
	public List<Course> mycourses(int aid)
	{
		ArrayList<Course> list=new ArrayList();
		Session sf=Connecting.connect();
		Query qr=sf.createQuery("from Course c where c.aid=?");
		qr.setParameter(0, aid);
		List<Course> lo=qr.list();
		Iterator<Course> it=lo.iterator();
		while(it.hasNext())
		{
			Course course=it.next();
			course.setName(course.getName());
			course.setSubject(course.getSubject());
			list.add(course);
		}
		return list;
	}
	
	
	
}
