package com.sprint2;

public class MatrixFibino {
	public static void main(String[] args) {
		int size = 3;
		int a = 1;
		int b = 1;
		for(int i=1;i<=size;i++)
		{
			for(int j=1;j<=size;j++)
			{
				System.out.print(a+" ");
				int next = a+b;
				a = b;
				b = next;
			}
			System.out.println();
		}
	}
}
