package com.tnsif.exception;

public class Withexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=5;

		try {
			int d=5/0;
		}
		catch(ArithmeticException e) {
			System.out.println("get"+e);
			System.out.println("hii");
		}
	}

}
