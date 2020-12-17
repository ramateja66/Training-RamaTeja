package com.assignment;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Insert
{
	public static void insert(Session ss)
	{
		Scanner sc=new Scanner(System.in);
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
		int i=(int) ss.save(saha);
		if(i>0)
		{
			System.out.println("Record inserted");
		}
		t.commit();
	}

	

}
