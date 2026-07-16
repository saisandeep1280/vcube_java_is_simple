package com.rough;

public class Stringdemo {

	public static void main(String[] args) {
		String s ="sandeep";
		String s2="sandeep";
		String s1 =new String("sandeep");
		String s3 =new String("sandeep");
		System.out.println(s==s2);
		System.out.println(s.equals(s1));
		System.out.println(s1.equals(s3));

	}

}
