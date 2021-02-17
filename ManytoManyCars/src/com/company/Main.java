package com.company;

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
		Manufacturer m1=new Manufacturer();
		m1.setId(121);
		m1.setName("Ford");
		Models md=new Models();
		md.setM_id(221);
		md.setModel_name("figo");
		Set set=new HashSet();
		set.add(md);
		m1.setModels(set);
		ss.save(m1);
		trx.commit();
		ss.close();
		sf.close();
	}

}
