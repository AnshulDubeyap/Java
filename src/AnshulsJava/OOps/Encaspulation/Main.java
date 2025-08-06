package AnshulsJava.OOps.Encaspulation;

public class Main {

	// Encapsulation (capsulation) is a process of wrapping data with methods to hide internal details
	// Data can be accessed only through methods, not directly

	// Getters and Setters are the methods used to access private data; the 'private' keyword is used to hide data
	// private data can be accessed only within the same class, outside the class it cannot be accessed

	// No one in the world should be able to access your private data, you should be able to decide who can access your private data

	public static void main(String[] args) {

		// We need to create an object of the class to access the data
		Human asian = new Human();

		// Using the getter method to access private data
		String name = asian.getName();
		System.out.println(name); // output = Anshul

		int age = asian.getAge();
		System.out.println(age); // output = 22


		// Using the setter method to set private data
		asian.setName("rahul");
		asian.setAge(22);

		String name2 = asian.getName();
		System.out.println(name2);
		int age2 = asian.getAge();
		System.out.println(age2);




	}
}
