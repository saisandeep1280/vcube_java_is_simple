package com.caseStudy;

import java.util.Scanner;

public class StdentMarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[25];
		int pass=0;
		int fail=0;
		int highest=0;
		int lowest=0;
		int sum =0;
		System.out.print("enter the marks  :");
		for(int i=0; i<arr.length;i++) {
			arr[i] =sc.nextInt();
			sum +=arr[i];
			if(arr[i]>100) {
				System.out.println("invalid marks");
				break;
			}
			else if(arr[i]>=35) {
				pass++;
			}else {
				fail++;
			}
			if(i==0) {
				lowest =arr[i];
				highest =arr[i];
			}else {
				if(arr[i]>highest) {
					highest =arr[i];
				}
				if(arr[i]<lowest) {
					lowest=arr[i];
				}
			}
		}
		double average = sum/arr.length;
		System.out.println("number of passed student : "+ pass);
		System.out.println("number of failed student : "+ fail);
		System.out.println("highest marks : "+ highest);
		System.out.println("lowest marks : "+ lowest);
		System.out.println("class  average marks : "+average);

		sc.close();
	}

}
