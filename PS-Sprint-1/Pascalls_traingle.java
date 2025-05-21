package com.sprint1;

public class Pascalls_traingle {
	public static void main(String[] args) {
		int num = 4;
		
		for(int i=0;i<=num-1;i++)
		{
			int val = 1;
			for(int j=0;j<=i;j++)
			{
				System.out.print(val+" ");
				
				val = val * (i-j)/(j+1);
			}
			
			System.out.println();
		}
	}
}
