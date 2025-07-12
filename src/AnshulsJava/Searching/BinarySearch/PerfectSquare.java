package AnshulsJava.Searching.BinarySearch;

import java.util.Scanner;

public class PerfectSquare {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the number you think is a perfect square : ");
		int num = in.nextInt();

		if(CheckPerfectSquare(num)){
			System.out.println("Yes the number is perfect Square");
		}else{
			System.out.println("No the number is not a perfect square");
		}


	}
 	static boolean CheckPerfectSquare(int num){
		int start = 0;
		int end = num;

		while(start <= end){
			int mid = (start + end)/2;

			if(mid * mid == num){
				return true;
			}

			if(mid * mid > num){
				end = mid - 1;
			}

			if (mid * mid < num) {
				start = mid + 1;
			}
		}

		return false;
	}
}
