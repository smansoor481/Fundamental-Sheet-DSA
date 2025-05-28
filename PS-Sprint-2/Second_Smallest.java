package com.sprint2;

public class Second_Smallest {
    public static void main(String[] args) {
        int[] arr = {12, 13, 1, 10, 34, 1};

        if (arr.length < 2) {
            System.out.println("Array doesn't have enough elements.");
            return;
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num > smallest && num < secondSmallest) {
                secondSmallest = num;
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("No second smallest element (all elements may be equal).");
        } else {
            System.out.println("Second smallest element is: " + secondSmallest);
        }
    }
}
