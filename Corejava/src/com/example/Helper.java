package com.example;

//overloding Example
public class Helper {
 
	 
	static int multiply(int a,int b) {
		
		return a*b;
	}
	
	static int multiply(int a,int b,int c) {
		
		return a*b*c;
	}
	  
	public static void main(String[] args) {
	
		System.out.println(Helper.multiply(10, 20));
		System.out.println(Helper.multiply(11, 12, 23));
	}

}
