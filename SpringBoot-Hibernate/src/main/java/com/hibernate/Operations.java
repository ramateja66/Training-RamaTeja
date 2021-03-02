package com.hibernate;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public class Operations 
{
	Scanner sc = new Scanner(System.in);
	@Autowired
	HibernateTemplate hbTemplate;
	public void insert() throws Exception {
		Session se = hbTemplate.getSessionFactory().openSession();
		
		String choice = "";
		do {
			Transaction tx = se.beginTransaction();
			Employee e = new Employee();
			System.out.println("enter employee id: ");
			e.setId(sc.nextInt());
			System.out.println("enter emploee name :");
			e.setName(sc.next());
			System.out.println("enter emploee nation :");
			e.setNationality(sc.next());
			Object s = se.save(e);
			tx.commit();
			if (s != null) {
				System.out.println("Record inserted");
			}
			System.out.println("Do you want to continue (y/n): ");
			choice = sc.next();
		} while (choice.equalsIgnoreCase("y"));
		se.close();
	}
	public void display()
	{
		Session se =hbTemplate.getSessionFactory().openSession();
		Scanner sc = new Scanner(System.in);
		Query qr = se.createQuery("from Employee e where e.id=:x");
		
			System.out.println("enter id of employee to be retrieve");
			qr.setParameter("x", sc.nextInt());
			List<Employee> li = qr.list();
			Iterator<Employee> i = li.iterator();
			while (i.hasNext()) {
				Employee e = i.next();
				System.out.println(e.getId() +"---"+e.getName()+"---"+e.getNationality());
						
			}
	}
	public void update()
	{
		Session se =hbTemplate.getSessionFactory().openSession();
		Transaction trx=se.beginTransaction();
	Query qr = se.createQuery("update Employee e set e.name=:x,e.nationality=:z where e.id=:y");
	System.out.println("Enter new name:");
	qr.setParameter("x", sc.next());
	System.out.println("Enter nationality:");
	qr.setParameter("z", sc.next());
	System.out.println("enter the id to which name to be updated: ");
	qr.setParameter("y", sc.nextInt());
	int a = qr.executeUpdate();
	trx.commit();
	if (a == 1)
		System.out.println("Record updated");
	}
	
	public void delete()
	{
		Session se =hbTemplate.getSessionFactory().openSession();
		Transaction trx=se.beginTransaction();
		Query qr = se.createQuery("delete from Employee e where e.id=:y");
		System.out.println("enter the id to which name to be updated: ");
		qr.setParameter("y", sc.nextInt());
		int a = qr.executeUpdate();
		trx.commit();
		if (a == 1)
			System.out.println("Record updated");
		}
	}



