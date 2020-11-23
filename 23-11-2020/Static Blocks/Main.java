package com.blocks;

class Oracle 
{
	public Oracle()
	{
		System.out.println("Oracle class Constructor");
	}
	static
	{
		System.out.println("Oracle class static methods");
	}
}
class MySql
{
	public MySql()
	{
		System.out.println("Mysql class Constructor");
	}
	static 
	{
		System.out.println("MySql class static methods");
	}
}
public class Main {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		Class oracle=Class.forName("com.blocks.Oracle");
		oracle.newInstance();
		Class mysql=Class.forName("com.blocks.MySql");
		mysql.newInstance();
		System.out.println(oracle.getName());
		System.out.println(mysql.getName());
		
	}

}
