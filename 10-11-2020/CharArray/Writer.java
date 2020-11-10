package com.charArray;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

	public static void main(String[] args) throws IOException {
		
		CharArrayWriter writer=new CharArrayWriter();
		FileWriter fiw=new FileWriter("D://character.txt");
		String s="Motivity Labs";
		writer.write(s);
		writer.writeTo(fiw);
		writer.close();
	}

}
