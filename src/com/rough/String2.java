package com.rough;

public class String2 {

	public static void main(String[] args) {
		String s= "java is super";
		String rev="";
		for (int i=s.length()-1;i>=0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
	}

}
