package AnshulsAdvanceJava.LVTI;

public class Main {

	//  LVTI --> Local Variable Type Inference
	//  It is a feature introduced in Java 10, which allows the compiler to infer the type of a local variable based on the value assigned to it.


	public static void main(String[] args) {

		// Declare a integer variable
		int i = 10;

		System.out.println(i);

		// In LVTI, we can also declare a variable like this
		// it assigns the type at compilation time
		var j = 20;

		System.out.println(j);

		int k;
		// var k; // compile time error (cannot assign a value to a local variable before it is declared)

	}
}
