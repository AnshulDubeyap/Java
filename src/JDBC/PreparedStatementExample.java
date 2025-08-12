package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PreparedStatementExample {

	// We use prepared statements when the Query is fixed and values keeps changing
	// useful for dynamic applications

	public static void main(String[] args) {

		String url = "jdbc:postgresql://localhost:5433/first";
		String user = "postgres";
		String password = "Anshul@667";

		String query = "insert into student.student_data (roll, name, age) values(?, ?, ?)";

		try (
				// Get the connection using DriverManager
				Connection con = DriverManager.getConnection(url, user, password);

				// Get the statement
				java.sql.PreparedStatement st = con.prepareStatement(query)
		) {

			// executeUpdate returns the number of rows affected (method inside the Statement interface)
			st.setInt(1, 66); // for the first '?'
			st.setString(2, "Cambam"); // for the second '?'
			st.setInt(3, 22); // for the third '?'

			int m = st.executeUpdate();

			if (m > 0) {
				System.out.println(m + " rows affected");
				System.out.println("✅ Data Inserted Successfully");
			} else {
				System.out.println("❌ Data Insertion Failed");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
