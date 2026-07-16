package com.condition;

import java.util.Scanner;

public class SpecialChars {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a char");
		char c =sc.next().charAt(0);
		if(Character.isUpperCase(c)) {
			System.out.println(" char is upper case letter");
		}else if(Character.isLowerCase(c)) {
			System.out.println("char is lower case letter");
		}else if(Character.isDigit(c)) {
			System.out.println("char is digit ");
		}else {
			System.out.println("char is special Character");
		}
		sc.close();
	}

}
