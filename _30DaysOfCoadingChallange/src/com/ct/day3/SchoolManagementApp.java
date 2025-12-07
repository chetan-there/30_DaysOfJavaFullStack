package com.ct.day3;

import java.util.Arrays;
import java.util.List;

public class SchoolManagementApp {
	public static void main(String[] args) {

		List<Student> list = Arrays.asList(new Student(1, "Rahul", "A", 90), new Student(2, "Sita", "B", 67),
				new Student(3, "Aman", "A", 45), new Student(4, "Rita", "C", 30), new Student(5, "Karan", "B", 85));

		SchoolService service = new SchoolService(list);

		System.out.println("=== Filter Students (Marks > 50) ===");
		service.filterStudents(s -> s.getMarks() > 50) // Lambda for FI
				.forEach(System.out::println);

		System.out.println("\n=== All Student Names ===");
		System.out.println(service.getAllNames());

		System.out.println("\n=== Top Scorer ===");
		System.out.println(service.getTopScorer().orElse(null));

		System.out.println("\n=== Sort by Marks Desc ===");
		service.sortByMarksDesc().forEach(System.out::println);

		System.out.println("\n=== Count by Grade ===");
		System.out.println(service.countByGrade());

		System.out.println("\n=== Average Marks ===");
		System.out.println(service.averageMarks());

		System.out.println("\n=== Passed Students ===");
		service.printPassedStudents();

		System.out.println("\n=== Second Highest Student ===");
		System.out.println(service.secondHighest().orElse(null));

		System.out.println("\n=== Total Marks of All Students ===");
		System.out.println(service.totalMarks());
	}
}
