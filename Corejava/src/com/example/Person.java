package com.example;

// Parent class
class Persons {
    String name;
    int age;

    // Constructor
    public Persons(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display basic info
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Child class inherits from Persons
class Student extends Persons {
    String studentId;
    String major;

    // Constructor
    public Student(String name, int age, String studentId, String major) {
        // Call the parent class constructor
        super(name, age);
        this.studentId = studentId;
        this.major = major;
    }

    // Overriding the displayInfo method to include student details
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the parent class method
        System.out.println("Student ID: " + studentId + ", Major: " + major);
    }
}



