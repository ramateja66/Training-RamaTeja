package com.user;

public class Book {

	public static void main(String[] args) throws MyException
	{
		// TODO Auto-generated method stub
		String bookName="trignomery";
		if(bookName.equalsIgnoreCase("geometry"))
			System.out.println("Same Book Name");
		else
			throw new MyException("Take book of same type");
	}

}
