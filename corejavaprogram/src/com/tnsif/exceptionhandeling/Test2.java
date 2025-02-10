package com.tnsif.exceptionhandeling;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(100/0);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			
		}
		finally {
			System.out.println("thankyou");
		}
	}
	

}
