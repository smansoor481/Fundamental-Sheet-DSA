package com.sprint1;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n%10 == 0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
		
		
		// count the digits
		int num = 12345;
		int res = String.valueOf(num).length();
		System.out.println(res);

	}

}
