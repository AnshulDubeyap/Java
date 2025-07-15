package AnshulsJava.OOps;

public class Main {
	public static void main(String[] args) {
		// Class is a named group of properties and values

		// An Array student of the Type Student class can hold 5 students
		Student[] student = new Student[5];

		// Creating a Student object (objects are created using the new keyword)
		// new allocates the memory at runtime (dynamically allocates) and returns a reference to it
		Student Anshul /* compile time */ = new Student(); /* Run time */

		System.out.println(Anshul);// output = random value
		System.out.println(Anshul.marks); // output = 0.0
		System.out.println(Anshul.name); // output = null
		System.out.println(Anshul.rollNo); // output = 0

		Anshul.marks = 88.75f;
		Anshul.name = "Anshul";
		Anshul.rollNo = 101;

		System.out.println(Anshul.marks); // output = 88.75
		System.out.println(Anshul.name); // output = Anshul
		System.out.println(Anshul.rollNo); // output = 101

		// the problem with the above initialization is that it's repetitive, if an obj has 100 properties, we have to do 100 times Anshul.something
		// We should have something that helps us to initialize the values at the time of initializing an object (constructor)

	}


	// Class Students
	static class Student{
		int rollNo;
		float marks;
		String name;

	}
}
