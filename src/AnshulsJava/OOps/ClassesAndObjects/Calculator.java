package AnshulsJava.OOps.ClassesAndObjects;

public class Calculator {
	// instance variable
	// An instance variable is a variable defined inside a class but outside any method or constructor,
	// and it is stored in heap memory as part of the object
	int instanceVariable = 10;

	// method
	public void localMethod(){
		System.out.println("This is a local method");
	}

	// methods inside a class Calculator
	public int add(int a, int b) {
		return a + b;
	}

	// methods inside a class Calculator
	public int subtract(int a, int b) {
		return a - b;
	}

	// methods inside a class Calculator
	public int multiply(int a, int b) {
		return a * b;
	}

	// methods inside a class Calculator
	public int divide(int a, int b) {
		if (b == 0) {
			return 0;
		}
		return a / b;
	}
}
