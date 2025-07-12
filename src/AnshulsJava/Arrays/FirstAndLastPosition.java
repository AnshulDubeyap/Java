package AnshulsJava.Arrays;

import java.util.Arrays;

public class FirstAndLastPosition {
//	Input: nums = [5,7,7,8,8,10], target = 8
//	Output: [3,4]

	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 2, 2, 2, 4, 5, 6, 7, 8, 2, 2};
		int target = 2;

		FirstAndLast(arr, target);
	}
	static void FirstAndLast(int[] arr, int target){
		int[] indices = new int[arr.length];
		int n = 0;

		for(int i = 0; i< arr.length; i++){
			if(arr[i] == target){
				indices[n] = i;
				n = n + 1;
			}
		}

		// First
		System.out.println("The First index of target is : "+ indices[0]);

		//Last
		int max = indices[0];
		for(int i = 0; i<indices.length; i++){
			if(indices[i] > max){
				max = indices[i];
			}
		}
		System.out.println("The Last index of target is : "+ max);
	}
}
