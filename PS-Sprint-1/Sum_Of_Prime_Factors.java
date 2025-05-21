package com.sprint1;

public class Sum_Of_Prime_Factors {
	public static void main(String[] args) {
		int num = 12;
		int sum = 0;

		System.out.println("Prime factors of " + num + " are:");

		for (int i = 1; i <= num; i++) {
			// Check if 'i' is a factor
			if (num % i == 0) {
				// Now check if 'i' is prime
				boolean isPrime = true;

				if (i <= 1) {
					isPrime = false;
				} else {
					for (int j = 2; j <= Math.sqrt(i); j++) {
						if (i % j == 0) {
							isPrime = false;
							break;
						}
					}
				}

				// If it's a prime factor, print and add to sum
				if (isPrime) {
					System.out.println(i);
					sum += i;
				}
			}
		}

		System.out.println("Sum of prime factors: " + sum);
	}
}
