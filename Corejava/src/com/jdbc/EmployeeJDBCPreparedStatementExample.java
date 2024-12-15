package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeJDBCPreparedStatementExample {

    public static void main(String[] args) {
        // Database connection details
        String url = "jdbc:mysql://localhost:3306/employeedb";  
        String username = "root";  
        String password = "root";  

        // JDBC connection, prepared statement, and result set
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            // --- 1. Insert a new employee using PreparedStatement ---
            String insertQuery = "INSERT INTO employee (name, salary) VALUES (?, ?)";
            try (PreparedStatement insertStatement = connection.prepareStatement(insertQuery)) {
                insertStatement.setString(1, "Sarah Connor");  // Setting the name parameter
                insertStatement.setDouble(2, 80000.00);       // Setting the salary parameter
                insertStatement.executeUpdate();  // Execute insert
                System.out.println("Inserted new employee: Sarah Connor");
            }

            // --- 2. Select all employees using PreparedStatement ---
            String selectQuery = "SELECT * FROM employee";
            try (PreparedStatement selectStatement = connection.prepareStatement(selectQuery);
                 ResultSet resultSet = selectStatement.executeQuery()) {

                System.out.println("Employee Records:");
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    double salary = resultSet.getDouble("salary");
                    System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
                }
            }

            // --- 3. Update employee salary using PreparedStatement ---
            String updateQuery = "UPDATE employee SET salary = ? WHERE name = ?";
            try (PreparedStatement updateStatement = connection.prepareStatement(updateQuery)) {
                updateStatement.setDouble(1, 85000.00);       // Setting the new salary
                updateStatement.setString(2, "Sarah Connor"); // Setting the name
                updateStatement.executeUpdate();  // Execute update
                System.out.println("Updated Sarah Connor's salary to 85000.00");
            }

            // --- 4. Delete an employee using PreparedStatement ---
            String deleteQuery = "DELETE FROM employee WHERE name = ?";
            try (PreparedStatement deleteStatement = connection.prepareStatement(deleteQuery)) {
                deleteStatement.setString(1, "Sarah Connor");  // Setting the name of the employee to delete
                deleteStatement.executeUpdate();  // Execute delete
                System.out.println("Deleted employee: Sarah Connor");
            }

            // Select all employees again to verify changes
            try (PreparedStatement selectStatement = connection.prepareStatement(selectQuery);
                 ResultSet resultSet = selectStatement.executeQuery()) {

                System.out.println("\nEmployee Records after update and deletion:");
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    double salary = resultSet.getDouble("salary");
                    System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}