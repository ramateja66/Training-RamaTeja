package com.hibernate;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Get {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Configuration cg=new Configuration();
		cg.configure("configuration.xml");
		SessionFactory sf=cg.buildSessionFactory();
		Session ss=sf.openSession();
		Student det=(Student) ss.get(Student.class, 104);
		System.out.println(det.getName());
		System.out.println(det.getMarks());
		System.out.println(det.getSection());
		System.out.println(det.getAddress());
		ss.close();
		sf.close();
		
	}

}
