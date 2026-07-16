package com.whileloops;

import java.util.Scanner;

public class WhileEnterInterger {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int count =0;
		while(count <5) {
			System.out.print("enter a 5 even number :");
			int ev=sc.nextInt();
			if(ev%2==0) {
				count++;
			}
		}
		sc.close();
	}

}
