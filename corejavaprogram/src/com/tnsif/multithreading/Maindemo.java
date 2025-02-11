package com.tnsif.multithreading;

public class Maindemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eclipse e=new Eclipse();
		e.start();
		
		Notepad f=new Notepad();
		f.start();
		
		Chrome g=new Chrome();
		g.start();
		
		System.out.println("mainmethod"+Thread.currentThread().getId());
	}

}
