package com.ss;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Information implements Serializable
{
	int date;
	String bikename;
	int price;
	public Information(int date,String bikename,int price)
	{
		super();
		this.date=date;
		this.bikename=bikename;
		this.price=price;
	}
}
public class Bike {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Information det=new Information(2017,"fz",3500);
		FileOutputStream stream=new FileOutputStream("d:\\bike.txt");
		ObjectOutputStream obj=new ObjectOutputStream(stream);
		obj.writeObject(det);
		obj.flush();
		obj.close();
		stream.close();
	}

}
