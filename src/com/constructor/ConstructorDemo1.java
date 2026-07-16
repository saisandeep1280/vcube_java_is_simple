package com.constructor;

import java.util.Scanner;

public class ConstructorDemo1 {
	int id;
	String name;
	String course;
	ConstructorDemo1(){
		id =101;
		name= "sai sandeep";
		course= "jfs";
	}
	public static void main(String[] args) {
		ConstructorDemo1 d = new ConstructorDemo1();
		Scanner sc =new Scanner(System.in);
		try {
		System.out.println("enter a your id");
		d.id = sc.nextInt();
		sc.nextLine();
		System.out.println("enter your name");
		d.name =sc.nextLine();
		System.out.println("enter your course name");
		d.course = sc.nextLine();
		}catch(Exception e){
			e.getStackTrace();
			System.out.println("in valid");
		}
		System.out.println("the id is :"+ d.id);
		System.out.println("the name is : "+ d.name);
		System.out.println("the course is : "+ d.course);
		sc.close();
	}
}
