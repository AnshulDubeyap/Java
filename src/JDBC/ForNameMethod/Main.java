package JDBC.ForNameMethod;

public class Main {
	// forMethod() -->

	public static void main(String[] args) {
		// If we create an object of classA
		ClassA obj = new ClassA(); // Output = Class A static block, Class A instance block

		// as we see, it executes both static and instance blocks inside classA

		// what happened here is, when we Load the classA class, it will execute the static block
		// when we create the object of classA, it will execute the instance block

		// Can we run a static block without creating the object of classA?
		// --> Yes, by forName() method

		// try catch because forName() method throws exception
		try {
			Class.forName("JDBC.ForNameMethod.ClassA"); // Output = Class A static block
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// And if we want to run the instance block as well?
		// --> Yes, by forName().newInstance() method
		try {
			Class.forName("JDBC.ForNameMethod.ClassA").newInstance(); // Output = Class A static block, Class A instance block
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}



	}

}
