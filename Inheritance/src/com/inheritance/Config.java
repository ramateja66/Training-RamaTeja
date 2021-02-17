package com.inheritance;
import java.util.Properties;
public class Config
{
	public static Properties connect()
	{
		Properties prop= new Properties();
        prop.setProperty("hibernate.connection.url", "jdbc:mysql://@localhost:3306/employee");
        prop.setProperty("dialect","org.hibernate.dialect.MySQLDialect");
        prop.setProperty("hibernate.connection.username","root");
        prop.setProperty("hibernate.connection.password","root");
        prop.setProperty("hibernate.connection.driver_class","com.mysql.cj.jdbc.Driver");
        prop.setProperty("hibernate.hbm2ddl.auto","update");
        prop.setProperty("hibernate.show_sql","true");
        return prop;  
	}
}
