package com.ct.day1;

// Topic: OOP Concepts
public class Day_1_4 {
	public static void main(String[] args) {
		// -------------------------
		// Encapsulation demo
		// -------------------------
		Student1 student = new Student1();
		student.setId(1);
		student.setName("Chetan");
		System.out.println("Encapsulation → Student ID: " + student.getId() + ", Name: " + student.getName());

		// -------------------------
		// Inheritance demo (Single, Multilevel, Hierarchical)
		// -------------------------
		Dog dog = new Dog();
		dog.eat(); // inherited from Animal
		dog.sound(); // overridden method

		Puppy puppy = new Puppy(); // multilevel inheritance
		puppy.sound();

		Cat cat = new Cat(); // hierarchical inheritance
		cat.sound();

		// -------------------------
		// Polymorphism demo (Overloading + Overriding)
		// -------------------------
		Calculator calc = new Calculator();
		System.out.println("Overloading → add(int,int): " + calc.add(5, 10));
		System.out.println("Overloading → add(double,double): " + calc.add(5.5, 2.5));

		Animal animal1 = new Dog(); // runtime polymorphism
		Animal animal2 = new Cat();
		animal1.sound(); // Dog's version
		animal2.sound(); // Cat's version

		// -------------------------
		// Abstraction demo (Abstract class + Interface)
		// -------------------------
		Vehicle car = new Car();
		Vehicle bike = new Bike();
		car.start();
		bike.start();

		Shape circle = new Circle();
		Shape rectangle = new Rectangle();
		circle.draw();
		rectangle.draw();
	}
}

// -------------------------
// Encapsulation
// -------------------------
class Student1 {
	private int id; // private → hidden data
	private String name;

	// public getters and setters → controlled access
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

// -------------------------
// Inheritance (Single, Multilevel, Hierarchical)
// -------------------------
class Animal {
	void eat() {
		System.out.println("Animal eats food");
	}

	void sound() {
		System.out.println("Animal makes sound");
	}
}

class Dog extends Animal {
	@Override
	void sound() {
		System.out.println("Dog barks");
	}
}

class Puppy extends Dog { // Multilevel inheritance
	@Override
	void sound() {
		System.out.println("Puppy yelps");
	}
}

class Cat extends Animal { // Hierarchical inheritance
	@Override
	void sound() {
		System.out.println("Cat meows");
	}
}

// -------------------------
// Polymorphism (Overloading + Overriding)
// -------------------------
class Calculator {
	// Method Overloading (compile-time polymorphism)
	int add(int a, int b) {
		return a + b;
	}

	double add(double a, double b) {
		return a + b;
	}
}

// -------------------------
// Abstraction (Interface + Abstract class)
// -------------------------
interface Vehicle {
	void start(); // abstract method
}

class Car implements Vehicle {
	public void start() {
		System.out.println("Car starts with key");
	}
}

class Bike implements Vehicle {
	public void start() {
		System.out.println("Bike starts with kick");
	}
}

// Abstract class example
abstract class Shape {
	abstract void draw(); // abstract method
}

class Circle extends Shape {
	void draw() {
		System.out.println("Drawing Circle");
	}
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("Drawing Rectangle");
	}
}



/*
 Rules of OOP Concepts in Java
1. Encapsulation
- Keep variables private.
- Provide public getters and setters for controlled access.
- Encapsulation = data hiding + controlled access.
- Improves security and maintainability.

2. Inheritance
- Use extends keyword for class inheritance.
- Child class inherits fields and methods of parent.
- Supports single, multilevel, and hierarchical inheritance.
- Java does not support multiple inheritance with classes (to avoid ambiguity).
- Achieved with interfaces if multiple inheritance is needed.

3. Polymorphism
	- Compile-time polymorphism (Overloading):
- Same method name, different parameter list.
- Decided at compile time.
	- Runtime polymorphism (Overriding):
- Subclass provides its own implementation of a parent method.
- Decided at runtime using dynamic method dispatch.
	- Rules for overriding:
- Method signature must be the same.
- Return type must be compatible.
- Access level cannot be more restrictive.
- Cannot override final or static methods.

4. Abstraction
- Achieved using abstract classes and interfaces.
	- Abstract class:
- Can have abstract and non-abstract methods.
- Can have constructors and instance variables.
	- Interface:
- All methods are implicitly abstract (Java 7).
- From Java 8, can have default and static methods.
- From Java 9, can have private methods.
- Abstraction = hiding implementation details and showing only functionality.


IQ : 🎯 Common Interview Questions
Encapsulation
- What is encapsulation in Java?
- Why do we use getters and setters?
- Can we achieve encapsulation without access modifiers?
- Difference between encapsulation and abstraction?
Inheritance
- What is inheritance?
- Types of inheritance supported in Java?
- Why doesn’t Java support multiple inheritance with classes?
- Difference between extends and implements?
Polymorphism
- Difference between overloading and overriding?
- Can we overload main() method?
- Can we override static methods?
- What is dynamic method dispatch?
- What happens if you change return type while overriding?
Abstraction
- Difference between abstract class and interface?
- Can abstract classes have constructors?
- Can we create an object of an abstract class?
- Why do we need abstraction?
- What is the difference between abstraction and encapsulation?
*/