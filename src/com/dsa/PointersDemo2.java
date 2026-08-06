package com.dsa;

import java.util.Arrays;
import java.util.Scanner;

public class PointersDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter your numbers:");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));

        int start = 0;
        int end = arr.length - 1;

        int target = 15;

        while (start < end) {

            int sum = arr[start] + arr[end];

            if (sum == target) {

                System.out.println("Pair Found: " + arr[start] + " + " + arr[end] + " = " + target);
                System.out.println("Indexes: " + start + " -> " + end);

                start++;
                end--;
            } else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }
        sc.close();
    }
}