package com.writer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Displaying {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/* Instantiating the reader class */ 
		Reader rd=new FileReader("D:\\writer.txt");
		/* reading the data through read method */ 
		int i=rd.read();
		/* checking the character till end displaying the data */ 
		while(i!=-1)
		{
			System.out.print((char)i);
			i=rd.read();
		}
		/* closing the reader object */ 
		rd.close();
		

	}

	
}
