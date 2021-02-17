package com.management;

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
		Session ss=sf.openSession();
		Transaction trx=ss.beginTransaction();
		Vendor vendor=new Vendor();
		vendor.setId(101);
		vendor.setName("godaddy");
		Customer customer=new Customer();
		customer.setCid(201);
		customer.setCname("uppal");
		Set set=new HashSet();
		set.add(customer);
		vendor.setCustomer(set);
		ss.save(vendor);
		trx.commit();
		ss.close();
		sf.close();
	}

}
