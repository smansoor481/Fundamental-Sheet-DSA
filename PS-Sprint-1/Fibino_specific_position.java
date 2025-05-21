package com.sprint1;

public class Fibino_specific_position {
	public static void main(String[] args) {
		int num = 5;
		int a = 0;
		int b = 1;
		while(a <= num)
		{
			System.out.print(a+" ");
			int next = a+b;
			a = b;
			b = next;
		}
	}
}
