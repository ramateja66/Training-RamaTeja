package com.bootjdbc;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {

	@Autowired
	private EmployeeJdbc emp;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Main.class, args);

	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	//	System.out.println(emp.createTable());
		Scanner sc=new Scanner(System.in);
		System.out.println("Select your option");
		System.out.println("1.To Insert Details");
		System.out.println("2.To Update Details");
		System.out.println("3.To delete");
		System.out.println("4.To Display");
		int option=sc.nextInt();
		while(true)
			{
		if(option==1)
		{
			System.out.println("Enter id");
			int id=sc.nextInt();
			System.out.println("Enter name");
			String name=sc.next();
			System.out.println("Enter lname");
			String lname=sc.next();
			System.out.print("Enter marks");
			int marks=sc.nextInt();
			emp.insert(id,name, lname,marks);
		}
		else if(option==2)
		{
			System.out.println("Enter name");
			String name=sc.next();
			System.out.println("Enter lname");
			String lname=sc.next();
			System.out.print("Enter marks");
			int marks=sc.nextInt();
			System.out.println("Enter id");
			int id=sc.nextInt();
			emp.update(id, name, lname,marks);
		}
		else if(option==3)
		{
			System.out.println("Enter id");
			int id=sc.nextInt();
			emp.delet(id);
			
		}
		else if(option==4)
		{
			System.out.println("Enter id");
			int id=sc.nextInt();
			emp.display(id);
			
		}
		System.out.println("Do you want to enter");
		String oo=sc.next();
		if(oo.equalsIgnoreCase("no"))
				{
			break;
				}
		else
		{
			continue;
		}
		
			}
	}

}
