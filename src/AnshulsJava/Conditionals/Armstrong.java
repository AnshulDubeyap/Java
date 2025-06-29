package AnshulsJava.Conditionals;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number that you belive to be armstrong : ");
		int n = input.nextInt();
		int count = 0;
		double sum = 0;
		int t = n;
		int z = n;


		while(t > 0){
			// Take the last digit;
			int ld = t  %10;

			// Count the number of digits
			count = count + 1;

			// Remove the digit
			t = t/10;
		}

		while(z > 0){
			// take the last digit
			int d = z%10;

			// take the cube and add it to sum
			sum = sum + Math.pow(d, count);

			// remove the digit
			z = z/10;
		}

		if(sum == n){
			System.out.println("The number is armstrong : " + n);
		}else{
			System.out.println("The number is not armstrong");
		}


	}
}
