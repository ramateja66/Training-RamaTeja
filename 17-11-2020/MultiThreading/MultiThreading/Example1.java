package com.threads;

class Extends extends Thread
{
	public void run()
	{
		
		for(int i=1;i<10;i++)
		{
			System.out.println("Thread value is " +i);
		}
	}
}
public class Example1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Extends ext=new Extends();
		ext.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Example values  " + i);
		}

	}

}
