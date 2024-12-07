package com.project;

class Student {
    String name;
    int age;
    String grade;

    // Constructor to initialize student
    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Display student details
    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}

class Employee {
    String name;
    int id;
    String department;

    // Constructor to initialize employee
    public Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    // Display employee details
    public void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
    }
}
