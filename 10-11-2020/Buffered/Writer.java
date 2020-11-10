package com.buffered;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/* creates an object for file writer and creates a connection to specified file mentione */ 
		FileWriter fis=new FileWriter("D://buff.txt");
		/* creater an object for buffered writer */
		BufferedWriter writer=new BufferedWriter(fis);
		/* writing a data into file using write method */ 
		writer.write(65);
		/* it goes to next line */ 
		writer.newLine();
		
		String s="India";
		String s2="Australia";
		/* writes the data in characters in the file */ 
		writer.write(s.toCharArray());
		writer.newLine();
		/* writes the data in form of String */ 
		writer.write(s2);
		writer.close();
		
		
	}

}
