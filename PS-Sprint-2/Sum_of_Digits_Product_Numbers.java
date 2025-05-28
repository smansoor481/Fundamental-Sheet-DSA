package com.sprint2;

public class Sum_of_Digits_Product_Numbers {
	public static void main(String[] args) {
		int num1 = 12;
		int num2 = 34;
		
		int res = num1 * num2;
		
		int sum =0;
		
		int temp = res;
		while(temp!=0)
		{
			int digit = temp % 10;
			sum += digit;
			temp /=10;
		}
		
		System.out.println(sum);
		
		
	}
}
