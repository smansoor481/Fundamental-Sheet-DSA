package com.sprint1;

public class Length_String_without_InBuilt {
	public static void main(String[] args) {
		String str = "hello";
		
		char[] cha =  str.toCharArray();
		
		int count = 0;
		for(int res : cha)
		{
			count++;
		}
		System.out.println(count);
	}
}
