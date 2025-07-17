package AnshulsJava.OOps.BasicOpps;

public class OopsDefinitions {
	public static void main(String[] args) {
		// Package is just like a folder, the package holds Java classes in the chamber compartments

		// Static is a property that does not belong to any specific object of the class and is the same for every object

		// created two instances of human class
		Human Anshul = new Human(23, "Anshul", 0, false);
		Human Cambam = new Human(33, "Cambam", 7000, true);

		System.out.println(Anshul.population); // output = 2
		System.out.println(Cambam.population); // output = 2;

		/*
		 When a static property is declared, it can be accessed before creating an object, and without referring to any object
		 We can create both property or function as static inside a class
		 Main is static because it should run without creating any object, as it is the first method that runs in Java
		*/


		// Cannot use non-static properties inside static methods or functions in a class
		//



	}
	// created a human class with some properties

	static class Human{
		int age;
		String name;
		int salary;
		boolean isMarried;

		// created a static property population
		static int population;

		// Created a constructor in human class

		Human(int age, String name, int salary, boolean isMarried){
			this.age = age;
			this.name = name;
			this.salary = salary;
			this.isMarried = isMarried;

			// static property is accessed by className, and not 'this'
			Human.population++;
		}
	}
}
