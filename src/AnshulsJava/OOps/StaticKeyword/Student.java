package AnshulsJava.OOps.StaticKeyword;

public class Student {
	String name;
	int rollNo;
	char grade;
	String gender;

	static String schoolName = "ABC School";

	public Student(String name, int rollNo, char grade, String gender) {
		this.name = name;
		this.rollNo = rollNo;
		this.grade = grade;
		this.gender = gender;
	}

	public static void printPrincipalName() {
		System.out.println("Helen Keller");
	}
}
