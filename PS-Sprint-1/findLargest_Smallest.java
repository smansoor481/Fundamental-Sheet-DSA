package com.sprint1;

public class findLargest_Smallest {
	public static void main(String[] args) {
		int[] arr = {4, 7, 1, 8, 5};
		int min = arr[0];
		int max = arr[0];
		
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		System.out.println("Minimum number: "+min);
		
		
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		
		System.out.println("Maximum number: "+max);

	}
}
