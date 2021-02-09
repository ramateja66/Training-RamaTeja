package com.springwithhibernate;

import org.springframework.orm.hibernate5.HibernateTemplate;

import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.Transactional;

public class EmployeeDaoImpl implements EmployeeDao 
{
	
	private HibernateTemplate hibernateTemplate;

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

}
