package com.exceptions;

import java.util.Scanner;
class Format {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
	        try { 
	            int num = Integer.parseInt ("rajumar") ; 
	            System.out.println(num); 
	        } 
	        catch(NumberFormatException e)
	        { 
	           e.printStackTrace();
	        } 
	    } 
	} 

