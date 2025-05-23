package com.sprint2;

public class Multiplication_Table_For_Range {
	public static void main(String[] args) {
		 
		int start = 2;
		int end = 4;
		for(int i=start;i<=end;i++)
		{
			for(int j=1;j<=end;j++)
			{
				System.out.println(i +" x " + j +" = " + i*j);
			}
			System.out.println();
		}
	}
}
