package AnshulsJava.Arrays;

import java.util.Arrays;

public class Reverse {
	public static void main(String[] args) {
		int[] arr = {12, 17, 13, 29, 44, 56, 83};

		System.out.println("The original array is : " + Arrays.toString(arr));

		ReverseArray(arr);
	}

	static void ReverseArray(int[] brr){
		int[] rev = new int[brr.length];

		for(int i = 0; i<brr.length; i++){
			rev[i] = brr[brr.length - 1 - i];
		}

		System.out.println("The reversed array is : " + Arrays.toString(rev));
	}
}
