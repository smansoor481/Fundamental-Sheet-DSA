package com.sprint1;

public class PrimeNumber_lessthan_Given_Number {
    public static void main(String[] args) {

        int range = 20; // You can change this to any upper limit

        System.out.println("Prime numbers less than or equal to " + range + " are:");

        for (int num = 2; num <= range; num++) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
