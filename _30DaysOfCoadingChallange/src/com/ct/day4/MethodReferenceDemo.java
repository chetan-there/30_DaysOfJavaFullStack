package com.ct.day4;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Chetan", "Ram", "Sham");

        // 1. Static method reference
        names.forEach(MethodReferenceDemo::printName);

        // 2. Instance method reference
        MethodReferenceDemo demo = new MethodReferenceDemo();
        names.forEach(demo::printNameInstance);

        // 3. Instance method of a class (use map instead of forEach)
        names.stream().map(String::toUpperCase).forEach(System.out::println);

        // 4. Constructor reference (use Integer instead of Number)
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        numbers.stream().map(Integer::new).forEach(System.out::println);
    }

    // Static method
    public static void printName(String name) {
        System.out.println("Static: " + name);
    }

    // Instance method
    public void printNameInstance(String name) {
        System.out.println("Instance: " + name);
    }
}