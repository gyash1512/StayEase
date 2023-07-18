
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseCreation {
    public static void main(String[] args) {
        try {
            // Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            // Open a connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/?user=root&password=root");

            // Execute a query to create database
            Statement stmt = conn.createStatement();
            String sql = "CREATE DATABASE Login";
            stmt.executeUpdate(sql);

            // Use created database
            sql = "USE Login";
            stmt.executeUpdate(sql);

            // Create table
            sql = "CREATE TABLE credentialsstu (username VARCHAR(255), password VARCHAR(255))";
            stmt.executeUpdate(sql);
            sql = "CREATE TABLE credentialsfac (username VARCHAR(255),password VARCHAR(255))";
            stmt.executeUpdate(sql);
            sql = "CREATE TABLE credentialsadm (username VARCHAR(255), password VARCHAR(255))";
            stmt.executeUpdate(sql);

            // Insert entry
            stmt.executeUpdate(sql);

            System.out.println("Database and table created successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

