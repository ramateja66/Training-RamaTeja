package com.blocks;

class Load
{
	public Load()
	{
		System.out.println("Load class constructor");
	}
	static 
	{
		System.out.println("Load class -- static method");
	}
}

public class ClassDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try {
			Class cot=Class.forName("com.blocks.Load");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
