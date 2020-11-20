package com.synchronizationexamples;

class Trainees
{
	public synchronized void message(String name)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print("Welcome to the company");
			try {
				Thread.sleep(2000);
				System.out.println(" " + name);
			} 
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Display extends Thread
{
	Trainees trainees;
	String name;
	public Display(Trainees trainees,String name)
	{
		super();
		this.trainees=trainees;
		this.name=name;
	}
	public void run()
	{

		trainees.message(this.name);
	}
	}

public class Welcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Trainees batch10=new Trainees();
		Display disp=new Display(batch10,"Motivity Labs");
		disp.start();
		Display jnit=new Display(batch10,"JNIT");
		jnit.start();

	}

}
