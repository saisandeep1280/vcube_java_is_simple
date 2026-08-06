package com.array;

import java.util.Arrays;

public class MoveNegativeNumbers {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, 5, -6};
        int[] result = new int[arr.length];
        int index =0;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                result[index] = arr[i];
                index++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                result[index] = arr[i];
                index++;
            }
        }
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Result Array  : " + Arrays.toString(result));
    }
}
