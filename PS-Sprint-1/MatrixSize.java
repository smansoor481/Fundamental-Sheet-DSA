package com.sprint1;

public class MatrixSize {
	public static void main(String[] args) {
		int num = 3;
		int count = 1;
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=num;j++)
			{
				System.out.print(count);
				count++;
			}
			System.out.println();
		}
	}
}
