package com.sprint1;

import java.util.Scanner;

public class Number_Pyramid {
	public static void main(String[] args) {
		/*
		 * 1
		 * 1 2
		 * 1 2 3
		 * 1 2 3 4
		 */
		
//		int num = 4;
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
