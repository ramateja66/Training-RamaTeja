package com.join;

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
        prop.setProperty("hibernate.hbm2ddl.auto","update");
        prop.setProperty("hibernate.show_sql","true");
        SessionFactory sf=new Configuration().addAnnotatedClass(Payment.class).addAnnotatedClass(Credit.class).addAnnotatedClass(Cheque.class).addProperties(prop).buildSessionFactory();
        Session ss=sf.openSession();
        Transaction trx=ss.beginTransaction();
    /*   Credit card=new Credit();
      card.setId(201);
      card.setAmount(20000);
      card.setCardtype("ICICI");*/
       Cheque cq=new Cheque();
        cq.setId(102);
        cq.setAmount(20022);
        cq.setChequetype("Axis");
        ss.save(cq);
        trx.commit();
        ss.close();
        sf.close();
	}

}
