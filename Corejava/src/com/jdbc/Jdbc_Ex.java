package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_Ex {

    public static void main(String[] args) {
        // Load the MySQL JDBC Driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Database credentials and URL
            String url = "jdbc:mysql://localhost:3306/jdbc_example"; // Change to your database name
            String user = "root"; // Replace with your MySQL username
            String pass = "root"; // Replace with your MySQL password
            
            // Establish connection
            Connection con = DriverManager.getConnection(url, user, pass);
            
            // Create a Statement object to execute SQL queries
            Statement st = con.createStatement();
            
            // Create table if it doesn't exist
            String createTableSQL = "CREATE TABLE IF NOT EXISTS junior_st ("
                    + "id INT PRIMARY KEY, "
                    + "name VARCHAR(20), "
                    + "class VARCHAR(50), "
                    + "Department VARCHAR(20))";
            st.executeUpdate(createTableSQL);
            
            // Insert some sample data into the table
            st.executeUpdate("INSERT INTO junior_st (id, name, class, Department) VALUES (2, 'Sejal', 'SY.CS', 'Commerce')");
            st.executeUpdate("INSERT INTO junior_st (id, name, class, Department) VALUES (3, 'Shruta', 'TY', 'Science')");
            st.executeUpdate("INSERT INTO junior_st (id, name, class, Department) VALUES (4, 'Nikita', 'FY.CS', 'Science')");
            
            // Output message
            System.out.println("Data inserted and connection successful!");

        } catch (ClassNotFoundException | SQLException e) {
            // Handle exceptions
            e.printStackTrace();
        } finally {
            try {
                Object con=null;
                Object st=null;
				// Close connection and statement (use try-with-resources or explicitly close resources)
                if (con != null) con.close();
               
				if (st != null) st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
