package com.ct.day3;

@FunctionalInterface
public interface StudentFilter {
    boolean check(Student s);
}
