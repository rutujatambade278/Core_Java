package com.Array;

public class StudentExample {
   
	public static void main(String[] args) {
       
		// 1. Declaring and initializing student information
        String studentName = " Rutuja Tambade";
        String studentId = "S12345";
        String studentCourse = "Computer Science";

        // 2. Trimming spaces around the student's name
        String trimmedName = studentName.trim();
        System.out.println("Trimmed Name: '" + trimmedName + "'"); 

        
        // 3. Checking if the student's name contains a specific substring
        boolean hasFirstName = studentName.contains("Rutuja");
        System.out.println("Name contains 'Rutuja': " + hasFirstName); 

        // 4. Changing the case of the student's name
        String upperCaseName = studentName.toUpperCase();
        String lowerCaseName = studentName.toLowerCase();
        System.out.println("Uppercase Name: " + upperCaseName); 
        System.out.println("Lowercase Name: " + lowerCaseName); 

        // 5. Replacing a part of the student's name
        String correctedName = studentName.replace("Rutuja", "Tambade");
        System.out.println("Corrected Name: " + correctedName); 

        // 6. Concatenating student's ID and course information
        String studentInfo = "Student ID: " + studentId + " | Course: " + studentCourse;
        System.out.println("Student Info: " + studentInfo); 

        // 7. Checking if the student's ID starts with 'S'
        boolean validId = studentId.startsWith("S");
        System.out.println("Valid ID (starts with 'S'): " + validId);

        // 8. Splitting the student's name into first and last name
        String[] nameParts = trimmedName.split(" ");
        String firstName = nameParts[0];
        String lastName = nameParts[1];
        System.out.println("First Name: " + firstName); 
        System.out.println("Last Name: " + lastName); 

        // 9. Using StringBuilder for efficient string concatenation (in case of many manipulations)
        StringBuilder builder = new StringBuilder();
        builder.append("Student Name: ").append(trimmedName)
               .append(" | Student ID: ").append(studentId)
               .append(" | Course: ").append(studentCourse);
        System.out.println("Full Student Info: " + builder.toString());
    }
}
