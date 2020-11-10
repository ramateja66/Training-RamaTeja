package com.sequence;

import java.io.FileInputStream;

import java.io.IOException;

import java.io.SequenceInputStream;

public class Sequence {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*Creates a FileInputStream by opening a connection to an actual file mention in path*/
		
		FileInputStream fis=new FileInputStream("D://character.txt");
		FileInputStream fis2=new FileInputStream("D://print.txt");
		/* combining the two files and displaying the result */
		SequenceInputStream stream=new SequenceInputStream(fis,fis2);
		int i=stream.read();
		while(i!=-1)
		{
			System.out.print((char)i);
			i=stream.read();
		}
		stream.close();
		fis.close();
	}

}
