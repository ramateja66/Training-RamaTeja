package com.threads;

public class JoinDemo extends Thread{
	
	public void run()
	{
		for(int i=1; i <10 ;i++)
		{
		System.out.println("My thread");
	}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		JoinDemo demo=new JoinDemo();
		demo.start();
		demo.join();
		for(int i=1;i<10;i++)
		{
			System.out.println("MAin Thread");
		}
		
	}

}
