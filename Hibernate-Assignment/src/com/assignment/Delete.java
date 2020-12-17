package com.assignment;

import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Delete
{
	public static void delete(Session ss,Query qr,int mod)
	{
		Scanner sc=new Scanner(System.in);
		Transaction ty=ss.beginTransaction();
		System.out.println("Enter id number");
		int id4=sc.nextInt();
		qr=ss.createQuery("delete from Student s where s.id=?");
		qr.setParameter(0, id4);
		mod=qr.executeUpdate();
		ty.commit();
	}

}
