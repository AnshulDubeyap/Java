package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {
	// Inserting the data in the database using JDBC,
	// but this is not the best practice, if we have 100 rows of data, we have to write a long query

	// So for dynamic data coming from the user, we use PreparedStatement

	public static void main(String[] args) {
		// Correct JDBC URL with explicit port
		String url = "jdbc:postgresql://localhost:5433/first";
		String user = "postgres";
		String password = "Anshul@667";

		// Sample data
		int rollNo = 66;
		String name = "Rahul";
		float age = 22;

		// Query
		String sql = "insert into student.student_data (roll, name, age)" + "values(" + rollNo + ", '" + name + "', " + age + ")";

		try (
				// Get the connection using DriverManager
				Connection con = DriverManager.getConnection(url, user, password);

				// Get the statement
				Statement st = con.createStatement()) {

			// executeUpdate returns the number of rows affected (method inside the Statement interface)
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
