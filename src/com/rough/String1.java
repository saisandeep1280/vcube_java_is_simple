package com.rough;

import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String s = sc.nextLine();
		String [] str = s.split(" ");
		System.out.println("number of words in string is "+str.length);
        sc.close();

	}

}
