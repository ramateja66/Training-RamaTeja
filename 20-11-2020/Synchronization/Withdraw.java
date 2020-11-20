package com.synchronizationexamples;

class MyAccount
{
	int balance=1000;
	public synchronized void cash(int balance)
	{
		System.out.println("Cash is withdrawn succesfully");
		if(this.balance<balance)
		{
			System.out.println("Add some money");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.balance=this.balance-balance;
		System.out.println("Withdrawn completed");
	}
	public synchronized void deposit(int balance)
	{
		System.out.println("Depsoting the money");
		this.balance+=balance;
		System.out.println("Successfully deposited");
		notify();
	}
}
public class Withdraw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyAccount rahul=new MyAccount();
		new Thread() {
			public void run()
			{
				rahul.cash(20000);
			}
			
		}.start();
		new Thread() {
			public void run()
			{
				rahul.deposit(20000);
			}
			
		}.start();
	}

}
