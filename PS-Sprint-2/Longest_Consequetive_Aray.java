package com.sprint2;

import java.util.Arrays;

public class Longest_Consequetive_Aray {
	public static void main(String[] args) {
		int[] arr = {100,4,200,1,3,2};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		
		int longestStrk = 1;
		int currentStrk = 1;
		
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i] == arr[i-1])
			{
				continue;
			}
			
			
			if(arr[i] == arr[i-1]+1)
			{
				currentStrk++;
			}
			else
			{
				longestStrk = Math.max(longestStrk, currentStrk);
			}
		}
		
		System.out.println(longestStrk);
		
	}
}
