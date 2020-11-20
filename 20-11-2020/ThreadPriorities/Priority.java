package com.priorities;


public class Priority extends Thread 
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Priority prior=new Priority();
		prior.setName("Joseph");
		prior.setPriority(1);
		Priority xyz=new Priority();
		xyz.setName("Hales");
		xyz.setPriority(10);
		prior.start();
		xyz.start();
		Priority abc=new Priority();
		abc.start();
		
	}

}
