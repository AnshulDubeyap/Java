package AnshulsJava.OOps.ExceptionHandling;

public class Main {
	public static void main(String[] args) {

		int a = 10, b = 0, result = 0;

		// ----------------------------
		// Example 1: Basic exception handling
		// ----------------------------
		try {
			result = a / b;  // Causes ArithmeticException: divide by zero
		} catch (Exception e) {
			System.out.println("Caught exception: " + e);  // Full exception details
		}

		// ----------------------------
		// Example 2: Get only the exception message
		// ----------------------------
		try {
			result = a / b;
		} catch (Exception e) {
			System.out.println("Exception message: " + e.getMessage());  // Just "/ by zero"
		}

		// ----------------------------
		// Example 3: Order of catch blocks matters
		// ----------------------------
		try {
			result = a / b;
		} catch (ArithmeticException e) {
			System.out.println("Caught ArithmeticException: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Caught general Exception: " + e.getMessage());
		}

		// ----------------------------
		// Example 4: Using throw and throws
		// ----------------------------
		try {
			callDivide(10, 0); // call a method that uses throws
		} catch (Exception e) {
			System.out.println("Handled thrown exception: " + e.getMessage());
		}

		// ----------------------------
		// Example 5: Finally block
		// ----------------------------
		try {
			int x = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Exception in try block: " + e.getMessage());
		} finally {
			System.out.println("This will always run (finally block).");
		}

		// ----------------------------
		// Info: Checked vs Unchecked
		// ----------------------------
		/*
		 * Checked Exceptions:
		 * - Known at compile time (e.g., IOException, SQLException)
		 * - Must be handled using try-catch or declared using 'throws'
		 *
		 * Unchecked Exceptions:
		 * - Known at runtime (e.g., ArithmeticException, NullPointerException)
		 * - Optional to handle
		 */
	}

	// This method throws an exception (throws)
	static void callDivide(int c, int d) throws Exception {
		if (d == 0) {
			throw new ArithmeticException("You can't divide by zero");  // throw
		} else {
			int result = c / d;
		}
	}
}
