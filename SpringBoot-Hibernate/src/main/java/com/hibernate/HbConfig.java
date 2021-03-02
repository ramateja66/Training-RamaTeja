package com.hibernate;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
@PropertySource(value= {"classpath:application.properties"})
public class HbConfig {
	@Value("${db.class}")
	private String driverClass;
	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String username;
	@Value("${spring.datasource.password}")
	private String password;
	@Value("${spring.jpa.properties.hibernate.dialect}")
	private String dialect;

	@Bean
	public DataSource getDataSource()
	{
		DriverManagerDataSource ds=new DriverManagerDataSource(url,username,password);
		ds.setDriverClassName(driverClass);
		return ds;
	}
	
	private Properties setProperties()
	{
		Properties prop=new Properties();
		prop.put("hibernate.dialect", dialect);
		prop.put("hibernate.hbm2ddl.auto","update");
		prop.put("hibernate.show_sql","true");
		return prop;
		
	}
	

	@Bean
	public LocalSessionFactoryBean factoryBean()
	{
		LocalSessionFactoryBean bean=new LocalSessionFactoryBean();
		bean.setDataSource(getDataSource());
		bean.setHibernateProperties(setProperties());
		bean.setPackagesToScan(new String[]{"com.hibernate"});
		return bean;
	}
	
	@Bean
	public HibernateTemplate getHibernateTemplate() {
		HibernateTemplate ht = new HibernateTemplate();
		ht.setSessionFactory(factoryBean().getObject());
		ht.setCheckWriteOperations(false);
		return ht;
	}
}
