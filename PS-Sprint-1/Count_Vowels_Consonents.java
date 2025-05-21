package com.sprint1;

public class Count_Vowels_Consonents {
	public static void main(String[] args) {
		String str =  "hello world";
		str = str.toLowerCase().replaceAll("\\s+", "");

		int vowels = 0;
		int consonents = 0;
		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || 
					str.charAt(i)=='o' || str.charAt(i)=='u' )
			{
				 vowels++;
			}
			else
			{
				consonents++;
			}
		}
		
		System.out.println("Vowel are: "+vowels);
		System.out.println("Consonents are: "+consonents);
	}

}

