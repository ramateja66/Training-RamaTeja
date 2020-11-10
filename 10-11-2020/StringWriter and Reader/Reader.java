package com.StringWriter;

import java.io.IOException;
import java.io.StringReader;

public class Reader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String name="Jnit Technologies";
		StringReader reader=new StringReader(name);
		int i=reader.read();
		while(i!=-1)
		{
			System.out.print((char)i);
			i=reader.read();
		}
	}

}
