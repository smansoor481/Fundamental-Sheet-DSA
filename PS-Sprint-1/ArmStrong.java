package com.sprint1;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 153;
		int count = String.valueOf(num).length();
		int original = num;
		int sum = 0;
		while(num!=0)
		{
			int digit = num % 10;
			sum += Math.pow(digit, count);
			num/= 10;
		}
		
		if(original== sum)
		{
			System.out.println("This is ArmStrong");
		}
		else
			System.out.println("Not armstrong");

	}

}
