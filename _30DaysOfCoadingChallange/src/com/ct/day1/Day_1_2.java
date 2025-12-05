package com.ct.day1;

// Topic: Data Types
//Key Differences from Primitive Types
//- Primitive types (like int, char, boolean) store actual values.
//- Non primitive types store references to objects in memory.
//- Non primitive types can be null, while primitive types cannot.
//- They usually start with a capital letter (e.g., String, Array, Object).

public class Day_1_2 {

	// Primitive Data Types
	byte b = 10;
	short s = 200;
	char c = 'A';
	boolean flag = true;
	int i = 1000;
	long l = 123456789L;
	float f = 12.34f;
	double d = 123.456;

	// Non-Primitive Data Types
	String name = "Chetan"; // String
	int[] marks = { 85, 90, 78 }; // Array
	Student student = new Student(1, "Ram"); // Object
	Day day = Day.MONDAY; // Enum

	public static void main(String[] args) {
		Day_1_2 demo = new Day_1_2();

		// Print primitive data types
		System.out.println("Byte: " + demo.b);
		System.out.println("Short: " + demo.s);
		System.out.println("Char: " + demo.c);
		System.out.println("Boolean: " + demo.flag);
		System.out.println("Int: " + demo.i);
		System.out.println("Long: " + demo.l);
		System.out.println("Float: " + demo.f);
		System.out.println("Double: " + demo.d);

		// Print non-primitive data types
		System.out.println("String: " + demo.name);
		System.out.println("Array element[1]: " + demo.marks[1]);
		System.out.println("Object: " + demo.student);
		System.out.println("Enum: " + demo.day);
	}
}

// Supporting class (Object example)
class Student {
	int id;
	String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student{id=" + id + ", name='" + name + "'}";
	}
}

// Enum example
enum Day {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}