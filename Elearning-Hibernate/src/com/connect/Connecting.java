package com.connect;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Connecting
{
	public static Session connect()
	{
		Configuration conf=new Configuration();
		conf.configure("configuration.xml");
		SessionFactory sf=conf.buildSessionFactory();
		Session ss=sf.openSession();
		return ss;
	}

}
