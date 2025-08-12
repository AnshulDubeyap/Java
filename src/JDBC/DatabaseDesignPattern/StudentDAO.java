package JDBC.DatabaseDesignPattern;

import java.sql.Connection;
import java.sql.DriverManager;

// DAO = Data Access Object
public class StudentDAO {
	public Student getNameByAge(int roll) {
		Student s = new Student();
		s.roll = roll;

		// fetch student name from a database
		try {
			String query = "SELECT \"name\" FROM public.\"Student\" WHERE \"rollNo\" = " + roll;


			String url = "jdbc:postgresql://localhost:5433/Anshul2";
			String user = "postgres";
			String password = "Anshul@667";

			// create a connection
			Connection con = DriverManager.getConnection(url, user, password);

			// create a statement
			java.sql.Statement st = con.createStatement();

			// execute the query
			java.sql.ResultSet rs = st.executeQuery(query);

			// process the result
			if(rs.next()) {
				s.sname = rs.getString("name");
			}else{
				s.sname = "No student found";
			}

			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return s;
	}

	public void addNewStudent(String name, int roll) {
		Student s = new Student();
		s.sname = name;
		s.roll = roll;

		try {
			String url = "jdbc:postgresql://localhost:5433/Anshul2";
			String user = "postgres";
			String password = "Anshul@667";

			// create a connection
			Connection con = DriverManager.getConnection(url, user, password);

			// create a statement
			java.sql.Statement st = con.createStatement();

			// execute the query
			st.executeUpdate("INSERT INTO public.\"Student\"(\"name\", \"rollNo\") VALUES('" + name + "', " + roll + ");");

			// process the result
			System.out.println("Student added successfully");

			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
