package com.condition;

import java.util.Scanner;

public class Animals {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Domestic Animal");
		System.out.println("   1.Cow");
		System.out.println("   2.Dog");
		System.out.println("2.Wild Animals");
		System.out.println("   1.Lion");
		System.out.println("   2.Tiger");
		System.out.println("enter the your slecton animal number");
		int animal = sc.nextInt();
		switch (animal) {
		
		case 1-> {
			System.out.println("wellcome to Domestic Animal");
			int Domestic = sc.nextInt();
			switch (Domestic) {
			case 1 -> System.out.println("Cow is a Domestic Animal ");
			case 2 -> System.out.println("Dog is a Domestic Animal");
			default -> System.out.println("the animal is not there ");
			}
		}
		case 2 ->{
			System.out.println("wellcom to Wild Animals ");
			int wild = sc.nextInt();
			switch (wild) {
			case 1 -> System.out.println("Lion is a Wild Animals");
			case 2 -> System.out.println("Tiger is a Wild Animals");
			default -> System.out.println("the animal is not there");
			}
			}
		default -> System.out.println("the catogry is not there");
		}
		
		sc.close();
	}

}
