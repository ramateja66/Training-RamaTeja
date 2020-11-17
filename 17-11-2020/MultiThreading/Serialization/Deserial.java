package com.ss;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserial {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream stream=new FileInputStream("d:\\bike.txt");
		ObjectInputStream inp=new ObjectInputStream(stream);
		Object o=inp.readObject();
		Information inf=(Information)o;
		System.out.println(inf.date + " " + inf.bikename + "  " + inf.price);

	}
}
