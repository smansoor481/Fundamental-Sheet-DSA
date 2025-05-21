package com.sprint1;

import java.util.Arrays;

public class ModeOfArray {
	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 3, 4, 4, 4};
		Arrays.sort(arr); // Sort the array first

		int mode = arr[0];
		int maxCount = 1;

		int current = arr[0];
		int count = 1;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == current) {
				count++;
			} else {
				if (count > maxCount) {
					maxCount = count;
					mode = current;
				}
				current = arr[i];
				count = 1;
			}
		}

		// Final check for the last number
		if (count > maxCount) {
			maxCount = count;
			mode = current;
		}

		System.out.println("Mode = " + mode);
	}
}

