package com.printwriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Write {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*Instantiating filw writer and creating a file in the specified location " */
		FileWriter writer=new FileWriter("D://print.txt");
		/*Creating the object for the printWriter */ 
		PrintWriter print=new PrintWriter(writer);
		String s="Kings 11 punjab";
		/*Writing the string s into the print.text file */ 
		print.write(s);
		/*Writing the specified character of string in file */ 
		print.print(s.charAt(2));
		print.close();
		writer.close();
		
	}

}
