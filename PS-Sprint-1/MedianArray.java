package com.sprint1;

import java.util.Arrays;

public class MedianArray {
	public static void main(String[] args) {
		int[] arr = {3,1,2,4,5};
		
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]=  temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		int sum = 0;
		for(int i=0;i<=arr.length-1;i++)
		{
			sum += arr[i];
		}
		
		int median = sum/arr.length;
		System.out.println("The median of the sorted array is :"+median);
		
		
		
		
		int base = 2;
		int exponent = 3;
		
		double res = Math.pow(base, exponent);
		System.out.println((int)res);
	}
}
