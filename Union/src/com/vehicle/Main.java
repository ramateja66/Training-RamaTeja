package com.vehicle;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties prop= new Properties();
        prop.setProperty("hibernate.connection.url", "jdbc:mysql://@localhost:3306/employee");
        prop.setProperty("dialect","org.hibernate.dialect.MySQLDialect");
        prop.setProperty("hibernate.connection.username","root");
        prop.setProperty("hibernate.connection.password","root");
        prop.setProperty("hibernate.connection.driver_class","com.mysql.cj.jdbc.Driver");
        prop.setProperty("hibernate.hbm2ddl.auto","create");
        prop.setProperty("hibernate.show_sql","true");
        SessionFactory sf=new Configuration().addAnnotatedClass(Vehicle.class).addAnnotatedClass(Three.class).addAnnotatedClass(Four.class).addProperties(prop).buildSessionFactory();
        Session ss=sf.openSession();
        Transaction trx=ss.beginTransaction();
     Three three=new Three();
     three.setId(103);
     three.setName("auto");
     three.setTotalwheels(3);
     ss.save(three);
     Four four=new Four();
     four.setId(104);
     four.setName("Car");
     four.setTotalweels(4);
     ss.save(four);
     trx.commit();
        ss.close();
        sf.close();
	}

}
