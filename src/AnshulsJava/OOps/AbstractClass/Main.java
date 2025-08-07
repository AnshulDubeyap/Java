package AnshulsJava.OOps.AbstractClass;


public class Main {

	// AbstractClass --> Abstract Class is a class that is meant to be overridden by child classes
	// Abstract class can have both abstract and non-abstract methods.
	// abstract methods are methods that are meant to be overridden by child classes
	// Cannot create objects of abstract classes, abstract classes can have no abstract methods alsos

	public static void main(String[] args) {
		// creating an object of CarDriver class
		CarDriver obj = new CarDriver();
		// calling drive() method of CarDriver class
		obj.drive();
		obj.play();

	}
}
