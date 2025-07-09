package AnshulsJava.Arrays;

import java.util.Scanner;

public class Max {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int[] arr = {12, 17, 13, 29, 44, 56, 83};

		int max = MaxElement(arr);

		System.out.println("The maximum element is : " + max);


	}
	static int MaxElement(int[] brr) {
		int max = brr[0];

		for(int i = 0; i < brr.length; i++) {
			if(brr[i] > max) {
				max = brr[i];
			}
		}

		return max;

	}
}
