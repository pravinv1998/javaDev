import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcExample {
    public static void main(String[] args) {
        // Database URL, username, and password
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "your_password";

        try {
            // Step 1: Load the JDBC driver (optional for newer versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Establish the connection
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connection established successfully!");

            // Step 3: Create a statement
            Statement stmt = conn.createStatement();

            // Step 4: Execute a query
            String query = "SELECT id, name FROM students";
            ResultSet rs = stmt.executeQuery(query);

            // Step 5: Process the results
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println(id + " - " + name);
            }

            // Step 6: Close resources
            rs.close();
            stmt.close();
            conn.close();
            System.out.println("Connection closed.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}