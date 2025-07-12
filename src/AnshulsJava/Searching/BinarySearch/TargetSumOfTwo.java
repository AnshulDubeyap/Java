package AnshulsJava.Searching.BinarySearch;

import java.util.Arrays;

public class TargetSumOfTwo {
	// Find two numbers in a sorted array whose sum equals target
	// Return their 1-based indices
	public static void main(String[] args) {
		int[] arr = {2,7,11,15};
		int target = 9;

		int[] indices = SumOfTwo(arr, target);


		System.out.println("The first indices are : " + Arrays.toString(indices));

	}
	static int[] SumOfTwo(int[] arr, int target){
		int start = 0;
		int end = arr.length - 1;

		while(start <= end){
			if(arr[start] + arr[end] == target){
				return new int[]{start + 1, end + 1};
			}

			if(arr[start] + arr[end]> target){
				end = end - 1;
			}

			if(arr[start] + arr[end] < target){
				start = start + 1;
			}
		}
		return new int[]{-1, -1};
	}

}
