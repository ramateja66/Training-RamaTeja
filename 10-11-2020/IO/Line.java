package com.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Line {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String sentence="Hello world";
		FileOutputStream stream=new FileOutputStream("D://file.txt");
		stream.write(sentence.getBytes());
		stream.close();

	}

}
