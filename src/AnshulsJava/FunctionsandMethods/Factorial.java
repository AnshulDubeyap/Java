package AnshulsJava.FunctionsandMethods;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the number you want factorial of : ");
		int num = in.nextInt();

		int fact = Factorial(num);
		System.out.println("The factorial of the number is : " + fact);
	}

	// A function to that returns factorial
	static int Factorial(int a){
		int fact = 1;

		while(a > 0){
			fact = fact*a;
			a = a-1;
		}

		return(fact);
	}
}
