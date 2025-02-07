package com.tnsif.exception;

public class Division {
	public static void divide() {
		int a=5,b=5,c;
		try {
			System.out.println("hyyy");
			int f=3/0;
			System.out.println("divison"+f);
		}
		catch(ArrayIndexOutOfBoundsException g) {
			System.out.println("exception caught"+g.getMessage());
		}
		catch(ArithmeticException h) {
			System.out.println("ae"+h.getMessage());
		}
		catch(IndexOutOfBoundsException k) {
			System.out.println("get"+k.getMessage());
			
		}
		catch(Exception l) {
			System.out.println("expe" +l.getMessage());
		}
	}

}
