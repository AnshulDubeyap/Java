package AnshulsJava.OOps.ExceptionHandling;
// every single exception is a subclass of Exception

// creating a custom exception
public class MyException extends Exception{

	// constructor
	public MyException(String message) {
		super(message); // calling the constructor of the parent class (Exception)
	}

}
