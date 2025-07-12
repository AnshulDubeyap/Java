package AnshulsJava.Searching.LinearSearch;

import java.util.Arrays;

public class MinimumIn2D {
	public static void main(String[] args) {
		int[][] arr = {{12, 13, 14, 15, 16}, {31, 32, 33, 34, 35}, {-32, -40, -57, -1, 0}, {-100, 100, 84, -84}};

		int[] ans = FindMinimum(arr);
		System.out.println("The minimum at the index : " + Arrays.toString(ans));
	}

	static int[] FindMinimum(int[][] arr){
		int min = arr[0][0];
		int a = 0;
		int b = 0;
		for(int row = 0; row<arr.length; row++){
			for(int col = 0; col<arr[row].length; col++){
				if(arr[row][col] < min){
					min = arr[row][col];
					a = row;
					b = col;
				}
			}
		}
		System.out.println("The minimum No is : "+ min);
		return new int[]{a, b};

	}
}

