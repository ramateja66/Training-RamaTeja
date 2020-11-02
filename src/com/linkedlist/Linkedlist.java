package com.linkedlist;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll=new LinkedList<Integer>();
	/* To add objects into linkedlist */
		ll.add(10);
		ll.add(20);
		ll.add(5);
		ll.add(25);
		ll.add(8);
		ll.add(56);
		ll.add(3);
		ll.add(10);
		System.out.println(ll);
		/* to get the first object in linkedlist*/
		System.out.println(ll.getFirst());
		/* to get the last object int linkedlist */
		System.out.println(ll.getLast());
		/* to remove the first object */ 
		ll.removeFirst();
		/* to remove the last object */ 
		ll.removeLast();
		/* to add first elemnet */ 
		ll.addFirst(56);
		/* to add the last object */ 
		ll.addLast(89);
		/* to check whether linked list contains or not */
		System.out.println(ll.contains(50));
		/* to get size of linkedlist */ 
		System.out.println(ll.size());
		/* to remove the object */ 
		ll.remove(5);
		/* to get the object ffrom given index */ 
		System.out.println(ll.get(5));
		/* to set the object in linkedlist at specified index */ 
		ll.set(0,99);
		/* to know the index of object */ 
		System.out.println(ll.indexOf(25));
		/* to get the first object in linkedlist */
		System.out.println(ll.peek());
		System.out.println(ll);
		System.out.println(ll.element());
		/*This method retrieves and removes the head (first element) of this list.*/
		System.out.println(ll.poll());
		System.out.println(ll);

	}

}
