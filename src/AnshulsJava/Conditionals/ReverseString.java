package AnshulsJava.Conditionals;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the string you want to reverse : ");
		String st = input.next();  // use input.nextLine() if you want to allow spaces

		String rev = "";

		for (int i = st.length() - 1; i >= 0; i--) {
			rev += st.charAt(i);
		}

		System.out.println("The reversed string : " + rev);
	}
}
