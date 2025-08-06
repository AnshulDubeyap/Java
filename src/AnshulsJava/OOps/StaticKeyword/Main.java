package AnshulsJava.OOps.StaticKeyword;

public class Main {

	// Package --> A package is like a folder in a file system. It contains classes, interfaces, and other packages.

	// Static --> Static is a property that does not belong to any specific object of the class and is the same for every object
	// Static can be declared inside a class or outside a class, Static can be a property or a function or variable.
	// We can also use static properties and functions without creating an object

	// It is very obvious that non-static properties and functions cannot be used in static methods or functions
	// Non-static properties and functions depend on the object (an object is needed to be created first)

	public static void main(String[] args) {

		// Static Properties without creating an object
		System.out.println(Student.schoolName); // output = ABC School
		Student.printPrincipalName(); // output = Helen Keller


		Student anshul = new Student("Anshul Dubey",101 , 'A',  "Male");
		Student rahul = new Student("Rahul Dubey",102 , 'A', "Male");

		System.out.println(anshul.name);
		System.out.println(rahul.name);


		// static Keyword must be used with class name not with object name
		System.out.println(Student.schoolName); // output = ABC School
		System.out.println(Student.schoolName); // output = ABC School


		// Calling a static method
		Student.printPrincipalName();

	}
}
