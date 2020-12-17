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
		Session ss=Connecting.connect();
		int mod=0;
		Query qr=null;
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
					Insert.insert(ss);
					 break;				
			case 2:
					System.out.println("Which id do you want to update");
					System.out.println(" 1. name 2.address 3.section 4.marks");
					int mode=sc.nextInt();
					Update.update(ss, qr, mod,mode);
					Transaction tx=ss.beginTransaction();
					tx.commit();
					break;	
			case 3:
					Delete.delete(ss, qr, mod);
					break;
			case 4:
					Display.display(ss, qr);
					break;
			}
		}while(option!=5);
			System.out.println("Exited ");
		ss.close();
	}

}
