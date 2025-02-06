package com.tnsif.staticprogram;

public class Staticmethod {
	int rollno;
	String name;
	static String clg ="tkr";
	
	static void change() {
		clg="tkem";
	}
	Staticmethod(int n,String m){
	rollno=n;
	name=m;
	}
	void display() {
		System.out.println(rollno+" "+name+" "+clg);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staticmethod v=new Staticmethod(1,"shiva");
		v.display();
		Staticmethod.change();
		v.display();
	}

}
