package com.sprint1;

public class Largest_Palindrome_String {
	public static void main(String[] args) {
		String s = "babad";
		String longest = "";

		for (int i = 0; i < s.length(); i++) {
			// Check for odd-length palindrome
			int left = i, right = i;
			while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
				if ((right - left + 1) > longest.length()) {
					longest = s.substring(left, right + 1);
				}
				left--;
				right++;
			}

			// Check for even-length palindrome
			left = i;
			right = i + 1;
			while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
				if ((right - left + 1) > longest.length()) {
					longest = s.substring(left, right + 1);
				}
				left--;
				right++;
			}
		}

		System.out.println("Longest Palindromic Substring: " + longest);
	}
}
