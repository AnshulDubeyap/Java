package AnshulsJava.Searching.BinarySearch;

import java.util.Scanner;

public class SquareRoot {
	// Return a Square root of a number

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the number: ");
		int num = in.nextInt();

		long sqrt = Math.round(FindSquareRoot(num));  // just rounding the result

		System.out.println("The SquareRoot of number " + num + " is: " + sqrt);
	}

	static double FindSquareRoot(int num) {
		int lb = 0;
		int ub = num;
		double result = 0;

		while (lb <= ub) {
			int mid = (lb + ub) / 2;

			if (mid * mid == num) {
				return mid;
			}

			if (mid * mid < num) {
				result = mid;
				lb = mid + 1;
			} else {
				ub = mid - 1;
			}
		}

		return result;  // return approximate root
	}
}
