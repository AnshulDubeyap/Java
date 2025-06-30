package AnshulsJava.FunctionsandMethods;

import java.util.Scanner;

public class Methods {
	public static void main(String[] args) {
		greetings();

		int result  = sum();
		System.out.println("The Sum is : " + result);

		String greet = greet();
		System.out.println(greet);
	}

	// Create a method Greeting
	// use static because, this function will be called inside main, and main is static
	static void greetings(){
		System.out.println("Hello, How may i help you?");
	}

	// Create a method sum that returns an integer
	static int sum(){
		Scanner in = new Scanner(System.in);
		int sum = 0;

		System.out.print("Enter the first number : ");
		int num1 = in.nextInt();

		System.out.print("Enter the second number : ");
		int num2 = in.nextInt();

		sum = num1 + num2;

		return(sum);
	}

	// Create a method sum that returns a string

	static String greet(){
		String greeting = "Hello, i wish you good morning";
		return greeting;
	}

}
