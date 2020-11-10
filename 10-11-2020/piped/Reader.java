package com.pipe;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class Reader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/* creating a object of piped reader */ 
		PipedReader read=new PipedReader();
		/* creating an object of piped writer */ 
		PipedWriter writer=new PipedWriter();
		/* conecter reader to writer through connect */ 
		read.connect(writer);
		/* writing through write method */ 
		writer.write(65);
		/* displaying the result */ 
		System.out.println(read.read());
		/* writing through write method */ 
		writer.write("JNIT");
		/* displaying the result */ 
		int i =read.read();
		while(i!=-1)
		{
			System.out.print((char)i);
			i=read.read();
		}
		read.close();
		writer.close();
		
	}

}
