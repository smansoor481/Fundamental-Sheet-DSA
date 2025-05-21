package com.sprint1;

public class Sum_of_Squares_of_digit {
	public static void main(String[] args) {
		int num = 123;
		
		int temp = num;
		int sum = 0;
		while(temp != 0)
		{
			int digit = temp % 10;
			sum += Math.pow(digit, 2);
			temp = temp / 10;
		}
		
		System.out.println(sum);
	}
}
