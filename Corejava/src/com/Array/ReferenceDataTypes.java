package com.Array;

public class ReferenceDataTypes {
    public static void main(String[] args) {
        // String (reference type)
        String message = "Hello, Java!";

        // Array (reference type)
        int[] numbers = {1, 2, 3, 4, 5};

        // Creating an object (reference type)
        Person person = new Person("John", 25);

        // Displaying values
        System.out.println("String: " + message);
        System.out.println("Array: " + numbers[0] + ", " + numbers[1]);
        System.out.println("Person: " + person.name + ", Age: " + person.age);
    }
}

// Person class for the object reference
class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
