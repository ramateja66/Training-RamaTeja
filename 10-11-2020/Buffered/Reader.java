package com.buffered;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Reader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*Creates a new FileReader, given the name of thefile to read from. */
		FileReader fiw=new FileReader("D://buff.txt");
		/* creates the bufferedreader object */ 
		BufferedReader br=new BufferedReader(fiw);
		/* displaying the result */ 
		int i=br.read();
		while(i!=-1)
		{
			System.out.print((char)i);
			i=br.read();
			
		}
		/* closing the buffered reader */ 
		br.close();

	}

}
