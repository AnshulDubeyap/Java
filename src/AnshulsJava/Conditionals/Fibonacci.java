package AnshulsJava.Conditionals;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		// Print fibonacci numbers
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = input.nextInt();

		int a = 0;
		int b = 1;
		int sum = 0;

		if(n >= 1){
			System.out.println(a);
		}

		if(n>= 2){
			System.out.println(b);
		}

		for(int i = 0; i<n; i++){
			sum = a + b;
			a = b;
			b = sum;

			System.out.println(sum);
		}


	}
}
