package com.ct.day1;

// Topic: Variables
public class Day_1_1 {

	// Class-level variables (fields)
	int id; // instance variable
	String name; // instance variable
	int marks; // instance variable
	static int count; // static variable (shared across all objects)

	// Constructor
	public Day_1_1(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
		count++; // increment static variable whenever a new object is created
	}

	// Method with local variable
	public void isPass() {
		int passBoundary = 35; // local variable
		if (marks >= passBoundary) {
			System.out.println(name + " (ID: " + id + ") → Pass");
		} else {
			System.out.println(name + " (ID: " + id + ") → Fail");
		}
	}

	// Static method to show total students created
	public static void showCount() {
		System.out.println("Total students created: " + count);
	}

	// Main method
	public static void main(String[] args) {
		// Creating multiple objects
		Day_1_1 s1 = new Day_1_1(1, "Ram", 36);
		Day_1_1 s2 = new Day_1_1(2, "Shyam", 25);
		Day_1_1 s3 = new Day_1_1(3, "Geeta", 75);

		// Checking pass/fail for each student
		s1.isPass();
		s2.isPass();
		s3.isPass();

		// Showing static variable effect
		Day_1_1.showCount(); // prints total students created
	}
}