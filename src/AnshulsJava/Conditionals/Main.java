package AnshulsJava.Conditionals;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of 😊 emojis to print -> ");
		int n = input.nextInt();

		// For Loop
		for (int i = 1; i <= n; i++) {
			System.out.print("😊");
		}

		// While Loop
		while(n>0){
			System.out.println("😊");
			n--;
		}

		//do While
		do {
			System.out.println("😊");

		}while (n>0);



	}
}
