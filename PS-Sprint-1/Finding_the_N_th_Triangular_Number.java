package com.sprint1;

public class Finding_the_N_th_Triangular_Number {
	public static void main(String[] args) {
		int num = 5;
		int sum=0;
		for(int i=0;i<=num;i++)
		{
			sum += i;
		}
		
		System.out.println("The 4th triangular number is:"+sum);
		
		
		
		// Perfect square
		int n = 17;
		
		int per = (int) Math.sqrt(n);
		
		
		if(per * per == n)
		{
			System.out.println(n+" is a perfect square");
		}
		else
		{
			System.out.println(n+" Not perfect sqaure");
		}
		 
		
	}
}
