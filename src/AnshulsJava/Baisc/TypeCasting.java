package AnshulsJava.Baisc;

import java.util.Scanner;

public class TypeCasting {
	public static void main(String[] args) {
		// Type casting: Automatic (widening) and Manual (narrowing) conversion of data types

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the integer -> ");
		float number = input.nextFloat();

		System.out.println(number); //? Output: integer.0 (automatically converted to float)

		// Conditions for Automatic (Widening) Type Casting:
		//      1. Types must be compatible
		//      2. Target type must have a larger size than source type

		// Manual Type Casting (Narrowing conversion)
		int num = (int)(34.44f);
		System.out.println(num); //? Output: 34 (decimal part is truncated)

		// Automatic Type Promotion in byte conversion
		int num2 = 257;
		System.out.println((byte)(num2)); //? Output: 1 (257 % 256 = 1 → byte overflow)

		int num3 = 11;
		float num4 = 12.6f;
		System.out.println(num3 * num4); // Output: 138.6 (float result)

		// If two different data types are used in an operation,
		// Java promotes the smaller type to the larger one automatically
	}
}
