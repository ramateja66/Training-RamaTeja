package com.blocks;

public class Static
{
	static
	{
		System.out.println("Static Block");
	}
	static void message()
	{
		System.out.println("Static method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method");
		Static.message();

	}

}
