package com.stringBuffer;

class Total
{
	void methods()
	{
		StringBuffer string=new StringBuffer("Smith");
		string=string.append("Williamson");
		/* appending the string to string buffer */ 
		System.out.println(string);
		/* returns the total length */ 
		System.out.println(string.length());
		/* returns the capacity */ 
		System.out.println(string.capacity());
		/* set the character at o index with character M */ 
		string.setCharAt(0, 'M');
		System.out.println(string);
		/* to reverse the string */ 
		System.out.println(string.reverse());
		/* deletes the character at mentioned index */ 
		string.deleteCharAt(6);
		System.out.println(string);
	}
}
public class Buffer {

	public static void main(String[] args) {
		
		Total total=new Total();
		total.methods();

	}

}
