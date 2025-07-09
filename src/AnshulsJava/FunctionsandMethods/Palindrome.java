package AnshulsJava.FunctionsandMethods;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the number you think is Palindrome : ");
		int num = in.nextInt();

		CheckPalindrome(num);
	}

	static void CheckPalindrome(int a){
		int rev = 0;
		int num = a;

		while(a > 0){
			int d = a %10;
			rev = rev*10 + d;
			a = a/10;
		}

		if(rev == num){
			System.out.println("Yes the number is Palindrome");
		}else{
			System.out.println("No the number is not Palindrome");
		}
	}
}
