package com.threads;

class Demo
{
	public void run()
	{

		for(int i=0;i<10;i++)
		{
			System.out.println("I value is " + i);
		}
	}
}
public class Without {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo demo=new Demo();
		demo.run();
		for(int j=0;j<10;j++)
		{
			System.out.println("J value is  " + j);
		}
		

	}

}
