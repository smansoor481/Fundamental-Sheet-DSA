package com.sprint1;

public class Sum_of_Digits {
	public static void main(String[] args) {
		int n = 1234;
		int temp = n;
		int sum = 0;
		while(temp!=0)
		{
			int digit = temp % 10;
			sum = sum + digit;
			temp = temp / 10;
		}
		System.out.println(sum+" ");
	}
}	
