package com.hibernate;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext cont=new ClassPathXmlApplicationContext("spring.xml");
		EmployeeDao dao=(EmployeeDao) cont.getBean("dao");
		int option;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("1.Insertion 2.Display 3.Update 4.Delete 5.Exit");
			option=sc.nextInt();
			switch(option)
			{
			case 1:
			{
				System.out.println("Enter id");
				int id=sc.nextInt();
				System.out.println("Enter name");
				String name=sc.next();
				System.out.println("Enter salrt");
				String sal=sc.next();
				EmployeeBean emp=new EmployeeBean();
				emp.setId(id);
				emp.setEname(name);
				emp.setEsalary(sal);
				System.out.println(dao.insertEmployee(emp));
				break;
			}
			case 2:
			{
				System.out.println("Do you want to vieew by 1. Id or 2.view All");
				int choice=sc.nextInt();
				if(choice==1)
				{
				System.out.println("Enter id of employee");
				int id=sc.nextInt();
				EmployeeBean bb=dao.searchEmployee(id);
				System.out.println(bb.getId()+"-"+bb.getEname()+"-"+bb.getEsalary());
				break;
				}
				else if(choice==2)
				{
					List<EmployeeBean> aa=dao.listEmployeees();
					Iterator<EmployeeBean> it=aa.iterator();
					while(it.hasNext())
					{
						EmployeeBean a=it.next();
						System.out.println(a.getEname());
					}
					break;
				}
			}
			case 3:
			{
				System.out.println("Enter id you want to update");
				int id=sc.nextInt();
				
			System.out.println("Enter name");
			String name=sc.next();
			System.out.println("enter salary");
			String sal=sc.next();
			EmployeeBean bean=new EmployeeBean();
			bean.setId(id);
			bean.setEname(name);
			bean.setEsalary(sal);
			System.out.println(dao.updateEmployee(bean));
			break;
			}
			case 4:
			{
				System.out.println("Enter id");
				int ii=sc.nextInt();
				System.out.println(dao.deleteEmployee(ii));
				break;
			}
			}	
		}while(option!=5);
		
			}

	}


