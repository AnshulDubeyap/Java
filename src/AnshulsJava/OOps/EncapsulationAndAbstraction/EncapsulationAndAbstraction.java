package AnshulsJava.OOps.EncapsulationAndAbstraction;

class Example {
	int a;
	private int b; // private data (Data Hiding)
	String name;
	void display() {
		System.out.println("Hello this is a example class");
	}

	// Getters and Setters (making a method to access private data)
	public int getB() {
		return b;
	}

	Example(int a, int b, String name) {
		this.a = a;
		this.b = b;
		this.name = name;
	}
}

public class EncapsulationAndAbstraction {

	public static void main(String[] args) {
		// Encapsulation is the process of wrapping data and methods into a single unit called class
		// Abstraction is the process of hiding the internal details and showing only the necessary details

		Example obj = new Example(12, 13, "Anshul");
		obj.display(); // output = Hello this is a example class
		System.out.println(obj.a); // output = 12
		// System.out.println(obj.b); // error, because b is private, so it cannot be accessed
		System.out.println(obj.name); // output = Anshul

		// Can access b using a getter method
		System.out.println(obj.getB()); // output = 13
	}
}
