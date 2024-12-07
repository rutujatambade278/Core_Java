package com.example;

//Abstract Class
abstract class Shape {
 // Abstract Method (no body)
 abstract void draw();

 // Non-abstract Method
 void display() {
     System.out.println("This is a shape.");
 }
}

//Subclass 1
class Circle extends Shape {
 @Override
 void draw() {
	 System.out.println("This is a shape.");
 }
}

//Subclass 2
class Rectangle extends Shape {
 @Override
 void draw() {
     System.out.println("Drawing a Rectangle.");
 }
}

//Main Class
public class AbstractExample {
 public static void main(String[] args) {
     // Cannot instantiate an abstract class
     // Shape shape = new Shape(); // This will cause an error

     // Use polymorphism to refer to subclasses
     Shape shape1 = new Circle();
     Shape shape2 = new Rectangle();

     shape1.display();  // Calls the non-abstract method
     shape1.draw();     // Calls the overridden method in Circle

     shape2.display();  // Calls the non-abstract method
     shape2.draw();     // Calls the overridden method in Rectangle
 }
}
