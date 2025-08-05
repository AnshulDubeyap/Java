package AnshulsJava.Pattern;

public class Main {
	public static void main(String[] args) {
		System.out.println("Pattern 1");
		pattern1(5);

		System.out.println();


		System.out.println("Pattern 2");
		pattern2(5);

		System.out.println();

		System.out.println("Pattern 3");
		pattern3(5);

		System.out.println();

		System.out.println("Pattern 4");
		pattern4(5);

		System.out.println();

		System.out.println("Pattern 5");
		pattern5(5);

		System.out.println();

		System.out.println("Pattern 5 b");
		pattern5_b(5);

		System.out.println();

		System.out.println("Pattern 6");
		pattern6(5);

		System.out.println();

		System.out.println("Pattern 7");
		pattern7(5);

	}

	// Pattern 1
	static void pattern1(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	// Pattern 2
	static void pattern2(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	// Pattern 3
	static void pattern3(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n - i + 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	// Pattern 4
	static void pattern4(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	// Pattern 5
	// my approach
	static void pattern5(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n - i ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	// Pattern 5
	// correct approach
	// count the number of rows, (that how many times the first loop will run)
	// count the number of columns, (that how many times the second loop will run)

	static void pattern5_b(int n) {
		for(int row = 0; row < 2 * n; row++) {
			int rowNo = row > n ? 2 * n - row : row;
			for(int col = 0; col < rowNo; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	// Pattern 6
	static void pattern6(int n) {
		for(int row = 0; row < 2 * n; row++) {

			// for stars
			int rowNo = row > n ? 2 * n - row : row;

			// for spaces
			int spaces = row > n ? row - n : n - row;

			for(int col = 0; col < spaces; col++) {
				System.out.print(" ");
			}

			for(int col = 0; col < rowNo; col++) {
				System.out.print("* ");
			}

			System.out.println();
		}

	}

	// Pattern 7
	static void pattern7(int n) {
		for(int row = 0; row < n; row++) {

			for(int col = 0; col < n - row; col++) {
				System.out.print(" ");
			}

			for(int col = 0; col < row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}


	// Pattern 8
	static void pattern8(int n) {
		for(int row = 0; row < 2 * n; row++) {
			int rowNo = row > n ? 2 * n - row : row;

		}
	}
}
