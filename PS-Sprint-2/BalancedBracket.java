package com.sprint2;

import java.util.Stack;

public class BalancedBracket {
	public static void main(String[] args) {
		String str = "{[()]}";

		Stack<Character> st = new Stack<Character>();
		boolean isBalanced = true;

		for(char ch : str.toCharArray())
		{
			if(ch == '{' || ch == '[' || ch == '(')
			{
				st.push(ch);
			}
			else if(ch == '}' || ch == ']' || ch == ')')
			{
				if(st.isEmpty())
				{
					isBalanced = false;
					break;
				}

				char top = st.pop();
				if (!((top == '(' && ch == ')') ||
						(top == '{' && ch == '}') ||
						(top == '[' && ch == ']'))) {
					isBalanced = false;
					break;
				}
			}
		}

		if (!st.isEmpty()) {
			isBalanced = false;
		}

		System.out.println("Is balanced? " + isBalanced);
	}
}
