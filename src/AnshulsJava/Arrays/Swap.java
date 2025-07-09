package AnshulsJava.Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Swap {
	public static void main(String[] args) {
		// Swap two numbers in an array

		int[] arr = {31, 32, 45};

		Scanner in = new Scanner(System.in);

		System.out.println("The the index you want to swap : ");
		int index1 = in.nextInt();

		if(index1 >= arr.length || index1 < 0) {
			System.out.println("Invalid index");
			return;
		}

		System.out.println("The the index you want to swap with : ");
		int index2 = in.nextInt();

		if(index2 >= arr.length || index2 < 0) {
			System.out.println("Invalid index");
			return;
		}

		System.out.println("Array after swap : " + Arrays.toString(arr)); // [31, 32, 45]

		SwapNumbers(arr, index1, index2);

		System.out.println("Array after swap : " + Arrays.toString(arr)); // [45, 32, 31]

	}

	static void SwapNumbers(int[] brr, int index1, int index2) {
		int temp = brr[index1];
		brr[index1] = brr[index2];
		brr[index2] = temp;
	}
}
