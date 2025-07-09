package AnshulsJava.FunctionsandMethods;

import java.util.Scanner;

public class PythagorasTriplets {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the numbers you think are Pythagoras Triplets ->");
		System.out.print("First : ");
		int num1 = in.nextInt();

		System.out.print("Second : ");
		int num2 = in.nextInt();

		System.out.print("Third : ");
		int num3 = in.nextInt();

		CheckPythagoras(num1, num2, num3);


	}

	static void CheckPythagoras(int a, int b, int c){
		if(a*a + b*b == c*c || b*b + c*c  == a*a || c*c + a*a == b*b){
			System.out.println("Yes the three numbers are PythagorasTriplets");
		}else{
			System.out.println("No the three numbers are not PythagorasTriplets");
		}
	}
}
