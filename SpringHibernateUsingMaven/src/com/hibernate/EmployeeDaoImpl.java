package com.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;


public class EmployeeDaoImpl implements EmployeeDao 
{
	
	private HibernateTemplate hibernateTemplate;
	private SessionFactory sessionFactory;
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	@Transactional
	public String insertEmployee(EmployeeBean emp) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(emp);
		return "done";
	}

	@Override
	@Transactional
	public EmployeeBean searchEmployee(int id) {
		// TODO Auto-generated method stub
		EmployeeBean bean=hibernateTemplate.get(EmployeeBean.class, id);
		return bean;
	}

	
	@Transactional
	public String updateEmployee(EmployeeBean emp) {
		// TODO Auto-generated method stub
		
	hibernateTemplate.update(emp);
	return "Updated";
	
	}

	@Override
	@Transactional
	public String deleteEmployee(int eid) {
		// TODO Auto-generated method stub
		EmployeeBean bbb=new EmployeeBean();
		bbb.setId(eid);
		hibernateTemplate.delete(bbb);
		return "Deleted";
	}

	@Override
	public List<EmployeeBean> listEmployeees() {
		// TODO Auto-generated method stub
		Session ss=this.sessionFactory.openSession();
		String qr="from EmployeeBean e";
		List<EmployeeBean> li=ss.createQuery(qr).list();
		ss.close();
		
		return li;
	}

}
