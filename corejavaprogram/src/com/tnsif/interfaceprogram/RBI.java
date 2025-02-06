package com.tnsif.interfaceprogram;

public class RBI implements Bank {

	@Override
	public float rateofinterest() {
		// TODO Auto-generated method stub
		return 9.3f;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new RBI();
		System.out.println("get rate of intrest"+b.rateofinterest());
}
}