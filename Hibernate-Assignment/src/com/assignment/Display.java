package com.assignment;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;

public class Display
{
	public static void display(Session ss,Query qr)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Full details 2.Name,Section,Marks 3.Address");
		int option=sc.nextInt();
		if(option==1)
		{
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
		if(option==2)
		{
			System.out.println("Enter id");
			int si=sc.nextInt();
			 qr=ss.createQuery("select s.name,s.section,s.marks from Student s where s.id=?");
			 qr.setParameter(0, si);
			 List name=qr.list();
			 Iterator ii=name.iterator();
			 while(ii.hasNext())
			 {
				 Object[] s=(Object[])ii.next();
				 System.out.println(s[0] +" " +s[1]+ " " +s[2]);
			 }
			
		}
		if(option==3)
		{
			System.out.println("Enter id");
			int si=sc.nextInt();
			 qr=ss.createQuery("select s.address from Student s where s.id=?");
			 qr.setParameter(0, si);
			 List name=qr.list();
			 Iterator ii=name.iterator();
			 while(ii.hasNext())
			 {
				 String s=(String)ii.next();
				 System.out.println(s);
			 }
		}
	}
}
