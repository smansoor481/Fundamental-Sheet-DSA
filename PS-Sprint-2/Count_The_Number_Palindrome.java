package com.sprint2;

public class Count_The_Number_Palindrome {
	public static void main(String[] args) {
		String str = "aaa";
		
		int count = 0;
		
		for(int cen = 0; cen <= str.length()-1;cen++)
		{
			int left = cen;
			int right = cen;
			
			while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
                count++;
                left--;
                right++;
            }
			
			
			
			left = cen;
			right = cen+1;
			while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
                count++;
                left--;
                right++;
            }
			
		}
		
		System.out.println(count);
		
	 
		
		
		
	}
}
