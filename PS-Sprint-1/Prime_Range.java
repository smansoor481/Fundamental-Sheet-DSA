package com.sprint1;

public class Prime_Range {
	public static void main(String[] args) {
		int start = 1;  // starting number
		int end = 10;   // ending number

		int sum=0;
		System.out.println("Prime numbers between " + start + " and " + end + " are:");

		for (int num = start; num <= end; num++) {
			boolean isPrime = true;

			if (num <= 1) {
				isPrime = false;
			} else {
				for (int i = 2; i <= Math.sqrt(num); i++) {
					if (num % i == 0) {
						isPrime = false;
						break;
					}
				}
			}

			if (isPrime) {
				System.out.print(num + " ");
				
				sum += num;
			}
		}
		
		System.out.println();
		System.out.println("The sum of prime numbers between 1 and 10 is:" + sum);

	}
}
