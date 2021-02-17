package com.one;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration config=new Configuration();
		config.addProperties(Config.connect());
		config.addAnnotatedClass(Instructor.class);
		config.addAnnotatedClass(InstructorDetail.class);
        SessionFactory sf=config.buildSessionFactory();
        Session ss=sf.openSession();
        Transaction trx=ss.beginTransaction();
        Instructor inst=new Instructor();
        inst.setFirstname("ram");
        inst.setLastname("teja");
        InstructorDetail detail=new InstructorDetail();
        detail.setChannel("youtube");
        detail.setHobby("cricket");
        inst.setIns(detail);
        ss.save(inst);
        trx.commit();
        ss.close();
        sf.close();
	}

}
