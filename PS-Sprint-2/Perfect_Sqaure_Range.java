package com.sprint2;

public class Perfect_Sqaure_Range {
	public static void main(String[] args) {

//		int n = 36;
//		int sqrt = (int) Math.sqrt(n);
//		
//		System.out.println(sqrt);
		
		
		for(int i=1;i<=10;i++)
		{
			int sqrt = (int) Math.sqrt(i);
			if(sqrt * sqrt == i)
			{
				System.out.print(i+" ");
			}
		}
	}
}
