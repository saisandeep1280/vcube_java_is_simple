package com.caseStudy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Pizza");
		System.out.println("2.Burger");
		System.out.println("3.Biryani");
		System.out.println("enter your choice");
		int choice =sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter your base price:"); 
			double pbase= sc.nextDouble();
			System.out.println("enter topping charge");
			double topping = sc.nextDouble();
			Pizza p = new Pizza(pbase,topping);
			System.out.println("\n-------------------BILL-------------------");
			System.out.println("Food Item : "+ p.name);
			System.out.println("Base Price: "+ p.basePrice);
			System.out.println("final price: "+p.calculatePrice());
			break;
		case 2:
			System.out.println("Enter your base price:"); 
			double bubase= sc.nextDouble();
			System.out.println("Enter packing  charge: ");
			double packing= sc.nextDouble();
			Burger b = new Burger (bubase,packing);
			System.out.println("\n-------------------BILL-------------------");
			System.out.println("Food Item : "+ b.name);
			System.out.println("Base Price: "+ b.basePrice);
			System.out.println("final price: "+b.calculatePrice());
			break;
		case 3:
			System.out.println("Enter your base price:"); 
			double birbase= sc.nextDouble();
			System.out.println("Enter gst  charge: ");
			double gst= sc.nextDouble();
			Biryani b1= new Biryani(birbase, gst);
			System.out.println("\n-------------------BILL-------------------");
			System.out.println("Food Item : "+ b1.name);
			System.out.println("Base Price: "+ b1.basePrice);
			System.out.println("final price: "+b1.calculatePrice());
			break;
		default:
			System.out.println("invaild choice");
			
		}

		sc.close();
	}

}
