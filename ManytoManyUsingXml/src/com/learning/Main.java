package com.learning;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure("configuration.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction trx=ss.beginTransaction();
		Student s1=new Student();
		s1.setStuid(101);
		s1.setName("bob");
		s1.setStumarks(900);
		Student s2=new Student();
		s2.setStuid(102);
		s2.setName("king");
		s2.setStumarks(1000);
		Course c1=new Course();
		c1.setCourseid(201);
		c1.setCoursename("maths");
		c1.setDuration("200");
		Course c2=new Course();
		c2.setCourseid(202);
		c2.setCoursename("phusics");
		c2.setDuration("35");
		Set set=new HashSet();
		set.add(c1);
		set.add(c2);
		s1.setCourse(set);
		s2.setCourse(set);
		ss.save(s1);
		ss.save(s2);
		trx.commit();
		ss.close();
		sf.close();
	}

}
