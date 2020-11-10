package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Input {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*a FileInputStream byopening a connection to an actual file to specified file */ 
		FileInputStream input=new FileInputStream("D:\\files.txt");
		
		int i=input.read();
		System.out.println((char)i);
	}

}
