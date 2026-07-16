package com.loops;

public class Loops1 {

	public static void main(String[] args) {

		int a=0;
		
		for(a=0;a<=10;a++)//a=a+1; a++
		{
			System.out.println("hello" + (a=a%2));
		}
		System.out.println(a);
	}
}
