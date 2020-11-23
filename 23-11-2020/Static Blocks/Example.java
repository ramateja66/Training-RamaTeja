package com.blocks;

class Book
{
	public Book()
	{
		System.out.println("Book details");
	}
	static
	{
		System.out.println("Static block of Book Class");
	}
	static void method()
	{
		System.out.println("Book class static method");
	}
	
	
}
public class Example {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		Class book=Class.forName("com.blocks.Book");
		book.newInstance();
		Book.method();
		System.out.println(book.getName());


	}

}
