
package com.tnsif.stringdemo;

public class Equalsmethod {
 public static void main(String[] args) {
	String s1="sachin";
	String s2="sachin";
	String s3=new String("sachin");
	String s4="tharun";
	
	System.out.println(s1.equals(s2));
	System.out.println(s1.equals(s3));
	System.out.println(s1.equals(s4));
}
}
