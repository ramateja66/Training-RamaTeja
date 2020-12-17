package com.assignment;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args)
	
	{
		int option;
		Scanner sc=new Scanner(System.in);
		Configuration cfg=new Configuration();
		cfg.configure("configuration.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Query qr;
		do {
			System.out.println("Choose your value");
			System.out.println("1.Insert");
			System.out.println("2.Update");
			System.out.println("3.Delete");
			System.out.println("4.Select");
			System.out.println("5.Exit");
			option=sc.nextInt();
			switch(option)
			{
			case 1:
				Student saha=new Student();
				System.out.println("Enter id");
				int id=sc.nextInt();
				saha.setId(id);
				System.out.println("Enter name");
				String name=sc.next();
				saha.setName(name);
				System.out.println("Enter section");
				String section=sc.next();
				saha.setSection(section);
				System.out.println("Enter address");
				String address=sc.next();
				saha.setAddress(address);
				System.out.println("Enter marks");
				int marks=sc.nextInt();
				saha.setMarks(marks);
				Transaction t=ss.beginTransaction();
				Object oo=ss.save(saha);
				if(oo!=null)
				{
					System.out.println("Record inserted");
				}
				t.commit();
				break;
								
			case 2:
				System.out.println("Which id do you want to update");
				System.out.println(" 1. name 2.address 3.section 4.marks");
				int mode=sc.nextInt();
				if(mode==1)
				{
					System.out.println("Enter name");
					String named=sc.next();
					System.out.println("Enter id");
					int id1=sc.nextInt();
					qr=ss.createQuery("update Student s set s.name=:x where s.id=:y");
					qr.setParameter("x",named);
					qr.setParameter("y", id1);
					qr.executeUpdate();
				
				}
				else if(mode==2)
				{
					System.out.println("Enter address");
					String add=sc.next();
					System.out.println("Enter id");
					int id5=sc.nextInt();
					qr=ss.createQuery("update Student s set s.address=:x where s.id=:y");
					qr.setParameter("x",add);
					qr.setParameter("y", id5);
					qr.executeUpdate();
	
				}
				else if(mode==3)
				{
					System.out.println("Enter section");
					String sec=sc.next();
					System.out.println("Enter id");
					int idd=sc.nextInt();
					qr=ss.createQuery("update Student s set s.section=:x where s.id=:y");
					qr.setParameter("x",sec);
					qr.setParameter("y", idd);
					qr.executeUpdate();
				}
				else if(mode==4)
				{
					System.out.println("Enter marks");
					int mark=sc.nextInt();
					System.out.println("Enter id");
					int iddd=sc.nextInt();
					qr=ss.createQuery("update Student s set s.marks=:x where s.id=:y");
					qr.setParameter("x",mark);
					qr.setParameter("y", iddd);
					qr.executeUpdate();
				}
				Transaction tx=ss.beginTransaction();
				tx.commit();
				break;	
			case 3:
				Transaction ty=ss.beginTransaction();
				System.out.println("Enter id number");
				int id4=sc.nextInt();
				qr=ss.createQuery("delete from Student s where s.id=?");
				qr.setParameter(0, id4);
				qr.executeUpdate();
				ty.commit();
				break;
			case 4:
				System.out.println("Enter id");
				int si=sc.nextInt();
				 qr=ss.createQuery("from Student s where s.id=?");
				 qr.setParameter(0, si);
				List<Student> li=qr.list();
				Iterator<Student> ii=li.iterator();
				while(ii.hasNext())
				{
					Student s=ii.next();
					System.out.println(s.getId() + " " + s.getName() + " " + s.getSection() + " " + s.getMarks());
				}
			}
		}
			while(option!=5);
			System.out.println("Exited ");
		ss.close();
		sf.close();
	}

}
