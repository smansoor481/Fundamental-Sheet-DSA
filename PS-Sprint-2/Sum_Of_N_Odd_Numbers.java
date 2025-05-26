package com.sprint2;

public class Sum_Of_N_Odd_Numbers {
	public static void main(String[] args) {
		int num = 5;
		
		int sum=0;
		int count = 0;
		int number = 1;
		
		
		while(count < num)
		{
			sum += number;
			number += 2;
			count++;
		}
		System.out.println(sum);
	}
}
