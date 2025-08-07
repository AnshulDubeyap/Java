package AnshulsJava.OOps.SuperAndThis;

public class Main {

	// Things to remember:
	// 1. Every time you create an object, a constructor runs automatically.
	// 2. If you don't write any constructor, Java gives a default no-arg constructor.
	// 3. Every class in Java automatically extends the Object class.
	// 4. Java automatically adds 'super()' as the first line in a constructor if you don't write it.

	// 'super' keyword is used to call the constructor of the parent (super) class.

	public static void main(String[] args) {

		B b = new B();
		// Output:
		// in A       (called by super() in B constructor)
		// in B

		B b1 = new B(1);
		// Output:
		// in A (default constructor called from A(int a) using this())
		// in A parameterized
		// in B parameterized
	}
}
