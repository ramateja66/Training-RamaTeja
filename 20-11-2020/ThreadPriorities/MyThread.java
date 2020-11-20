package com.priorities;

public class MyThread extends Thread {
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread thread=new MyThread();
		thread.setPriority(Thread.MAX_PRIORITY);
		thread.setName("Cook");
		MyThread thread2=new MyThread();
		thread2.setPriority(Thread.MIN_PRIORITY);
		thread2.setName("Paine");
		thread.start();
		thread2.start();
		}

}
