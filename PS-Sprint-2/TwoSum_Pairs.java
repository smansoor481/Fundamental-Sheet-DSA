package com.sprint2;

public class TwoSum_Pairs {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int target = 5;

		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j] == target)
				{
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}

	}
}
