package AnshulsJava.OOps.Generics.LambdaFunctions;

import java.util.ArrayList;

public class LambdaFunctions {
	// lambda functions are one-line functions
	public static void main(String[] args) {

		// creating a lambda function
		Operation addition = (a, b) -> a + b;

		// creating a lambda function
		Operation subtraction = (a, b) -> a - b;

		// creating a lambda function
		Operation multiplication = (a, b) -> a * b;

		// creating a lambda function
		Operation division = (a, b) -> a / b;

		System.out.println(addition.operation(2, 3)); // output = 5
		System.out.println(subtraction.operation(2, 3)); // output = -1
		System.out.println(multiplication.operation(2, 3)); // output = 6
		System.out.println(division.operation(2, 3)); // output = 0

		// Another way of creating a lambda function
		ArrayList<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(20);

		// lambda function
		list.forEach(num -> System.out.println(num * 2)); // output = [20, 40]

		// lambda function
		list.forEach(item -> System.out.println(item * 4)); // output = [40, 80]

	}

	// Creating an interface operation
	interface Operation{
		int operation(int a, int b);
	}
}
