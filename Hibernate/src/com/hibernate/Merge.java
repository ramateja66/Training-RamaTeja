package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Merge {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		 Configuration configuration = new Configuration();
		 configuration.configure("configuration.xml");
		 SessionFactory factory = configuration.buildSessionFactory();
	        Session session = factory.openSession();
	        Student student = (Student) session.get(Student.class, 115);
	        session.close();
	        student.setName("John");
	        Session session2 = factory.openSession();
	        Student student2 = (Student) session2.get(Student.class, 115);
	        Transaction tx = session2.beginTransaction();

	        session2.merge(student);
	        tx.commit();
	}

}
