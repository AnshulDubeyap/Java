package AnshulsJava.Searching.BinarySearch;

import java.util.Arrays;

public class BinaryIn2D {
	public static void main(String[] args) {
		int[][] arr = {
				{ 10, 20, 30, 40 },
				{ 15, 25, 35, 45 },
				{ 27, 29, 37, 48 },
				{ 32, 33, 39, 50 }
		}; // Sorted Array

		int target = 33;

		int[] index = Binary2D(arr, target);

		System.out.println("The index where element : " + target + " is : " + Arrays.toString(index));


	}

	static int[] Binary2D(int[][] arr, int target){
		int row = 0; // Starting from the first row
		int col = arr.length -1; // Starting from the last column

		while(row < arr.length && col >= 0){

			if(arr[row][col] == target){
				return new int[]{row, col};
			}

			if(target > arr[row][col]){
				row = row + 1;
			}

			if(target < arr[row][col]){
				col = col -1;
			}
		}

		return new int[]{-1, -1};

	}
}
