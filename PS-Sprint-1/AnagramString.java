package com.sprint1;

import java.util.Arrays;

public class AnagramString {
	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silent";

		if(str1.length() != str2.length())
			System.out.println(false);


		char[] char1 = str1.toCharArray();
		char[] char2 = str2.toCharArray();


		Arrays.sort(char1);
		Arrays.sort(char2);


		if(Arrays.equals(char1, char2))
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not Anagram");
		}






	}
}
