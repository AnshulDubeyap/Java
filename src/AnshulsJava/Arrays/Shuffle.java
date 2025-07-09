package AnshulsJava.Arrays;

import java.util.Arrays;

public class Shuffle {
	public static void main(String[] args) {
		// Shuffle an array
		// [12, 13, 14, 15, 16, 31, 32, 33, 34, 35, 36] = [12, 31, 13, 32, 14, 33, 15, 34, 16, 35, 36]

		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 51, 52, 53, 54, 55, 56, 57, 58, 59};

		System.out.println("The original array is : " + Arrays.toString(arr));

		ShuffleArray(arr);
	}

	static void ShuffleArray(int[] brr) {
		int[] shuffle = new int[brr.length];
		int[] sub1 = new int[brr.length / 2];
		int[] sub2 = new int[brr.length / 2];
		int j = 0;
		int k = 0;

		for(int i = 0; i<sub1.length; i++){
			sub1[i] = brr[i];
		}

		for(int i =  sub1.length; i<brr.length; i++){
			sub2[j] = brr[i];
			j++;
		}

		for(int i = 0; i<brr.length; i++){

		}

		System.out.println("The shuffled array is : " + Arrays.toString(shuffle));
	}
}
