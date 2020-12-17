package com.assignment;

import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Update 
{
	public static void update(Session ss,Query qr, int mod,int mode)
	{
		
		Scanner sc=new Scanner(System.in);
		if(mode==1)
		{
		System.out.println("Enter name");
		String named=sc.next();
		System.out.println("Enter id");
		int id1=sc.nextInt();
		qr=ss.createQuery("update Student s set s.name=:x where s.id=:y");
		qr.setParameter("x",named);
		qr.setParameter("y", id1);
		mod=qr.executeUpdate();
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
			mod=qr.executeUpdate();
			
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
			mod=qr.executeUpdate();
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
			mod=qr.executeUpdate();
		}
		if(mod>0)
			System.out.println("Successfully");
		else
			System.out.println("Not updated Successfully");
		
	}

}
