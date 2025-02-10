package com.tnsif.exceptionhandeling;

public class Throwdemo {
	public void validate(int age) {
		try {
			if(age<18) {
				throw new ArithmeticException("you are not eligiable");
			
			}
			else {
				System.out.println("you are eligible");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Throwdemo d=new Throwdemo();
		d.validate(60);
		System.out.println("hello");
	}

}
