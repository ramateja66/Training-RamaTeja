package com.member;

class Person
{
	int height=5;
	void personHeight()
	{
		System.out.println("Height of the person "+ height);
		Shiva king=new Shiva();
		king.name();
	}
	class Shiva
	{
		void name()
		{
			System.out.println("Name of the person is Shiva");
		}
	}
}
public class Details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person shiva=new Person();
		shiva.personHeight();

	}

}
