package com.ct.day3;

public class Student {
    private int id;
    private String name;
    private String grade;
    private int marks;

    public Student(int id, String name, String grade, int marks) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.marks = marks;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getGrade() { return grade; }
    public int getMarks() { return marks; }

    @Override
    public String toString() {
        return id + " - " + name + " (" + grade + "), Marks: " + marks;
    }
}
