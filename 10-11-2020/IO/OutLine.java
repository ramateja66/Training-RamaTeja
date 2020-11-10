package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class OutLine {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream stream=new FileInputStream("D://file.txt");
		int i=stream.read();
		while(i!=-1)
		{
			System.out.print((char)i);
			i=stream.read();
		}

	}

}
