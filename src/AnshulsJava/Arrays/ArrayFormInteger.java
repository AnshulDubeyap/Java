package AnshulsJava.Arrays;

import java.util.Arrays;

public class ArrayFormInteger {
	public static void main(String[] args) {
		// Input: num = [1,2,0,0], k = 34
		// Output: [1,2,3,4]
		// Explanation: 1200 + 34 = 1234

		int[] arr = {1, 2, 0, 0};
		int k = 34;

		FormInteger(arr, k);
	}

	static void FormInteger(int[] arr, int k){
		int num = 0;
		int[] result = new int[arr.length];
		int j = 0;

		for(int i = 0; i< arr.length; i++){
			num = num*10 + arr[i];
		}

		num = num + k;

		for(int i = 0; i< arr.length;i++){
			result[j] = num%10;
			num = num/10;
			j = j+1;
		}

		System.out.println("The Result Array is : " + Arrays.toString(result)); // output = [4, 3, 2, 1]

	}
}
