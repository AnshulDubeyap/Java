package AnshulsJava.OOps.ClassesAndObjects;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Class --> a class is a named group of properties and values

		// To use the properties and values of a class, we have to create an object of that class
		// Object is created by using 'new' keyword, which allocates the memory at runtime and returns a reference to it
		Calculator calc = new Calculator();

		// Calculator calc --> runs at compile time
		// new Calculator() --> runs at run time (allocates the memory at runtime and returns a reference to it)

		// Calculator calc --> runs at run time
		// new Calculator() --> runs at compile time

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first number --> ");
		int a = input.nextInt();

		System.out.print("Enter the second number --> ");
		int b = input.nextInt();

		int sum = calc.add(a, b);
		int sub = calc.subtract(a, b);
		int mul = calc.multiply(a, b);
		int div = calc.divide(a, b);

		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
	}
}
