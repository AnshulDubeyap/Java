package JDBC.DatabaseDesignPattern;

public class Main {
	public static void main(String[] args) {
		// Get the student name by roll (25)

		StudentDAO dao = new StudentDAO();

		Student s = dao.getNameByAge(25);
		System.out.println(s.sname); // output = Foxtr

		// Get the student name by roll (100)
		s = dao.getNameByAge(100);
		System.out.println(s.sname); // output = No student found

		// Add a new student
		dao.addNewStudent("Anshul", 25);

	}

}
