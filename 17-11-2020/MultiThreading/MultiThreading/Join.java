package com.threads;

import java.util.Scanner;

public class Join extends Thread {
	int x,y;
	public void run()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x and y values");
		x=sc.nextInt();
		y=sc.nextInt();
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Join jn=new Join();
		jn.start();
		jn.join();
		System.out.println("sum -" + (jn.x+jn.y));
	}

}
