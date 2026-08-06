package com.dsa;

public class SludingWindow {

	public static void main(String[] args) {
		int [] users= {50,70,120,200,300,40,35,40};
		int days =3;
		int sum=0;
		int avg =0;
		for(int i=0;i<days; i++) {
			sum=sum+users[i];
		}
		avg= sum/days;
		System.out.println("first 3 windows : ");
		System.out.println("the sum :"+ sum);
		System.out.println("the avg : "+ avg);
		for(int i=0;i<users.length-days;i++) {
			sum=sum-users[i+1]+users[i+days-1];
			avg= sum/days;
			System.out.println("next every 3 windows : ");
			System.out.println("the sum :"+ sum);
			System.out.println("the avg : "+ avg);
		}
	}

}
