package com.sprint2;

public class Sum_Single_Digit {
	public static void main(String[] args) {
		int num = 129;

		while(num >= 10)
		{
			int temp = num;
			int sum = 0;
			while(temp > 0)
			{
				int digit = temp % 10;
				sum += digit;
				temp /= 10;
			}
			
			num = sum;
			 
		}
		
		 
		System.out.println("Sum of digits is: "+num);
	}
}
