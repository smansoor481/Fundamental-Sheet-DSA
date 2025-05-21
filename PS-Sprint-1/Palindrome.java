package com.sprint1;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.toLowerCase().replaceAll("\\s+", "");
		boolean palindrome = true;
		int left = 0;
		int right = str.length()-1;

		while(str.charAt(left) != str.charAt(right))
		{
			palindrome = false;
			break;
		}

		left++;
		right--;

		if(palindrome)
		{
			System.out.println("This is palin");
		}
		else {
			System.out.println("not palin");
		}

	}
}
