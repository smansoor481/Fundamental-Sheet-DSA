package com.sprint1;

public class LeapYear {
	public static void main(String[] args) {
		int n = 2023;
		
		while(n!=0)
		{
			if((n%4==0 && n % 100 !=0) || (n%400==0))
			{
				System.out.println("It is a leap year");
			}
			else
			{
				System.out.println("Not leap year");
			}
			break;
		}
	}
}
