package com.sprint1;

public class Missing_Number {
	public static void main(String[] args) {
		
		int[] arr1 = {1,2,4,5};
		int sum1 = 0;
		for(int i=0;i<=arr1.length-1;i++)
		{
			sum1 += arr1[i];
		}
		
		int n = 5;
		int expectedSum= n*(n+1)/2;
		
		int missNumber = expectedSum - sum1;
		
		System.out.println(missNumber);
		
		
		
	}
}
