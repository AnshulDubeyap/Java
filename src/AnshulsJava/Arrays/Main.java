package AnshulsJava.Arrays;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Syntax
		int[] brr = new int[5];
		// new, new keyword is used to create a new object, at runtime (Dynamic memory allocation)
		// int[] is the data type
		// brr is the variable name(reference variable)
		// 5 is the size


		// Syntax breakdown
		int[] arr; // Declaration of an array, arr is getting defined in the stack, happens at compile time
		arr = new int[5];// Initialization of an array, arr is getting defined in the memory(heap), happens at run time


		// Arrays in Java are not always continuous in memory, it depends on JVM, it says in the documentation that objects created by JVM are not continuous in memory


		int[] crr = new int[5];
		System.out.println(crr[0]); // output = 0

		String[] drr = new String[5];
		System.out.println(drr[0]); // output = null

		// Null, it is a literal, the output of all reference types is null
		// Any object that is not given any value is null whether an array or anything else

		// Inputs in an Array

		Scanner input = new Scanner(System.in);
		int[] arr1 = new int[5];
		for(int i = 0; i<arr1.length; i++){
			System.out.print("Enter the value of arr " + i + " : ");
			arr1[i] = input.nextInt();
		}

		// Printing an Array

		for(int i = 0; i<arr1.length; i++){
			System.out.println(arr1[i]);
		}
	}
}
