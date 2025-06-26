package AnshulsJava.Baisc;

import java.util.Scanner;

public class Inputs {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please Enter some Input -> ");
		int rollNo = input.nextInt();
		System.out.println("Your roll no is " + rollNo);


		// Literal and Identifier
		int a = 10; // 'int' is an identifier and 'a' is a literal

		// If you want to print a big number use '_' instead of '.'
		int b = 100_000_000;
		System.out.println(b); // output = 100000000

		// Print the first word of String
		System.out.println("Enter the String");
		String name = input.next();
		System.out.println(name); // prints the first word of String

		// Print the entire of String
		System.out.println("Enter the String");
		String name2 = input.nextLine();
		System.out.println(name2); // prints the entire string

		// Prints the Float
		System.out.println("Enter a Float number");
		float number = input.nextFloat();
		System.out.println(number); // prints the float number








	}
}
