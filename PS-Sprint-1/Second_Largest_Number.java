package com.sprint1;

import java.util.Arrays;

public class Second_Largest_Number {
	public static void main(String[] args) {
		int[] arr = {10,20,4,45,99};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		int first_Largest = arr.length-1;
		int second_Largest = arr.length-2;
		
		System.out.println("First Largest: "+arr[first_Largest]);
		System.out.println("Second Largest: "+arr[second_Largest]);
	}
}
