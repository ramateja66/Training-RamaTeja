package com.linkedlist;

import java.util.LinkedList;

public class LinkedlistTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Kiran");
		/* this method adds the object at first index */ 
		ll.push("Stoinis");
		ll.push("Pant");
	System.out.println(ll);
	/* this method returns the first object in linked list */
	System.out.println(ll.peekFirst());
	/* this method returns the last object in linked list */
	System.out.println(ll.peekLast());
	/* this method retunr the last object and removes it from the list */ 
	System.out.println(ll.pollLast());
	/* this method retunr the first object and removes it from the list */ 
	System.out.println(ll.pollFirst());
	System.out.println(ll);
	/* this methods deletes the first object from list*/ 
	System.out.println(ll.pop());
	System.out.println(ll);
	ll.add("Kiran");
	ll.add("murali");
	ll.add("rohit");
	LinkedList<String> bl=new LinkedList<String>();
	bl.push("ram");
	bl.push("ravi");
	/* to insert one linkked list elements into another */ 
	bl.addAll(ll);
	System.out.println(bl);
	/* this method adds object to tail of the list */
	bl.offer("madhu");
	System.out.println(bl);
	/*This method inserts the specified element at the front of this list.*/ 
	bl.offerFirst("King");
	/* This method inserts the specified element at the last of this list.*/ 
	bl.offerFirst("Queen");
	}

}
