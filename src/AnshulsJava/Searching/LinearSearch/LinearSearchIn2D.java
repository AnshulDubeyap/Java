package AnshulsJava.Searching.LinearSearch;

import java.util.Arrays;

public class LinearSearchIn2D {
	public static void main(String[] args) {
		int[][] arr = {{12, 13, 14},{15, 16, 17},{18, 19, 20}};
		int target = 18;

		int[]ans = Search2D(arr, 18);

		System.out.println(Arrays.toString(ans)
		);

	}
	static int[] Search2D(int[][] arr, int target){
		if(arr.length == 0){
			return new int[]{-1, -1};
		}
		for(int row = 0; row< arr.length; row++){
			for(int col= 0; col<arr[row].length; col++){
				if(arr[row][col] == target){
					return new int[]{row, col};
				}
			}

		}
		return new int[]{-1, -1};
	}
}
