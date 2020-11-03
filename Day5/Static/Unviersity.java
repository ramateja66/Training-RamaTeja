package com.staticinner;


class Jntu
{
	static int i=50;
	static class Anurag
	{
		void examDetails()
		{
			System.out.println("Exam will started from November");
			
		}
		void totalStudents()
		{
			System.out.println("Total students is "+ i);
		}
	}
}
public class Unviersity {

	public static void main(String[] args) {
		Jntu.Anurag anurag=new Jntu.Anurag();
		anurag.examDetails();
		anurag.totalStudents();
	}

}
