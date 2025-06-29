package AnshulsJava.Conditionals;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		// Reverse of a number
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the input number you want to reverse : ");
		int n = input.nextInt();
		int rev = 0;
		while(n > 0){
			// take the last number
			int d = n%10;

			// add the d to the first
			rev = rev*10 + d;

			// remove the d
			n = n/10;
		}

		System.out.println("The reversed number is : "+ rev);
	}
}
