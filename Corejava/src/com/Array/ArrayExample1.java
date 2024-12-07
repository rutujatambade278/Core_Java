package com.Array;

public class ArrayExample1 {
    public static void main(String[] args) {
        // 1. Declare and initialize an array of student scores
        int[] scores = {85, 90, 78, 92, 88};

        // 2. Accessing elements using indices
        System.out.println("First student's score: " + scores[0]); // Output: 85
        System.out.println("Third student's score: " + scores[2]); // Output: 78

        // 3. Calculate the sum of all scores using a loop
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("Sum of all scores: " + sum); // Output: 433

        // 4. Calculate the average score
        double average = (double) sum / scores.length;
        System.out.println("Average score: " + average); // Output: 86.6

        // 5. Finding the highest score
        int highest = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > highest) {
                highest = scores[i];
            }
        }
        System.out.println("Highest score: " + highest); // Output: 92

        // 6. Finding the lowest score
        int lowest = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < lowest) {
                lowest = scores[i];
            }
        }
        System.out.println("Lowest score: " + lowest); // Output: 78

        // 7. Updating a score (e.g., the score of the second student)
        scores[1] = 95; // Updating second student's score from 90 to 95
        System.out.println("Updated second student's score: " + scores[1]); // Output: 95

        // 8. Display all scores using a loop
        System.out.println("All student scores:");
        for (int score : scores) {
            System.out.println(score);
        }
       
    }
}
