package AnshulsJava.FunctionsandMethods;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the number you think is prime: ");
		int num = in.nextInt();

		CheckPrime(num);
	}

	// Function to check whether a number is prime using a while loop
	static void CheckPrime(int a) {
		if (a <= 1) {
			// 0 and 1 are not prime numbers
			System.out.println("The number is not Prime");
			return;
		}

		int i = 2;
		while (i * i <= a) {
			if (a % i == 0) {
				// Found a factor other than 1 and itself
				System.out.println("The number is not Prime");
				return;
			}
			i++;
		}

		// No divisors found, so it's prime
		System.out.println("The number is Prime");
	}
}
