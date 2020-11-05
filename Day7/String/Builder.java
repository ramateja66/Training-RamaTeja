package com.stringbuilder;

class Total
{
	void methods()
	{

		StringBuilder str=new StringBuilder("Under");
		str=str.append("John");
		/* appending the string to string buffer */ 
		System.out.println(str);
		/* returns the total length */ 
		System.out.println(str.length());
		/* returns the capacity */ 
		System.out.println(str.capacity());
		/* set the character at o index with character M */ 
		str.setCharAt(0, 't');
		System.out.println(str);
		/* to reverse the string */ 
		System.out.println(str.reverse());
		/* deletes the character at mentioned index */ 
		str.deleteCharAt(6);
		System.out.println(str);
	}
}
public class Builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Total total=new Total();
		total.methods();
	}

}
