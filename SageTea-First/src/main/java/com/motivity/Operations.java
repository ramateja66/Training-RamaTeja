package com.motivity;



import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
@Service
public class Operations 
{
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	public boolean established()
	{
		Session ss=hibernateTemplate.getSessionFactory().openSession();
		if(ss!=null)
			return true;
		else
			return false;
	}
	
	public void insert(Employee emp,int id)
	{
		Session ss=hibernateTemplate.getSessionFactory().openSession();
		Transaction trx=ss.beginTransaction();
		
		Employeer er=ss.load(Employeer.class,id);
		emp.setEmployer(er);
		ss.save(emp);
		trx.commit();
	}
	public Employee view(int id)
	{
		return hibernateTemplate.get(Employee.class, id);
	}
	
	public Employeer viewemployeer(int id)
	{
		return hibernateTemplate.get(Employeer.class, id);
	}
	public void erinsert(Employeer er)
	{
		Session ss=hibernateTemplate.getSessionFactory().openSession();
		Transaction trx=ss.beginTransaction();
		ss.save(er);
		trx.commit();
	}
}
