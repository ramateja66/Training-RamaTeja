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
