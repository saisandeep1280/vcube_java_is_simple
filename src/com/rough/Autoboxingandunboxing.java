package com.rough;

public class Autoboxingandunboxing {

	public static void main(String[] args) {
		Integer i = 10; 
		System.out.println("Autoboxing: " + i); 
		
		int j = i; 
		System.out.println("Unboxing: " + j); 
		
		int a =25;
		Integer obj =a;//Auto boxing
		System.out.println(obj);
		
		
		Integer in = 29;
		int ss =in;//Auto unboxing
		System.out.println(ss);
		Integer c =126;
		Integer d =126;
		System.out.println(c==d);
		System.out.println(c.equals(d));
		
	}

}
