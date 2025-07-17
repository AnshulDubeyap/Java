package AnshulsJava.Recursion;

import java.util.Scanner;

public class Main {
	// Recursion is a function that calls itself
	public static void main(String[] args) {
		// Using recursion to print numbers nth fibonacci number

		Scanner in = new Scanner(System.in);

		System.out.println("Please enter the index : ");
		int index = in.nextInt();

		int num = NthFibonacci(index);

		System.out.println("The fibonacci number at " + index + " is : " + num);


	}

	static int NthFibonacci(int n) {

		if(n < 2){
			return n;
		}
		return NthFibonacci(n-1) + NthFibonacci(n-2);
	}
}
