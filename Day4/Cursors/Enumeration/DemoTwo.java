package com.enumeration;

import java.util.Enumeration;
import java.util.Vector;

public class DemoTwo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Vector<String> cityList = new Vector<String>();
        
		cityList.add("Delhi");
		cityList.add("Agra");
		cityList.add("Bangalore");
		cityList.add("Kerala");
		cityList.add("Pune");
  
        
        Enumeration<String> num = cityList.elements(); 
        while(num.hasMoreElements())
        System.out.println(num.nextElement());
      

	}
	}

