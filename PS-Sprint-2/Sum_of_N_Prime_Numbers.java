package com.sprint2;

public class Sum_of_N_Prime_Numbers {
	public static void main(String[] args) {
		int num = 4;
		boolean isPrime = true;
		
		if(num <=1)
		{
			isPrime = false;
		}
		
		for(int i=2;i<=num;i++)
		{
			if(num%2==0)
			{
				isPrime = false;
				break;
			}
		}
		
		if(isPrime)
		{
			System.out.println("This is prime");
		}
		else
		{
			System.out.println("Not");
		}
	}
}
