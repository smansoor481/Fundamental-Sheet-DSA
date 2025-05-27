package com.sprint2;

public class Largest_Prime_Factor {
	public static void main(String[] args) {
		int num = 28;

		int i = 2;
		int largest = 0;

		while(num > 1)
		{
			if(num%i==0)
			{
				largest = i;
				num = num / i;
			}
			else
			{
				i++;
			}
		}

		System.out.println("Largest prime factor is: " + largest);


	}
}
