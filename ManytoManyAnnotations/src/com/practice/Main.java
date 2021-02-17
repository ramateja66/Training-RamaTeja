package com.practice;

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
		Configuration cf=new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session sess=sf.openSession();
		Transaction trx=sess.beginTransaction();
		Bike bike=new Bike();
		bike.setId(101);
		bike.setCompany_name("hero");
		bike.setPrice(8000);
		Model model=new Model();
		model.setCid(202);
		model.setModel_name("Karishma");
		Set set=new HashSet();
		set.add(model);
		bike.setModels(set);
		sess.save(bike);
		trx.commit();
		sess.close();
		sf.close();
	}

}
