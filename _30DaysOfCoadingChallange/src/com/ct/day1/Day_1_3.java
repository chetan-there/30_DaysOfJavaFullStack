package com.ct.day1;

// Topic: Control Flow
public class Day_1_3 {

	public static void main(String[] args) {

		int marks = 65;
		int day = 3;

		// -------------------------
		// Decision Making Statements
		// -------------------------

		// if
		if (marks > 35) {
			System.out.println("Pass (if)");
		}

		// if-else
		if (marks >= 75) {
			System.out.println("Distinction (if-else)");
		} else {
			System.out.println("Not Distinction (if-else)");
		}

		// if-else-if ladder
		if (marks >= 75) {
			System.out.println("Distinction (if-else-if ladder)");
		} else if (marks >= 60) {
			System.out.println("First Class (if-else-if ladder)");
		} else if (marks >= 35) {
			System.out.println("Pass (if-else-if ladder)");
		} else {
			System.out.println("Fail (if-else-if ladder)");
		}

		// switch statement
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		default:
			System.out.println("Other Day");
		}

		// -------------------------
		// Looping Statements
		// -------------------------

		// for loop
		System.out.println("For loop:");
		for (int i = 1; i <= 5; i++) {
			System.out.println("i = " + i);
		}

		// while loop
		System.out.println("While loop:");
		int j = 1;
		while (j <= 5) {
			System.out.println("j = " + j);
			j++;
		}

		// do-while loop
		System.out.println("Do-While loop:");
		int k = 1;
		do {
			System.out.println("k = " + k);
			k++;
		} while (k <= 5);

		// -------------------------
		// Break and Continue
		// -------------------------
//		- break = stop the loop/switch completely.
//		- continue = skip one iteration, keep looping.


		System.out.println("Break example:");
		for (int x = 1; x <= 5; x++) {
			if (x == 3)
				break; // exits loop when x == 3
			System.out.println("x = " + x);
		}

		System.out.println("Continue example:");
		for (int y = 1; y <= 5; y++) {
			if (y == 3)
				continue; // skips iteration when y == 3
			System.out.println("y = " + y);
		}
	}
}