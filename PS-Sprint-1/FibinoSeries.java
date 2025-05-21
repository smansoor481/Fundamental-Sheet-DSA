package com.sprint1;

import java.util.Scanner;

public class FibinoSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		while(a < n)
		{
			System.out.print(a+" ");
			int next = a+b;
			a = b;
			b = next;
		}
	}
}
