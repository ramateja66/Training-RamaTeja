package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure("configuration.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		Student st=(Student)ss.load(Student.class, 105);
		st.setMarks(100);
		ss.update(st);
		tr.commit();
		ss.close();
		sf.close();
	}

}
