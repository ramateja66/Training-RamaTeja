package com.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class Output {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		FileOutputStream out=new FileOutputStream("D:\\files.txt");
		out.write((char)65);
		out.close();
		
	}

}
