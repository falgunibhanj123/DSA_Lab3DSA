package com.greatlearning.balancingbracket;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancingBracket {
	public boolean areBracketsBalanced(String s) {

		Deque<Character> stack = new ArrayDeque<Character>();
		for (int i = 0; i < s.length(); i++) {
			char x = s.charAt(i);

			if (x == '(' || x == '[' || x == '{') {
				stack.push(x);
				continue;
			}
			// if (stack.isEmpty())
			// return false;
			char check;
			switch (x) {
			case ')':
				check = stack.pop();
				if (check == '{' || check == '[')
					return false;
				break;

			case '}':
				check = stack.pop();
				if (check == '(' || check == '[')
					return false;
				break;

			case ']':
				check = stack.pop();
				if (check == '(' || check == '{')
					return false;
				break;

			default:
				System.out.println("Invalid Character in input String");
				return false;
			}
		}
		return (stack.isEmpty());
	}
}
