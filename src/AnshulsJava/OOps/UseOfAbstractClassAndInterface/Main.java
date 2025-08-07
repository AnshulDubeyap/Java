package AnshulsJava.OOps.UseOfAbstractClassAndInterface;

public class Main {



	public static void main(String[] args) {

		// A developer needs a computer to build applications

		// Create Laptop and Desktop objects
		Laptop lap = new Laptop();
		Desktop desk = new Desktop();

		// Create a Developer object
		Developer dev = new Developer();

		// These lines below work but are repetitive and tightly coupled
//		dev.coding(lap);
//		dev.coding(desk);

		// Better approach: Use a common parent type (Computer)
		// This way, both Laptop and Desktop can be handled using the same method

		// Upcasting Laptop and Desktop to a Computer type
		Computer com = new Laptop();
		Computer com1 = new Desktop();

		// Developer uses any computer to write code
		// This way, both Laptop and Desktop can be handled using the same method
		// Makes code more flexible, thus the use of interfaces and abstract classes
		dev.coding(com);
		dev.coding(com1);
	}
}
