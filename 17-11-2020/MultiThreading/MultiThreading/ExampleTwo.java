package com.threads;

public class ExampleTwo extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExampleTwo two=new ExampleTwo();
		two.start();
		for(int i=1;i<10;i++)
		{
			System.out.println(i);
		}
	}
	public void run()
	{
		for(int i=10;i<20;i++)
		{
			System.out.println(i);
		}
	}

}
