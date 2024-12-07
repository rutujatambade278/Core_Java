package com.Array;

public class VariableExample {

    // Instance variable
    String studentName;
    int studentAge;

    // Static variable
    static int totalStudents = 0;

    // Constructor
    public VariableExample(String name, int age) {
        studentName = name;
        studentAge = age;   
        totalStudents++;    // static variable
    }

    // Method with local variable and parameter
    public void displayInfo() {
        // Local variable
        String info = "Student Info: " + studentName + ", Age: " + studentAge;
        System.out.println(info);
    }

    public static void main(String[] args) {
        // Creating objects of the VariableExample class
        VariableExample student1 = new VariableExample("Riya", 10);
        VariableExample student2 = new VariableExample("ovi",12);

        // Displaying the information of the students
        student1.displayInfo(); 
        student2.displayInfo(); 

        // Accessing the static variable
        System.out.println("Total Students: " + totalStudents); // Output: Total Students: 2
    }
}
