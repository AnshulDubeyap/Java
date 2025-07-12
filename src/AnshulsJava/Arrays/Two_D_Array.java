package AnshulsJava.Arrays;

import java.util.Scanner;

public class Two_D_Array {
	public static void main(String[] args) {
		// 2D Array is basically an array of arrays.
		// The reference variable arr points to an array object containing reference variables to other array objects

		// Syntax
		int[][] arr = new int[5][5]; // 2 rows, 3 columns, mentioning the rows are mandatory, the columns are optional

		// Declaring and initializing a 2D Array
		int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 } };

		// Accessing an element of a 2D Array
		System.out.println(arr1[0][1]); // output = 2
		System.out.println(arr1[1][2]); // output = 6
		System.out.println(arr1[0][2]); // output = 3
		System.out.println(arr1[1][1]); // output = 5

		// inputs in a 2D Array
		Scanner input = new Scanner(System.in);

		for(int row = 0; row<arr.length; row++){
			for(int col = 0; col<arr[row].length; col++){
				System.out.print("Enter the value of arr " + row + " " + col + " : ");
				arr[row][col] = input.nextInt();
			}
		}

		// printing a 2D Array
		for(int i = 0; i<arr.length; i++){
			for(int j = 0; j<arr[i].length; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
