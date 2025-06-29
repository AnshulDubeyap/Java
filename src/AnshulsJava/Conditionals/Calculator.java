package AnshulsJava.Conditionals;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Take input from user until he presses 'X' or 'x'

		int ans = 0;

		while(true){
			// Take operator as input
			System.out.print("Enter the operator : " );
			char op = input.next().trim().charAt(0);

			if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
				// Take numbers as input
				System.out.print("Enter the first operand : ");
				int num1 = input.nextInt();

				System.out.print("Enter the second operand : ");
				int num2 = input.nextInt();

				switch (op){
					case '+':
						ans = num1 + num2;
						break;
					case '-':
						ans = num1 - num2;
						break;
					case '*':
						ans = num1 * num2;
						break;
					case '/':
						if(num2 != 0){
							ans = num1 / num2;
						}else{
							System.out.println("Cant divide by zero");
						}
						break;
					case '%':
						ans = num1 % num2;

					default:
						System.out.println("Enter the valid operator");
					break;
				}


			} else if (op == 'x' || op == 'X') {
				break;
				
			}else {
				System.out.println("The operator is not in use in current system");
			}


			System.out.println("The result of the operation is : " + ans);

		}

	}
}
