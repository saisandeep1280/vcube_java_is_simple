package com.caseStudy;

import java.util.Scanner;

public class CsaeStudy2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("do you have library card (yes / no)");
		String libcard = sc.next();
		if(libcard.equalsIgnoreCase("yes")) {
			System.out.println("how many book are taken : ");
			int book =sc.nextInt();
			if(book>=3) {
				System.out.println("your cannot take book you reach limt");
			}else {
				
				 System.out.println("Select Book Category:");
	                System.out.println("1. Fiction");
	                System.out.println("2. Science");
	                System.out.println("3. History");

	                System.out.print("Enter your choice: ");
	                int choice = sc.nextInt();

	                switch (choice) {

	                    case 1:
	                        System.out.println("Borrowing Period: 7 days");
	                        break;

	                    case 2:
	                        System.out.println("Borrowing Period: 14 days");
	                        break;

	                    case 3:
	                        System.out.println("Borrowing Period: 21 days");
	                        break;

	                    default:
	                        System.out.println("Invalid Category");
	                }
	            }

	        } else if (libcard.equalsIgnoreCase("No")) {
	            System.out.println("Library card required to borrow books.");
	        } else {
	            System.out.println("Invalid Input");
	        }

	        sc.close();
	    }
	}