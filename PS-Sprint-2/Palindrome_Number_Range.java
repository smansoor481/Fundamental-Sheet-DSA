package com.sprint2;

public class Palindrome_Number_Range {
    public static void main(String[] args) {
        System.out.println("Palindrome numbers between 1 and 100:");

        for (int num = 1; num <= 100; num++) {
            int original = num;
            int reversed = 0;
            int temp = num;

            while (temp > 0) {
                int digit = temp % 10;
                reversed = reversed * 10 + digit;
                temp = temp / 10;
            }

            if (original == reversed) {
                System.out.print(original + " ");
            }
        }
    }
}
