package AnshulsJava.FunctionsandMethods;

import java.util.Scanner;

public class Arguments {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the first number : ");
		int c = in.nextInt();

		System.out.print("Enter the first number : ");
		int d = in.nextInt();

		int result = sum(c, d);
		System.out.println("The sum is : "+ result);

	}
	static int sum(int a, int b){
		int sum = 0;
		sum = a + b;
		return sum;
	}
}

// arguments are variables we pass in the function




