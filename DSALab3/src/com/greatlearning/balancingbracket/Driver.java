package com.greatlearning.balancingbracket;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {

		BalancingBracket balance = new BalancingBracket();

		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter the String to check their Balancing Brackets :");
		String expr = myObj.nextLine();
		myObj.close();

		if (expr == null || expr.isEmpty()) {
			System.out.println("The entered String is empty");
		}

		else if (balance.areBracketsBalanced(expr)) {
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}

	}
}
