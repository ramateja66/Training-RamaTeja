package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cf=new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sef=cf.buildSessionFactory();
		Session ss=sef.openSession();
		Transaction trx=ss.beginTransaction();
		Student st=(Student)ss.load(Student.class, 102);
		ss.delete(st);;
		trx.commit();
		sef.close();
		ss.close();
		

	}

}
