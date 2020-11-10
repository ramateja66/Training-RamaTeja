package com.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Example {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String s="I love my country";
		String s2="India";
		/* creating the object of the writer class */ 
		Writer wt=new FileWriter("D://writer.txt");
		/* writing the s into the destination file */ 
		/* This is for storing the string in form of character array */ 
		wt.write(s.toCharArray());
		/*this is for storing the string in destination file */ 
		wt.write(s2);
		/*closing the writer */
		wt.close();
		

	}

}
