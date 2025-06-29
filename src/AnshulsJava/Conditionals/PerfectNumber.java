package AnshulsJava.Conditionals;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number you think is a perfect number : ");
		int n = input.nextInt();

		int t = n;
		int sum = 0;

		for(int i = 1; i<t ; i++){
			if( t % i == 0){
				sum = sum + i;
			}
		}

		if( sum == n){
			System.out.println("The number is Perfect number : "+ n);
		}else{
			System.out.println("The number is not a Perfect number : "+ n);
		}
	}
}
