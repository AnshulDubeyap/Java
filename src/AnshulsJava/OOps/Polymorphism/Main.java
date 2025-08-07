package AnshulsJava.OOps.Polymorphism;

public class Main {

	// Polymorphism means "many forms"
	// It allows the same method or object to behave in different ways

	// There are two types of polymorphism in Java:
	// 1. Compile-time polymorphism → Method Overloading
	// 2. Run-time polymorphism → Method Overriding

	public static void main(String[] args) {

		// Example of Run-time Polymorphism (Method Overriding)

		// Case 1: Parent class object and method
		Class_A obj = new Class_A();
		obj.show(); // Output: Class A

		// Case 2: Parent class reference holding Child class object
		// This is called Upcasting
		// Even though the reference is of Class_A, the method of Class_B will run
		Class_A obj1 = new Class_B();
		obj1.show(); // Output: Class B

		// Case 3: Same as above with another child class
		Class_A obj2 = new Class_C();
		obj2.show(); // Output: Class C

		// Why? Because the show() method is overridden in each child class,
		// and Java always calls the version from the actual object, not the reference type

		// obj is a Class_A reference pointing to different child class objects (only works with inheritance)
		// same method name, different behavior (polymorphism)
	}
}
