package com.user;

public class Person {

	public static void main(String[] args) throws MyException 
	{
		// TODO Auto-generated method stub
		int age=18;
		if(age>18)
		{
			System.out.println("YOu are eligible ");
		}
		else
			throw new MyException("Not elgible");
	}

}
