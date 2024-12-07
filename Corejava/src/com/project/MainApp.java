package com.project;

import java.util.Scanner;

public class MainApp {

    // Static arrays to store students and employees
    static Student[] students = new Student[5];
    static Employee[] employees = new Employee[5];

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Student");
            System.out.println("2. Add Employee");
            System.out.println("3. Update Student");
            System.out.println("4. Update Employee");
            System.out.println("5. Remove Student");
            System.out.println("6. Remove Employee");
            System.out.println("7. View All Students");
            System.out.println("8. View All Employees");
            System.out.println("9. Exit");

            choice = sc.nextInt();
            sc.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    addStudent(sc);
                    break;
                case 2:
                    addEmployee(sc);
                    break;
                case 3:
                    updateStudent(sc);
                    break;
                case 4:
                    updateEmployee(sc);
                    break;
                case 5:
                    removeStudent(sc);
                    break;
                case 6:
                    removeEmployee(sc);
                    break;
                case 7:
                    viewAllStudents();
                    break;
                case 8:
                    viewAllEmployees();
                    break;
                case 9:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 9);
    }

    // Add a student
    public static void addStudent(Scanner sc) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                System.out.println("Enter student name:");
                String name = sc.nextLine();
                System.out.println("Enter student age:");
                int age = sc.nextInt();
                sc.nextLine(); // consume newline
                System.out.println("Enter student grade:");
                String grade = sc.nextLine();

                students[i] = new Student(name, age, grade);
                System.out.println("Student added successfully!");
                return;
            }
        }
        System.out.println("Student array is full!");
    }

    // Add an employee
    public static void addEmployee(Scanner sc) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                System.out.println("Enter employee name:");
                String name = sc.nextLine();
                System.out.println("Enter employee ID:");
                int id = sc.nextInt();
                sc.nextLine(); // consume newline
                System.out.println("Enter employee department:");
                String department = sc.nextLine();

                employees[i] = new Employee(name, id, department);
                System.out.println("Employee added successfully!");
                return;
            }
        }
        System.out.println("Employee array is full!");
    }

    // Update student
    public static void updateStudent(Scanner sc) {
        System.out.println("Enter student index to update (0-4):");
        int index = sc.nextInt();
        sc.nextLine();  // Consume newline
        if (index >= 0 && index < students.length && students[index] != null) {
            System.out.println("Enter new student name:");
            String name = sc.nextLine();
            System.out.println("Enter new student age:");
            int age = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.println("Enter new student grade:");
            String grade = sc.nextLine();

            students[index] = new Student(name, age, grade);
            System.out.println("Student updated successfully!");
        } else {
            System.out.println("Invalid student index or student not found!");
        }
    }

    // Update employee
    public static void updateEmployee(Scanner sc) {
        System.out.println("Enter employee index to update (0-4):");
        int index = sc.nextInt();
        sc.nextLine(); // consume newline
        if (index >= 0 && index < employees.length && employees[index] != null) {
            System.out.println("Enter new employee name:");
            String name = sc.nextLine();
            System.out.println("Enter new employee ID:");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.println("Enter new employee department:");
            String department = sc.nextLine();

            employees[index] = new Employee(name, id, department);
            System.out.println("Employee updated successfully!");
        } else {
            System.out.println("Invalid employee index or employee not found!");
        }
    }

    // Remove student
    public static void removeStudent(Scanner sc) {
        System.out.println("Enter student index to remove (0-4):");
        int index = sc.nextInt();
        if (index >= 0 && index < students.length && students[index] != null) {
            students[index] = null;
            System.out.println("Student removed successfully!");
        } else {
            System.out.println("Invalid student index or student not found!");
        }
    }

    // Remove employee
    public static void removeEmployee(Scanner sc) {
        System.out.println("Enter employee index to remove (0-4):");
        int index = sc.nextInt();
        if (index >= 0 && index < employees.length && employees[index] != null) {
            employees[index] = null;
            System.out.println("Employee removed successfully!");
        } else {
            System.out.println("Invalid employee index or employee not found!");
        }
    }

    // View all students
    public static void viewAllStudents() {
        System.out.println("\n--- All Students ---");
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                students[i].display();
            }
        }
    }

    // View all employees
    public static void viewAllEmployees() {
        System.out.println("\n--- All Employees ---");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                employees[i].display();
            }
        }
    }
}