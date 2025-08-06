package AnshulsJava.OOps.Inheritance;

	// Inheritance --> inheritance allows a class to inherit properties and methods from another class
	// Extends --> extends keyword is used to inherit properties and methods from another class

	// Inheritance --> Multiple Level Inheritance, Single Level Inheritance
	// Multiple Inheritance is not allowed in Java

public class Main {
	public static void main(String[] args) {

		// create an object of Calculator
		Calculator calc = new Calculator();
		int r1 = calc.add(10, 20);
		System.out.println(r1);
		int r2 = calc.subtract(10, 20);
		System.out.println(r2);



		// create an object of AdvancedCalculator
		AdvanceCalculator calc1 = new AdvanceCalculator();

		// This is an example of Single Level Inheritance (AdvanceCalculator inherits from Calculator)

		int r3 = calc1.add(10, 20);
		System.out.println(r3);
		int r4 = calc1.subtract(10, 20);
		System.out.println(r4);
		int r5 = calc1.multiply(10, 20);
		System.out.println(r5);
		int r6 = calc1.divide(10, 20);
		System.out.println(r6);

		// create an object of SuperCalculator
		SuperCalculator calc2 = new SuperCalculator();

		// This is an example of Multiple Level Inheritance (SuperCalculator inherits from AdvanceCalculator and Calculator)

		int r7 = calc2.add(10, 20);
		System.out.println(r7);
		int r8 = calc2.subtract(10, 20);
		System.out.println(r8);
		int r9 = calc2.multiply(10, 20);
		System.out.println(r9);
		int r10 = calc2.divide(10, 20);
		System.out.println(r10);
		int r11 = calc2.power(10, 20);
		System.out.println(r11);
		int r12 = calc2.sqrt(10);
		System.out.println(r12);
		int r13 = calc2.mod(10, 20);
		System.out.println(r13);

	}
}
