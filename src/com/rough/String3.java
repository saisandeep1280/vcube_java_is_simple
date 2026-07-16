package com.rough;

public class String3 {

	public static void main(String[] args) {
		String s= "hello world";
		char c ='l';
		int count = 0;
		for(int i=0; i<s.length();i++) {
			if (s.charAt(i) == c) {
				count ++;
			}
		}
		System.out.println(count);
	}

}
