package AnshulsJava.OOps.UpcastingAndDowncasting;

public class Main {
	public static void main(String[] args) {
		// Upcasting: Parent reference to a child object
		Class_A obj = new Class_B();

		obj.show1(); // Output: Class A's method is called

		// obj.show2(); // Error: show2() not in Class_A

		// Downcasting: Parent reference cast back to child
		Class_B obj1 = (Class_B) obj;

		obj1.show2(); // Output: Class B's method is called
		obj1.show1(); // Output: Class A's method is called
	}
}
