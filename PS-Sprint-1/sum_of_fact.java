package com.sprint1;

public class sum_of_fact {
	public static void main(String[] args) {
		int num = 4;
		int fact = 1;
		for(int i=1;i<=num;i++)
		{
			 fact = fact*i;
		}
		
		System.out.println(fact);
		
//		int fact = 24;
		int orgi = fact;
		int sum=0;
		while(orgi!=0)
		{
			int digit = orgi % 10;
			sum += digit;
			orgi = orgi / 10;
		}
		System.out.println(sum);
			
	}

}
