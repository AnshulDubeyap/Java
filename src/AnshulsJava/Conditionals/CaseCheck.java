package AnshulsJava.Conditionals;

import com.sun.deploy.util.SyncAccess;

import java.util.Scanner;

public class CaseCheck {
	public static void main(String[] args) {
		// A program that tells weather a char is uppercase or lowercase

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the chracter");

		char ch = input.next().trim().charAt(0); // this is how to take char as input in Java

		// Check weather its AcSII code lies between a and z
		if(ch >= 'a' && ch <= 'z'){
			System.out.println("Character is lowercase : " + ch);

		}else{
			System.out.println("Character is uppercase : " + ch);
		}
	}
}
