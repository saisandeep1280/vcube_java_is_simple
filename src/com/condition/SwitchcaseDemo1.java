package com.condition;

import java.util.Scanner;

public class SwitchcaseDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the your catagory : ");
		String ticket = sc.nextLine().toUpperCase();
		switch(ticket) {
		case "G"->System.out.println("the price is 150");
		case "P"-> System.out.println("the price is 250");
		case "V" -> System.out.println("the price is 400");
		default -> System.out.println("invalid ticket entry");
		}
		sc.close();
	}

}
