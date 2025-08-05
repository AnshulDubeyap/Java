package AnshulsAdvanceJava.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) {
		// Correct JDBC URL with explicit port
		String url = "jdbc:postgresql://localhost:5433/first";
		String user = "postgres";
		String password = "Anshul@667";

		// Sample data
		int rollNo = 1;
		String name = "Anshul";
		float age = 22;

		// Query
		String sql = "insert into student.student_data (roll, name, age)" + "values(" + rollNo + ", '" + name + "', " + age + ")";



		try (
				// Get the connection using DriverManager
		     Connection con = DriverManager.getConnection(url, user, password);

		     // Get the statement
		     Statement st = con.createStatement()) {

			// get the number of rows affected (output from executeUpdate)
			int m = st.executeUpdate(sql);

			if (m > 0) {
				System.out.println(m + " rows affected");
				System.out.println("✅ Data Inserted Successfully");
			} else {
				System.out.println("❌ Data Insertion Failed");
			}

		} catch (Exception e) {
			System.err.println("⚠️ Error: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
