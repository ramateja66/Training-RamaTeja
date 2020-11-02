package com.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list =new ArrayList<Integer>();
		list.add(10);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		Iterator<Integer> iter=list.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}

	}

}
