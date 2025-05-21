package com.sprint1;

public class SumOf_Even_Range {
	public static void main(String[] args) {
		int num = 10;
		int even = 0;
		int odd = 0;
		for(int i=1;i<=num;i++)
		{
			if(i%2==0)
			{
				even += i;
			}
			if(i%2==1)
			{
				odd += i;
			}
		}
		System.out.println("The sum of even numbers between 1 and 10 is: "+even);
		System.out.println("The sum of odd numbers between 1 and 10 is: "+odd);
	}
}
