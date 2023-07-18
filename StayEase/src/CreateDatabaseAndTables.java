
import java.sql.*;

public class CreateDatabaseAndTables {
    public static void main(String[] args) {
        try {
            // Replace with your database URL, username and password
            String url = "jdbc:mysql://localhost:3306/";
            String username = "root";
            String password = "root";

            // Get a connection to the database
            Connection conn = DriverManager.getConnection(url, username, password);

            // Create a statement
            Statement stmt = conn.createStatement();

            // Create the database
            String sql = "CREATE DATABASE TICKETS";
            stmt.executeUpdate(sql);
            System.out.println("Database created successfully...");

            // Use the created database
            sql = "USE TICKETS";
            stmt.executeUpdate(sql);

            // Create the first table
            sql = "CREATE TABLE ticketstu (" +
                    "EnrollmentNumber VARCHAR(255) NOT NULL," +
                    "DateFrom DATE," +
                    "DateTo DATE," +
                    "TimeFrom TIME," +
                    "TimeTo TIME," +
                    "RoomNo VARCHAR(255)," +
                    "AdditionalServices VARCHAR(255)," +
                    "PRIMARY KEY (EnrollmentNumber)" +
                    ")";
            stmt.executeUpdate(sql);
            System.out.println("Table ticketstu created successfully...");

            // Create the second table
            sql = "CREATE TABLE ticketfac (" +
                    "FacultyID VARCHAR(255) NOT NULL," +
                    "DateFrom DATE," +
                    "DateTo DATE," +
                    "TimeFrom TIME," +
                    "TimeTo TIME," +
                    "RoomNo VARCHAR(255)," +
                    "AdditionalServices VARCHAR(255)," +
                    "PRIMARY KEY (FacultyID)" +
                    ")";
            stmt.executeUpdate(sql);
            System.out.println("Table ticketfac created successfully...");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}