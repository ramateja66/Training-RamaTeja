package com.sleep;

public class Characters extends Thread
{
	public void run()
	{
		for(char i='A';i<'F';i++)
		{
			System.out.println(i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Characters ch=new Characters();
		ch.start();
	}

}
