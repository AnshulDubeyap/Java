package AnshulsJava.OOps.ExceptionHandling;

public class Main {
	public static void main(String[] args) {
		// creating an exception
		int a = 10, b = 0, result = 0;
		try {
			result = a / b;
		} catch (Exception e) {
			System.out.println(e); // output = java.lang.ArithmeticException: / by zero
			// the message shows the exception is divided by zero
			// Exception is a class, ArithmeticException is a subclass in Exception
		}

//=============================================================================

		// We can also print the message
		try {
			result = a / b;
		} catch (Exception e) {
			System.out.println(e.getMessage()); // output = / by zero
		}

//=============================================================================

		// Every exception is a subclass of Exception,
		// thus we can use Exception class to catch all the exceptions,
		// thus if we want to specify a particular exception, we have to use that particular exception class above the Exception class

		try {
			result = a / b;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
//		} catch (ArithmeticException e) { // error because all the exceptions are already handled by Exception
//			System.out.println(e.getMessage());
//		}

		// Instead of using ArithmeticException below Exception, we have to use above it
		try {
			result = a / b;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
//=============================================================================

		// Using a custom exception
		try {
			String name = "Anshul";

			if(name.equals("Anshul")) {

				throw new MyException("Name is Anshul");

			}else {
				System.out.println("Name is not Anshul");
			}
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
	}

	// We have to declare the exception in the method by 'throws' keyword
	// 'throws' -> You might get an exception in this method
	// 'throw' -> You are throwing an exception
	static int divide(int c, int d) throws Exception {
		if(d == 0) {
			throw new ArithmeticException("Division by zero is not allowed");
		}else {
			return c/d;
		}
	}
}
