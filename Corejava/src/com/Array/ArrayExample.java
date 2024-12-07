package com.Array;

public class ArrayExample {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = {10, 20, 30, 40, 50};
        
        // Access elements from the array
        System.out.println("First element: " + numbers[0]);
        System.out.println("Third element: " + numbers[2]);  
        
        // Loop through the array and print each element
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
}
