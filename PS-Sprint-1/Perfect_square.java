package com.sprint1;

public class Perfect_square {
	public static void main(String[] args) {
		int num = 14;
		
		int sum = 0;
		for(int i=1;i<=num-1;i++)
		{
			if(num%i==0)
			{
				sum = sum + i;
			}
		}
		
		if(sum == num)
		{
			System.out.println("Perfect square");
		}
		else
			System.out.println("Not perfect square");
		
	}
}
