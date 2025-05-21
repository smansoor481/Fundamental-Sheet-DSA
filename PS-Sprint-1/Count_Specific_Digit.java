package com.sprint1;

public class Count_Specific_Digit {
	public static void main(String[] args) {
		int num = 122333223;
		int digit = 2;
		
		int count = 0;
		int temp = num;
		while(temp != 0)
		{
			int digi = temp % 10;
			if(digi == digit)
			{
				count++;
			}
			temp = temp / 10;
		}
		
		System.out.println(count);
	}
}
