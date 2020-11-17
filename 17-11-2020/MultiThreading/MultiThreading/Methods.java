package com.threads;

public class Methods extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods meth=new Methods();
		System.out.println(meth.isAlive());
		meth.start();
		System.out.println(meth.isAlive());
		System.out.println("Default name " +meth.getName());
		meth.setName("Jon");
		System.out.println("After assigning the name " +meth.getName());
	}
	public void run()
	{
		System.out.println("HEllo");
	}
}
