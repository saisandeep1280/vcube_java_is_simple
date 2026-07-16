package com.rough;

import java.util.Scanner;

public class StringToArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s =sc.nextLine().toLowerCase();
		String a = s.trim();
		String []  q = a.split(" ");
		for (String w : q) {
		System.out.println(w);
		}
		
		char [] arr = a.toCharArray();
		for (char c :arr) {
			System.out.println(c);
		}
		sc.close();
	}

}
