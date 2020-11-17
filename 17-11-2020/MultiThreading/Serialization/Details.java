package com.ss;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class Details {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream fit=new FileInputStream("d:\\emp.txt");
		ObjectInputStream oist=new ObjectInputStream(fit);
		Object o=oist.readObject();
		Employee emp=(Employee)o;
		System.out.println(emp.id + " " + emp.name+"  " +emp.salary);

	}	
}
