package com.charArray;

import java.io.CharArrayReader;
import java.io.IOException;

public class Reader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String s="Motivity labs" ;
		CharArrayReader reader=new CharArrayReader(s.toCharArray());
		int i=reader.read();
		while(i!=-1)
		{
			System.out.print((char)i);
			i=reader.read();
		}
		reader.close();

	}

}
