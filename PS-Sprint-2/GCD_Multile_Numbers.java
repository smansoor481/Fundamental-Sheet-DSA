package com.sprint2;

public class GCD_Multile_Numbers {
	public static void main(String[] args) {
		int[] arr = {12,24,36};

		int result = arr[0];

		for (int i = 1; i < arr.length; i++) {
			int a = result;
			int b = arr[i];

			while (b != 0) {
				int temp = b;
				b = a % b;
				a = temp;
			}
			result = a;  // update result to current gcd
		}

		System.out.println("GCD of the array is: " + result);


	}
}
