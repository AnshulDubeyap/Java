package AnshulsJava.OOps.InnerClass.AnonymousInnerClass;

public class Main {
	public static void main(String[] args) {
		// Create an object of outer class Class_A
		Class_A obj = new Class_A();
		obj.play(); // Output: Play functionality implemented

		// If I want to change the functionality of play(), I have two ways
		// 1. Create a new class extending Class_A and override the play() method
		// 2. Create an anonymous inner class and override the play() method


		// 2nd Approach

		Class_A obj1 = new Class_A() {
			public void play() {
				System.out.println("Play functionality changed");
			}
		};

		obj1.play(); // Output: Play functionality changed

		// Using the curly braces to create an anonymous inner class and override the play() method
	}
}
