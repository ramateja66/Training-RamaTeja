package com.ss;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable
{
	int id;
	String name;
	int salary;
	public Employee(int id,String name,int salary)
	{
		super();
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
}
public class SerialEx  {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		Employee emp=new Employee(101,"David",35000);
		FileOutputStream fstr=new FileOutputStream("d:\\emp.txt");
		ObjectOutputStream str=new ObjectOutputStream(fstr);
		str.writeObject(emp);
		str.flush();
		str.close();
	}

}
