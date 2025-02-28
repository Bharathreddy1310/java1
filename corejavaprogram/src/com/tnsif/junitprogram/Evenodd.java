package com.tnsif.junitprogram;

import java.util.Scanner;

public class Evenodd {
	
	public static void main(String[] args) {
		Scanner e= new Scanner(System.in);
		System.out.println("enter the number");
		
		int a= e.nextInt();
		if(a%2==0)
		 System.out.println(a+"is the even number");
		 else
			 System.out.println(a+"is the odd number");
	}
	
	
}
