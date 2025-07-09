package AnshulsJava.FunctionsandMethods;

import java.util.Scanner;

public class PrimeBetweenTwoNumbers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the lower bound : ");
		int num1 = in.nextInt();

		System.out.print("Enter the upper bound: ");
		int num2 = in.nextInt();

		PrintPrime(num1, num2);
	}

	static void PrintPrime(int a, int b) {
		for (int i = a; i <= b; i++) {
			if (i < 2) continue;  // Skip numbers less than 2

			boolean isPrime = true;

			for (int j = 2; j * j <= i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime) {
				System.out.println("The Prime number is: " + i);
			}
		}
	}
}
