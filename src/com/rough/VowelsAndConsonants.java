package com.rough;

import java.util.Scanner;

public class VowelsAndConsonants {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String str =sc.nextLine();
		int vowels = 0;
		int consonants = 0;
		for(int i =0;i<str.length();i++) {
			char ch = Character.toLowerCase(str.charAt(i));
					if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
						vowels++;
					}else {
						consonants++;
					}
					
		}
		System.out.println("the vowels are: "+vowels);
		System.out.println("the consonants are :"+consonants);
		sc.close();
	}
}
