package AnshulsJava.Conditionals;

import java.util.Scanner;

public class Largest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number -> ");
		int a = input.nextInt();
		System.out.println("Enter the number -> ");
		int b = input.nextInt();
		System.out.println("Enter the number -> ");
		int c = input.nextInt();

		// Find the largest of three

		if(a > b){
			if(a > c){
				System.out.println("The number largest is : " + a);
			}else{
				System.out.println("The number largest is : " + c);
			}
		}else {
			if(b>c){
				System.out.println("The number largest is : " + b);
			}
			else{
				System.out.println("The number largest is : " + c);
			}
		}


		// Another approach -> not mine but simpler

		int max = a;

		if(b>max){
			max = b;

		}
		if(c > max){
			max = c;

		}
		System.out.println("The max is " + max);
	}
}
