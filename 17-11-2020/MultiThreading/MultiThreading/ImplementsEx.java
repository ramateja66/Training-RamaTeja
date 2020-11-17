package com.threads;

class Imp implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{
			System.out.println("i value is " + i);
		}
	}
	
}
public class ImplementsEx 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementsEx ex=new ImplementsEx();
		Imp imp=new Imp();
		Thread t=new Thread(imp);
		t.start();
		System.out.println(t.getName());
	}

}
