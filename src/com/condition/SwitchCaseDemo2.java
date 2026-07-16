package com.condition;

import java.util.Scanner;

public class SwitchCaseDemo2 {
	String getmarks(int marks) {
		String grade=" ";
		if(marks>100) {
			System.out.println("plese enter correct marks");
		}else {
			grade = switch(marks/10) {
			case 10 -> "A+";
			case 9 ->  "A";
			case 8 ->  "B";
			case 7 ->  "C";
			case 6 ->  "D";
			case 5 ->  "e";
			case 4,3 ->  "just pass";
			default -> "failed";
			};
		}
		return grade;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SwitchCaseDemo2 s= new SwitchCaseDemo2();
		System.out.println("enter the marks : ");
		int marks =sc.nextInt();
		String result =s.getmarks(marks);
		System.out.println(result);
		sc.close();
	}

}
