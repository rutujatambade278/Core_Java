package com.Array;

public class StringExample {
    public static void main(String[] args) {
        // Declare and initialize a String
        String message = "Hello, World!";
        
        // Access characters using the charAt() method
        System.out.println("First character: " + message.charAt(0));  // Output: H
        
        // String concatenation
        String greeting = "Hello" + " " + "Java!";
        System.out.println(greeting);  // Output: Hello Java!
        
        // Length of the string
        System.out.println("Length of message: " + message.length());  // Output: 13
        
        // Convert string to uppercase
        System.out.println("Uppercase: " + message.toUpperCase());  // Output: HELLO, WORLD!
    }
}
