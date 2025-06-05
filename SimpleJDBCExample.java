package dhanu;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class SimpleJDBCExample {
    public static void main(String[] args) {
        // Database connection details
        String url = "jdbc:mysql://localhost:3306/studentdb";
        String user = "root"; // change if your MySQL username is different
        String password = ""; // change if you have a MySQL password

        // SQL command to create the students table
        String createTableSQL = "CREATE TABLE IF NOT EXISTS students (" +
                                "id INT PRIMARY KEY, " +
                                "name VARCHAR(100), " +
                                "marks INT)";

        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database!");

            // Create a statement to execute SQL
            Statement stmt = conn.createStatement();

            // Execute SQL to create table
            stmt.executeUpdate(createTableSQL);
            System.out.println("Table 'students' created successfully (if not exists).");

            // Close resources
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database error occurred.");
            e.printStackTrace();
        }
    }
}



