package AnshulsJava.FunctionsandMethods;

import java.util.Arrays;

public class ChangeValue_Original {
	public static void main(String[] args) {
		// Let's take an example where a change inside the function affects the original value.
		// This works only for non-primitive types (like arrays, objects)
		// because Java passes the reference by value.
		// Primitives (like int, float, boolean) follow true pass-by-value.

		// Declare an array
		int[] Arr = {12, 13, 14, 15, 16};

		// Pass the array into the function
		ChangeArr(Arr);

		// Print the array after function call
		System.out.println(Arrays.toString(Arr)); // Output: [99, 13, 14, 15, 16]

		// The array gets changed because arrays are reference types.
		// The reference 'Arr' is passed by value to the function.
		// Inside the function, 'Brr' refers to the same array object as 'Arr'.
		// So modifying Brr[0] = 99 changes the original array.
	}

	// Function to modify the first element of the array
	static void ChangeArr(int[] Brr) {
		Brr[0] = 99;
	}
}
