package com.ct.day3;
import java.util.*;
import java.util.stream.*;

public class SchoolService {

    List<Student> students;

    public SchoolService(List<Student> students) {
        this.students = students;
    }

    // 1. Filter students using FI + Lambda
    public List<Student> filterStudents(StudentFilter filter) {
        return students.stream()
                .filter(filter::check)
                .collect(Collectors.toList());
    }

    // 2. Get all student names (map + collect)
    public List<String> getAllNames() {
        return students.stream()
                .map(Student::getName)
                .collect(Collectors.toList());
    }

    // 3. Get top scorer (max + method reference)
    public Optional<Student> getTopScorer() {
        return students.stream()
                .max(Comparator.comparing(Student::getMarks));
    }

    // 4. Sort by marks (sorted + method reference)
    public List<Student> sortByMarksDesc() {
        return students.stream()
                .sorted(Comparator.comparing(Student::getMarks).reversed())
                .collect(Collectors.toList());
    }

    // 5. Count students grade-wise (groupingBy + count)
    public Map<String, Long> countByGrade() {
        return students.stream()
                .collect(Collectors.groupingBy(
                        Student::getGrade,
                        Collectors.counting()
                ));
    }

    // 6. Average marks of School (mapToInt + average)
    public double averageMarks() {
        return students.stream()
                .mapToInt(Student::getMarks)
                .average()
                .orElse(0);
    }

    // 7. Students who passed (>40) — uses reference print
    public void printPassedStudents() {
        students.stream()
                .filter(s -> s.getMarks() > 40)
                .forEach(System.out::println); // method reference
    }

    // 8. Second highest marks (sorted + skip)
    public Optional<Student> secondHighest() {
        return students.stream()
                .sorted(Comparator.comparing(Student::getMarks).reversed())
                .skip(1)
                .findFirst();
    }

    // 9. Reduce example — total marks of all
    public int totalMarks() {
        return students.stream()
                .map(Student::getMarks)
                .reduce(0, (a, b) -> a + b);
    }
}
