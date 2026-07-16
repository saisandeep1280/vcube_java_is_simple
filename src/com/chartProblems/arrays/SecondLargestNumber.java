package com.chartProblems.arrays;
import java.util.Scanner;
public class SecondLargestNumber {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter array size: ");
	        int size = sc.nextInt();

	        if (size < 2) {
	            System.out.println("Second largest element doesn't exist.");
	            sc.close();
	            return;
	        }

	        int[] arr = new int[size];

	        System.out.print("Enter elements: ");
	        for (int i = 0; i < size; i++) {
	            arr[i] = sc.nextInt();
	        }

	        int largest, secondLargest;

	        // Initialize largest and secondLargest
	        if (arr[0] > arr[1]) {
	            largest = arr[0];
	            secondLargest = arr[1];
	        } else {
	            largest = arr[1];
	            secondLargest = arr[0];
	        }

	        // Traverse remaining elements
	        for (int i = 2; i < size; i++) {

	            if (arr[i] > largest) {
	                secondLargest = largest;
	                largest = arr[i];
	            } else if (arr[i] > secondLargest && arr[i] != largest) {
	                secondLargest = arr[i];
	            }
	        }

	        if (largest == secondLargest) {
	            System.out.println("Second largest element doesn't exist.");
	        } else {
	            System.out.println("Largest = " + largest);
	            System.out.println("Second Largest = " + secondLargest);
	        }
	        sc.close();
	    }
	}