package com.listIterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(56);
		list.add(700);
		list.add(800);
		list.add(200);
		list.add(56);
		list.add(41);
		list.add(33);
		ListIterator<Integer> listIter=list.listIterator();
		while(listIter.hasNext())
		{
			System.out.println(listIter.next());
		}
	}

}
