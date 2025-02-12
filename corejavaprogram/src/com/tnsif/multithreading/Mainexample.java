package com.tnsif.multithreading;


class Eclipe implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Eclipe"+Thread.currentThread().getId());
	}
	
}
	class Flipcart implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("FLipcart"+Thread.currentThread().getId());
		}
		
	}
	
	
public class Mainexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eclipe e=new Eclipe();
		Thread obj=new Thread(e);
		obj.start();
		obj.setPriority(Thread.MAX_PRIORITY);
		
		Flipcart f=new Flipcart();
		Thread obj1=new  Thread(f);
		obj1.setPriority(Thread.MIN_PRIORITY);
		
		for(int i=0;i<5;i++)
			System.out.println("mainmethod"+Thread.currentThread().getId());

	}

}


