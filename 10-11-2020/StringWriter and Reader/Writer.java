package com.StringWriter;

import java.io.IOException;
import java.io.StringWriter;

public class Writer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		StringWriter string=new StringWriter();
		String name="Technologies";
		string.write(name);
		String com=string.toString();
		System.out.println("String -" + com);
		StringBuffer buffer=string.getBuffer();
		System.out.println("StringBuffer -" +buffer);
		string.close();
	}

}
