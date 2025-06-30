package AnshulsJava.FunctionsandMethods;

import java.util.Scanner;

public class ChangeValue_Swap {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Enter the number 1 : ");
		int a = in.nextInt();

		System.out.print("Enter the number 2: ");
		int b = in.nextInt();

		// Attempt to swap the input numbers
		Swap(a, b);

		System.out.println(a); // Still prints original a (not swapped)
		System.out.println(b); // Still prints original b (not swapped)

		// Why didn't the values swap?
		// Because Java is pass-by-value. The function Swap() receives copies of a and b.
		// num1 and num2 are local copies of a and b.
		// Swapping those copies does not affect the original values in main.

		String name = "Anshul";
		greet(name); // Outputs: Hello, Kunal Rana
		System.out.println(name); // Still prints: Anshul (not changed)

		// The variable 'name' in main points to "Anshul".
		// Inside greet(), 'naam' is a new reference that gets changed to "Kunal Rana".
		// This change does not affect the original 'name' in main.

		// Important: String in Java is immutable.
		// That means once a String object is created, it cannot be changed.
		// When you do naam = "Kunal Rana", you're not modifying the original String.
		// You're just pointing the local variable to a new String object.
	}

	// Function to swap two numbers (swap only happens inside this method)
	static void Swap(int num1, int num2) {
		int temp = num1;
		num1 = num2;
		num2 = temp;
	}

	// Function to greet the user by modifying the local copy of the reference
	static void greet(String naam) {
		naam = "Kunal Rana"; // This creates a new String, does not modify the original
		System.out.println("Hello, " + naam);
	}
}
