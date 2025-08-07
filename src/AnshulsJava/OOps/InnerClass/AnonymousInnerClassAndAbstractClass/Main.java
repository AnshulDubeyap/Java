package AnshulsJava.OOps.InnerClass.AnonymousInnerClassAndAbstractClass;

public class Main {
	public static void main(String[] args) {

		// As we know, we cannot create an object of an abstract class, so we cannot create an object of Class_A

		// two ways to solve this problem

		// 1. Create a class extending Class_A and override the show() method
		// method 1 is to create a new class extending Class_A, but the only purpose of the new class is to override the show() method
		// for only a single purpose we are creating a new class (that's not good)

		// 2. Create an anonymous inner class and override the show() method
		// method 2 is to create an anonymous inner class and override the show() method (this is better)

		Class_A obj = new Class_A() {
			public void show() {
				System.out.println("Play functionality changed");
			}
		};

		// Now we can use the method in the abstract class
		obj.show(); // Output = Play functionality changed


	}
}
