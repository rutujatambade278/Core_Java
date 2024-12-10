package com.jdbc;

import java.sql.*;

public class JdbcExample {

    // JDBC URL, username, and password
    static final String DB_URL = "jdbc:mysql://localhost:3306/jdbc_Example?useSSL=false&serverTimezone=UTC";
    static final String USER = "root";  
    static final String PASS = "root"; 

    public static void main(String[] args) {
        // Register the MySQL JDBC driver (required in some versions)
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Step 1: Establish a connection
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected to the database.");

            // Step 2: Create and execute a query
            Statement stmt = conn.createStatement();
            String sql = "SELECT id, name FROM users";
            ResultSet rs = stmt.executeQuery(sql);

            // Step 3: Extract data from the result set
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println("ID: " + id + ", Name: " + name);
            }

            // Step 4: Clean up environment
            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException se) {
            // Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            // Handle errors for Class.forName
            e.printStackTrace();
        }
    }
}
