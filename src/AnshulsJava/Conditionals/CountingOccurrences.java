package AnshulsJava.Conditionals;

import java.util.Scanner;

public class CountingOccurrences {
	public static void main(String[] args) {
		// Find the number of occurrences of a number
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the Big number with lots of 5s : ");
		int n = input.nextInt();

		int count = 0;

		while(n > 0){
			// get the last digit
			int d = n%10;

			// check if number is 5
			if(d == 5){
				count = count + 1;
			}

			// remove the last digit
			n = n/10;
		}

		System.out.println("the number of times the 5 appeared in the number is : "+ count);
	}
}
