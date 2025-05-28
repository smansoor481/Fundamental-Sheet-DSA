package com.sprint2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sum_of_Numbers_String {
	public static void main(String[] args) {
		String str = "The Numbers are 12 and 34";
		
		Pattern pattern = Pattern.compile("\\d+");
		
		Matcher matcher = pattern.matcher(str);
		
		int sum = 0;
		while(matcher.find())
		{
			sum = sum + Integer.parseInt(matcher.group());
		}
		
		System.out.println("Sum of Numbers: "+sum);
		
	}
}
