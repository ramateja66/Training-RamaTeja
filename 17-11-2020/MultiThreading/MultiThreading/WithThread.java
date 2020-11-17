package com.threads;

public class WithThread implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WithThread thread=new WithThread();
		Thread t=new Thread(thread);
		t.start();
		for(int j=0;j<10;j++)
		{
			System.out.println("j values are " + j);
		}

	}

	@Override
	public void run() {
		for(int i=1;i<10;i++)
		{
 			System.out.println("i values are " + i);
		}
	}

}
