package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Persistent {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure("configuration.xml");
		SessionFactory sfg=cfg.buildSessionFactory();
		Session ss=sfg.openSession();
		Student bingo=new Student();
		bingo.setId(110);
		bingo.setName("kiran");
		bingo.setSection("c");
		bingo.setAddress("Ngd");
		bingo.setMarks(400);
		Transaction tf=ss.beginTransaction();
		ss.persist(bingo);
		tf.commit();
		ss.close();
		sfg.close();
	}

}
