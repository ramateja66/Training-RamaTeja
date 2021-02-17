package com.hibernate5;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties prop=new Properties();
		

        prop.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/employee");

        
        prop.setProperty("dialect", "org.hibernate.dialect.MySQLDialect");

        prop.setProperty("hibernate.connection.username", "root");
        prop.setProperty("hibernate.connection.password", "root");
        prop.setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
        prop.setProperty("show_sql"," true");
        
	Configuration con=new Configuration();
	con.addAnnotatedClass(Employee.class);
	SessionFactory sf=con.buildSessionFactory();
	Session ss=sf.openSession();
	Transaction trx=ss.beginTransaction();
	Employee emp=new Employee();
	emp.setId(101);
	emp.setName("teja");
	emp.setSalary(20000);
	ss.save(emp);
	trx.commit();
	ss.close();
	sf.close();

	}

}
