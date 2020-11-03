package com.member;

class GeneralScience
{
	int marks=50;
	void details()
	{
		System.out.println("Details of the Subjects");
	}
	class Physics
	{
		void numberOfChapter()
		{
	
			System.out.println("9 chapter");
		}
		void marks()
		{
			System.out.println("marks of the student are "+ marks);
		}
	}
}
public class Subjects {

	public static void main(String[] args)
	{
		GeneralScience science=new GeneralScience();
		GeneralScience.Physics physics=science.new Physics();
		science.details();
		physics.numberOfChapter();
		physics.marks();
		
	}

}
