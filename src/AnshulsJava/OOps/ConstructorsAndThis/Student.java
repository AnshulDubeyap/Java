package AnshulsJava.OOps.ConstructorsAndThis;

public class Student {
	String name;
	int rollNo;
	float marks;


	// Constructor, using 'this' keyword
	Student(String name, int rollNo, float marks) {
		this.name = "Anshul Dubey";
		this.marks = 89.9f;
		this.rollNo = 101;
	}

	// Default Constructor
	Student() {
		System.out.println("Default Constructor");
	}


}
