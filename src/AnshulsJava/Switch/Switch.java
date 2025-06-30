package AnshulsJava.Switch;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Take an input
		System.out.print("Enter any fruit name : ");
		String fruit = input.next();

		// Apply switch

		switch( fruit){
			case "mango":
				System.out.println("The king of fruits : " + fruit);
				break;
			case "banana":
				System.out.println("Quick energy provider fruit : " + fruit);
				break;
			case "orange":
				System.out.println("The fruit that is rich in vitaminC : " + fruit);
				break;
			case "pineapple":
				System.out.println("a the fruit with ting-ling after effect : " + fruit);
				break;
			case "apple":
				System.out.println("The fruit that keeps the doctors away : " + fruit);
				break;
			default:
				System.out.println("The awesome fruit : " + fruit);

		}



	}
}
