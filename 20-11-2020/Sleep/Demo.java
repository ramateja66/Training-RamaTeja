package com.sleep;

public class Demo extends Thread{
	
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try {
				sleep(2000);
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo demo=new Demo();
		demo.start();
	}

}
