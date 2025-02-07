package com.tnsif.exception;

public class Nestedtryexception {
	

	public static void check() {
		String str="TNS";
		int slength=str.length();
		System.out.println("string length"+slength);
		String anotherstring=null;
	int y=4;
	try {
		try {
			System.out.println(str.charAt(y));
		}
		catch(StringIndexOutOfBoundsException r) {
			System.out.println("string length"+anotherstring.length());
			
		}
	}
		catch(NullPointerException j) {
			System.out.println("exception"+j.getMessage());
			
		}
	}
}
	
		
