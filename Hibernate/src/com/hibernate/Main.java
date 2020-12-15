package com.hibernate;



import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cc=new Configuration();
		cc.configure("configuration.xml");
		SessionFactory ss=cc.buildSessionFactory();
		Session se=ss.openSession();
		Student akhil=new Student();
		akhil.setId(115);
		akhil.setName("Hitman");
		akhil.setMarks(980);
		akhil.setSection("D");
		akhil.setAddress("ngl ");
		Transaction trx=se.beginTransaction();
		Serializable sid=se.save(akhil);
		System.out.println(sid);
		trx.commit();
		ss.close();
		se.close();
	
	}

}
