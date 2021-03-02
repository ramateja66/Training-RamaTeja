package com.hibernate;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource({"classpath:application.properties"})
public class Main implements CommandLineRunner {

	@Autowired
	private Operations op;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Main.class, args);

	}
	
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
		if(option==1)
			{op.insert();}
		else if(option==2)
		{
			op.update();
		}
		else if(option==3)
		{
			op.delete();
		}
		else if(option==4)
			{op.display();}
	}

}
