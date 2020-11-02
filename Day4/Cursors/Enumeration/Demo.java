package com.enumeration;

import java.util.Enumeration;
import java.util.Vector;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vect=new Vector<String>();
		vect.add("kane");
		vect.add("randy");
		vect.add("hhh");
		vect.add("undertaker");
		vect.add("john");
		Enumeration<String> num=vect.elements();
		while(num.hasMoreElements())
			System.out.println(num.nextElement());
		}

}
