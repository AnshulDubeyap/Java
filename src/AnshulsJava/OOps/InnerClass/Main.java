package AnshulsJava.OOps.InnerClass;

public class Main {
	// Inner class = a class defined inside another class

	// A non-static inner class depends on the object of the outer class
	// You cannot declare static members inside a non-static inner class

	public static void main(String[] args) {

		// Calling the Static method
		Class_A.play(); // Output: Play functionality implemented

		// Create an object of outer class Class_A
		Class_A obj = new Class_A();
		obj.show(); // Output: Class A

		// Create an object of inner class Class_B using an outer class object
		Class_A.Class_B obj1 = obj.new Class_B();
		obj1.show1(); // Output: Class B

		// Calling the static inner class
		Class_A.Class_C.show2(); // Output: Class C static

		// Calling the non-static method of a static inner class
		Class_A.Class_C obj2 = new Class_A.Class_C();
		obj2.show3(); // Output: Class C non-static


	}
}
