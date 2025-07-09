package AnshulsJava.FunctionsandMethods;

import java.util.Scanner;

public class Overloading {
	// Two functions with the same name but different arguments
	// The compiler differentiates between them at compile time

	public static void main(String[] args) {
		int num = 21;
		String name = "Anshul";

		// The Integer function runs because the argument is Integer
		fun(num);

		// The String function runs because the argument is String
		fun(name);



	}

	static void fun(int a){
		System.out.println("This is the integer function working");
		System.out.println(a);
	}

	static void fun(String a){
		System.out.println("This is the string function working");
		System.out.println(a);
	}


}

