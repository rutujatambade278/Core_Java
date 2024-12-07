package com.example;

public class Main {
    public static void main(String[] args) {
        // Creating an object of Student
        Student student = new Student("Rutuja", 24, "S12345", "Computer Science");

        // Calling the displayInfo method
        student.displayInfo();
    }
}

//Notes-Inheritance=Inheritance is a fundamental concept in object-oriented programming (OOP) that allows one class to acquire the properties and behaviors of another class
//2)Features of Inheritance=Code Reusability,code optimize
//3)Types of Inheritance-Single Inheritance: A class inherits from one parent class.
                         //Multilevel Inheritance: A class inherits from a child class, forming a chain.
                         //Hierarchical Inheritance: Multiple classes inherit from one parent class.
                         //Multiple Inheritance (not supported directly in Java via classes but achievable using interfaces): A class inherits from multiple sources.

//4) we can achieve inheritance in two keyword 1)extends 2)implement
//class to-class=extends use kartat && class to-interface -implements
